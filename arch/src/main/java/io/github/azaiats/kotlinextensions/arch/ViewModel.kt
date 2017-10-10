package io.github.azaiats.kotlinextensions.arch

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider
import android.arch.lifecycle.ViewModelProviders
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentActivity

/**
 * @author Andrei Zaiats
 * @since 10/10/2017
 */
inline fun <reified T : ViewModel> FragmentActivity.bindViewModel(): T = ViewModelProviders.of(this)[T::class.java]

inline fun <reified T : ViewModel> FragmentActivity.bindViewModel(factory: ViewModelProvider.Factory): T = ViewModelProviders.of(this, factory)[T::class.java]

inline fun <reified T : ViewModel> Fragment.bindViewModel(): T = ViewModelProviders.of(this)[T::class.java]

inline fun <reified T : ViewModel> Fragment.bindViewModel(factory: ViewModelProvider.Factory): T = ViewModelProviders.of(this, factory)[T::class.java]

inline fun <reified T : ViewModel> Fragment.bindParentViewModel(): T = ViewModelProviders.of(parentFragment)[T::class.java]

inline fun <reified T : ViewModel> Fragment.bindParenViewModel(factory: ViewModelProvider.Factory): T = ViewModelProviders.of(parentFragment, factory)[T::class.java]

inline fun <reified T : ViewModel> Fragment.bindHostViewModel(): T = ViewModelProviders.of(activity)[T::class.java]

inline fun <reified T : ViewModel> Fragment.bindHostViewModel(factory: ViewModelProvider.Factory): T = ViewModelProviders.of(activity, factory)[T::class.java]