/*
 * Copyright WeiLianYang
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.william.easykt.utils

import android.os.Build
import com.blankj.utilcode.util.RomUtils
import com.william.base_component.utils.logI

/**
 *  author : WilliamYang
 *  date : 2021/11/8 9:33
 *  description :
 */

/**
 * MANUFACTURER: HUAWEI，BRAND: HUAWEI，DEVICE: HWMED-M，MODEL: MED-AL00，DISPLAY: MED-AL00 10.1.0.208(C00E57R4P1)，
 * PRODUCT: MED-AL00，FINGERPRINT: HUAWEI/MED-AL00/HWMED-M:10/HUAWEIMED-AL00/10.1.0.208C00:user/release-keys，
 * SUPPORTED_ABIS: [armeabi-v7a, armeabi]，ID: HUAWEIMED-AL00，TAGS: release-keys，
 * HOST: cn-central-hcd-2a-187d25e511633677831202-5cbf8d588c-bvn8j，SDK_INT: 29，
 * BOARD: MED，HARDWARE: mt6765，RomInfo{name=huawei, version=10.1.0}
 */
fun getBuildInfo() {
    StringBuilder().apply {

        append("MANUFACTURER: " + Build.MANUFACTURER)
        append("，BRAND: " + Build.BRAND)
        append("，DEVICE: " + Build.DEVICE)
        append("，MODEL: " + Build.MODEL)
        append("，DISPLAY: " + Build.DISPLAY)
        append("，PRODUCT: " + Build.PRODUCT)
        append("，FINGERPRINT: " + Build.FINGERPRINT)
        append("，SUPPORTED_ABIS: " + Build.SUPPORTED_ABIS.contentToString())
        append("，ID: " + Build.ID)
        append("，TAGS: " + Build.TAGS)
        append("，HOST: " + Build.HOST)
        append("，SDK_INT: " + Build.VERSION.SDK_INT.toString())
        append("，BOARD: " + Build.BOARD)
        append("，HARDWARE: " + Build.HARDWARE)
        append("，" + RomUtils.getRomInfo().toString())

        toString().logI()
    }
}
