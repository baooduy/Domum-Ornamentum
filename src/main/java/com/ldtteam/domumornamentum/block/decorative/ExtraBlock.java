package com.ldtteam.domumornamentum.block.decorative;

import com.ldtteam.domumornamentum.block.AbstractBlock;
import com.ldtteam.domumornamentum.block.types.ExtraBlockType;
import net.minecraft.world.level.material.Material;

public class ExtraBlock extends AbstractBlock<ExtraBlock>
{
    /**
     * The hardness this block has.
     */
    private static final float BLOCK_HARDNESS = 3F;

    /**
     * The resistance this block has.
     */
    private static final float RESISTANCE = 1F;

    /**
     * The top type.
     */
    private final ExtraBlockType type;

    /**
     * Constructor of the FullBlock.
     */
    public ExtraBlock(final ExtraBlockType type)
    {
        super(Properties.of(Material.WOOD).strength(BLOCK_HARDNESS, RESISTANCE));
        this.type = type;
    }

    public ExtraBlockType getType()
    {
        return type;
    }
}
