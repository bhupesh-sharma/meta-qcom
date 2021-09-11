SUMMARY = "simple low-level testing tool for qcom boards"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=987293312a134ab40eec5f3d446cfaff"

SRCREV = "999c82b3b006004ce0f05821358132cdab2ebee6"
SRC_URI = "git://github.com/bhupesh-sharma/bootrr.git;protocol=https"
SRCBRANCH = "license-bootrr"
SRC_URI[sha256sum] = "5035b9984326325ebb9c58e91bf474a6b4f0a334c5720c97263b01d9588cd9fd"

S = "${WORKDIR}/git"

do_install() {
        mkdir -p ${D}${bindir}
	for file in $(ls boards/*)
	do
		install -m 0755 $file ${D}${bindir}/$(basename $file)
	done
	
	for file in $(ls helpers/*)
	do
		install -m 0755 $file ${D}${bindir}/$(basename $file)
	done
}

RDEPENDS_${PN} = "bash"
