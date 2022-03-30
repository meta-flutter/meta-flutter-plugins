SUMMARY = "Linux System Info Plugin Example"
DESCRIPTION = "A library for getting linux system information"
AUTHOR = "Lorenzo Torres"
HOMEPAGE = "https://github.com/LolzDEV/linux_system_info"
BUGTRACKER = "https://github.com/LolzDEV/linux_system_info/issues"
SECTION = "graphics"

LICENSE = "GPL-3.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1ebbd3e34237af26da5dc08a4e440464"

SRC_URI = "git://github.com/LolzDEV/linux_system_info.git;lfs=0;branch=master;protocol=https;destsuffix=git"

SRCREV = "${AUTOSRC}"

S = "${WORKDIR}/git"

#PUBSPEC_APPNAME = "geolocator_example"
#FLUTTER_APPLICATION_PATH = "geolocator/example/"
FLUTTER_APPLICATION_DELETE_LINUX_FOLDER = "1"
FLUTTER_APPLICATION_INSTALL_PREFIX = "flutter/examples/plugins"

# flutter create linux_syste_info

inherit flutter-app
