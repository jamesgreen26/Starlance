package net.jcm.vsch.compat.create;

import com.tterrag.registrate.Registrate;
import com.tterrag.registrate.util.entry.BlockEntry;
import net.jcm.vsch.VSCHMod;
import net.jcm.vsch.blocks.VSCHBlocks;
import net.minecraft.world.level.block.Block;

import static com.simibubi.create.Create.REGISTRATE;

// Because create only seems to take Registrate block registry object thingys, we have to re-register some of our blocks for the ponder stuff
public class RegistrateBlocks {
    public static final Registrate REGISTRATE = Registrate.create(VSCHMod.MODID);

    public static final BlockEntry<Block> THRUSTER_BLOCK = REGISTRATE.block("thruster_block", properties -> VSCHBlocks.THRUSTER_BLOCK.get())
            .register();

    public static final BlockEntry<Block> AIR_THRUSTER_BLOCK = REGISTRATE.block("air_thruster_block", properties -> VSCHBlocks.AIR_THRUSTER_BLOCK.get())
            .register();

    public static final BlockEntry<Block> POWERFUL_THRUSTER_BLOCK = REGISTRATE.block("powerful_thruster_block", properties -> VSCHBlocks.POWERFUL_THRUSTER_BLOCK.get())
            .register();

    /**
     * Doesn't do anything, but makes sure this class is loaded
     */
    public static void register() {

    }
}
