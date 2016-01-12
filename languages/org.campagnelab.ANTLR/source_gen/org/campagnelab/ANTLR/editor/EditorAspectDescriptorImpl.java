package org.campagnelab.ANTLR.editor;

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
      if (SConceptOperations.isExactly(SNodeOperations.asSConcept(cncpt), MetaAdapterFactory.getConcept(0xd6782141eafa4cf7L, 0xa85d1229abdb1152L, 0x631eebe3113b458fL, "org.campagnelab.ANTLR.structure.Alternative"))) {
        return Collections.<ConceptEditor>singletonList(new Alternative_Editor());
      }
      if (SConceptOperations.isExactly(SNodeOperations.asSConcept(cncpt), MetaAdapterFactory.getConcept(0xd6782141eafa4cf7L, 0xa85d1229abdb1152L, 0x631eebe31132d842L, "org.campagnelab.ANTLR.structure.Alternatives"))) {
        return Collections.<ConceptEditor>singletonList(new Alternatives_Editor());
      }
      if (SConceptOperations.isExactly(SNodeOperations.asSConcept(cncpt), MetaAdapterFactory.getConcept(0xd6782141eafa4cf7L, 0xa85d1229abdb1152L, 0x175f2668a88033f2L, "org.campagnelab.ANTLR.structure.Dot"))) {
        return Collections.<ConceptEditor>singletonList(new Dot_Editor());
      }
      if (SConceptOperations.isExactly(SNodeOperations.asSConcept(cncpt), MetaAdapterFactory.getConcept(0xd6782141eafa4cf7L, 0xa85d1229abdb1152L, 0x631eebe3113222a9L, "org.campagnelab.ANTLR.structure.Grammar"))) {
        return Collections.<ConceptEditor>singletonList(new Grammar_Editor());
      }
      if (SConceptOperations.isExactly(SNodeOperations.asSConcept(cncpt), MetaAdapterFactory.getConcept(0xd6782141eafa4cf7L, 0xa85d1229abdb1152L, 0x797c10c6e517ac38L, "org.campagnelab.ANTLR.structure.HasOptionalParams"))) {
        return Collections.<ConceptEditor>singletonList(new HasOptionalParams_Editor());
      }
      if (SConceptOperations.isExactly(SNodeOperations.asSConcept(cncpt), MetaAdapterFactory.getConcept(0xd6782141eafa4cf7L, 0xa85d1229abdb1152L, 0x7c18b9e17b73a85L, "org.campagnelab.ANTLR.structure.LabeledElement"))) {
        return Collections.<ConceptEditor>singletonList(new LabeledElement_Editor());
      }
      if (SConceptOperations.isExactly(SNodeOperations.asSConcept(cncpt), MetaAdapterFactory.getConcept(0xd6782141eafa4cf7L, 0xa85d1229abdb1152L, 0x175f2668a8872629L, "org.campagnelab.ANTLR.structure.LexerAlt"))) {
        return Collections.<ConceptEditor>singletonList(new LexerAlt_Editor());
      }
      if (SConceptOperations.isExactly(SNodeOperations.asSConcept(cncpt), MetaAdapterFactory.getConcept(0xd6782141eafa4cf7L, 0xa85d1229abdb1152L, 0x4e506a1ba17cd353L, "org.campagnelab.ANTLR.structure.LexerAltList"))) {
        return Collections.<ConceptEditor>singletonList(new LexerAltList_Editor());
      }
      if (SConceptOperations.isExactly(SNodeOperations.asSConcept(cncpt), MetaAdapterFactory.getConcept(0xd6782141eafa4cf7L, 0xa85d1229abdb1152L, 0x155bede063d71d12L, "org.campagnelab.ANTLR.structure.LexerBlock"))) {
        return Collections.<ConceptEditor>singletonList(new LexerBlock_Editor());
      }
      if (SConceptOperations.isExactly(SNodeOperations.asSConcept(cncpt), MetaAdapterFactory.getConcept(0xd6782141eafa4cf7L, 0xa85d1229abdb1152L, 0x4e506a1ba15f4aa4L, "org.campagnelab.ANTLR.structure.LexerElement"))) {
        return Collections.<ConceptEditor>singletonList(new LexerElement_Editor());
      }
      if (SConceptOperations.isExactly(SNodeOperations.asSConcept(cncpt), MetaAdapterFactory.getConcept(0xd6782141eafa4cf7L, 0xa85d1229abdb1152L, 0x175f2668a88648b1L, "org.campagnelab.ANTLR.structure.LexerRule"))) {
        return Collections.<ConceptEditor>singletonList(new LexerRule_Editor());
      }
      if (SConceptOperations.isExactly(SNodeOperations.asSConcept(cncpt), MetaAdapterFactory.getConcept(0xd6782141eafa4cf7L, 0xa85d1229abdb1152L, 0x175f2668a886ac85L, "org.campagnelab.ANTLR.structure.LexerRuleBlock"))) {
        return Collections.<ConceptEditor>singletonList(new LexerRuleBlock_Editor());
      }
      if (SConceptOperations.isExactly(SNodeOperations.asSConcept(cncpt), MetaAdapterFactory.getConcept(0xd6782141eafa4cf7L, 0xa85d1229abdb1152L, 0x175f2668a890ef9eL, "org.campagnelab.ANTLR.structure.LexerRuleRef"))) {
        return Collections.<ConceptEditor>singletonList(new LexerRuleRef_Editor());
      }
      if (SConceptOperations.isExactly(SNodeOperations.asSConcept(cncpt), MetaAdapterFactory.getConcept(0xd6782141eafa4cf7L, 0xa85d1229abdb1152L, 0x4e506a1ba17206d3L, "org.campagnelab.ANTLR.structure.LexerRuleRefByName"))) {
        return Collections.<ConceptEditor>singletonList(new LexerRuleRefByName_Editor());
      }
      if (SConceptOperations.isExactly(SNodeOperations.asSConcept(cncpt), MetaAdapterFactory.getConcept(0xd6782141eafa4cf7L, 0xa85d1229abdb1152L, 0xdb5f4ba9332cba7L, "org.campagnelab.ANTLR.structure.NotSet"))) {
        return Collections.<ConceptEditor>singletonList(new NotSet_Editor());
      }
      if (SConceptOperations.isExactly(SNodeOperations.asSConcept(cncpt), MetaAdapterFactory.getConcept(0xd6782141eafa4cf7L, 0xa85d1229abdb1152L, 0x1ebae6380de529f8L, "org.campagnelab.ANTLR.structure.Parentheses"))) {
        return Collections.<ConceptEditor>singletonList(new Parentheses_Editor());
      }
      if (SConceptOperations.isExactly(SNodeOperations.asSConcept(cncpt), MetaAdapterFactory.getConcept(0xd6782141eafa4cf7L, 0xa85d1229abdb1152L, 0x631eebe31132d838L, "org.campagnelab.ANTLR.structure.ParserRule"))) {
        return Collections.<ConceptEditor>singletonList(new ParserRule_Editor());
      }
      if (SConceptOperations.isExactly(SNodeOperations.asSConcept(cncpt), MetaAdapterFactory.getConcept(0xd6782141eafa4cf7L, 0xa85d1229abdb1152L, 0x631eebe31132d843L, "org.campagnelab.ANTLR.structure.ParserRuleBlock"))) {
        return Collections.<ConceptEditor>singletonList(new ParserRuleBlock_Editor());
      }
      if (SConceptOperations.isExactly(SNodeOperations.asSConcept(cncpt), MetaAdapterFactory.getConcept(0xd6782141eafa4cf7L, 0xa85d1229abdb1152L, 0x631eebe31132d966L, "org.campagnelab.ANTLR.structure.ParserRuleRef"))) {
        return Collections.<ConceptEditor>singletonList(new ParserRuleRef_Editor());
      }
      if (SConceptOperations.isExactly(SNodeOperations.asSConcept(cncpt), MetaAdapterFactory.getConcept(0xd6782141eafa4cf7L, 0xa85d1229abdb1152L, 0x631eebe3113ea53bL, "org.campagnelab.ANTLR.structure.REGEXP"))) {
        return Collections.<ConceptEditor>singletonList(new REGEXP_Editor());
      }
      if (SConceptOperations.isExactly(SNodeOperations.asSConcept(cncpt), MetaAdapterFactory.getConcept(0xd6782141eafa4cf7L, 0xa85d1229abdb1152L, 0xdb5f4ba93652fedL, "org.campagnelab.ANTLR.structure.Range"))) {
        return Collections.<ConceptEditor>singletonList(new Range_Editor());
      }
      if (SConceptOperations.isExactly(SNodeOperations.asSConcept(cncpt), MetaAdapterFactory.getConcept(0xd6782141eafa4cf7L, 0xa85d1229abdb1152L, 0x1ebae6380de70d78L, "org.campagnelab.ANTLR.structure.RuleRefByName"))) {
        return Collections.<ConceptEditor>singletonList(new RuleRefByName_Editor());
      }
      if (SConceptOperations.isExactly(SNodeOperations.asSConcept(cncpt), MetaAdapterFactory.getConcept(0xd6782141eafa4cf7L, 0xa85d1229abdb1152L, 0x631eebe31132d846L, "org.campagnelab.ANTLR.structure.Sequence"))) {
        return Collections.<ConceptEditor>singletonList(new Sequence_Editor());
      }
      if (SConceptOperations.isExactly(SNodeOperations.asSConcept(cncpt), MetaAdapterFactory.getConcept(0xd6782141eafa4cf7L, 0xa85d1229abdb1152L, 0x631eebe3113e657fL, "org.campagnelab.ANTLR.structure.StringLiteral"))) {
        return Collections.<ConceptEditor>singletonList(new StringLiteral_Editor());
      }
      if (SConceptOperations.isExactly(SNodeOperations.asSConcept(cncpt), MetaAdapterFactory.getConcept(0xd6782141eafa4cf7L, 0xa85d1229abdb1152L, 0x7c18b9e171f2eb3L, "org.campagnelab.ANTLR.structure.Token"))) {
        return Collections.<ConceptEditor>singletonList(new Token_Editor());
      }
      if (SConceptOperations.isExactly(SNodeOperations.asSConcept(cncpt), MetaAdapterFactory.getConcept(0xd6782141eafa4cf7L, 0xa85d1229abdb1152L, 0x7c18b9e172f3f03L, "org.campagnelab.ANTLR.structure.TokenRef"))) {
        return Collections.<ConceptEditor>singletonList(new TokenRef_Editor());
      }
      if (SConceptOperations.isExactly(SNodeOperations.asSConcept(cncpt), MetaAdapterFactory.getConcept(0xd6782141eafa4cf7L, 0xa85d1229abdb1152L, 0x7c18b9e171f1505L, "org.campagnelab.ANTLR.structure.TokenSpec"))) {
        return Collections.<ConceptEditor>singletonList(new TokenSpec_Editor());
      }
    }
    return Collections.<ConceptEditor>emptyList();
  }

  public Collection<ConceptEditorComponent> getDeclaredEditorComponents(SAbstractConcept concept, String editorComponentId) {
    {
      SAbstractConcept cncpt = ((SAbstractConcept) concept);
      if (SConceptOperations.isExactly(SNodeOperations.asSConcept(cncpt), MetaAdapterFactory.getConcept(0xd6782141eafa4cf7L, 0xa85d1229abdb1152L, 0x797c10c6e517ac38L, "org.campagnelab.ANTLR.structure.HasOptionalParams"))) {
        if ("org.campagnelab.ANTLR.editor.OptionalParamEditor".equals(editorComponentId)) {
          return Collections.<ConceptEditorComponent>singletonList(new OptionalParamEditor());
        }
      }
      if (SConceptOperations.isExactly(SNodeOperations.asSConcept(cncpt), MetaAdapterFactory.getConcept(0xd6782141eafa4cf7L, 0xa85d1229abdb1152L, 0x631eebe31132d843L, "org.campagnelab.ANTLR.structure.ParserRuleBlock"))) {
        if ("org.campagnelab.ANTLR.editor.RHSEditor".equals(editorComponentId)) {
          return Collections.<ConceptEditorComponent>singletonList(new RHSEditor());
        }
      }
    }
    return Collections.<ConceptEditorComponent>emptyList();
  }


}
