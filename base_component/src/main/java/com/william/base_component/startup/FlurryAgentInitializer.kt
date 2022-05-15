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

package com.william.base_component.startup

import android.content.Context
import androidx.startup.Initializer
import com.flurry.android.FlurryAgent
import com.william.base_component.BaseApp
import com.william.base_component.BuildConfig
import com.william.base_component.extension.logD


/**
 * @author William
 * @date 2022/5/15 11:11
 * Class Comment：FlurryAgent Initializer
 */
class FlurryAgentInitializer : Initializer<Unit> {

    override fun create(context: Context) {
        FlurryAgent.Builder()
            .withLogEnabled(BuildConfig.DEBUG)
            .withCaptureUncaughtExceptions(true)
            .build(context, BaseApp.FLURRY_KEY)
        "FlurryAgent init".logD()
    }

    override fun dependencies(): List<Class<out Initializer<*>>> {
        return emptyList()
    }

}