package com.higherorderco.bend.language

import com.higherorderco.bend.BendIcons
import com.intellij.openapi.fileTypes.LanguageFileType
import org.jetbrains.annotations.NotNull
import org.jetbrains.annotations.Nullable
import javax.swing.Icon


class BendFileType private constructor() : LanguageFileType(BendLanguage.INSTANCE) {
    @NotNull
    override fun getName(): String {
        return "Bend File"
    }

    @NotNull
    override fun getDescription(): String {
        return "Bend file"
    }

    @NotNull
    override fun getDefaultExtension(): String {
        return "bend"
    }

    @Nullable
    override fun getIcon(): Icon {
        return BendIcons.FILE
    }

    companion object {
        val INSTANCE: BendFileType = BendFileType()
    }
}
