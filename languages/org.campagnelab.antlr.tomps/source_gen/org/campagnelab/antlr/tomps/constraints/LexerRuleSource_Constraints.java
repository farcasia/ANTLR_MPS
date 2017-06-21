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
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.smodel.runtime.ReferenceScopeProvider;
import jetbrains.mps.smodel.runtime.base.BaseScopeProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.runtime.ReferencePresentationContext;
import org.jetbrains.mps.openapi.model.SNodeReference;
import jetbrains.mps.scope.Scope;
import jetbrains.mps.smodel.runtime.ReferenceConstraintsContext;
import jetbrains.mps.scope.ListScope;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import org.campagnelab.antlr.tomps.behavior.Source__BehaviorDescriptor;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.smodel.SNodePointer;

public class LexerRuleSource_Constraints extends BaseConstraintsDescriptor {
  public LexerRuleSource_Constraints() {
    super(MetaAdapterFactory.getConcept(0x932d719ce93144d5L, 0x990ce115f79b5942L, 0x6912564f422833dbL, "org.campagnelab.antlr.tomps.structure.LexerRuleSource"));
  }

  @Override
  protected Map<SReferenceLink, ReferenceConstraintsDescriptor> getSpecifiedReferences() {
    Map<SReferenceLink, ReferenceConstraintsDescriptor> references = new HashMap<SReferenceLink, ReferenceConstraintsDescriptor>();
    references.put(MetaAdapterFactory.getReferenceLink(0x932d719ce93144d5L, 0x990ce115f79b5942L, 0x6912564f422833dbL, 0x6912564f422833dcL, "rule"), new BaseReferenceConstraintsDescriptor(MetaIdFactory.refId(0x932d719ce93144d5L, 0x990ce115f79b5942L, 0x6912564f422833dbL, 0x6912564f422833dcL), this) {
      @Override
      public boolean hasOwnOnReferenceSetHandler() {
        return true;
      }
      @Override
      public boolean validate(final SNode referenceNode, final SNode oldReferentNode, final SNode newReferentNode) {
        return true;
      }
      @Override
      public void onReferenceSet(final SNode referenceNode, final SNode oldReferentNode, final SNode newReferentNode) {
        SPropertyOperations.set(referenceNode, MetaAdapterFactory.getProperty(0x932d719ce93144d5L, 0x990ce115f79b5942L, 0x3875e55a78eeb7ddL, 0x2884e9c78702dfbfL, "id"), SPropertyOperations.getString(SLinkOperations.getTarget(newReferentNode, MetaAdapterFactory.getReferenceLink(0xd6782141eafa4cf7L, 0xa85d1229abdb1152L, 0x175f2668a890ef9eL, 0x175f2668a890ef9fL, "rule")), MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name")));
      }
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
            return SPropertyOperations.getString(SLinkOperations.getTarget(_context.getParameterNode(), MetaAdapterFactory.getReferenceLink(0xd6782141eafa4cf7L, 0xa85d1229abdb1152L, 0x175f2668a890ef9eL, 0x175f2668a890ef9fL, "rule")), MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name"));
          }
          @Override
          public SNodeReference getSearchScopeValidatorNode() {
            return breakingNode_dppn1_a0a2a0a0a4a0b0a1a2;
          }
          @Override
          public Scope createScope(final IOperationContext operationContext, final ReferenceConstraintsContext _context) {
            return ListScope.forResolvableElements(SNodeOperations.getNodeDescendants(Source__BehaviorDescriptor.alternative_id3xPTlDSW3GT.invoke(_context.getReferenceNode()), MetaAdapterFactory.getConcept(0xd6782141eafa4cf7L, 0xa85d1229abdb1152L, 0x175f2668a890ef9eL, "org.campagnelab.ANTLR.structure.LexerRuleRef"), false, new SAbstractConcept[]{}));
          }
        };
      }
    });
    return references;
  }
  private static SNodePointer breakingNode_dppn1_a0a2a0a0a4a0b0a1a2 = new SNodePointer("r:96753133-5205-453f-884d-181387ba1d08(org.campagnelab.antlr.tomps.constraints)", "8739557558226481275");
}
