package org.campagnelab.metar.R.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.PropertySupport;

public class IntValue_PropertySupport extends PropertySupport {
  public boolean canSetValue(String value) {
    String testValue = null;
    if (value == null) {
      testValue = "";
    } else {
      testValue = value;
    }
    return testValue.matches("[0-9]+[Ll]?");
  }
}
