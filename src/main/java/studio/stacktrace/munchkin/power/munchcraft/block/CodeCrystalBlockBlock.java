
package studio.stacktrace.munchkin.power.munchcraft.block;

import studio.stacktrace.munchkin.power.munchcraft.itemgroup.CodeCrystalTabItemGroup;
import studio.stacktrace.munchkin.power.munchcraft.MunchcraftModElements;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.loot.LootContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import java.util.List;
import java.util.Collections;

@MunchcraftModElements.ModElement.Tag
public class CodeCrystalBlockBlock extends MunchcraftModElements.ModElement {
	@ObjectHolder("munchcraft:code_crystal_block")
	public static final Block block = null;
	public CodeCrystalBlockBlock(MunchcraftModElements instance) {
		super(instance, 2);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items
				.add(() -> new BlockItem(block, new Item.Properties().group(CodeCrystalTabItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}
	public static class CustomBlock extends Block {
		public CustomBlock() {
			super(Block.Properties.create(Material.IRON).sound(SoundType.METAL).hardnessAndResistance(10f, 10f).setLightLevel(s -> 0));
			setRegistryName("code_crystal_block");
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(this, 1));
		}
	}
}
