// This is a generated file. Not intended for manual editing.
package com.higherorderco.bend.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface BendRule extends PsiElement {

  @NotNull
  List<BendPattern> getPatternList();

  @NotNull
  BendTerm getTerm();

  @NotNull
  PsiElement getName();

}
