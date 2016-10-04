package io.github.azaiats.kotlinextensions

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.support.annotation.BoolRes
import android.support.annotation.IntegerRes
import android.support.annotation.LayoutRes
import android.support.annotation.StringRes
import android.util.DisplayMetrics
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.InputMethodManager
import android.widget.Toast

/**
 * @author Andrei Zaiats
 * @since 10/03/2016
 */
val Context.displayWidth: Int
    get() = resources.displayMetrics.widthPixels

val Context.displayHeight: Int
    get() = resources.displayMetrics.heightPixels

val Context.displayMetrick: DisplayMetrics
    get() = resources.displayMetrics

inline fun <reified T : Activity> Context?.startActivity() = this?.startActivity(Intent(this, T::class.java))

fun Context?.toast(text: CharSequence, duration: Int = Toast.LENGTH_LONG) = this?.let { Toast.makeText(it, text, duration).show() }

fun Context?.toast(@StringRes textId: Int, duration: Int = Toast.LENGTH_LONG) = this?.let { Toast.makeText(it, textId, duration).show() }

fun Context.getInteger(@IntegerRes id: Int) = resources.getInteger(id)

fun Context.getBoolean(@BoolRes id: Int) = resources.getBoolean(id)

fun Context.inflateLayout(@LayoutRes layoutId: Int, parent: ViewGroup? = null, attachToRoot: Boolean = false): View
        = LayoutInflater.from(this).inflate(layoutId, parent, attachToRoot)

val Context.inputManager: InputMethodManager?
    get() = getSystemService(Context.INPUT_METHOD_SERVICE) as? InputMethodManager

