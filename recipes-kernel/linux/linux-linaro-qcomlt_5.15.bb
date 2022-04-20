# Copyright (C) 2021 Linaro
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-kernel/linux/linux-linaro-qcom.inc

# SRCBRANCH set to "release/qcomlt-5.15" in linux-linaro-qcom.inc
SRCREV = "9bc25b368335b6d3d59be44db0c4818bdfbfa546"

# SRCBRANCH set to adp stable release branch
SRCBRANCH:sa8155p = "release/sa8155p-adp/v5.15.y-eth-single-queue"
SRCREV:sa8155p = "ec88afff41eaf94dce5507f957a4d71b59d4cb55"
SRC_URI:sa8155p = "git://git.linaro.org/people/bhupesh.sharma/kernel.git;branch=${SRCBRANCH}"
