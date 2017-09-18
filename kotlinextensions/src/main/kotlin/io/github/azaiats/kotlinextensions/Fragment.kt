@file:Suppress("unused")

package io.github.azaiats.kotlinextensions

import android.app.Fragment
import android.support.annotation.StringRes
import android.support.v4.app.NotificationCompat
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

inline fun Fragment.notification(body: NotificationCompat.Builder.() -> Unit) = activity.notification(body)

inline fun SupportFragment.notification(body: NotificationCompat.Builder.() -> Unit) = activity.notification(body)

fun Fragment.browse(url: String, newTask: Boolean = false) = activity.browse(url, newTask)

fun SupportFragment.browse(url: String, newTask: Boolean = false) = activity.browse(url, newTask)

fun Fragment.share(text: String, subject: String = "") = activity.share(text, subject)

fun SupportFragment.share(text: String, subject: String = "") = activity.share(text, subject)

fun Fragment.email(email: String, subject: String = "", text: String = "") = activity.email(email, subject, text)

fun SupportFragment.email(email: String, subject: String = "", text: String = "") = activity.email(email, subject, text)

fun Fragment.makeCall(number: String) = activity.makeCall(number)

fun SupportFragment.makeCall(number: String) = activity.makeCall(number)

fun Fragment.sendSms(number: String, text: String = "") = activity.sendSms(number, text)

fun SupportFragment.sendSms(number: String, text: String = "") = activity.sendSms(number, text)

fun Fragment.rate() = activity.rate()

fun SupportFragment.rate() = activity.rate()