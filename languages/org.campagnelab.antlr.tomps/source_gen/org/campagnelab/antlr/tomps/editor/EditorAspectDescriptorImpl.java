package org.campagnelab.antlr.tomps.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.EditorAspectDescriptorBase;
import java.util.Collection;
import jetbrains.mps.openapi.editor.descriptor.ConceptEditor;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import java.util.Collections;
import jetbrains.mps.openapi.editor.descriptor.ConceptEditorComponent;

public class EditorAspectDescriptorImpl extends EditorAspectDescriptorBase {
  public Collection<ConceptEditor> getDeclaredEditors(SAbstractConcept concept) {
    {
      SAbstractConcept cncpt = ((SAbstractConcept) concept);
      if (SConceptOperations.isExactly(SNodeOperations.asSConcept(cncpt), MetaAdapterFactory.getConcept(0x932d719ce93144d5L, 0x990ce115f79b5942L, 0x6a1bb02ea606232bL, "org.campagnelab.antlr.tomps.structure.AlternativeMapper"))) {
        return Collections.<ConceptEditor>singletonList(new AlternativeMapper_Editor());
      }
      if (SConceptOperations.isExactly(SNodeOperations.asSConcept(cncpt), MetaAdapterFactory.getConcept(0x932d719ce93144d5L, 0x990ce115f79b5942L, 0x69d936b00a0eba02L, "org.campagnelab.antlr.tomps.structure.ConceptMapper"))) {
        return Collections.<ConceptEditor>singletonList(new ConceptMapper_Editor());
      }
      if (SConceptOperations.isExactly(SNodeOperations.asSConcept(cncpt), MetaAdapterFactory.getConcept(0x932d719ce93144d5L, 0x990ce115f79b5942L, 0x6a1bb02ea6061b82L, "org.campagnelab.antlr.tomps.structure.ConvertToMPS"))) {
        return Collections.<ConceptEditor>singletonList(new ConvertToMPS_Editor());
      }
      if (SConceptOperations.isExactly(SNodeOperations.asSConcept(cncpt), MetaAdapterFactory.getConcept(0x932d719ce93144d5L, 0x990ce115f79b5942L, 0x4aaf5f3861bb9098L, "org.campagnelab.antlr.tomps.structure.Destination"))) {
        return Collections.<ConceptEditor>singletonList(new Destination_Editor());
      }
      if (SConceptOperations.isExactly(SNodeOperations.asSConcept(cncpt), MetaAdapterFactory.getConcept(0x932d719ce93144d5L, 0x990ce115f79b5942L, 0x6912564f422833dbL, "org.campagnelab.antlr.tomps.structure.LexerRuleSource"))) {
        return Collections.<ConceptEditor>singletonList(new LexerRuleSource_Editor());
      }
      if (SConceptOperations.isExactly(SNodeOperations.asSConcept(cncpt), MetaAdapterFactory.getConcept(0x932d719ce93144d5L, 0x990ce115f79b5942L, 0x7c18b9e1882f81cL, "org.campagnelab.antlr.tomps.structure.Mapper"))) {
        return Collections.<ConceptEditor>singletonList(new Mapper_Editor());
      }
      if (SConceptOperations.isExactly(SNodeOperations.asSConcept(cncpt), MetaAdapterFactory.getConcept(0x932d719ce93144d5L, 0x990ce115f79b5942L, 0x11106e6008e38ee7L, "org.campagnelab.antlr.tomps.structure.NewVisitor"))) {
        return Collections.<ConceptEditor>singletonList(new NewVisitor_Editor());
      }
      if (SConceptOperations.isExactly(SNodeOperations.asSConcept(cncpt), MetaAdapterFactory.getConcept(0x932d719ce93144d5L, 0x990ce115f79b5942L, 0x195a5f84d619bfbdL, "org.campagnelab.antlr.tomps.structure.Operator"))) {
        return Collections.<ConceptEditor>singletonList(new Operator_Editor());
      }
      if (SConceptOperations.isExactly(SNodeOperations.asSConcept(cncpt), MetaAdapterFactory.getConcept(0x932d719ce93144d5L, 0x990ce115f79b5942L, 0x3875e55a78eeb7feL, "org.campagnelab.antlr.tomps.structure.ParserRuleSource"))) {
        return Collections.<ConceptEditor>singletonList(new ParserRuleSource_Editor());
      }
      if (SConceptOperations.isExactly(SNodeOperations.asSConcept(cncpt), MetaAdapterFactory.getConcept(0x932d719ce93144d5L, 0x990ce115f79b5942L, 0x3875e55a78eeb7ddL, "org.campagnelab.antlr.tomps.structure.Source"))) {
        return Collections.<ConceptEditor>singletonList(new Source_Editor());
      }
      if (SConceptOperations.isExactly(SNodeOperations.asSConcept(cncpt), MetaAdapterFactory.getConcept(0x932d719ce93144d5L, 0x990ce115f79b5942L, 0x443e8c43ffcc4608L, "org.campagnelab.antlr.tomps.structure.ToBooleanDestination"))) {
        return Collections.<ConceptEditor>singletonList(new ToBooleanDestination_Editor());
      }
      if (SConceptOperations.isExactly(SNodeOperations.asSConcept(cncpt), MetaAdapterFactory.getConcept(0x932d719ce93144d5L, 0x990ce115f79b5942L, 0x443e8c43ffcf6763L, "org.campagnelab.antlr.tomps.structure.ToFloatDestination"))) {
        return Collections.<ConceptEditor>singletonList(new ToFloatDestination_Editor());
      }
      if (SConceptOperations.isExactly(SNodeOperations.asSConcept(cncpt), MetaAdapterFactory.getConcept(0x932d719ce93144d5L, 0x990ce115f79b5942L, 0x443e8c43ffc0edbfL, "org.campagnelab.antlr.tomps.structure.ToIntDestination"))) {
        return Collections.<ConceptEditor>singletonList(new ToIntDestination_Editor());
      }
      if (SConceptOperations.isExactly(SNodeOperations.asSConcept(cncpt), MetaAdapterFactory.getConcept(0x932d719ce93144d5L, 0x990ce115f79b5942L, 0x6c9855e848a0c58L, "org.campagnelab.antlr.tomps.structure.ToOperator"))) {
        return Collections.<ConceptEditor>singletonList(new ToOperator_Editor());
      }
      if (SConceptOperations.isExactly(SNodeOperations.asSConcept(cncpt), MetaAdapterFactory.getConcept(0x932d719ce93144d5L, 0x990ce115f79b5942L, 0x3ec2bbae1bba463bL, "org.campagnelab.antlr.tomps.structure.TrimCharacters"))) {
        return Collections.<ConceptEditor>singletonList(new TrimCharacters_Editor());
      }
    }
    return Collections.<ConceptEditor>emptyList();
  }

  public Collection<ConceptEditorComponent> getDeclaredEditorComponents(SAbstractConcept concept, String editorComponentId) {
    {
      SAbstractConcept cncpt = ((SAbstractConcept) concept);
      if (SConceptOperations.isExactly(SNodeOperations.asSConcept(cncpt), MetaAdapterFactory.getConcept(0x932d719ce93144d5L, 0x990ce115f79b5942L, 0x3875e55a78eeb7ddL, "org.campagnelab.antlr.tomps.structure.Source"))) {
        if ("org.campagnelab.antlr.tomps.editor.SourceEditorComponent".equals(editorComponentId)) {
          return Collections.<ConceptEditorComponent>singletonList(new SourceEditorComponent());
        }
      }
    }
    return Collections.<ConceptEditorComponent>emptyList();
  }


}
