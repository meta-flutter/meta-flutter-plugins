SUMMARY = "Connectivity Plus Flutter Plugin Example"
DESCRIPTION = "Demonstrates how to use the connectivity_plus plugin."
AUTHOR = "Flutter Community"
HOMEPAGE = "https://plus.fluttercommunity.dev/"
BUGTRACKER = "https://github.com/fluttercommunity/plus_plugins/issues"
SECTION = "graphics"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=aaa4daf7a83c6896af2c007b59db56e4"

SRC_URI = "git://github.com/fluttercommunity/plus_plugins.git;lfs=0;branch=main;protocol=https;destsuffix=git"

SRCREV = "${AUTOSRC}"

S = "${WORKDIR}/git"

PUBSPEC_APPNAME = "connectivity_plus"
FLUTTER_APPLICATION_PATH = "packages/connectivity_plus/connectivity_plus/example"
FLUTTER_APPLICATION_DELETE_LINUX_FOLDER = "1"
FLUTTER_APPLICATION_INSTALL_PREFIX = "flutter/examples/plugins"

inherit flutter-app
