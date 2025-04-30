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

    public static final RegistryObject<Item> DIAMOND_COMB = ITEMS.register("diamond_comb", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RUBY_COMB = ITEMS.register("ruby_comb", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SAPPHIRE_COMB = ITEMS.register("sapphire_comb", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> EMERALD_COMB = ITEMS.register("emerald_comb", () -> new Item(new Item.Properties()));

    //public static final RegistryObject<Item> GALVANIZED_COMB = ITEMS.register("galvanized_comb", () -> new Item(new Item.Properties())); //zinc
    //public static final RegistryObject<Item> IMPREGNABLE_COMB = ITEMS.register("impregnable_comb", () -> new Item(new Item.Properties())); // titanium
    //public static final RegistryObject<Item> INVINCIBLE_COMB = ITEMS.register("invincible_comb", () -> new Item(new Item.Properties())); //tungsten
    //public static final RegistryObject<Item> BRAZEN_COMB = ITEMS.register("brazen_comb", () -> new Item(new Item.Properties())); //brass
    public static final RegistryObject<Item> RESOLUTE_COMB = ITEMS.register("resolute_comb", () -> new Item(new Item.Properties())); // bronze
    public static final RegistryObject<Item> FORTIFIED_COMB = ITEMS.register("fortified_comb", () -> new Item(new Item.Properties())); //steel
    public static final RegistryObject<Item> STAINLESS_COMB = ITEMS.register("stainless_comb", () -> new Item(new Item.Properties()));  // nickel
    public static final RegistryObject<Item> INVARIABLE_COMB = ITEMS.register("invariable_comb", () -> new Item(new Item.Properties()));  // Invar

    public static final RegistryObject<Item> SHINING_COMB = ITEMS.register("shining_comb", () -> new Item(new Item.Properties()));  // silver
    public static final RegistryObject<Item> GLITTERING_COMB = ITEMS.register("glittering_comb", () -> new Item(new Item.Properties()));  // gold
    public static final RegistryObject<Item> GILDED_COMB = ITEMS.register("gilded_comb", () -> new Item(new Item.Properties()));  // electrum
    //public static final RegistryObject<Item> VALUABLE_COMB = ITEMS.register("valuable_comb", () -> new Item(new Item.Properties()));  // platinum

    //TODO TAG forestry:comb
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
