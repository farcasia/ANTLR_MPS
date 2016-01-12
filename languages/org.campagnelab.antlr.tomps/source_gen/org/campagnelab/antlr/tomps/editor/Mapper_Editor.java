package org.campagnelab.antlr.tomps.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.openapi.editor.cells.EditorCell;
import jetbrains.mps.openapi.editor.EditorContext;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.lang.editor.cellProviders.SingleRoleCellProvider;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import org.jetbrains.mps.openapi.language.SContainmentLink;
import jetbrains.mps.nodeEditor.cellMenu.CompositeSubstituteInfo;
import jetbrains.mps.lang.editor.cellProviders.AggregationCellContext;
import jetbrains.mps.nodeEditor.cellMenu.SubstituteInfoPartExt;
import java.util.List;
import jetbrains.mps.openapi.editor.cells.SubstituteAction;
import jetbrains.mps.nodeEditor.cellMenu.CellContext;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;

public class Mapper_Editor extends DefaultNodeEditor {
  public EditorCell createEditorCell(EditorContext editorContext, SNode node) {
    return this.createCollection_j5ilxx_a(editorContext, node);
  }
  private EditorCell createCollection_j5ilxx_a(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createIndent2(editorContext, node);
    editorCell.setCellId("Collection_j5ilxx_a");
    editorCell.setBig(true);
    editorCell.addEditorCell(this.createRefNode_j5ilxx_a0(editorContext, node));
    editorCell.addEditorCell(this.createConstant_j5ilxx_b0(editorContext, node));
    editorCell.addEditorCell(this.createRefNode_j5ilxx_c0(editorContext, node));
    return editorCell;
  }
  private EditorCell createRefNode_j5ilxx_a0(EditorContext editorContext, SNode node) {
    SingleRoleCellProvider provider = new Mapper_Editor.sourceSingleRoleHandler_j5ilxx_a0(node, MetaAdapterFactory.getContainmentLink(0x932d719ce93144d5L, 0x990ce115f79b5942L, 0x7c18b9e1882f81cL, 0x3875e55a78ffcbddL, "source"), editorContext);
    return provider.createCell();
  }
  private class sourceSingleRoleHandler_j5ilxx_a0 extends SingleRoleCellProvider {
    public sourceSingleRoleHandler_j5ilxx_a0(SNode ownerNode, SContainmentLink containmentLink, EditorContext context) {
      super(ownerNode, containmentLink, context);
    }
    public EditorCell createChildCell(EditorContext editorContext, SNode child) {
      EditorCell editorCell = super.createChildCell(editorContext, child);
      installCellInfo(child, editorCell);
      return editorCell;
    }
    public void installCellInfo(SNode child, EditorCell editorCell) {
      editorCell.setSubstituteInfo(new CompositeSubstituteInfo(myEditorContext, new AggregationCellContext(myOwnerNode, child, myContainmentLink.getDeclarationNode()), new SubstituteInfoPartExt[]{new Mapper_Editor.Mapper_component_cellMenu_j5ilxx_a0a0()}));
      if (editorCell.getRole() == null) {
        editorCell.setRole("source");
      }
    }


    @Override
    protected EditorCell createEmptyCell() {
      EditorCell editorCell = super.createEmptyCell();
      editorCell.setCellId("empty_source");
      installCellInfo(null, editorCell);
      return editorCell;
    }

    protected String getNoTargetText() {
      return "<no source>";
    }

  }
  public static class Mapper_component_cellMenu_j5ilxx_a0a0 implements SubstituteInfoPartExt {
    private SourceRefMenu myComponent;
    public Mapper_component_cellMenu_j5ilxx_a0a0() {
      this.myComponent = new SourceRefMenu();
    }
    public List<SubstituteAction> createActions(CellContext cellContext, EditorContext editorContext) {
      return this.myComponent.createSubstituteActions(cellContext, editorContext);
    }
  }
  private EditorCell createConstant_j5ilxx_b0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "->");
    editorCell.setCellId("Constant_j5ilxx_b0");
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createRefNode_j5ilxx_c0(EditorContext editorContext, SNode node) {
    SingleRoleCellProvider provider = new Mapper_Editor.destinationSingleRoleHandler_j5ilxx_c0(node, MetaAdapterFactory.getContainmentLink(0x932d719ce93144d5L, 0x990ce115f79b5942L, 0x7c18b9e1882f81cL, 0x4aaf5f3861bb9078L, "destination"), editorContext);
    return provider.createCell();
  }
  private class destinationSingleRoleHandler_j5ilxx_c0 extends SingleRoleCellProvider {
    public destinationSingleRoleHandler_j5ilxx_c0(SNode ownerNode, SContainmentLink containmentLink, EditorContext context) {
      super(ownerNode, containmentLink, context);
    }
    public EditorCell createChildCell(EditorContext editorContext, SNode child) {
      EditorCell editorCell = super.createChildCell(editorContext, child);
      installCellInfo(child, editorCell);
      return editorCell;
    }
    public void installCellInfo(SNode child, EditorCell editorCell) {
      editorCell.setSubstituteInfo(new CompositeSubstituteInfo(myEditorContext, new AggregationCellContext(myOwnerNode, child, myContainmentLink.getDeclarationNode()), new SubstituteInfoPartExt[]{new Mapper_Editor.Mapper_component_cellMenu_j5ilxx_a0c0()}));
      if (editorCell.getRole() == null) {
        editorCell.setRole("destination");
      }
    }


    @Override
    protected EditorCell createEmptyCell() {
      EditorCell editorCell = super.createEmptyCell();
      editorCell.setCellId("empty_destination");
      installCellInfo(null, editorCell);
      return editorCell;
    }

    protected String getNoTargetText() {
      return "<no destination>";
    }

  }
  public static class Mapper_component_cellMenu_j5ilxx_a0c0 implements SubstituteInfoPartExt {
    private DestinationRefMenu myComponent;
    public Mapper_component_cellMenu_j5ilxx_a0c0() {
      this.myComponent = new DestinationRefMenu();
    }
    public List<SubstituteAction> createActions(CellContext cellContext, EditorContext editorContext) {
      return this.myComponent.createSubstituteActions(cellContext, editorContext);
    }
  }
}
