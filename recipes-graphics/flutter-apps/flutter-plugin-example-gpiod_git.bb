SUMMARY = "Google Sign In Flutter Plugin Example"
DESCRIPTION = "A Flutter plugin for Google Sign In."
AUTHOR = "Hannes Winkler"
HOMEPAGE = "https://github.com/ardera/flutter_packages"
BUGTRACKER = "https://github.com/ardera/flutter_packages/issues"
SECTION = "graphics"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=9950fa17ba55dae6a2fff5386d065d1c"

SRC_URI = "git://github.com/ardera/flutter_packages.git;lfs=0;branch=main;protocol=https;destsuffix=git"

SRCREV = "${AUTOSRC}"

S = "${WORKDIR}/git"

PUBSPEC_APPNAME = "flutter_gpiod_test_app"
FLUTTER_APPLICATION_PATH = "packages/flutter_gpiod_test_app"
FLUTTER_APPLICATION_DELETE_LINUX_FOLDER = "1"
FLUTTER_APPLICATION_INSTALL_PREFIX = "flutter/examples/plugins"

inherit flutter-app
