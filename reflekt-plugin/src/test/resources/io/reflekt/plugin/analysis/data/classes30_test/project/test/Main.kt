package io.reflekt.test

import io.reflekt.Reflekt

fun main() {
    val classes = Reflekt.classes().withAnnotations<B1>().withSubType<B1>()
}
