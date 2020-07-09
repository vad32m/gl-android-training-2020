#define LOG_TAG "vendor.vadym.hardware.LedHal@1.0-service"

#include <hidl/HidlSupport.h>
#include <hidl/HidlTransportSupport.h>
#include "LedHal.h"

using ::android::hardware::configureRpcThreadpool;
using ::vendor::vadym::hardware::LedHal::V1_0::implementation::LedHalImpl;
using ::vendor::vadym::hardware::LedHal::V1_0::ILedHal;
using ::android::hardware::joinRpcThreadpool;
using ::android::OK;
using ::android::sp;

int main(int /* argc */, char* /* argv */ []) {
    sp<LedHalImpl> ledControlHW = new LedHalImpl();
    configureRpcThreadpool(1, true /* will join */);
    if (ledControlHW->registerAsService() != OK) {
        ALOGE("Couldn't register LedControl 1.0 service.");
        return 1;
    }
    joinRpcThreadpool();

    ALOGE("Service exited!");
    return 1;
}