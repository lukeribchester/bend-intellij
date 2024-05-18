package com.higherorderco.bend.language.psi

import com.higherorderco.bend.language.BendFileType
import com.higherorderco.bend.language.BendLanguage
import com.intellij.extapi.psi.PsiFileBase
import com.intellij.openapi.fileTypes.FileType
import com.intellij.psi.FileViewProvider
import org.jetbrains.annotations.NotNull


class BendFile(@NotNull viewProvider: FileViewProvider?) :
    PsiFileBase(viewProvider!!, BendLanguage.INSTANCE) {
    @NotNull
    override fun getFileType(): FileType {
        return BendFileType.INSTANCE
    }

    override fun toString(): String {
        return "Bend File"
    }
}
