package org.campagnelab.antlr.tomps.editor;

/*Generated by MPS */

import jetbrains.mps.editor.runtime.descriptor.AbstractEditorBuilder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.openapi.editor.EditorContext;
import jetbrains.mps.openapi.editor.cells.EditorCell;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cellLayout.CellLayout_Indent;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.openapi.editor.style.Style;
import jetbrains.mps.editor.runtime.style.StyleImpl;
import jetbrains.mps.editor.runtime.style.StyleAttributes;
import jetbrains.mps.nodeEditor.MPSFonts;
import jetbrains.mps.lang.editor.cellProviders.SingleRoleCellProvider;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import org.jetbrains.mps.openapi.language.SContainmentLink;
import jetbrains.mps.openapi.editor.cells.CellActionType;
import jetbrains.mps.editor.runtime.impl.cellActions.CellAction_DeleteSmart;
import jetbrains.mps.openapi.editor.cells.DefaultSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.CompositeSubstituteInfo;
import jetbrains.mps.lang.editor.cellProviders.AggregationCellContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.nodeEditor.cellMenu.SubstituteInfoPartExt;
import jetbrains.mps.nodeEditor.cellMenu.SChildSubstituteInfoPartEx;
import jetbrains.mps.openapi.editor.menus.transformation.SNodeLocation;
import java.util.List;
import jetbrains.mps.openapi.editor.cells.SubstituteAction;
import jetbrains.mps.nodeEditor.cellMenu.CellContext;

/*package*/ class ToFloatDestination_EditorBuilder_a extends AbstractEditorBuilder {
  @NotNull
  private SNode myNode;

  public ToFloatDestination_EditorBuilder_a(@NotNull EditorContext context, @NotNull SNode node) {
    super(context);
    myNode = node;
  }

  @NotNull
  @Override
  public SNode getNode() {
    return myNode;
  }

  /*package*/ EditorCell createCell() {
    return createCollection_wz6i73_a();
  }

  private EditorCell createCollection_wz6i73_a() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Indent());
    editorCell.setCellId("Collection_wz6i73_a");
    editorCell.setBig(true);
    editorCell.setCellContext(getCellFactory().getCellContext());
    editorCell.addEditorCell(createConstant_wz6i73_a0());
    editorCell.addEditorCell(createRefNode_wz6i73_b0());
    return editorCell;
  }
  private EditorCell createConstant_wz6i73_a0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "(float)");
    editorCell.setCellId("Constant_wz6i73_a0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.FONT_STYLE, MPSFonts.PLAIN);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createRefNode_wz6i73_b0() {
    SingleRoleCellProvider provider = new ToFloatDestination_EditorBuilder_a.toConvertSingleRoleHandler_wz6i73_b0(myNode, MetaAdapterFactory.getContainmentLink(0x932d719ce93144d5L, 0x990ce115f79b5942L, 0x443e8c43ffcf6763L, 0x443e8c43ffcf6764L, "toConvert"), getEditorContext());
    return provider.createCell();
  }
  private static class toConvertSingleRoleHandler_wz6i73_b0 extends SingleRoleCellProvider {
    @NotNull
    private SNode myNode;

    public toConvertSingleRoleHandler_wz6i73_b0(SNode ownerNode, SContainmentLink containmentLink, EditorContext context) {
      super(containmentLink, context);
      myNode = ownerNode;
    }

    @Override
    @NotNull
    public SNode getNode() {
      return myNode;
    }

    protected EditorCell createChildCell(SNode child) {
      EditorCell editorCell = getUpdateSession().updateChildNodeCell(child);
      editorCell.setAction(CellActionType.DELETE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0x932d719ce93144d5L, 0x990ce115f79b5942L, 0x443e8c43ffcf6763L, 0x443e8c43ffcf6764L, "toConvert"), child));
      editorCell.setAction(CellActionType.BACKSPACE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0x932d719ce93144d5L, 0x990ce115f79b5942L, 0x443e8c43ffcf6763L, 0x443e8c43ffcf6764L, "toConvert"), child));
      installCellInfo(child, editorCell);
      return editorCell;
    }



    private void installCellInfo(SNode child, EditorCell editorCell) {
      if (editorCell.getSubstituteInfo() == null || editorCell.getSubstituteInfo() instanceof DefaultSubstituteInfo) {
        editorCell.setSubstituteInfo(new CompositeSubstituteInfo(getEditorContext(), new AggregationCellContext(myNode, child, SLinkOperations.findLinkDeclaration(MetaAdapterFactory.getContainmentLink(0x932d719ce93144d5L, 0x990ce115f79b5942L, 0x443e8c43ffcf6763L, 0x443e8c43ffcf6764L, "toConvert"))), new SubstituteInfoPartExt[]{new ToFloatDestination_EditorBuilder_a.toConvertSingleRoleHandler_wz6i73_b0.ToFloatDestination_component_cellMenu_wz6i73_a0b0(), new SChildSubstituteInfoPartEx(editorCell)}));
      }
      if (editorCell.getRole() == null) {
        editorCell.setRole("toConvert");
      }
    }
    @Override
    protected EditorCell createEmptyCell() {
      getCellFactory().pushCellContext();
      getCellFactory().setNodeLocation(new SNodeLocation.FromParentAndLink(getNode(), MetaAdapterFactory.getContainmentLink(0x932d719ce93144d5L, 0x990ce115f79b5942L, 0x443e8c43ffcf6763L, 0x443e8c43ffcf6764L, "toConvert")));
      try {
        EditorCell editorCell = super.createEmptyCell();
        editorCell.setCellId("empty_toConvert");
        installCellInfo(null, editorCell);
        setCellContext(editorCell);
        return editorCell;
      } finally {
        getCellFactory().popCellContext();
      }
    }
    protected String getNoTargetText() {
      return "<no toConvert>";
    }
    public static class ToFloatDestination_component_cellMenu_wz6i73_a0b0 implements SubstituteInfoPartExt {
      private DestinationRefMenu myComponent;
      public ToFloatDestination_component_cellMenu_wz6i73_a0b0() {
        this.myComponent = new DestinationRefMenu();
      }
      public List<SubstituteAction> createActions(CellContext cellContext, EditorContext editorContext) {
        return this.myComponent.createSubstituteActions(cellContext, editorContext);
      }
    }
  }
}