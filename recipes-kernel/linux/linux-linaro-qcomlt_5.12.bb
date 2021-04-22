# Copyright (C) 2014-2021 Linaro
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "Linux kernel (bhsharma, Linaro Git)"
LIC_FILES_CHKSUM = "file://COPYING;md5=6bc538ed5bd9a7fc9398086aedcd7e46"

require recipes-kernel/linux/linux-linaro-qcom.inc
require recipes-kernel/linux/linux-qcom-bootimg.inc

LOCALVERSION ?= "-linaro-lt-qcom"

SRCBRANCH = "sa8155p-adp-board-v2-w-crypto"
SRCREV = "1fa6792d4194c297ec2c8856f5bbb78ceab66fcc"

COMPATIBLE_MACHINE = "(sa8155p)"
