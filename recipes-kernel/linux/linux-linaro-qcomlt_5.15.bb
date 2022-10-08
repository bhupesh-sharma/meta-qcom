# Copyright (C) 2021 Linaro
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-kernel/linux/linux-linaro-qcom.inc

# SRCBRANCH set to "release/qcomlt-5.15" in linux-linaro-qcom.inc
SRCREV = "9bc25b368335b6d3d59be44db0c4818bdfbfa546"

# SRCBRANCH set to adp stable release branch
LINUX_LINARO_QCOM_GIT:sa8155p = "git://git.linaro.org/people/bhupesh.sharma/kernel.git;protocol=https"
SRCBRANCH:sa8155p = "release/sa8155p-adp/v5.15.y"
SRCREV:sa8155p = "1e8a24b8874f0e0157653f058aceaa1104f20b22"
