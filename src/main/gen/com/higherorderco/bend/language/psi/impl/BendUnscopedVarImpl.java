// This is a generated file. Not intended for manual editing.
package com.higherorderco.bend.language.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.higherorderco.bend.language.psi.BendTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.higherorderco.bend.language.psi.*;

public class BendUnscopedVarImpl extends ASTWrapperPsiElement implements BendUnscopedVar {

  public BendUnscopedVarImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull BendVisitor visitor) {
    visitor.visitUnscopedVar(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof BendVisitor) accept((BendVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public PsiElement getName() {
    return findNotNullChildByType(NAME);
  }

}
