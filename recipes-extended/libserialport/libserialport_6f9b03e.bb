DESCRIPTION = "libserialport is a minimal, cross-platform shared library written in C that is intended to take care of the OS-specific details when writing software that uses serial ports."
HOMEPAGE = "https://sigrok.org/wiki/Libserialport"

LICENSE = "LGPL-3.0+"
LIC_FILES_CHKSUM = "file://COPYING;md5=e6a600fd5e1d9cbde2d983680233ad02"

inherit autotools

SRC_URI = "https://sigrok.org/gitweb/?p=libserialport.git;a=snapshot;h=6f9b03e597ea7200eb616a4e410add3dd1690cb1;sf=zip"

SRC_URI[md5sum] = "b93f0325a6157198152b5bd7e8182b51"
SRC_URI[sha256sum] = "4a2af9d9c3ff488e92fb75b4ba38b35bcf9b8a66df04773eba2a7bbf1fa7529d"
