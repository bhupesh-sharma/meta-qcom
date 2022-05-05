# Copyright (C) 2021 Linaro
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-kernel/linux/linux-linaro-qcom.inc

COMPATIBLE_MACHINE = "(sa8155p)"

LINUX_LINARO_QCOM_GIT:sa8155p = "git://git.linaro.org/people/bhupesh.sharma/kernel.git;protocol=https"
SRCBRANCH:sa8155p = "sa8155p-adp-board-gnss-for-sharing-v1-based-on-linux-next"
SRCREV:sa8155p = "397b7539851cbe6569dfd400737964f3369db8ba"
