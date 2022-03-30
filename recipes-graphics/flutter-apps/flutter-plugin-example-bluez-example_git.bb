SUMMARY = "Bluez Flutter Plugin Example"
DESCRIPTION = "Provides a client to connect to BlueZ - the Linux Bluetooth stack."
AUTHOR = "Canonical"
HOMEPAGE = "https://github.com/canonical/bluez.dart"
BUGTRACKER = "https://github.com/canonical/bluez.dart/issues"
SECTION = "graphics"

LICENSE = "MPL-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=815ca599c9df247a0c7f619bab123dad"

SRC_URI = "git://github.com/canonical/bluez.dart.git;lfs=0;branch=main;protocol=https;destsuffix=git"

SRCREV = "${AUTOSRC}"

S = "${WORKDIR}/git"

#PUBSPEC_APPNAME = "battery_plus_example"
#FLUTTER_APPLICATION_PATH = "packages/battery_plus/battery_plus/example"
FLUTTER_APPLICATION_DELETE_LINUX_FOLDER = "1"
FLUTTER_APPLICATION_INSTALL_PREFIX = "flutter/examples/plugins"

# flutter create example/
#list_adapters
#list_devices
#list_services
#monitor
#pair
#scan


inherit flutter-app
