// This is a generated file. Not intended for manual editing.
package com.higherorderco.bend.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface BendTerm extends PsiElement {

  @Nullable
  BendApp getApp();

  @Nullable
  BendBind getBind();

  @Nullable
  BendDup getDup();

  @Nullable
  BendEra getEra();

  @Nullable
  BendGroup getGroup();

  @Nullable
  BendLam getLam();

  @Nullable
  BendLet getLet();

  @Nullable
  BendLetTup getLetTup();

  @Nullable
  BendMatch getMatch();

  @Nullable
  BendNumOp getNumOp();

  @Nullable
  BendSwitch getSwitch();

  @Nullable
  BendTup getTup();

  @Nullable
  BendUnscopedLam getUnscopedLam();

  @Nullable
  BendUnscopedVar getUnscopedVar();

  @Nullable
  BendUse getUse();

  @Nullable
  BendVar getVar();

  @Nullable
  PsiElement getNumber();

}
