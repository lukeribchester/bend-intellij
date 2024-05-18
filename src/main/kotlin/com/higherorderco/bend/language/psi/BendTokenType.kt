package com.higherorderco.bend.language.psi

import com.higherorderco.bend.language.BendLanguage
import com.intellij.psi.tree.IElementType
import org.jetbrains.annotations.NonNls
import org.jetbrains.annotations.NotNull


class BendTokenType(@NotNull @NonNls debugName: String?) :
    IElementType(debugName.toString(), BendLanguage.INSTANCE) {
}
