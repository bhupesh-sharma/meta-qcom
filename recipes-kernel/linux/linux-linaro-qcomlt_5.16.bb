# Copyright (C) 2021 Linaro
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-kernel/linux/linux-linaro-qcom.inc

COMPATIBLE_MACHINE = "(sa8155p)"
#SRC_URI:append = " file://0001-Revert-kbuild-Enable-DT-schema-checks-for-.dtb-targe.patch"
LINUX_LINARO_QCOM_GIT = "git://git.linaro.org/people/bhupesh.sharma/kernel.git;protocol=https"
SRCBRANCH = "release/sa8155p-adp/qcomlt-5.16"
SRCREV = "f9d51e19c1dd51659c16c10a6de12999b56e3f32"
