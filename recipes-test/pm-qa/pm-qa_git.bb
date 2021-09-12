SUMMARY = "PM-QA validation test suite for the power management on Linux"

LICENSE = "GPL v2"
LIC_FILES_CHKSUM = "file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263"

SRCREV = "5ead8481bc9b315dfd71e0d34384d1cc7a923007"
SRC_URI = "git://git.linaro.org/power/pm-qa.git;protocol=https"
SRCBRANCH = "master"

S = "${WORKDIR}/git"

do_install() {
        mkdir -p ${D}${bindir}
	for file in $(ls utils/*)
	do
		install -m 0755 $file ${D}${bindir}/$(basename $file)
	done

	for file in $(ls cpufreq/*.sh)
	do
		install -m 0755 $file ${D}${bindir}/$(basename $file)
	done

	for file in $(ls cpuhotplug/*.sh)
	do
		install -m 0755 $file ${D}${bindir}/$(basename $file)
	done

	for file in $(ls cpuidle/*.sh)
	do
		install -m 0755 $file ${D}${bindir}/$(basename $file)
	done

	for file in $(ls cputopology/*.sh)
	do
		install -m 0755 $file ${D}${bindir}/$(basename $file)
	done

	for file in $(ls thermal/*.sh)
	do
		install -m 0755 $file ${D}${bindir}/$(basename $file)
	done

	for file in $(ls include/*.sh)
	do
		install -m 0755 $file ${D}${bindir}/$(basename $file)
	done

}
