package org.campagnelab.antlr.tomps.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.BaseStructureAspectDescriptor;
import jetbrains.mps.smodel.runtime.ConceptDescriptor;
import jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder;
import jetbrains.mps.smodel.adapter.ids.MetaIdFactory;
import java.util.Collection;
import java.util.Arrays;
import org.jetbrains.annotations.Nullable;

public class StructureAspectDescriptor extends BaseStructureAspectDescriptor {

  /*package*/ final ConceptDescriptor myConceptConvertToMPS = new ConceptDescriptorBuilder("org.campagnelab.antlr.tomps.structure.ConvertToMPS", MetaIdFactory.conceptId(0x932d719ce93144d5L, 0x990ce115f79b5942L, 0x6a1bb02ea6061b82L)).super_("jetbrains.mps.lang.core.structure.BaseConcept").super_(MetaIdFactory.conceptId(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x10802efe25aL)).parents("jetbrains.mps.lang.core.structure.BaseConcept").parentIds(MetaIdFactory.conceptId(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x10802efe25aL)).referenceDescriptors(new ConceptDescriptorBuilder.Ref(7645898506791951337L, "grammar", MetaIdFactory.conceptId(0xd6782141eafa4cf7L, 0xa85d1229abdb1152L, 0x631eebe3113222a9L), false)).references("grammar").childDescriptors(new ConceptDescriptorBuilder.Link(7645898506791953299L, "mappers", MetaIdFactory.conceptId(0x932d719ce93144d5L, 0x990ce115f79b5942L, 0x6a1bb02ea606232bL), false, true, false)).children(new String[]{"mappers"}, new boolean[]{true}).create();
  /*package*/ final ConceptDescriptor myConceptMapper = new ConceptDescriptorBuilder("org.campagnelab.antlr.tomps.structure.Mapper", MetaIdFactory.conceptId(0x932d719ce93144d5L, 0x990ce115f79b5942L, 0x6a1bb02ea606232bL)).super_("jetbrains.mps.lang.core.structure.BaseConcept").super_(MetaIdFactory.conceptId(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x10802efe25aL)).parents("jetbrains.mps.lang.core.structure.BaseConcept").parentIds(MetaIdFactory.conceptId(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x10802efe25aL)).referenceDescriptors(new ConceptDescriptorBuilder.Ref(7645898506791953297L, "alternative", MetaIdFactory.conceptId(0xd6782141eafa4cf7L, 0xa85d1229abdb1152L, 0x631eebe3113b458fL), false)).references("alternative").create();

  @Override
  public Collection<ConceptDescriptor> getDescriptors() {
    return Arrays.asList(myConceptConvertToMPS, myConceptMapper);
  }

  @Override
  @Nullable
  public ConceptDescriptor getDescriptor(String conceptFqName) {
    switch (Arrays.binarySearch(stringSwitchCases_1htk8d_a0a0g, conceptFqName)) {
      case 0:
        return myConceptConvertToMPS;
      case 1:
        return myConceptMapper;
      default:
        return null;
    }
  }
  private static String[] stringSwitchCases_1htk8d_a0a0g = new String[]{"org.campagnelab.antlr.tomps.structure.ConvertToMPS", "org.campagnelab.antlr.tomps.structure.Mapper"};
}
