// This is a generated file. Not intended for manual editing.
package com.higherorderco.bend.language.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.higherorderco.bend.language.psi.impl.*;

public interface BendTypes {

  IElementType APP = new BendElementType("APP");
  IElementType ASK = new BendElementType("ASK");
  IElementType BIND = new BendElementType("BIND");
  IElementType DATA = new BendElementType("DATA");
  IElementType DUP = new BendElementType("DUP");
  IElementType ERA = new BendElementType("ERA");
  IElementType GROUP = new BendElementType("GROUP");
  IElementType LAM = new BendElementType("LAM");
  IElementType LET = new BendElementType("LET");
  IElementType LET_TUP = new BendElementType("LET_TUP");
  IElementType LIST = new BendElementType("LIST");
  IElementType MATCH = new BendElementType("MATCH");
  IElementType MATCH_ARM = new BendElementType("MATCH_ARM");
  IElementType NAME_ERA = new BendElementType("NAME_ERA");
  IElementType NUM_OP = new BendElementType("NUM_OP");
  IElementType OPERATOR = new BendElementType("OPERATOR");
  IElementType PATTERN = new BendElementType("PATTERN");
  IElementType RULE = new BendElementType("RULE");
  IElementType SWITCH = new BendElementType("SWITCH");
  IElementType SWITCH_ARM = new BendElementType("SWITCH_ARM");
  IElementType TAG = new BendElementType("TAG");
  IElementType TERM = new BendElementType("TERM");
  IElementType TUP = new BendElementType("TUP");
  IElementType UNSCOPED_LAM = new BendElementType("UNSCOPED_LAM");
  IElementType UNSCOPED_VAR = new BendElementType("UNSCOPED_VAR");
  IElementType USE = new BendElementType("USE");
  IElementType VAR = new BendElementType("VAR");

  IElementType BEND = new BendTokenType("Bend");
  IElementType CHAR = new BendTokenType("CHAR");
  IElementType DIGIT = new BendTokenType("DIGIT");
  IElementType FOLD = new BendTokenType("Fold");
  IElementType NAME = new BendTokenType("NAME");
  IElementType NAT = new BendTokenType("Nat");
  IElementType NUMBER = new BendTokenType("NUMBER");
  IElementType STRING = new BendTokenType("STRING");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == APP) {
        return new BendAppImpl(node);
      }
      else if (type == ASK) {
        return new BendAskImpl(node);
      }
      else if (type == BIND) {
        return new BendBindImpl(node);
      }
      else if (type == DATA) {
        return new BendDataImpl(node);
      }
      else if (type == DUP) {
        return new BendDupImpl(node);
      }
      else if (type == ERA) {
        return new BendEraImpl(node);
      }
      else if (type == GROUP) {
        return new BendGroupImpl(node);
      }
      else if (type == LAM) {
        return new BendLamImpl(node);
      }
      else if (type == LET) {
        return new BendLetImpl(node);
      }
      else if (type == LET_TUP) {
        return new BendLetTupImpl(node);
      }
      else if (type == LIST) {
        return new BendListImpl(node);
      }
      else if (type == MATCH) {
        return new BendMatchImpl(node);
      }
      else if (type == MATCH_ARM) {
        return new BendMatchArmImpl(node);
      }
      else if (type == NAME_ERA) {
        return new BendNameEraImpl(node);
      }
      else if (type == NUM_OP) {
        return new BendNumOpImpl(node);
      }
      else if (type == OPERATOR) {
        return new BendOperatorImpl(node);
      }
      else if (type == PATTERN) {
        return new BendPatternImpl(node);
      }
      else if (type == RULE) {
        return new BendRuleImpl(node);
      }
      else if (type == SWITCH) {
        return new BendSwitchImpl(node);
      }
      else if (type == SWITCH_ARM) {
        return new BendSwitchArmImpl(node);
      }
      else if (type == TAG) {
        return new BendTagImpl(node);
      }
      else if (type == TERM) {
        return new BendTermImpl(node);
      }
      else if (type == TUP) {
        return new BendTupImpl(node);
      }
      else if (type == UNSCOPED_LAM) {
        return new BendUnscopedLamImpl(node);
      }
      else if (type == UNSCOPED_VAR) {
        return new BendUnscopedVarImpl(node);
      }
      else if (type == USE) {
        return new BendUseImpl(node);
      }
      else if (type == VAR) {
        return new BendVarImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
