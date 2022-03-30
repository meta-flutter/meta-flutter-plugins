https://github.com/canonical/gsettings.dart

SUMMARY = "GSetting Flutter Plugin Example"
DESCRIPTION = "Provides a client to use GSettings - a settings database used for storing user preferences on Linux."
AUTHOR = "Canonical"
HOMEPAGE = "https://github.com/canonical/gsettings.dart"
BUGTRACKER = "https://github.com/canonical/gsettings.dart/issues"
SECTION = "graphics"

LICENSE = "MPL-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=9741c346eef56131163e13b9db1241b3"

SRC_URI = "git://github.com/canonical/gsettings.dart.git;lfs=0;branch=main;protocol=https;destsuffix=git"

SRCREV = "${AUTOSRC}"

S = "${WORKDIR}/git"

#PUBSPEC_APPNAME = "battery_plus_example"
#FLUTTER_APPLICATION_PATH = "packages/battery_plus/battery_plus/example"
FLUTTER_APPLICATION_DELETE_LINUX_FOLDER = "1"
FLUTTER_APPLICATION_INSTALL_PREFIX = "flutter/examples/plugins"

# flutter create gsettings_example

inherit flutter-app
