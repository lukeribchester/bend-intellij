// This is a generated file. Not intended for manual editing.
package com.higherorderco.bend.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface BendMatch extends PsiElement {

  @NotNull
  List<BendMatchArm> getMatchArmList();

  @Nullable
  BendTerm getTerm();

  @NotNull
  List<BendVar> getVarList();

  @NotNull
  PsiElement getName();

}
