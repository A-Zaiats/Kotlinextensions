package io.github.azaiats.kotlinextensions

import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.Adapter
import android.widget.AdapterView
import android.widget.TextView

/**
 * @author Andrei Zaiats
 * @since 10/10/2017
 */
inline fun View.onClick(crossinline action: () -> Unit) = setOnClickListener { action() }

inline fun <T: Adapter> AdapterView<T>.onItemSelected(crossinline action: (Int) -> Unit) {
    onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
        override fun onNothingSelected(parent: AdapterView<*>?) = Unit
        override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) = action(position)
    }
}

inline fun TextView.onTextChanged(crossinline action: (CharSequence) -> Unit) {
    addTextChangedListener(object : TextWatcher {
        override fun afterTextChanged(s: Editable?) = Unit
        override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) = Unit
        override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) = action(s ?: "")
    })
}