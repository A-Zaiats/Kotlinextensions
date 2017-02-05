# Kotlinextensions
Kotlin library for Android providing useful extensions to eliminate boilerplate code

## Usage

#### Context extensions

read-only properties:

- displayWidth - The absolute width of the available display size in pixels.
- displayHeight - he absolute height of the available display size in pixels.
- displayMetricks - The resource's current display metrics.
- inflater - android.view.LayoutInflater obtained from current context.

system managers as context's read-only properties:

- inputManager
- notificationManager
- keyguardManager
- telephonyManager
- devicePolicyManager

methods:

- `toast(text: CharSequence, duration: Int = Toast.LENGTH_LONG)` - show toast with message.
- `toast(@StringRes textId: Int, duration: Int = Toast.LENGTH_LONG)` - show toast with message from sting resources.
- `intent<ComponentClass>()` - create an intent for a specific component.
- `startActivity<ActivityClass>()` - launch a new activity with no options specified.
- `startService<ServiceClass>()` - launch a new service with no options specified.
- `getInteger(@IntegerRes id: Int)` - returns the integer value contained in the resource.
- `getBoolean(@BoolRes id: Int)` - returns the boolean value contained in the resource.
- `inflateLayout(@LayoutRes layoutId: Int, parent: ViewGroup? = null, attachToRoot: Boolean = false)` - inflate a new view.
- `browse(url: String, newTask: Boolean = false): Boolean` - display the data by url.
- `share(text: String, subject: String = ""): Boolean` - open a chooser for text sharing.
- `email(email: String, subject: String = "", text: String = ""): Boolean` - send an email.
- `makeCall(number: String): Boolean` - make a phone call
- `sendSms(number: String, text: String = ""): Boolean` - send an sms.
- `rate(): Boolean` - open current app on the Google Play Store.

#### Fragment extensions

methods:

- `toast(text: CharSequence, duration: Int = Toast.LENGTH_LONG)` - show toast with message.
- `toast(@StringRes textId: Int, duration: Int = Toast.LENGTH_LONG)` - show toast with message from sting resources.
- `browse(url: String, newTask: Boolean = false): Boolean` - display the data by url.
- `share(text: String, subject: String = ""): Boolean` - open a chooser for text sharing.
- `email(email: String, subject: String = "", text: String = ""): Boolean` - send an email.
- `makeCall(number: String): Boolean` - make a phone call
- `sendSms(number: String, text: String = ""): Boolean` - send an sms.
- `rate(): Boolean` - open current app on the Google Play Store.

#### Useful functions

- `runOnUiThread(action: () -> Unit)` - run action on UI thread
- `runDelayed(delayMillis: Long, action: () -> Unit)` run action with delay
- `runDelayedOnUiThread(delayMillis: Long, action: () -> Unit)` - run action on UI thread with delay

## License
    Copyright 2016 Andrei Zaiats

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

      http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
