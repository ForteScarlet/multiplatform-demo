@file:JvmName("Util")

import kotlin.jvm.JvmName

fun foo(block: (String) -> Int): Int {
    return block("foo") + 1
}



