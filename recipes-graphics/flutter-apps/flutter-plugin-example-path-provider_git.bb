SUMMARY = "Path Provider Flutter Plugin Example"
DESCRIPTION = "A Flutter plugin for Path Provider."
AUTHOR = "Flutter Team"
HOMEPAGE = "https://plus.fluttercommunity.dev/"
BUGTRACKER = "https://github.com/flutter/flutter/issues"
SECTION = "graphics"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a60894397335535eb10b54e2fff9f265"

DEPENDS += "\
    flutter-engine-${FLUTTER_RUNTIME} \
    "

SRC_URI = "git://github.com/flutter/plugins.git;lfs=0;branch=main;protocol=https;destsuffix=git"

SRCREV = "b3e37559f96652fc91b14d3970cbf1c38c7a5c05"

S = "${WORKDIR}/git"

PUBSPEC_APPNAME = "path_provider_example"
FLUTTER_APPLICATION_PATH = "packages/path_provider/path_provider/example"
FLUTTER_APPLICATION_TEST_ROOT = "${FLUTTER_APPLICATION_PATH}/.."
FLUTTER_APPLICATION_RUN_TEST = "1"
FLUTTER_APPLICATION_CLEAR_LINUX_FOLDER = "1"
FLUTTER_APPLICATION_INSTALL_PREFIX = "flutter/examples/plugins"

inherit flutter-app
