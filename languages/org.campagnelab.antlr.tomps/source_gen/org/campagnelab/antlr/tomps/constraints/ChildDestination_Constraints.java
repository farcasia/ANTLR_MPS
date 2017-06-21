package org.campagnelab.antlr.tomps.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.base.BaseConstraintsDescriptor;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import java.util.Map;
import org.jetbrains.mps.openapi.language.SReferenceLink;
import jetbrains.mps.smodel.runtime.ReferenceConstraintsDescriptor;
import java.util.HashMap;
import jetbrains.mps.smodel.runtime.base.BaseReferenceConstraintsDescriptor;
import jetbrains.mps.smodel.adapter.ids.MetaIdFactory;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.smodel.runtime.ReferenceScopeProvider;
import jetbrains.mps.smodel.runtime.base.BaseScopeProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.runtime.ReferencePresentationContext;
import org.campagnelab.antlr.tomps.behavior.Destination__BehaviorDescriptor;
import org.jetbrains.mps.openapi.model.SNodeReference;
import jetbrains.mps.scope.Scope;
import jetbrains.mps.smodel.runtime.ReferenceConstraintsContext;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.scope.ListScope;
import org.campagnelab.antlr.tomps.behavior.Mapper__BehaviorDescriptor;
import jetbrains.mps.smodel.SNodePointer;

public class ChildDestination_Constraints extends BaseConstraintsDescriptor {
  public ChildDestination_Constraints() {
    super(MetaAdapterFactory.getConcept(0x932d719ce93144d5L, 0x990ce115f79b5942L, 0x4aaf5f3861bb9099L, "org.campagnelab.antlr.tomps.structure.ChildDestination"));
  }

  @Override
  protected Map<SReferenceLink, ReferenceConstraintsDescriptor> getSpecifiedReferences() {
    Map<SReferenceLink, ReferenceConstraintsDescriptor> references = new HashMap<SReferenceLink, ReferenceConstraintsDescriptor>();
    references.put(MetaAdapterFactory.getReferenceLink(0x932d719ce93144d5L, 0x990ce115f79b5942L, 0x4aaf5f3861bb9099L, 0x4aaf5f3861bb96d2L, "to"), new BaseReferenceConstraintsDescriptor(MetaIdFactory.refId(0x932d719ce93144d5L, 0x990ce115f79b5942L, 0x4aaf5f3861bb9099L, 0x4aaf5f3861bb96d2L), this) {
      @Override
      public boolean hasOwnScopeProvider() {
        return true;
      }
      @Nullable
      @Override
      public ReferenceScopeProvider getScopeProvider() {
        return new BaseScopeProvider() {
          @Override
          public boolean hasPresentation() {
            return true;
          }
          @Override
          public String getPresentation(final IOperationContext operationContext, final ReferencePresentationContext _context) {
            return (String) Destination__BehaviorDescriptor.name_id2uLbzznpwAh.invoke(_context.getReferenceNode());
          }
          @Override
          public SNodeReference getSearchScopeValidatorNode() {
            return breakingNode_eoe544_a0a2a0a0a1a0b0a1a2;
          }
          @Override
          public Scope createScope(final IOperationContext operationContext, final ReferenceConstraintsContext _context) {
            {
              SNode mapper = SNodeOperations.getNodeAncestor(_context.getReferenceNode(), MetaAdapterFactory.getConcept(0x932d719ce93144d5L, 0x990ce115f79b5942L, 0x7c18b9e1882f81cL, "org.campagnelab.antlr.tomps.structure.Mapper"), false, false);
              return ListScope.forResolvableElements(Mapper__BehaviorDescriptor.linkDeclarations_id3xPTlDT1UDq.invoke(mapper, Mapper__BehaviorDescriptor.concept_idv1yTSox$EK.invoke(mapper)));
            }
          }
        };
      }
    });
    return references;
  }
  private static SNodePointer breakingNode_eoe544_a0a2a0a0a1a0b0a1a2 = new SNodePointer("r:96753133-5205-453f-884d-181387ba1d08(org.campagnelab.antlr.tomps.constraints)", "2860118060024403710");
}
