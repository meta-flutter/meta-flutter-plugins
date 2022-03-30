SUMMARY = "libserialport Plugin Example"
DESCRIPTION = "Serial Port for Flutter"
AUTHOR = "J-P Nurmi"
HOMEPAGE = "https://github.com/jpnurmi/flutter_libserialport"
BUGTRACKER = "https://github.com/jpnurmi/flutter_libserialport/issues"
SECTION = "graphics"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=eb51e6812edbf587a5462bf17f2692a2"

DEPENDS += "\
    libserialport \
    flutter-engine-${FLUTTER_RUNTIME} \
    "

SRC_URI = "git://github.com/jpnurmi/flutter_libserialport.git;lfs=0;branch=main;protocol=https;destsuffix=git"

SRCREV = "${AUTOREV}"

S = "${WORKDIR}/git"

PUBSPEC_APPNAME = "flutter_libserialport_example"
FLUTTER_APPLICATION_PATH = "example/"
FLUTTER_APPLICATION_DELETE_LINUX_FOLDER = "1"
FLUTTER_APPLICATION_INSTALL_PREFIX = "flutter/examples/plugins"

inherit flutter-app
