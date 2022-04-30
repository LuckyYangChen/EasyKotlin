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

package com.william.easykt.ui

import com.william.base_component.activity.BaseActivity
import com.william.base_component.extension.bindingView
import com.william.base_component.extension.dp
import com.william.easykt.R
import com.william.easykt.databinding.ActivityRoundCornerBinding


/**
 * @author William
 * @date 2022/4/30 19:54
 * Class Comment：round corner layout
 */
class RoundCornerLayoutActivity : BaseActivity() {

    override val viewBinding: ActivityRoundCornerBinding by bindingView()

    override fun initAction() {

    }

    override fun initData() {
        setTitleText(R.string.test_round_rect)

        viewBinding.rclCustom1.setCornerRadius(16.dp)
        viewBinding.rclCustom2.setSpecialCorner(12.dp, 18.dp, 24.dp, 30.dp)

    }
}