// This is a generated file. Not intended for manual editing.
package com.higherorderco.bend.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface BendSwitch extends PsiElement {

  @NotNull
  List<BendSwitchArm> getSwitchArmList();

  @Nullable
  BendTerm getTerm();

  @NotNull
  List<BendVar> getVarList();

  @NotNull
  PsiElement getName();

}
