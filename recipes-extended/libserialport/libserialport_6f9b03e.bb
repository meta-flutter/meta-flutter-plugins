DESCRIPTION = "libserialport is a minimal, cross-platform shared library written in C that is intended to take care of the OS-specific details when writing software that uses serial ports."
HOMEPAGE = "https://sigrok.org/wiki/Libserialport"

LICENSE = "LGPL-3.0+"
LIC_FILES_CHKSUM = "file://COPYING;md5=e6a600fd5e1d9cbde2d983680233ad02"

inherit autotools-brokensep

SRC_URI = "git://github.com/sigrokproject/libserialport.git;protocol=https;branch=master"
SRCREV = "6f9b03e597ea7200eb616a4e410add3dd1690cb1"

S = "${WORKDIR}/git"

do_configure_prepend() {
    cd ${S}
    ./autogen.sh
}