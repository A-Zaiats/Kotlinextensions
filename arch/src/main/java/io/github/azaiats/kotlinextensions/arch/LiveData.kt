package io.github.azaiats.kotlinextensions.arch

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.Transformations

/**
 * @author Andrei Zaiats
 * @since 10/10/2017
 */
inline fun <T, R> LiveData<T>.map(crossinline mapper: (T) -> R): LiveData<R> = Transformations.map(this) { mapper(it) }

inline fun <T, R> LiveData<T>.map(crossinline supplier: () -> R): LiveData<R> = Transformations.map(this) { supplier() }

inline fun <T, R> LiveData<T>.flatMap(crossinline mapper: (T) -> LiveData<R>): LiveData<R> = Transformations.switchMap(this) { mapper(it) }

inline fun <T, R> LiveData<T>.flatMap(crossinline supplier: () -> LiveData<R>): LiveData<R> = Transformations.switchMap(this) { supplier() }