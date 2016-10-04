package io.github.azaiats.kotlinextensions

import android.app.Fragment
import android.support.annotation.StringRes
import android.widget.Toast
import android.support.v4.app.Fragment as SupportFragment

/**
 * @author Andrei Zaiats
 * @since 10/03/2016
 */
fun Fragment?.toast(text: CharSequence, duration: Int = Toast.LENGTH_LONG) = this?.let { activity.toast(text, duration) }

fun Fragment?.toast(@StringRes textId: Int, duration: Int = Toast.LENGTH_LONG) = this?.let { activity.toast(textId, duration) }

fun SupportFragment?.toast(text: CharSequence, duration: Int = Toast.LENGTH_LONG) = this?.let { activity.toast(text, duration) }

fun SupportFragment?.toast(@StringRes textId: Int, duration: Int = Toast.LENGTH_LONG) = this?.let { activity.toast(textId, duration) }