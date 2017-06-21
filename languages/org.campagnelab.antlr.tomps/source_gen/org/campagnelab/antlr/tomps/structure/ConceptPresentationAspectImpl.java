package org.campagnelab.antlr.tomps.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.ConceptPresentationAspectBase;
import jetbrains.mps.smodel.runtime.ConceptPresentation;
import jetbrains.mps.smodel.runtime.ConceptPresentationBuilder;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.mps.openapi.language.SAbstractConcept;

public class ConceptPresentationAspectImpl extends ConceptPresentationAspectBase {
  private final ConceptPresentation props_AlternativeMapper = new ConceptPresentationBuilder().create();
  private final ConceptPresentation props_ChildDestination = new ConceptPresentationBuilder().create();
  private final ConceptPresentation props_ConceptMapper = new ConceptPresentationBuilder().create();
  private final ConceptPresentation props_ConvertToMPS = new ConceptPresentationBuilder().create();
  private final ConceptPresentation props_ConverterName = new ConceptPresentationBuilder().create();
  private final ConceptPresentation props_Destination = new ConceptPresentationBuilder().create();
  private final ConceptPresentation props_ExampleConcept = new ConceptPresentationBuilder().create();
  private final ConceptPresentation props_IToConverter = new ConceptPresentationBuilder().create();
  private final ConceptPresentation props_LabeledElementSource = new ConceptPresentationBuilder().create();
  private final ConceptPresentation props_LexerRuleSource = new ConceptPresentationBuilder().create();
  private final ConceptPresentation props_Mapper = new ConceptPresentationBuilder().create();
  private final ConceptPresentation props_NewVisitor = new ConceptPresentationBuilder().create();
  private final ConceptPresentation props_Operator = new ConceptPresentationBuilder().create();
  private final ConceptPresentation props_ParserRuleSource = new ConceptPresentationBuilder().create();
  private final ConceptPresentation props_PropertyDestination = new ConceptPresentationBuilder().create();
  private final ConceptPresentation props_Source = new ConceptPresentationBuilder().create();
  private final ConceptPresentation props_TextGenHelper = new ConceptPresentationBuilder().create();
  private final ConceptPresentation props_ToBooleanDestination = new ConceptPresentationBuilder().create();
  private final ConceptPresentation props_ToFloatDestination = new ConceptPresentationBuilder().create();
  private final ConceptPresentation props_ToIntDestination = new ConceptPresentationBuilder().create();
  private final ConceptPresentation props_ToOperator = new ConceptPresentationBuilder().create();
  private final ConceptPresentation props_TrimCharacters = new ConceptPresentationBuilder().create();

  @Override
  @Nullable
  public ConceptPresentation getDescriptor(SAbstractConcept c) {
    StructureAspectDescriptor structureDescriptor = (StructureAspectDescriptor) myLanguageRuntime.getAspect(jetbrains.mps.smodel.runtime.StructureAspectDescriptor.class);
    switch (structureDescriptor.internalIndex(c)) {
      case LanguageConceptSwitch.AlternativeMapper:
        return props_AlternativeMapper;
      case LanguageConceptSwitch.ChildDestination:
        return props_ChildDestination;
      case LanguageConceptSwitch.ConceptMapper:
        return props_ConceptMapper;
      case LanguageConceptSwitch.ConvertToMPS:
        return props_ConvertToMPS;
      case LanguageConceptSwitch.ConverterName:
        return props_ConverterName;
      case LanguageConceptSwitch.Destination:
        return props_Destination;
      case LanguageConceptSwitch.ExampleConcept:
        return props_ExampleConcept;
      case LanguageConceptSwitch.IToConverter:
        return props_IToConverter;
      case LanguageConceptSwitch.LabeledElementSource:
        return props_LabeledElementSource;
      case LanguageConceptSwitch.LexerRuleSource:
        return props_LexerRuleSource;
      case LanguageConceptSwitch.Mapper:
        return props_Mapper;
      case LanguageConceptSwitch.NewVisitor:
        return props_NewVisitor;
      case LanguageConceptSwitch.Operator:
        return props_Operator;
      case LanguageConceptSwitch.ParserRuleSource:
        return props_ParserRuleSource;
      case LanguageConceptSwitch.PropertyDestination:
        return props_PropertyDestination;
      case LanguageConceptSwitch.Source:
        return props_Source;
      case LanguageConceptSwitch.TextGenHelper:
        return props_TextGenHelper;
      case LanguageConceptSwitch.ToBooleanDestination:
        return props_ToBooleanDestination;
      case LanguageConceptSwitch.ToFloatDestination:
        return props_ToFloatDestination;
      case LanguageConceptSwitch.ToIntDestination:
        return props_ToIntDestination;
      case LanguageConceptSwitch.ToOperator:
        return props_ToOperator;
      case LanguageConceptSwitch.TrimCharacters:
        return props_TrimCharacters;
    }
    return null;
  }
}
