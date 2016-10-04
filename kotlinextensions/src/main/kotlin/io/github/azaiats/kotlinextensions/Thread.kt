package io.github.azaiats.kotlinextensions

import android.os.Handler
import android.os.Looper

/**
 * @author Andrei Zaiats
 * @since 10/04/2016
 */
fun runOnUiThread(action: () -> Unit){
    if (ContextHandler.mainThread == Thread.currentThread()) action() else ContextHandler.handler.post { action() }
}

fun runDelayed(delayMillis: Long, action: () -> Unit) {
    Handler().postDelayed(action, delayMillis)
}

fun runDelayedOnUiThread(delayMillis: Long, action: () -> Unit) {
    ContextHandler.handler.postDelayed(action, delayMillis)
}

private object ContextHandler {
    val handler = Handler(Looper.getMainLooper())
    val mainThread = Looper.getMainLooper().thread
}