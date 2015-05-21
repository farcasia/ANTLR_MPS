package org.campagnelab.metar.R.actions;

/*Generated by MPS */

import jetbrains.mps.openapi.actions.descriptor.NodeFactory;
import org.jetbrains.mps.openapi.model.SNode;
import org.jetbrains.mps.openapi.model.SModel;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;

public class ParamValue {
  public static class NodeFactory_4522383332304972367 implements NodeFactory {
    public void setup(SNode newNode, SNode sampleNode, SNode enclosingNode, SModel model) {
      {
        final SNode pVal = sampleNode;
        if (SNodeOperations.isInstanceOf(pVal, MetaAdapterFactory.getConcept(0x3b58810c84314bbbL, 0x99eab4671e02dd13L, 0x44763ca97f6dfe13L, "org.campagnelab.metar.R.structure.PositionalParameterValue"))) {
          SLinkOperations.setTarget(newNode, MetaAdapterFactory.getContainmentLink(0x3b58810c84314bbbL, 0x99eab4671e02dd13L, 0x501583ef40d93683L, 0x501583ef40d93794L, "value"), SLinkOperations.getTarget(pVal, MetaAdapterFactory.getContainmentLink(0x3b58810c84314bbbL, 0x99eab4671e02dd13L, 0x501583ef40d93683L, 0x501583ef40d93794L, "value")));
        }
      }
    }
  }
}