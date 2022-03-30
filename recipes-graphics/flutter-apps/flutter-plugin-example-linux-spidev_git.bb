SUMMARY = "Linux SPI device Flutter Plugin Example"
DESCRIPTION = "A dart package for SPI using the linux spidev interface."
AUTHOR = "Hannes Winkler"
HOMEPAGE = "https://github.com/ardera/flutter_packages"
BUGTRACKER = "https://github.com/ardera/flutter_packages/issues"
SECTION = "graphics"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=9950fa17ba55dae6a2fff5386d065d1c"

DEPENDS += "\
    flutter-engine-${FLUTTER_RUNTIME} \
    "

SRC_URI = "git://github.com/ardera/flutter_packages.git;lfs=0;branch=main;protocol=https;destsuffix=git"

SRCREV = "a3b1656eb4938fd1c892ad8c3e3a2a5e215f4290"

S = "${WORKDIR}/git"

PUBSPEC_APPNAME = "linux_spidev_example"
FLUTTER_APPLICATION_PATH = "packages/linux_spidev/example/"
FLUTTER_APPLICATION_INSTALL_PREFIX = "flutter/examples/plugins"

inherit flutter-app
