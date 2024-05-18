package com.higherorderco.bend.language

import com.intellij.lexer.FlexAdapter


class BendLexerAdapter : FlexAdapter(BendLexer(null))
