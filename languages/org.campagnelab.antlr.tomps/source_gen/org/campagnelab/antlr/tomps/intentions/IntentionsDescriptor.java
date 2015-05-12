package org.campagnelab.antlr.tomps.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.BaseIntentionsDescriptor;
import jetbrains.mps.intentions.IntentionsManager;

public class IntentionsDescriptor extends BaseIntentionsDescriptor {
  public void init() {
    IntentionsManager.getInstance().registerIntentionFactory(new AddAllAlternatives_Intention());
    IntentionsManager.getInstance().registerIntentionFactory(new AddLabelSubconcept_Intention());
    IntentionsManager.getInstance().registerIntentionFactory(new AsType_Intention());
    IntentionsManager.getInstance().registerIntentionFactory(new CreateConcept_Intention());
    IntentionsManager.getInstance().registerIntentionFactory(new CreateConceptAndLabels_Intention());
    IntentionsManager.getInstance().registerIntentionFactory(new CreateConceptAndLabelsForAlt_Intention());
    IntentionsManager.getInstance().registerIntentionFactory(new CreateEditor_Intention());
    IntentionsManager.getInstance().registerIntentionFactory(new CreateEditors_Intention());
    IntentionsManager.getInstance().registerIntentionFactory(new CreateOperatorConcepts_Intention());
    IntentionsManager.getInstance().registerIntentionFactory(new DeclareOperator_Intention());
    IntentionsManager.getInstance().registerIntentionFactory(new RenameLabelsFromConceptsIn_Intention());
    IntentionsManager.getInstance().registerIntentionFactory(new ResolveAllAlternativesById_Intention());
    IntentionsManager.getInstance().registerIntentionFactory(new SortOperatorsByPriority_Intention());
    IntentionsManager.getInstance().registerIntentionFactory(new SwitchToOperatorNames_Intention());
  }
}
