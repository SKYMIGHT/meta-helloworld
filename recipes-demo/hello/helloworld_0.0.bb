DESCRIPTION = "Hello World sample program"
PR = "r0"
LIC_FILES_CHKSUM = "file://hello.c;md5=433c43099b0665d0b580249d4cd0a998"
SRC_URI = "file://hello.c"

LICENSE = "MIT"

S = "${WORKDIR}"

do_compile() {
             ${CC} ${CFLAGS} ${LDFLAGS} -o hello hello.c
}

do_install() {
             install -d ${D}${bindir}/
             install -m 0755 ${S}/hello ${D}${bindir}/
}

FILES_${PN} = "${bindir}/hello"
