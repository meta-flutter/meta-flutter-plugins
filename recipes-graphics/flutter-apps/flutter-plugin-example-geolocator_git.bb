SUMMARY = "Geolocator Plugin Example"
DESCRIPTION = "A Flutter geolocation plugin which provides easy access to platform specific location services"
AUTHOR = "Maurits van Beusekom"
HOMEPAGE = "https://github.com/Baseflow/flutter-geolocator"
BUGTRACKER = "https://github.com/Baseflow/flutter-geolocator/issues"
SECTION = "graphics"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=eb51e6812edbf587a5462bf17f2692a2"

SRC_URI = "git://github.com/Baseflow/flutter-geolocator.git;lfs=0;branch=master;protocol=https;destsuffix=git"

SRCREV = "${AUTOSRC}"

S = "${WORKDIR}/git"

PUBSPEC_APPNAME = "geolocator_example"
FLUTTER_APPLICATION_PATH = "geolocator/example/"
FLUTTER_APPLICATION_DELETE_LINUX_FOLDER = "1"
FLUTTER_APPLICATION_INSTALL_PREFIX = "flutter/examples/plugins"

inherit flutter-app
