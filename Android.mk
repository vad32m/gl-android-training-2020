LOCAL_PATH := ${call my-dir}

include ${CLEAR_VARS}

LOCAL_PACKAGE_NAME := FloatWriter

LOCAL_SRC_FILES := \
	$(call all-java-files-under, java) \
	$(call all-Iaidl-files-under, aidl) \

LOCAL_USE_APPT2 := true

LOCAL_RESOURCE_DIR := $(LOCAL_PATH)/res

LOCAL_STATIC_ANDROID_LIBRARIES := \
	android-support-v7-appcompat \
	android-support-constraint-layout

LOCAL_STATIC_JAVA_LIBRARIES += \
	android-support-constraint-layout-solver

LOCAL_SDK_VERSION := 28

include ${BUILD_PACKAGE}
