// This is a generated file. Not intended for manual editing.
package com.higherorderco.bend.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface BendPattern extends PsiElement {

  @Nullable
  BendNameEra getNameEra();

  @NotNull
  List<BendPattern> getPatternList();

  @Nullable
  PsiElement getName();

  @Nullable
  PsiElement getNumber();

}
