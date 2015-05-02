package org.campagnelab.antlr.tomps.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.IntentionFactory;
import java.util.Collection;
import jetbrains.mps.intentions.IntentionExecutable;
import jetbrains.mps.intentions.IntentionType;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.openapi.editor.EditorContext;
import org.jetbrains.mps.openapi.model.SNodeReference;
import jetbrains.mps.smodel.SNodePointer;
import java.util.Collections;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import java.util.List;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.internal.collections.runtime.ISelector;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.intentions.IntentionDescriptor;

public class AddAllAlternatives_Intention implements IntentionFactory {
  private Collection<IntentionExecutable> myCachedExecutable;
  public AddAllAlternatives_Intention() {
  }
  public String getConcept() {
    return "org.campagnelab.antlr.tomps.structure.ConceptMapper";
  }
  public String getPresentation() {
    return "AddAllAlternatives";
  }
  public String getPersistentStateKey() {
    return "org.campagnelab.antlr.tomps.intentions.AddAllAlternatives_Intention";
  }
  public String getLanguageFqName() {
    return "org.campagnelab.antlr.tomps";
  }
  public IntentionType getType() {
    return IntentionType.NORMAL;
  }
  public boolean isAvailableInChildNodes() {
    return false;
  }
  public boolean isApplicable(final SNode node, final EditorContext editorContext) {
    return true;
  }
  public SNodeReference getIntentionNodeReference() {
    return new SNodePointer("r:3172cd41-bcad-4d57-92e5-868449e54828(org.campagnelab.antlr.tomps.intentions)", "4141541856753872938");
  }
  public boolean isSurroundWith() {
    return false;
  }
  public Collection<IntentionExecutable> instances(final SNode node, final EditorContext context) {
    if (myCachedExecutable == null) {
      myCachedExecutable = Collections.<IntentionExecutable>singletonList(new AddAllAlternatives_Intention.IntentionImplementation());
    }
    return myCachedExecutable;
  }
  public class IntentionImplementation implements IntentionExecutable {
    public IntentionImplementation() {
    }
    public String getDescription(final SNode node, final EditorContext editorContext) {
      return "Add All Alternatives For Concept " + SPropertyOperations.getString(SLinkOperations.getTarget(node, MetaAdapterFactory.getReferenceLink(0x932d719ce93144d5L, 0x990ce115f79b5942L, 0x69d936b00a0eba02L, 0x69d936b00a0eba03L, "concept")), MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name"));
    }
    public void execute(final SNode node, final EditorContext editorContext) {
      // add any missing alternatives for the concept: 
      final List<SNode> altMappers = SLinkOperations.getChildren(SNodeOperations.getNodeAncestor(node, MetaAdapterFactory.getConcept(0x932d719ce93144d5L, 0x990ce115f79b5942L, 0x6a1bb02ea6061b82L, "org.campagnelab.antlr.tomps.structure.ConvertToMPS"), false, false), MetaAdapterFactory.getContainmentLink(0x932d719ce93144d5L, 0x990ce115f79b5942L, 0x6a1bb02ea6061b82L, 0x6a1bb02ea6062393L, "altMappers"));
      ListSequence.fromList(SLinkOperations.getChildren(SNodeOperations.getNodeAncestor(node, MetaAdapterFactory.getConcept(0x932d719ce93144d5L, 0x990ce115f79b5942L, 0x6a1bb02ea6061b82L, "org.campagnelab.antlr.tomps.structure.ConvertToMPS"), false, false), MetaAdapterFactory.getContainmentLink(0x932d719ce93144d5L, 0x990ce115f79b5942L, 0x6a1bb02ea6061b82L, 0x6a1bb02ea6062393L, "altMappers"))).addSequence(ListSequence.fromList(SNodeOperations.getNodeDescendants(SLinkOperations.getTarget(node, MetaAdapterFactory.getReferenceLink(0x932d719ce93144d5L, 0x990ce115f79b5942L, 0x69d936b00a0eba02L, 0x69d936b00a0eba05L, "rule")), MetaAdapterFactory.getConcept(0xd6782141eafa4cf7L, 0xa85d1229abdb1152L, 0x631eebe3113b458fL, "org.campagnelab.ANTLR.structure.Alternative"), false, new SAbstractConcept[]{})).where(new IWhereFilter<SNode>() {
        public boolean accept(final SNode alt) {
          // only add mapper when one not already present 
          return ListSequence.fromList(altMappers).all(new IWhereFilter<SNode>() {
            public boolean accept(SNode it) {
              return neq_4ev8m1_a0a0a0a0a0b0a0a0a0a0a2a2m(SLinkOperations.getTarget(it, MetaAdapterFactory.getReferenceLink(0x932d719ce93144d5L, 0x990ce115f79b5942L, 0x6a1bb02ea606232bL, 0x6a1bb02ea6062391L, "alternative")), alt);
            }
          });

        }
      }).select(new ISelector<SNode, SNode>() {
        public SNode select(SNode alternative) {
          // add the mapper: 
          SNode altMapper = SConceptOperations.createNewNode(SNodeOperations.asInstanceConcept(MetaAdapterFactory.getConcept(0x932d719ce93144d5L, 0x990ce115f79b5942L, 0x6a1bb02ea606232bL, "org.campagnelab.antlr.tomps.structure.AlternativeMapper")));
          SLinkOperations.setTarget(altMapper, MetaAdapterFactory.getReferenceLink(0x932d719ce93144d5L, 0x990ce115f79b5942L, 0x6a1bb02ea606232bL, 0x6a1bb02ea6062391L, "alternative"), alternative);
          return altMapper;
        }
      }));
    }
    public IntentionDescriptor getDescriptor() {
      return AddAllAlternatives_Intention.this;
    }
  }
  private static boolean neq_4ev8m1_a0a0a0a0a0b0a0a0a0a0a2a2m(Object a, Object b) {
    return !(((a != null ? a.equals(b) : a == b)));
  }
}