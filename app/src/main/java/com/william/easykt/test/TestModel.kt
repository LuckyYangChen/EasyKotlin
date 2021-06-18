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

package com.william.easykt.test

import com.william.base_component.mvp.base.BaseModel
import com.william.base_component.net.data.BaseResponse
import com.william.easykt.data.Banner
import com.william.easykt.service.Api
import io.reactivex.Observable


/**
 * @author William
 * @date 2020/5/3 15:52
 * Class Comment：
 */
class TestModel : BaseModel(), TestContract.IModel {

    override fun getBanners(): Observable<BaseResponse<List<Banner>>> {
        return Api.apiService.getBanners()
    }

}