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

package com.nagopy.android.callconfirm.view.helper;

import android.widget.ImageView;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.any;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class DataBindingAdapterTest {

    @Mock
    ImageView imageView;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void setImageUri() throws Exception {
        DataBindingAdapter.setImageUri(imageView, null);
        verify(imageView, times(0)).setImageURI(any());

        DataBindingAdapter.setImageUri(imageView, "");
        verify(imageView, times(0)).setImageURI(any());

        DataBindingAdapter.setImageUri(imageView, "test");
        verify(imageView, times(1)).setImageURI(any());
    }

}