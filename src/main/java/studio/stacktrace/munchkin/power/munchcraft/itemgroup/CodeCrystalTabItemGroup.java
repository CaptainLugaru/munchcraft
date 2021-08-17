
package studio.stacktrace.munchkin.power.munchcraft.itemgroup;

import studio.stacktrace.munchkin.power.munchcraft.item.CodeCrystalItem;
import studio.stacktrace.munchkin.power.munchcraft.MunchcraftModElements;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

@MunchcraftModElements.ModElement.Tag
public class CodeCrystalTabItemGroup extends MunchcraftModElements.ModElement {
	public CodeCrystalTabItemGroup(MunchcraftModElements instance) {
		super(instance, 9);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabcode_crystal_tab") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(CodeCrystalItem.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
