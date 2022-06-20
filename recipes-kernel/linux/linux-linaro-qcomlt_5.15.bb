# Copyright (C) 2021 Linaro
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-kernel/linux/linux-linaro-qcom.inc

# SRCBRANCH set to "release/qcomlt-5.15" in linux-linaro-qcom.inc
SRCREV = "9bc25b368335b6d3d59be44db0c4818bdfbfa546"

# sa8155p: SRCBRANCH set to adp stable release branch
SRCBRANCH:sa8155p = "release/sa8155p-adp/v5.15.y"
SRCREV:sa8155p = "f721c52e0d32f1f4f765dbddf125cae331f75bf7"

# qcs8155p: SRCBRANCH is also set to adp stable release branch (for now)
SRCBRANCH:qcs8155p = "release/sa8155p-adp/v5.15.y"
SRCREV:qcs8155p = "f721c52e0d32f1f4f765dbddf125cae331f75bf7"
