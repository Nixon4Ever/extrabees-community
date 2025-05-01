package extrabees.util;

import extrabees.api.ExtraBeesConstants;
import extrabees.items.ExtraBeesItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

@SuppressWarnings("unused")
public class CreativeTab {
    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ExtraBeesConstants.MOD_ID);
    public static final RegistryObject<CreativeModeTab> EXTRABEES_TAB = TABS.register("extrabees_tab",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.extrabees_tab"))
                    .icon(ExtraBeesItems.CORRODED_COMB.get()::getDefaultInstance)
                    .displayItems((displayParams, output) -> {
                        output.accept(ExtraBeesItems.ROCKY_COMB.get());
                        output.accept(ExtraBeesItems.BARREN_COMB.get());
                        output.accept(ExtraBeesItems.NUCLEAR_COMB.get());
                        output.accept(ExtraBeesItems.ROTTING_COMB.get());

                        output.accept(ExtraBeesItems.FOSSILIZED_COMB.get());

                        output.accept(ExtraBeesItems.RUSTY_COMB.get());
                        output.accept(ExtraBeesItems.CORRODED_COMB.get());
                        output.accept(ExtraBeesItems.TARNISHED_COMB.get());
                        output.accept(ExtraBeesItems.LEADEN_COMB.get());
                        output.accept(ExtraBeesItems.LAPIS_COMB.get());

                        output.accept(ExtraBeesItems.DIAMOND_COMB.get());
                        output.accept(ExtraBeesItems.EMERALD_COMB.get());
                        output.accept(ExtraBeesItems.RUBY_COMB.get());
                        output.accept(ExtraBeesItems.SAPPHIRE_COMB.get());

                        output.accept(ExtraBeesItems.RESOLUTE_COMB.get());
                        output.accept(ExtraBeesItems.FORTIFIED_COMB.get());
                        output.accept(ExtraBeesItems.STAINLESS_COMB.get());
                        output.accept(ExtraBeesItems.INVARIABLE_COMB.get());

                        output.accept(ExtraBeesItems.SHINING_COMB.get());
                        output.accept(ExtraBeesItems.GLITTERING_COMB.get());
                        output.accept(ExtraBeesItems.GILDED_COMB.get());
                    })
                    .withSearchBar()
                    .build()
    );
}
