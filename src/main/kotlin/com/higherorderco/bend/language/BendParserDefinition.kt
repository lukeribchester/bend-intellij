package com.higherorderco.bend.language

import com.intellij.lang.ASTNode
import com.intellij.lang.ParserDefinition
import com.intellij.lang.PsiParser
import com.intellij.lexer.Lexer
import com.intellij.openapi.project.Project
import com.intellij.psi.FileViewProvider
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile
import com.intellij.psi.tree.IFileElementType
import com.intellij.psi.tree.TokenSet
import com.higherorderco.bend.language.parser.BendParser
import com.higherorderco.bend.language.psi.BendFile
import com.higherorderco.bend.language.psi.BendTokenSets
import com.higherorderco.bend.language.psi.BendTypes
import org.jetbrains.annotations.NotNull


internal class BendParserDefinition : ParserDefinition {
    @NotNull
    override fun createLexer(project: Project?): Lexer {
        return BendLexerAdapter()
    }

    @NotNull
    override fun getCommentTokens(): TokenSet {
        return BendTokenSets.COMMENTS
    }

    @NotNull
    override fun getStringLiteralElements(): TokenSet {
        return TokenSet.EMPTY
    }

    @NotNull
    override fun createParser(project: Project?): PsiParser {
        return BendParser()
    }

    @NotNull
    override fun getFileNodeType(): IFileElementType {
        return FILE
    }

    @NotNull
    override fun createFile(@NotNull viewProvider: FileViewProvider): PsiFile {
        return BendFile(viewProvider)
    }

    @NotNull
    override fun createElement(node: ASTNode?): PsiElement {
        return BendTypes.Factory.createElement(node)
    }

    companion object {
        val FILE: IFileElementType = IFileElementType(BendLanguage.INSTANCE)
    }
}
