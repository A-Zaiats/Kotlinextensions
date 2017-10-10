@file:Suppress("unused")

package io.github.azaiats.kotlinextensions

/**
 * @author Andrei Zaiats
 * @since 02/05/2017
 */
class Optional<T> private constructor(private val value: T?) {

    companion object {

        fun <T> of(value: T) = Optional(value)

        fun <T> ofNullable(value: T?) = Optional(value)

        fun <T> empty() = Optional(null as T?)
    }

    fun get(): T = value ?: error("No value present")

    fun isPresent() = value != null

    fun ifPresent(action: (T) -> Unit) = value?.let(action)

    fun orElse(other: T): T = value ?: other

    fun orElseGet(producer: () -> T): T = value ?: producer()

    fun orElseNullable(other: T?): T? = value ?: other

    fun orElseGetNullable(producer: () -> T?): T? = value ?: producer()

    fun <E: Throwable> orElseThrow(producer: () -> E): T = value ?: throw producer()

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other?.javaClass != javaClass) return false

        other as Optional<*>

        return value == other.value
    }

    override fun hashCode(): Int {
        return value?.hashCode() ?: 0
    }

    override fun toString(): String {
        return "Optional(value=$value)"
    }

}