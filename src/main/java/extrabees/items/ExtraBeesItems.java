package extrabees.items;

import extrabees.api.ExtraBeesConstants;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ExtraBeesItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ExtraBeesConstants.MOD_ID);

    public static final RegistryObject<Item> ROCKY_COMB = ITEMS.register("rocky_comb", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BARREN_COMB = ITEMS.register("barren_comb", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NUCLEAR_COMB = ITEMS.register("nuclear_comb", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ROTTING_COMB = ITEMS.register("rotting_comb", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RUSTY_COMB = ITEMS.register("rusty_comb", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CORRODED_COMB = ITEMS.register("corroded_comb", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TARNISHED_COMB = ITEMS.register("tarnished_comb", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LEADEN_COMB = ITEMS.register("leaden_comb", () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
