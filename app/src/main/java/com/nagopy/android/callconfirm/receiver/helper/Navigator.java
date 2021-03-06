/*
 * Copyright 2017 75py
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.nagopy.android.callconfirm.receiver.helper;

import android.app.Application;
import android.content.Intent;

import com.nagopy.android.callconfirm.di.ReceiverScope;
import com.nagopy.android.callconfirm.view.ConfirmActivity;

import javax.inject.Inject;

@ReceiverScope
public class Navigator {

    @Inject
    Application context;

    @Inject
    Navigator() {
    }

    public void startConfirmActivity(String phoneNumber) {
        Intent intent = new Intent(context, ConfirmActivity.class);
        intent.putExtra(Intent.EXTRA_PHONE_NUMBER, phoneNumber);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP);
        context.startActivity(intent);
    }

}
