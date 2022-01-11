package net.brndnwlsh.bonkers.item;

import net.brndnwlsh.bonkers.Bonkers;
import net.brndnwlsh.bonkers.item.custom.ModAxeItem;
import net.brndnwlsh.bonkers.item.custom.ModHoeItem;
import net.brndnwlsh.bonkers.item.custom.ModPickaxeItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item POGGERITE_INGOT = registerItem("poggerite_ingot",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));
    public static final Item POGGERITE_SWORD = registerItem("poggerite_sword",
            new SwordItem(ModToolMaterial.POGGERITE, 4, -2.4f,
                    new FabricItemSettings().group(ItemGroup.MISC)));
    public static final Item POGGERITE_PICKAXE = registerItem("poggerite_pickaxe",
            new ModPickaxeItem(ModToolMaterial.POGGERITE, 2, -2.8f,
                    new FabricItemSettings().group(ItemGroup.MISC)));
    public static final Item POGGERITE_AXE = registerItem("poggerite_axe",
            new ModAxeItem(ModToolMaterial.POGGERITE, 6, -3f,
                    new FabricItemSettings().group(ItemGroup.MISC)));
    public static final Item POGGERITE_SHOVEL = registerItem("poggerite_shovel",
            new ShovelItem(ModToolMaterial.POGGERITE,2.5f, -3f,
                    new FabricItemSettings().group(ItemGroup.MISC)));
    public static final Item POGGERITE_HOE = registerItem("poggerite_hoe",
            new ModHoeItem(ModToolMaterial.POGGERITE,-3, 0f,
                    new FabricItemSettings().group(ItemGroup.MISC)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Bonkers.MOD_ID, name), item);
    }

    public static void registerModItems() {
        System.out.println("Registering Mod Items for " + Bonkers.MOD_ID);
    }

}
