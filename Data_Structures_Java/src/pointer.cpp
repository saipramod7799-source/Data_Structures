#include <iostream>
#include <memory>
#include <thread>
#include <mutex>
#include <vector>
#include <functional>

typedef void (*SensorCallback)(int);

void onDataReceived(int val){
    std::cout << "[callback] Processed Data: " << val << std::endl;
}

class SensorHardware {
public: 
    volatile int* device_register;
    SensorHardware(){
        device_register = new int(0);
    }
    ~SensorHardware(){
        delete device_register;
    }
};

class SensorManager{
private: 
    std::mutex mutex;
    int data = 0;
    std::shared_ptr<SensorHardware> hardware;
public:
    SensorManager(std::shared_ptr<SensorHardware> hw): hardware(hw){}

    void updateData(int newValue){
        std::lock_guard<std::mutex> lock(mtx);
        return data
    }

    void getData(){
        std::lock_guard<std::mutex> lock(mtx);
        return data;
    }
};

void threadProducer(std::shared_ptr<SensorManager> mgr){
    for(int i = 1; i<=3; ++i){
        std::this_thread::sleep_for(std::chrono::milliseconds(100));
        mgr->updateData(i * 10);
        std::cout << "[Producer] Set data to: " << i * 10 << std::endl;
    }
}

int main(){

    auto hw = std::make_shared<SensorHardware>();
    auto manager = std::make_shared<SensorManager>(hw);

    std::weak_ptr<SensorManager> observer = manager;

    std::thread t1(threadProducer, manager);
    SensorCallback callback = onDataReceived;

    for (int i = 0; i < 3; ++i) {
        std::this_thread::sleep_for(std::chrono::milliseconds(150));
        
        // Checking if manager still exists via Weak Pointer
        if (auto lockedMgr = observer.lock()) {
            int val = lockedMgr->getData();
            callback(val); // Executing function pointer
        }
    }

    t1.join(); // Wait for thread to finish
    return 0;
}