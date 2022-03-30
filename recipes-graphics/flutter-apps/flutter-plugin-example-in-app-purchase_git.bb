SUMMARY = "In App Purchases Flutter Plugin Example"
DESCRIPTION = "A Flutter plugin for In App Purchases."
AUTHOR = "Flutter Team"
HOMEPAGE = "https://plus.fluttercommunity.dev/"
BUGTRACKER = "https://github.com/flutter/flutter/issues"
SECTION = "graphics"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a60894397335535eb10b54e2fff9f265"

SRC_URI = "git://github.com/flutter/plugins.git;lfs=0;branch=main;protocol=https;destsuffix=git"

SRCREV = "${AUTOSRC}"

S = "${WORKDIR}/git"

PUBSPEC_APPNAME = "in_app_purchase_example"
FLUTTER_APPLICATION_PATH = "packages/in_app_purchase/in_app_purchase/example"
FLUTTER_APPLICATION_DELETE_LINUX_FOLDER = "1"
FLUTTER_APPLICATION_INSTALL_PREFIX = "flutter/examples/plugins"

inherit flutter-app
