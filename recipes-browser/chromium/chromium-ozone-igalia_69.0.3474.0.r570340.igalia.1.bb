SRC_URI = "https://tmp.igalia.com/chromium-tarballs/chromium-ozone-wayland-dev-${PV}.tar.xz"
S = "${WORKDIR}/chromium-ozone-wayland-dev-${PV}"

require chromium-ozone-igalia.inc

SRC_URI[md5sum] = "ddf583957f57b0f57c7d7835ec593d67"
SRC_URI[sha256sum] = "999a6e56ecc5bcc9414ceafe5c066bf7055f1fc7d56392b81fcbb66b96eee316"

LIC_FILES_CHKSUM += "\
  file://${S}/buildtools/third_party/libunwind/trunk/LICENSE.TXT;md5=f1a6f38bb5a8dabe8e3ec33557112dc9 \
  file://${S}/ios/third_party/material_internationalization_ios/LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57 \
  file://${S}/ios/third_party/motion_animator_objc/LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57 \
  file://${S}/ios/third_party/motion_interchange_objc/LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57 \
  file://${S}/ios/third_party/motion_transitioning_objc/LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57 \
  file://${S}/third_party/angle/LICENSE;md5=7abdb66a6948f39c2f469140db5184e2 \
  file://${S}/third_party/boringssl/src/LICENSE;md5=9b082148f9953258347788edb83e401b \
  file://${S}/third_party/breakpad/LICENSE;md5=828152b41153892a725f0e7f56faff73 \
  file://${S}/third_party/expat/files/COPYING;md5=5b8620d98e49772d95fc1d291c26aa79 \
  file://${S}/third_party/ffmpeg/CREDITS.chromium;md5=ccd691316e9b2fd436cd55b6347bb6c8 \
  file://${S}/third_party/freetype/src/docs/FTL.TXT;md5=9f37b4e6afa3fef9dba8932b16bd3f97 \
  file://${S}/third_party/google_toolbox_for_mac/LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57 \
  file://${S}/third_party/harfbuzz-ng/src/COPYING;md5=e021dd6dda6ff1e6b1044002fc662b9b \
  file://${S}/third_party/icu/LICENSE;md5=63752c57bd0b365c9af9f427ef79c819 \
  file://${S}/third_party/libpng/LICENSE;md5=c2adba923425f511c6087a7ca53270e6 \
  file://${S}/third_party/libsrtp/LICENSE;md5=2909fcf6f09ffff8430463d91c08c4e1\
  file://${S}/third_party/ots/LICENSE;md5=e06eff2aa65b917034a81599bea73dc4 \
  file://${S}/third_party/yasm/source/patched-yasm/COPYING;md5=a12d8903508fb6bfd49d8d82c6170dd9 \
  file://${S}/third_party/vulkan/README.chromium;md5=f9e47cf7ee46165615c8631513ef13b8 \
  file://${S}/v8/third_party/inspector_protocol/LICENSE;md5=db90dcb101891a7285d25f2fbceca752 \
  file://${S}/v8/LICENSE;md5=bda6d3b7be87052ff181da3ed9fd5501 \
  file://${S}/v8/LICENSE.valgrind;md5=df3b3d49700e781f7508895abd114277 \
"

SRC_URI += " \
 file://v8-6.8.14-qemu-wrapper.patch;patchdir=v8 \
 file://0001-Use-v8-qemu-wrapper.sh-on-v8-context-snapshot-creati.patch \
 file://0001-linux-fix-ARM-snapshot-context-traits-build.patch;patchdir=third_party/crashpad/crashpad \
"
