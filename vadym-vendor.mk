PRODUCT_PACKAGES += FloatExchangeService \
	vendor.vadym.hardware.LedHal@1.0-service \
	FloatWriter

DEVICE_MANIFEST_FILE += \
	vendor/vadym/hardware/interfaces/manifest.xml

DEVICE_MATRIX_FILE += \
	vendor/vadym/hardware/interfaces/compatibility_matrix.xml

BOARD_SEPOLICY_DIRS += \
	vendor/vadym/sepolicy