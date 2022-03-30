SUMMARY = "Linux Serial Flutter Plugin Example"
DESCRIPTION = "Dart package for accessing serial ports on Linux using dart:ffi."
AUTHOR = "Hannes Winkler"
HOMEPAGE = "https://github.com/ardera/flutter_packages"
BUGTRACKER = "https://github.com/ardera/flutter_packages/issues"
SECTION = "graphics"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=9950fa17ba55dae6a2fff5386d065d1c"

DEPENDS += "\
    flutter-engine-${FLUTTER_RUNTIME} \
    "

SRC_URI = "git://github.com/ardera/flutter_packages.git;lfs=0;branch=main;protocol=https;destsuffix=git"

SRCREV = "${AUTOREV}"

S = "${WORKDIR}/git"

PUBSPEC_APPNAME = "linux_serial_example"
FLUTTER_APPLICATION_PATH = "packages/linux_serial/example"
FLUTTER_APPLICATION_INSTALL_PREFIX = "flutter/examples/plugins"

inherit flutter-app
