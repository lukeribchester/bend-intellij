package com.higherorderco.bend.language

import com.intellij.lang.Language


object BendLanguage : Language("Bend") {
    private fun readResolve(): Any = BendLanguage

    val INSTANCE: BendLanguage = BendLanguage
}
