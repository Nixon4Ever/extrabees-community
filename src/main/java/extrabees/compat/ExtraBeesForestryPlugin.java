package extrabees.compat;

import extrabees.api.ExtraBeesBeeSpecies;
import extrabees.api.ExtraBeesConstants;
import extrabees.items.ExtraBeesItems;
import forestry.api.genetics.alleles.BeeChromosomes;
import forestry.api.genetics.alleles.ForestryAlleles;
import forestry.api.plugin.IApicultureRegistration;
import forestry.api.plugin.IForestryPlugin;
import forestry.api.plugin.IGeneticRegistration;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.NotNull;

import java.awt.*;

import static extrabees.api.ExtraBeesTaxa.*;

@SuppressWarnings("removal")
public class ExtraBeesForestryPlugin implements IForestryPlugin {
    public static final ResourceLocation ID = ExtraBeesConstants.extrabees("default");
    @Override
    public @NotNull ResourceLocation id() {
        return ID;
    }
    @Override
    public void registerGenetics(@NotNull IGeneticRegistration genetics){
        ExtraBeesTaxonomy.defineTaxa(genetics);
    }
    @Override
    public void registerApiculture(IApicultureRegistration apiculture) {
        apiculture.registerSpecies(ExtraBeesBeeSpecies.ARID, GENUS_BARREN, SPECIES_ARID, true, new Color(0xbde754))
                .setBody(new Color(0xcae274))
                .addProduct(ExtraBeesItems.BARREN_COMB.get().getDefaultInstance(), 0.12f)
                .setGenome(genome -> {
                    genome.set(BeeChromosomes.POLLINATION, ForestryAlleles.POLLINATION_SLOWER);
                    genome.set(BeeChromosomes.FERTILITY, ForestryAlleles.FERTILITY_3);
                    genome.set(BeeChromosomes.TEMPERATURE_TOLERANCE, ForestryAlleles.TOLERANCE_DOWN_1);
                });
        apiculture.registerSpecies(ExtraBeesBeeSpecies.BARREN, GENUS_BARREN, SPECIES_BARREN, true, new Color(0xdfd163))
                .setBody(new Color(0xbcd26c))
                .addProduct(ExtraBeesItems.BARREN_COMB.get().getDefaultInstance(), 0.12f)
                .setGenome(genome -> {
                    genome.set(BeeChromosomes.POLLINATION, ForestryAlleles.POLLINATION_SLOWER);
                    genome.set(BeeChromosomes.FERTILITY, ForestryAlleles.FERTILITY_3);
                    genome.set(BeeChromosomes.TEMPERATURE_TOLERANCE, ForestryAlleles.TOLERANCE_DOWN_1);
                });
        apiculture.registerSpecies(ExtraBeesBeeSpecies.DESOLATE, GENUS_BARREN, SPECIES_DESOLATE, true, new Color(0xd0b78f))
                .setBody(new Color(0xbcd26c))
                .addProduct(ExtraBeesItems.BARREN_COMB.get().getDefaultInstance(), 0.12f)
                .setGenome(genome -> {
                    genome.set(BeeChromosomes.POLLINATION, ForestryAlleles.POLLINATION_SLOWER);
                    genome.set(BeeChromosomes.FERTILITY, ForestryAlleles.FERTILITY_3);
                    genome.set(BeeChromosomes.TEMPERATURE_TOLERANCE, ForestryAlleles.TOLERANCE_DOWN_1);
                });

        apiculture.registerSpecies(ExtraBeesBeeSpecies.ROCKY, GENUS_ROCKY, SPECIES_ROCKY, true, new Color(0xa7a7a7))
                .setBody(new Color(0x8d8d8d))
                .addProduct(ExtraBeesItems.ROCKY_COMB.get().getDefaultInstance(), 0.12f)
                .setGenome(genome -> {
                    genome.set(BeeChromosomes.POLLINATION, ForestryAlleles.POLLINATION_SLOWER);
                    genome.set(BeeChromosomes.FERTILITY, ForestryAlleles.FERTILITY_3);
                    genome.set(BeeChromosomes.TEMPERATURE_TOLERANCE, ForestryAlleles.TOLERANCE_DOWN_1);
                });
        apiculture.registerSpecies(ExtraBeesBeeSpecies.TOLERANT, GENUS_ROCKY, SPECIES_TOLERANT, true, new Color(0x757575))
                .setBody(new Color(0x8d8d8d))
                .addProduct(ExtraBeesItems.ROCKY_COMB.get().getDefaultInstance(), 0.12f)
                .setGenome(genome -> {
                    genome.set(BeeChromosomes.POLLINATION, ForestryAlleles.POLLINATION_SLOWER);
                    genome.set(BeeChromosomes.FERTILITY, ForestryAlleles.FERTILITY_3);
                    genome.set(BeeChromosomes.TEMPERATURE_TOLERANCE, ForestryAlleles.TOLERANCE_DOWN_1);
                });
        apiculture.registerSpecies(ExtraBeesBeeSpecies.ROBUST, GENUS_ROCKY, SPECIES_ROBUST, true, new Color(0x695555))
                .setBody(new Color(0x8d8d8d))
                .addProduct(ExtraBeesItems.ROCKY_COMB.get().getDefaultInstance(), 0.12f)
                .setGenome(genome -> {
                    genome.set(BeeChromosomes.POLLINATION, ForestryAlleles.POLLINATION_SLOWER);
                    genome.set(BeeChromosomes.FERTILITY, ForestryAlleles.FERTILITY_3);
                    genome.set(BeeChromosomes.TEMPERATURE_TOLERANCE, ForestryAlleles.TOLERANCE_DOWN_1);
                });
        apiculture.registerSpecies(ExtraBeesBeeSpecies.RESILIENT, GENUS_ROCKY, SPECIES_RESILIENT, true, new Color(0x717c89))
                .setBody(new Color(0x8d8d8d))
                .addProduct(ExtraBeesItems.ROCKY_COMB.get().getDefaultInstance(), 0.12f)
                .setGenome(genome -> {
                    genome.set(BeeChromosomes.POLLINATION, ForestryAlleles.POLLINATION_SLOWER);
                    genome.set(BeeChromosomes.FERTILITY, ForestryAlleles.FERTILITY_3);
                    genome.set(BeeChromosomes.TEMPERATURE_TOLERANCE, ForestryAlleles.TOLERANCE_DOWN_1);
                });

        apiculture.registerSpecies(ExtraBeesBeeSpecies.DECAYING, GENUS_HOSTILE, SPECIES_DECAYING, true, new Color(0xbedfb5))
                .setBody(new Color(0xbcd26c))
                .addProduct(ExtraBeesItems.BARREN_COMB.get().getDefaultInstance(), 0.12f)
                .addProduct(ExtraBeesItems.ROTTING_COMB.get().getDefaultInstance(), 0.12f)
                .setGenome(genome -> {
                    genome.set(BeeChromosomes.POLLINATION, ForestryAlleles.POLLINATION_SLOWER);
                    genome.set(BeeChromosomes.FERTILITY, ForestryAlleles.FERTILITY_3);
                    genome.set(BeeChromosomes.TEMPERATURE_TOLERANCE, ForestryAlleles.TOLERANCE_DOWN_1);
                });
        apiculture.registerSpecies(ExtraBeesBeeSpecies.SKELETAL, GENUS_HOSTILE, SPECIES_SKELETAL, true, new Color(0xe8ece7))
                .setBody(new Color(0xcae274))
                .addProduct(ExtraBeesItems.BARREN_COMB.get().getDefaultInstance(), 0.12f)
                .setGenome(genome -> {
                    genome.set(BeeChromosomes.POLLINATION, ForestryAlleles.POLLINATION_SLOWER);
                    genome.set(BeeChromosomes.FERTILITY, ForestryAlleles.FERTILITY_3);
                    genome.set(BeeChromosomes.TEMPERATURE_TOLERANCE, ForestryAlleles.TOLERANCE_DOWN_1);
                });
        apiculture.registerSpecies(ExtraBeesBeeSpecies.CREEPY, GENUS_HOSTILE, SPECIES_CREEPY, true, new Color(0x2ce515))
                .setBody(new Color(0xcae274))
                .addProduct(ExtraBeesItems.BARREN_COMB.get().getDefaultInstance(), 0.12f)
                .addProduct(ExtraBeesItems.NUCLEAR_COMB.get().getDefaultInstance(), 0.12f)
                .setGenome(genome -> {
                    genome.set(BeeChromosomes.POLLINATION, ForestryAlleles.POLLINATION_SLOWER);
                    genome.set(BeeChromosomes.FERTILITY, ForestryAlleles.FERTILITY_3);
                    genome.set(BeeChromosomes.TEMPERATURE_TOLERANCE, ForestryAlleles.TOLERANCE_DOWN_1);
                });

        apiculture.registerSpecies(ExtraBeesBeeSpecies.UNSTABLE, GENUS_NUCLEAR, SPECIES_UNSTABLE, true, new Color(0x3e8b34))
                .setBody(new Color(0x989898))
                .addProduct(ExtraBeesItems.BARREN_COMB.get().getDefaultInstance(), 0.12f)
                .setGenome(genome -> {
                    genome.set(BeeChromosomes.POLLINATION, ForestryAlleles.POLLINATION_SLOWER);
                    genome.set(BeeChromosomes.FERTILITY, ForestryAlleles.FERTILITY_3);
                    genome.set(BeeChromosomes.TEMPERATURE_TOLERANCE, ForestryAlleles.TOLERANCE_DOWN_1);
                });
        apiculture.registerSpecies(ExtraBeesBeeSpecies.NUCLEAR, GENUS_NUCLEAR, SPECIES_NUCLEAR, true, new Color(0x41cb2f))
                .setBody(new Color(0x989898))
                .addProduct(ExtraBeesItems.BARREN_COMB.get().getDefaultInstance(), 0.12f)
                .setGenome(genome -> {
                    genome.set(BeeChromosomes.POLLINATION, ForestryAlleles.POLLINATION_SLOWER);
                    genome.set(BeeChromosomes.FERTILITY, ForestryAlleles.FERTILITY_3);
                    genome.set(BeeChromosomes.TEMPERATURE_TOLERANCE, ForestryAlleles.TOLERANCE_DOWN_1);
                });
        apiculture.registerSpecies(ExtraBeesBeeSpecies.RADIOACTIVE, GENUS_NUCLEAR, SPECIES_RADIOACTIVE, true, new Color(0x1efe00))
                .setBody(new Color(0x989898))
                .addProduct(ExtraBeesItems.BARREN_COMB.get().getDefaultInstance(), 0.12f)
                .addProduct(ExtraBeesItems.NUCLEAR_COMB.get().getDefaultInstance(), 0.12f)
                .setGenome(genome -> {
                    genome.set(BeeChromosomes.POLLINATION, ForestryAlleles.POLLINATION_SLOWER);
                    genome.set(BeeChromosomes.FERTILITY, ForestryAlleles.FERTILITY_3);
                    genome.set(BeeChromosomes.TEMPERATURE_TOLERANCE, ForestryAlleles.TOLERANCE_DOWN_1);
                });

        apiculture.registerSpecies(ExtraBeesBeeSpecies.RUSTY, GENUS_RUSTY, SPECIES_RUSTY, true, new Color(0xa77058))
                .setBody(new Color(0x989898))
                .addProduct(ExtraBeesItems.ROCKY_COMB.get().getDefaultInstance(), 0.12f)
                .addProduct(ExtraBeesItems.RUSTY_COMB.get().getDefaultInstance(), 0.12f)
                .setGenome(genome -> {
                    genome.set(BeeChromosomes.POLLINATION, ForestryAlleles.POLLINATION_SLOWER);
                    genome.set(BeeChromosomes.FERTILITY, ForestryAlleles.FERTILITY_3);
                    genome.set(BeeChromosomes.TEMPERATURE_TOLERANCE, ForestryAlleles.TOLERANCE_DOWN_1);
                });
        apiculture.registerSpecies(ExtraBeesBeeSpecies.CORRODED, GENUS_RUSTY, SPECIES_CORRODED, true, new Color(0xd06308))
                .setBody(new Color(0x989898))
                .addProduct(ExtraBeesItems.ROCKY_COMB.get().getDefaultInstance(), 0.12f)
                .addProduct(ExtraBeesItems.CORRODED_COMB.get().getDefaultInstance(), 0.12f)
                .setGenome(genome -> {
                    genome.set(BeeChromosomes.POLLINATION, ForestryAlleles.POLLINATION_SLOWER);
                    genome.set(BeeChromosomes.FERTILITY, ForestryAlleles.FERTILITY_3);
                    genome.set(BeeChromosomes.TEMPERATURE_TOLERANCE, ForestryAlleles.TOLERANCE_DOWN_1);
                });
        apiculture.registerSpecies(ExtraBeesBeeSpecies.TARNISHED, GENUS_RUSTY, SPECIES_TARNISHED, true, new Color(0xbcb0bc))
                .setBody(new Color(0x989898))
                .addProduct(ExtraBeesItems.ROCKY_COMB.get().getDefaultInstance(), 0.12f)
                .addProduct(ExtraBeesItems.TARNISHED_COMB.get().getDefaultInstance(), 0.12f)
                .setGenome(genome -> {
                    genome.set(BeeChromosomes.POLLINATION, ForestryAlleles.POLLINATION_SLOWER);
                    genome.set(BeeChromosomes.FERTILITY, ForestryAlleles.FERTILITY_3);
                    genome.set(BeeChromosomes.TEMPERATURE_TOLERANCE, ForestryAlleles.TOLERANCE_DOWN_1);
                });
        apiculture.registerSpecies(ExtraBeesBeeSpecies.LEADEN, GENUS_RUSTY, SPECIES_LEADEN, true, new Color(0x8d7b8c))
                .setBody(new Color(0x989898))
                .addProduct(ExtraBeesItems.ROCKY_COMB.get().getDefaultInstance(), 0.12f)
                .addProduct(ExtraBeesItems.LEADEN_COMB.get().getDefaultInstance(), 0.12f)
                .setGenome(genome -> {
                    genome.set(BeeChromosomes.POLLINATION, ForestryAlleles.POLLINATION_SLOWER);
                    genome.set(BeeChromosomes.FERTILITY, ForestryAlleles.FERTILITY_3);
                    genome.set(BeeChromosomes.TEMPERATURE_TOLERANCE, ForestryAlleles.TOLERANCE_DOWN_1);
                });

        apiculture.registerSpecies(ExtraBeesBeeSpecies.EMERALD, GENUS_GEMSTONE, SPECIES_EMERALD, true, new Color(0x1cfe03))
                .setBody(new Color(0x7F7F7F))
                .addProduct(ExtraBeesItems.ROCKY_COMB.get().getDefaultInstance(), 0.12f)
                .addProduct(ExtraBeesItems.EMERALD_COMB.get().getDefaultInstance(), 0.12f)
                .setGenome(genome -> {
                    genome.set(BeeChromosomes.POLLINATION, ForestryAlleles.POLLINATION_SLOWER);
                    genome.set(BeeChromosomes.FERTILITY, ForestryAlleles.FERTILITY_3);
                    genome.set(BeeChromosomes.TEMPERATURE_TOLERANCE, ForestryAlleles.TOLERANCE_DOWN_1);
                });
        apiculture.registerSpecies(ExtraBeesBeeSpecies.RUBY, GENUS_GEMSTONE, SPECIES_RUBY, true, new Color(0xd50000))
                .setBody(new Color(0x7F7F7F))
                .addProduct(ExtraBeesItems.ROCKY_COMB.get().getDefaultInstance(), 0.12f)
                .addProduct(ExtraBeesItems.RUBY_COMB.get().getDefaultInstance(), 0.12f)
                .setGenome(genome -> {
                    genome.set(BeeChromosomes.POLLINATION, ForestryAlleles.POLLINATION_SLOWER);
                    genome.set(BeeChromosomes.FERTILITY, ForestryAlleles.FERTILITY_3);
                    genome.set(BeeChromosomes.TEMPERATURE_TOLERANCE, ForestryAlleles.TOLERANCE_DOWN_1);
                });
        apiculture.registerSpecies(ExtraBeesBeeSpecies.SAPPHIRE, GENUS_GEMSTONE, SPECIES_SAPPHIRE, true, new Color(0x0a47fe))
                .setBody(new Color(0x7F7F7F))
                .addProduct(ExtraBeesItems.ROCKY_COMB.get().getDefaultInstance(), 0.12f)
                .addProduct(ExtraBeesItems.SAPPHIRE_COMB.get().getDefaultInstance(), 0.12f)
                .setGenome(genome -> {
                    genome.set(BeeChromosomes.POLLINATION, ForestryAlleles.POLLINATION_SLOWER);
                    genome.set(BeeChromosomes.FERTILITY, ForestryAlleles.FERTILITY_3);
                    genome.set(BeeChromosomes.TEMPERATURE_TOLERANCE, ForestryAlleles.TOLERANCE_DOWN_1);
                });
        apiculture.registerSpecies(ExtraBeesBeeSpecies.DIAMOND, GENUS_GEMSTONE, SPECIES_DIAMOND, true, new Color(0x67e4d7))
                .setBody(new Color(0x7F7F7F))
                .addProduct(ExtraBeesItems.ROCKY_COMB.get().getDefaultInstance(), 0.12f)
                .addProduct(ExtraBeesItems.DIAMOND_COMB.get().getDefaultInstance(), 0.12f)
                .setGenome(genome -> {
                    genome.set(BeeChromosomes.POLLINATION, ForestryAlleles.POLLINATION_SLOWER);
                    genome.set(BeeChromosomes.FERTILITY, ForestryAlleles.FERTILITY_3);
                    genome.set(BeeChromosomes.TEMPERATURE_TOLERANCE, ForestryAlleles.TOLERANCE_DOWN_1);
                });

        apiculture.registerSpecies(ExtraBeesBeeSpecies.RESOLUTE, GENUS_METALLIC, SPECIES_RESOLUTE, true, new Color(0xC1843E))
                .setBody(new Color(0x7F7F7F))
                .addProduct(ExtraBeesItems.ROCKY_COMB.get().getDefaultInstance(), 0.12f)
                .addProduct(ExtraBeesItems.RESOLUTE_COMB.get().getDefaultInstance(), 0.12f)
                .setGenome(genome -> {
                    genome.set(BeeChromosomes.POLLINATION, ForestryAlleles.POLLINATION_SLOWER);
                    genome.set(BeeChromosomes.FERTILITY, ForestryAlleles.FERTILITY_3);
                    genome.set(BeeChromosomes.TEMPERATURE_TOLERANCE, ForestryAlleles.TOLERANCE_DOWN_1);
                });
        apiculture.registerSpecies(ExtraBeesBeeSpecies.STAINLESS, GENUS_METALLIC, SPECIES_STAINLESS, true, new Color(0xB8A8A1))
                .setBody(new Color(0x7F7F7F))
                .addProduct(ExtraBeesItems.ROCKY_COMB.get().getDefaultInstance(), 0.12f)
                .addProduct(ExtraBeesItems.STAINLESS_COMB.get().getDefaultInstance(), 0.12f)
                .setGenome(genome -> {
                    genome.set(BeeChromosomes.POLLINATION, ForestryAlleles.POLLINATION_SLOWER);
                    genome.set(BeeChromosomes.FERTILITY, ForestryAlleles.FERTILITY_3);
                    genome.set(BeeChromosomes.TEMPERATURE_TOLERANCE, ForestryAlleles.TOLERANCE_DOWN_1);
                });
        apiculture.registerSpecies(ExtraBeesBeeSpecies.FORTIFIED, GENUS_METALLIC, SPECIES_FORTIFIED, true, new Color(0x737373))
                .setBody(new Color(0x7F7F7F))
                .addProduct(ExtraBeesItems.ROCKY_COMB.get().getDefaultInstance(), 0.12f)
                .addProduct(ExtraBeesItems.FORTIFIED_COMB.get().getDefaultInstance(), 0.12f)
                .setGenome(genome -> {
                    genome.set(BeeChromosomes.POLLINATION, ForestryAlleles.POLLINATION_SLOWER);
                    genome.set(BeeChromosomes.FERTILITY, ForestryAlleles.FERTILITY_3);
                    genome.set(BeeChromosomes.TEMPERATURE_TOLERANCE, ForestryAlleles.TOLERANCE_DOWN_1);
                });
        apiculture.registerSpecies(ExtraBeesBeeSpecies.INVARIABLE, GENUS_METALLIC, SPECIES_INVARIABLE, true, new Color(0xBFBBAC))
                .setBody(new Color(0x7F7F7F))
                .addProduct(ExtraBeesItems.ROCKY_COMB.get().getDefaultInstance(), 0.12f)
                .addProduct(ExtraBeesItems.INVARIABLE_COMB.get().getDefaultInstance(), 0.12f)
                .setGenome(genome -> {
                    genome.set(BeeChromosomes.POLLINATION, ForestryAlleles.POLLINATION_SLOWER);
                    genome.set(BeeChromosomes.FERTILITY, ForestryAlleles.FERTILITY_3);
                    genome.set(BeeChromosomes.TEMPERATURE_TOLERANCE, ForestryAlleles.TOLERANCE_DOWN_1);
                });

        apiculture.registerSpecies(ExtraBeesBeeSpecies.GILDED, GENUS_PRECIOUS, SPECIES_GILDED, true, new Color(0xE3CD80))
                .setBody(new Color(0x7F7F7F))
                .addProduct(ExtraBeesItems.ROCKY_COMB.get().getDefaultInstance(), 0.12f)
                .addProduct(ExtraBeesItems.GILDED_COMB.get().getDefaultInstance(), 0.12f)
                .setGenome(genome -> {
                    genome.set(BeeChromosomes.POLLINATION, ForestryAlleles.POLLINATION_SLOWER);
                    genome.set(BeeChromosomes.FERTILITY, ForestryAlleles.FERTILITY_3);
                    genome.set(BeeChromosomes.TEMPERATURE_TOLERANCE, ForestryAlleles.TOLERANCE_DOWN_1);
                });
        apiculture.registerSpecies(ExtraBeesBeeSpecies.SHINING, GENUS_PRECIOUS, SPECIES_SHINING, true, new Color(0xFFFFFF))
                .setBody(new Color(0x7F7F7F))
                .addProduct(ExtraBeesItems.ROCKY_COMB.get().getDefaultInstance(), 0.12f)
                .addProduct(ExtraBeesItems.SHINING_COMB.get().getDefaultInstance(), 0.12f)
                .setGenome(genome -> {
                    genome.set(BeeChromosomes.POLLINATION, ForestryAlleles.POLLINATION_SLOWER);
                    genome.set(BeeChromosomes.FERTILITY, ForestryAlleles.FERTILITY_3);
                    genome.set(BeeChromosomes.TEMPERATURE_TOLERANCE, ForestryAlleles.TOLERANCE_DOWN_1);
                });
        apiculture.registerSpecies(ExtraBeesBeeSpecies.GLITTERING, GENUS_PRECIOUS, SPECIES_GLITTERING, true, new Color(0xE4C737))
                .setBody(new Color(0x7F7F7F))
                .addProduct(ExtraBeesItems.ROCKY_COMB.get().getDefaultInstance(), 0.12f)
                .addProduct(ExtraBeesItems.GLITTERING_COMB.get().getDefaultInstance(), 0.12f)
                .setGenome(genome -> {
                    genome.set(BeeChromosomes.POLLINATION, ForestryAlleles.POLLINATION_SLOWER);
                    genome.set(BeeChromosomes.FERTILITY, ForestryAlleles.FERTILITY_3);
                    genome.set(BeeChromosomes.TEMPERATURE_TOLERANCE, ForestryAlleles.TOLERANCE_DOWN_1);
                });
    }
}
