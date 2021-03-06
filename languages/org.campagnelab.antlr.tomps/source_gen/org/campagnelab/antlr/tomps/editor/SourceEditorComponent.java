package org.campagnelab.antlr.tomps.editor;

/*Generated by MPS */

import jetbrains.mps.openapi.editor.descriptor.ConceptEditorComponent;
import org.jetbrains.annotations.NotNull;
import java.util.Collection;
import java.util.Collections;
import jetbrains.mps.openapi.editor.cells.EditorCell;
import jetbrains.mps.openapi.editor.EditorContext;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cells.EditorCell_Property;
import jetbrains.mps.nodeEditor.cells.ModelAccessor;
import org.campagnelab.antlr.tomps.behavior.Source__BehaviorDescriptor;
import jetbrains.mps.util.EqualUtil;
import jetbrains.mps.openapi.editor.cells.CellActionType;
import jetbrains.mps.editor.runtime.cells.EmptyCellAction;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.openapi.editor.style.Style;
import jetbrains.mps.editor.runtime.style.StyleImpl;
import jetbrains.mps.editor.runtime.style.StyleAttributes;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.lang.editor.cellProviders.PropertyCellProvider;
import jetbrains.mps.nodeEditor.EditorManager;

public class SourceEditorComponent implements ConceptEditorComponent {
  @NotNull
  public Collection<String> getContextHints() {
    return Collections.emptyList();
  }
  public EditorCell createEditorCell(EditorContext editorContext, SNode node) {
    return this.createCollection_h5wjze_a(editorContext, node);
  }
  private EditorCell createCollection_h5wjze_a(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createIndent2(editorContext, node);
    editorCell.setCellId("Collection_h5wjze_a");
    editorCell.addEditorCell(this.createReadOnlyModelAccessor_h5wjze_a0(editorContext, node));
    editorCell.addEditorCell(this.createConstant_h5wjze_b0(editorContext, node));
    editorCell.addEditorCell(this.createProperty_h5wjze_c0(editorContext, node));
    return editorCell;
  }
  private EditorCell createReadOnlyModelAccessor_h5wjze_a0(final EditorContext editorContext, final SNode node) {
    EditorCell_Property editorCell = EditorCell_Property.create(editorContext, new ModelAccessor() {
      public String getText() {
        return (String) Source__BehaviorDescriptor.name_id3xPTlDSWS6G.invoke(node);
      }
      public void setText(String s) {
      }
      public boolean isValidText(String s) {
        return EqualUtil.equals(s, getText());
      }
    }, node);
    editorCell.setAction(CellActionType.DELETE, EmptyCellAction.getInstance());
    editorCell.setAction(CellActionType.BACKSPACE, EmptyCellAction.getInstance());
    editorCell.setCellId("ReadOnlyModelAccessor_h5wjze_a0");
    return editorCell;
  }
  private EditorCell createConstant_h5wjze_b0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, ":");
    editorCell.setCellId("Constant_h5wjze_b0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.PUNCTUATION_RIGHT, 0, true);
    style.set(StyleAttributes.PUNCTUATION_LEFT, 0, true);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createProperty_h5wjze_c0(EditorContext editorContext, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, editorContext);
    provider.setRole("cardinality");
    provider.setNoTargetText("<no cardinality>");
    EditorCell editorCell;
    editorCell = provider.createEditorCell(editorContext);
    editorCell.setCellId("SEC_property_cardinality");
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    SNode attributeConcept = provider.getRoleAttribute();
    if (attributeConcept != null) {
      EditorManager manager = EditorManager.getInstanceFromContext(editorContext);
      return manager.createNodeRoleAttributeCell(attributeConcept, provider.getRoleAttributeKind(), editorCell);
    } else
    return editorCell;
  }
}
