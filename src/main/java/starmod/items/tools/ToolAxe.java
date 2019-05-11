package starmod.items.tools;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import starmod.Main;
import starmod.init.ModItems;
import starmod.util.IHasModel;

public class ToolAxe extends ItemAxe implements IHasModel {

public ToolAxe(String name, ToolMaterial material) {
		
	super(material, 8.0F, -3.0F);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.TOOLS);
		
		ModItems.ITEMS.add(this);
	}
	
	
	@Override
	public void registerModels() {
	
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
