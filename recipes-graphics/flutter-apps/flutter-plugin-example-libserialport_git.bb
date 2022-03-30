SUMMARY = "libserialport Plugin Example"
DESCRIPTION = "Serial Port for Flutter"
AUTHOR = "J-P Nurmi"
HOMEPAGE = "https://github.com/jpnurmi/flutter_libserialport"
BUGTRACKER = "https://github.com/jpnurmi/flutter_libserialport/issues"
SECTION = "graphics"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=61d5e5d41a9135815ebfd7e7f556c48b"

DEPENDS += "\
    libserialport \
    flutter-engine-${FLUTTER_RUNTIME} \
    "

SRC_URI = "git://github.com/jpnurmi/flutter_libserialport.git;lfs=0;branch=main;protocol=https;destsuffix=git"

SRCREV = "e9c1fd940d26b2fc1674d5cb724027245c0ed094"

S = "${WORKDIR}/git"

PUBSPEC_APPNAME = "flutter_libserialport_example"
FLUTTER_APPLICATION_PATH = "example/"
FLUTTER_APPLICATION_TEST_ROOT = "${FLUTTER_APPLICATION_PATH}/.."
FLUTTER_APPLICATION_RUN_TEST = "1"
FLUTTER_APPLICATION_CLEAR_LINUX_FOLDER = "1"
FLUTTER_APPLICATION_INSTALL_PREFIX = "flutter/examples/plugins"

inherit flutter-app
