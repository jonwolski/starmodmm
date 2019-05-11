package starmod.items.food;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import starmod.Main;
import starmod.init.ModItems;
import starmod.util.IHasModel;

public class FoodBase extends ItemFood implements IHasModel {

	public FoodBase(String name, int amount, boolean isWolfFood) {
		super(amount, isWolfFood);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.FOOD);
		
		ModItems.ITEMS.add(this);
		
	}

	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this, 0, "inventory");
		
	}

}