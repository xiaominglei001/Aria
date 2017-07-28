/*
 * Copyright (C) 2016 AriaLyy(https://github.com/AriaLyy/Aria)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.arialyy.aria.core.download;

import android.os.Handler;
import com.arialyy.aria.core.inf.IDownloadListener;

/**
 * Created by Aria.Lao on 2017/7/20.
 * 普通任务下载的事件监听器
 */
class DownloadListener extends BaseListener<DownloadEntity, DownloadTask>
    implements IDownloadListener {
  DownloadListener(DownloadTask task, Handler outHandler) {
    super(task, outHandler);
  }

  @Override public void supportBreakpoint(boolean support) {

  }

}
