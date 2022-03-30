SUMMARY = "Fwupd Flutter Plugin Example"
DESCRIPTION = "Native Dart client library to control firmware updates on Linux."
AUTHOR = "Canonical"
HOMEPAGE = "https://github.com/canonical/bluez.dart"
BUGTRACKER = "https://github.com/canonical/bluez.dart/issues"
SECTION = "graphics"

LICENSE = "MPL-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=9741c346eef56131163e13b9db1241b3"

DEPENDS += "fwupd"

SRC_URI = "git://github.com/canonical/fwupd.dart.git;lfs=0;branch=main;protocol=https;destsuffix=git"

SRCREV = "${AUTOSRC}"

S = "${WORKDIR}/git"

#PUBSPEC_APPNAME = "battery_plus_example"
#FLUTTER_APPLICATION_PATH = "packages/battery_plus/battery_plus/example"
FLUTTER_APPLICATION_DELETE_LINUX_FOLDER = "1"
FLUTTER_APPLICATION_INSTALL_PREFIX = "flutter/examples/plugins"

# flutter create fwupd_example

inherit flutter-app
