package starmod.init;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;
import starmod.items.ItemBase;
import starmod.items.armor.ArmorBase;
import starmod.items.food.FoodBase;
import starmod.items.tools.ToolAxe;
import starmod.items.tools.ToolBow;
import starmod.items.tools.ToolHoe;
import starmod.items.tools.ToolPickaxe;
import starmod.items.tools.ToolSpade;
import starmod.items.tools.ToolSword;
import starmod.util.Reference;

public class ModItems {
 public static final List<Item> ITEMS = new ArrayList<Item>();
 
 public static final Item INGOT_JADE = new ItemBase("ingot_jade");
 
 //Materials
 public static final ToolMaterial MATERIAL_REAPER = EnumHelper.addToolMaterial("material_reaper", 3, 2362, 15.0F, 14.0F, 20);

public static final ArmorMaterial ARMOR_MATERIAL_MOSSYSTONE = EnumHelper.addArmorMaterial("armor_material_mossystone", Reference.MOD_ID + ":ingot_jade", 14, new int[] {3, 8, 6, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0F);


 
 public static final Item ITEM_MOSSYSTONECHUNK = new ItemBase("item_mossystonechunk");
 
 
 //Tools
public static final ItemSword SWORD_MOSSYSTONE = new ToolSword("sword_mossystone", MATERIAL_REAPER);
public static final ItemAxe AXE_MOSSYSTONE = new ToolAxe("axe_mossystone", MATERIAL_REAPER);
public static final ItemPickaxe PICKAXE_MOSSYSTONE = new ToolPickaxe("pickaxe_mossystone", MATERIAL_REAPER);
public static final ItemSpade SPADE_MOSSYSTONE = new ToolSpade("spade_mossystone", MATERIAL_REAPER);
public static final ItemHoe HOE_MOSSYSTONE = new ToolHoe("hoe_mossystone", MATERIAL_REAPER);
public static final ItemBow BOW_STONE = new ToolBow("bow_stone", MATERIAL_REAPER);

//Armor
public static final Item HELMET_MOSSYSTONE = new ArmorBase("helmet_mossystone", ARMOR_MATERIAL_MOSSYSTONE, 1, EntityEquipmentSlot.HEAD);
public static final Item CHESTPLATE_MOSSYSTONE = new ArmorBase("chestplate_mossystone", ARMOR_MATERIAL_MOSSYSTONE, 1, EntityEquipmentSlot.CHEST);
public static final Item LEGGINGS_MOSSYSTONE = new ArmorBase("leggings_mossystone", ARMOR_MATERIAL_MOSSYSTONE, 2, EntityEquipmentSlot.LEGS);
public static final Item BOOTS_MOSSYSTONE = new ArmorBase("boots_mossystone", ARMOR_MATERIAL_MOSSYSTONE, 1, EntityEquipmentSlot.FEET); 

//Food
public static final Item STONE_APPLE = new FoodBase("stone_apple", 8, true);

}