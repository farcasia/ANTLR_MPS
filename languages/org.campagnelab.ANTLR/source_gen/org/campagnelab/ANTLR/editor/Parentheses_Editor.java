package org.campagnelab.ANTLR.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.openapi.editor.cells.EditorCell;
import jetbrains.mps.openapi.editor.EditorContext;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.lang.editor.cellProviders.SingleRoleCellProvider;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import org.jetbrains.mps.openapi.language.SContainmentLink;
import jetbrains.mps.nodeEditor.cellMenu.DefaultChildSubstituteInfo;
import jetbrains.mps.editor.runtime.cells.BigCellUtil;

public class Parentheses_Editor extends DefaultNodeEditor {
  public EditorCell createEditorCell(EditorContext editorContext, SNode node) {
    return this.createCollection_vziv2x_a(editorContext, node);
  }
  public EditorCell createInspectedCell(EditorContext editorContext, SNode node) {
    return this.createComponent_vziv2x_a(editorContext, node);
  }
  private EditorCell createCollection_vziv2x_a(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createIndent2(editorContext, node);
    editorCell.setCellId("Collection_vziv2x_a");
    editorCell.setBig(true);
    editorCell.addEditorCell(this.createConstant_vziv2x_a0(editorContext, node));
    editorCell.addEditorCell(this.createRefNode_vziv2x_b0(editorContext, node));
    editorCell.addEditorCell(this.createConstant_vziv2x_c0(editorContext, node));
    editorCell.addEditorCell(this.createComponent_vziv2x_d0(editorContext, node));
    return editorCell;
  }
  private EditorCell createConstant_vziv2x_a0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "(");
    editorCell.setCellId("Constant_vziv2x_a0");
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createRefNode_vziv2x_b0(EditorContext editorContext, SNode node) {
    SingleRoleCellProvider provider = new Parentheses_Editor.contentSingleRoleHandler_vziv2x_b0(node, MetaAdapterFactory.getContainmentLink(0xd6782141eafa4cf7L, 0xa85d1229abdb1152L, 0x1ebae6380de529f8L, 0x1ebae6380de52a0fL, "content"), editorContext);
    return provider.createCell();
  }
  private class contentSingleRoleHandler_vziv2x_b0 extends SingleRoleCellProvider {
    public contentSingleRoleHandler_vziv2x_b0(SNode ownerNode, SContainmentLink containmentLink, EditorContext context) {
      super(ownerNode, containmentLink, context);
    }
    public EditorCell createChildCell(EditorContext editorContext, SNode child) {
      EditorCell editorCell = super.createChildCell(editorContext, child);
      installCellInfo(child, editorCell);
      return editorCell;
    }
    public void installCellInfo(SNode child, EditorCell editorCell) {
      editorCell.setSubstituteInfo(new DefaultChildSubstituteInfo(myOwnerNode, myContainmentLink.getDeclarationNode(), myEditorContext));
      if (editorCell.getRole() == null) {
        editorCell.setRole("content");
      }
    }


    @Override
    protected EditorCell createEmptyCell() {
      EditorCell editorCell = super.createEmptyCell();
      editorCell.setCellId("empty_content");
      installCellInfo(null, editorCell);
      return editorCell;
    }

    protected String getNoTargetText() {
      return "<no content>";
    }

  }
  private EditorCell createConstant_vziv2x_c0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, ")");
    editorCell.setCellId("Constant_vziv2x_c0");
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createComponent_vziv2x_d0(EditorContext editorContext, SNode node) {
    EditorCell editorCell = editorContext.getCellFactory().createEditorComponentCell(node, "org.campagnelab.ANTLR.editor.OptionalParamEditor");
    return editorCell;
  }
  private EditorCell createComponent_vziv2x_a(EditorContext editorContext, SNode node) {
    EditorCell editorCell = editorContext.getCellFactory().createEditorComponentCell(node, "org.campagnelab.ANTLR.editor.RHSEditor");
    EditorCell bigCell = BigCellUtil.findBigCell(editorCell, node);
    if (bigCell != null) {
      bigCell.setBig(true);
    }
    return editorCell;
  }
}
