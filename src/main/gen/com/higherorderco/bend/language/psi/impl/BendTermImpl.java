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

public class BendTermImpl extends ASTWrapperPsiElement implements BendTerm {

  public BendTermImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull BendVisitor visitor) {
    visitor.visitTerm(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof BendVisitor) accept((BendVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public BendApp getApp() {
    return findChildByClass(BendApp.class);
  }

  @Override
  @Nullable
  public BendBind getBind() {
    return findChildByClass(BendBind.class);
  }

  @Override
  @Nullable
  public BendDup getDup() {
    return findChildByClass(BendDup.class);
  }

  @Override
  @Nullable
  public BendEra getEra() {
    return findChildByClass(BendEra.class);
  }

  @Override
  @Nullable
  public BendGroup getGroup() {
    return findChildByClass(BendGroup.class);
  }

  @Override
  @Nullable
  public BendLam getLam() {
    return findChildByClass(BendLam.class);
  }

  @Override
  @Nullable
  public BendLet getLet() {
    return findChildByClass(BendLet.class);
  }

  @Override
  @Nullable
  public BendLetTup getLetTup() {
    return findChildByClass(BendLetTup.class);
  }

  @Override
  @Nullable
  public BendMatch getMatch() {
    return findChildByClass(BendMatch.class);
  }

  @Override
  @Nullable
  public BendNumOp getNumOp() {
    return findChildByClass(BendNumOp.class);
  }

  @Override
  @Nullable
  public BendSwitch getSwitch() {
    return findChildByClass(BendSwitch.class);
  }

  @Override
  @Nullable
  public BendTup getTup() {
    return findChildByClass(BendTup.class);
  }

  @Override
  @Nullable
  public BendUnscopedLam getUnscopedLam() {
    return findChildByClass(BendUnscopedLam.class);
  }

  @Override
  @Nullable
  public BendUnscopedVar getUnscopedVar() {
    return findChildByClass(BendUnscopedVar.class);
  }

  @Override
  @Nullable
  public BendUse getUse() {
    return findChildByClass(BendUse.class);
  }

  @Override
  @Nullable
  public BendVar getVar() {
    return findChildByClass(BendVar.class);
  }

  @Override
  @Nullable
  public PsiElement getNumber() {
    return findChildByType(NUMBER);
  }

}
