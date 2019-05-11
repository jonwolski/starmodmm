package starmod.items.tools;

import javax.annotation.Nullable;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.IItemPropertyGetter;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import starmod.Main;
import starmod.init.ModItems;
import starmod.util.IHasModel;


public class ToolBow extends ItemBow implements IHasModel {

	public ToolBow(String name, ToolMaterial material) {
		
		super();
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

