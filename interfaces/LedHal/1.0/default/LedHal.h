#ifndef __HIKEY_LEDCTL_HAL_
#define __HIKEY_LEDCTL_HAL_

#include <vendor/vadym/hardware/LedHal/1.0/ILedHal.h>

namespace vendor {
namespace vadym {
namespace hardware {
namespace LedHal {
namespace V1_0 {
namespace implementation {

using ::android::hardware::Return;

class LedHalImpl : public ILedHal {

public:
    LedHalImpl();

    Return<bool> setFloat(float arg) override;

private:
    ~LedHalImpl();
};

} // namespace implementation
} // namespace V1_0
} // namespace LedHal
} // namespace hardware
} // namespace vadym
} // namespace vendor

#endif /* __HIKEY_LEDCTL_HAL_ */