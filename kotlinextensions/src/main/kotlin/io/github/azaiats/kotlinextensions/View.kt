package io.github.azaiats.kotlinextensions

import android.support.annotation.ColorRes
import android.support.annotation.IdRes
import android.support.annotation.StringRes
import android.support.design.widget.BaseTransientBottomBar.Duration
import android.support.design.widget.Snackbar
import android.view.View

/**
 * @author Andrei Zaiats
 * @since 10/03/2016
 */
inline fun <reified T : View> View.find(@IdRes id: Int) = findViewById(id) as T

inline fun <reified T : View> View.findOptional(@IdRes id: Int) = findViewById(id) as? T

fun View.snack(message: String, length: Int = Snackbar.LENGTH_LONG) = snack(message, length) {}

fun View.snack(@StringRes messageRes: Int, length: Int = Snackbar.LENGTH_LONG) = snack(messageRes, length) {}

inline fun View.snack(message: String, @Duration length: Int = Snackbar.LENGTH_LONG, f: Snackbar.() -> Unit) {
    val snack = Snackbar.make(this, message, length)
    snack.f()
    snack.show()
}

inline fun View.snack(@StringRes messageRes: Int, @Duration length: Int = Snackbar.LENGTH_LONG, f: Snackbar.() -> Unit) {
    val snack = Snackbar.make(this, messageRes, length)
    snack.f()
    snack.show()
}

fun Snackbar.action(text: String, @ColorRes color: Int? = null, listener: (View) -> Unit) {
    setAction(text, listener)
    color?.let { setActionTextColor(color) }
}