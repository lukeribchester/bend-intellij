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

public class BendPatternImpl extends ASTWrapperPsiElement implements BendPattern {

  public BendPatternImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull BendVisitor visitor) {
    visitor.visitPattern(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof BendVisitor) accept((BendVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public BendNameEra getNameEra() {
    return findChildByClass(BendNameEra.class);
  }

  @Override
  @NotNull
  public List<BendPattern> getPatternList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, BendPattern.class);
  }

  @Override
  @Nullable
  public PsiElement getName() {
    return findChildByType(NAME);
  }

  @Override
  @Nullable
  public PsiElement getNumber() {
    return findChildByType(NUMBER);
  }

}
