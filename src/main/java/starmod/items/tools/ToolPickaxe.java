package starmod.items.tools;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSword;
import starmod.Main;
import starmod.init.ModItems;
import starmod.util.IHasModel;

public class ToolPickaxe extends ItemPickaxe implements IHasModel {

public ToolPickaxe(String name, ToolMaterial material) {
		
	super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.COMBAT);
		
		ModItems.ITEMS.add(this);
	}
	
	
	@Override
	public void registerModels() {
	
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
