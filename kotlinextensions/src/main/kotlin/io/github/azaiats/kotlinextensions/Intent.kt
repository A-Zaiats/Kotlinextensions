package io.github.azaiats.kotlinextensions

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle

/**
 * @author Andrei Zaiats
 * @since 12/27/2016
 */
inline fun intent(body: Intent.() -> Unit): Intent {
    val intent = Intent()
    intent.body()
    return intent
}

inline fun intent(action: String, body: Intent.() -> Unit): Intent {
    val intent = Intent(action)
    intent.body()
    return intent
}

inline fun intent(action: String, uri: Uri, body: Intent.() -> Unit): Intent {
    val intent = Intent(action, uri)
    intent.body()
    return intent
}

inline fun <reified T : Any> intent(context: Context, body: Intent.() -> Unit): Intent {
    val intent = Intent(context, T::class.java)
    intent.body()
    return intent
}

inline fun bundle(body: Bundle.() -> Unit): Bundle {
    val bundle = Bundle()
    bundle.body()
    return bundle
}