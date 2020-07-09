#define LOG_TAG "LedHalImpl"

#include "LedHal.h"

namespace vendor {
namespace vadym {
namespace hardware {
namespace LedHal {
namespace V1_0 {
namespace implementation {

LedHalImpl::LedHalImpl() {
    //ALOGD("LedHalImpl created");
}

LedHalImpl::~LedHalImpl() {
    //ALOGD("LedHalImpl deleted");
}

Return<bool> LedHalImpl::setFloat(float arg) {
    return (arg > 5.0);
}

} // namespace implementation
} // namespace V1_0
} // namespace LedHal
} // namespace hardware
} // namespace vadym
} // namespace vendor