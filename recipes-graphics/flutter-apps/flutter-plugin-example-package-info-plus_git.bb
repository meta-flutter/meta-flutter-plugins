SUMMARY = "Package Info Flutter Plugin Example"
DESCRIPTION = "Demonstrates how to use the package info plugin."
AUTHOR = "Flutter Community"
HOMEPAGE = "https://plus.fluttercommunity.dev/"
BUGTRACKER = "https://github.com/fluttercommunity/plus_plugins/issues"
SECTION = "graphics"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=aaa4daf7a83c6896af2c007b59db56e4"

DEPENDS += "\
    flutter-engine-${FLUTTER_RUNTIME} \
    "

SRC_URI = "git://github.com/fluttercommunity/plus_plugins.git;lfs=0;branch=main;protocol=https;destsuffix=git"

SRCREV = "${AUTOREV}"

S = "${WORKDIR}/git"

PUBSPEC_APPNAME = "package_info_example"
FLUTTER_APPLICATION_PATH = "packages/package_info_plus/package_info_plus/example"
FLUTTER_APPLICATION_DELETE_LINUX_FOLDER = "1"
FLUTTER_APPLICATION_INSTALL_PREFIX = "flutter/examples/plugins"

inherit flutter-app
