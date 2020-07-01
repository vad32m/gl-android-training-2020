LOCAL_PATH := ${call my-dir}

include ${CLEAR_VARS}

LOCAL_PACKAGE_NAME := FloatWriter

LOCAL_MODULE_TAGS := optional

LOCAL_SRC_FILES := $(call all-java-files-under, java)
LOCAL_SRC_FILES += $(call all-Iaidl-files-under, aidl)

LOCAL_STATIC_ANDROID_LIBRARIES := \
	android-support-design \
	android-support-constraint-layout \
	android-support-v7-appcompat

LOCAL_SDK_VERSION := current

LOCAL_RESOURCE_DIR := $(LOCAL_PATH)/res

LOCAL_USE_AAPT2 := true

include ${BUILD_PACKAGE}
