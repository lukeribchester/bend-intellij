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

public class BendUnscopedLamImpl extends ASTWrapperPsiElement implements BendUnscopedLam {

  public BendUnscopedLamImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull BendVisitor visitor) {
    visitor.visitUnscopedLam(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof BendVisitor) accept((BendVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public BendTag getTag() {
    return findChildByClass(BendTag.class);
  }

  @Override
  @NotNull
  public BendTerm getTerm() {
    return findNotNullChildByClass(BendTerm.class);
  }

  @Override
  @NotNull
  public PsiElement getName() {
    return findNotNullChildByType(NAME);
  }

}
