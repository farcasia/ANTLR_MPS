package org.campagnelab.ANTLR.editor;

/*Generated by MPS */

import jetbrains.mps.editor.runtime.descriptor.AbstractEditorBuilder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.openapi.editor.EditorContext;
import jetbrains.mps.openapi.editor.cells.EditorCell;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cellLayout.CellLayout_Indent;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.lang.editor.cellProviders.PropertyCellProvider;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.openapi.editor.style.Style;
import jetbrains.mps.editor.runtime.style.StyleImpl;
import jetbrains.mps.editor.runtime.style.StyleAttributes;
import jetbrains.mps.nodeEditor.cells.EditorCell_Property;
import jetbrains.mps.nodeEditor.cells.ModelAccessor;
import org.campagnelab.ANTLR.behavior.ParserRuleBlock__BehaviorDescriptor;
import jetbrains.mps.util.EqualUtil;
import jetbrains.mps.openapi.editor.cells.CellActionType;
import jetbrains.mps.editor.runtime.cells.EmptyCellAction;

/*package*/ class RHSEditor_ComponentBuilder_a extends AbstractEditorBuilder {
  @NotNull
  private SNode myNode;

  public RHSEditor_ComponentBuilder_a(@NotNull EditorContext context, @NotNull SNode node) {
    super(context);
    myNode = node;
  }

  @NotNull
  @Override
  public SNode getNode() {
    return myNode;
  }

  /*package*/ EditorCell createCell() {
    return createCollection_c471p1_a();
  }

  private EditorCell createCollection_c471p1_a() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Indent());
    editorCell.setCellId("Collection_c471p1_a");
    editorCell.addEditorCell(createConstant_c471p1_a0());
    editorCell.addEditorCell(createProperty_c471p1_b0());
    editorCell.addEditorCell(createConstant_c471p1_c0());
    editorCell.addEditorCell(createProperty_c471p1_d0());
    editorCell.addEditorCell(createConstant_c471p1_e0());
    editorCell.addEditorCell(createProperty_c471p1_f0());
    editorCell.addEditorCell(createConstant_c471p1_g0());
    editorCell.addEditorCell(createReadOnlyModelAccessor_c471p1_h0());
    return editorCell;
  }
  private EditorCell createConstant_c471p1_a0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "optional:");
    editorCell.setCellId("Constant_c471p1_a0");
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createProperty_c471p1_b0() {
    CellProviderWithRole provider = new PropertyCellProvider(myNode, getEditorContext());
    provider.setRole("isOptional");
    provider.setNoTargetText("<no isOptional>");
    EditorCell editorCell;
    editorCell = provider.createEditorCell(getEditorContext());
    editorCell.setCellId("RHSE_property_isOptional");
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    SNode attributeConcept = provider.getRoleAttribute();
    if (attributeConcept != null) {
      EditorManager manager = EditorManager.getInstanceFromContext(getEditorContext());
      return manager.createNodeRoleAttributeCell(attributeConcept, provider.getRoleAttributeKind(), editorCell);
    } else
    return editorCell;
  }
  private EditorCell createConstant_c471p1_c0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "accept multiple:");
    editorCell.setCellId("Constant_c471p1_c0");
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createProperty_c471p1_d0() {
    CellProviderWithRole provider = new PropertyCellProvider(myNode, getEditorContext());
    provider.setRole("acceptMultiple");
    provider.setNoTargetText("<no acceptMultiple>");
    EditorCell editorCell;
    editorCell = provider.createEditorCell(getEditorContext());
    editorCell.setCellId("RHSE_property_acceptMultiple");
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    SNode attributeConcept = provider.getRoleAttribute();
    if (attributeConcept != null) {
      EditorManager manager = EditorManager.getInstanceFromContext(getEditorContext());
      return manager.createNodeRoleAttributeCell(attributeConcept, provider.getRoleAttributeKind(), editorCell);
    } else
    return editorCell;
  }
  private EditorCell createConstant_c471p1_e0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "plus:");
    editorCell.setCellId("Constant_c471p1_e0");
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createProperty_c471p1_f0() {
    CellProviderWithRole provider = new PropertyCellProvider(myNode, getEditorContext());
    provider.setRole("plus");
    provider.setNoTargetText("<no plus>");
    EditorCell editorCell;
    editorCell = provider.createEditorCell(getEditorContext());
    editorCell.setCellId("RHSE_property_plus");
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    SNode attributeConcept = provider.getRoleAttribute();
    if (attributeConcept != null) {
      EditorManager manager = EditorManager.getInstanceFromContext(getEditorContext());
      return manager.createNodeRoleAttributeCell(attributeConcept, provider.getRoleAttributeKind(), editorCell);
    } else
    return editorCell;
  }
  private EditorCell createConstant_c471p1_g0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "needsVisit=");
    editorCell.setCellId("Constant_c471p1_g0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.INDENT_LAYOUT_ON_NEW_LINE, true);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createReadOnlyModelAccessor_c471p1_h0() {
    EditorCell_Property editorCell = EditorCell_Property.create(getEditorContext(), new ModelAccessor() {
      public String getText() {
        return Boolean.toString((boolean) ParserRuleBlock__BehaviorDescriptor.needsVisit_id3ft5eLKF8lT.invoke(myNode));
      }
      public void setText(String s) {
      }
      public boolean isValidText(String s) {
        return EqualUtil.equals(s, getText());
      }
    }, myNode);
    editorCell.setAction(CellActionType.DELETE, EmptyCellAction.getInstance());
    editorCell.setAction(CellActionType.BACKSPACE, EmptyCellAction.getInstance());
    editorCell.setCellId("ReadOnlyModelAccessor_c471p1_h0");
    return editorCell;
  }
}