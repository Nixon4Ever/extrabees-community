package extrabees.compat;

import extrabees.api.ExtraBeesTaxa;
import forestry.api.genetics.ForestryTaxa;
import forestry.api.genetics.alleles.BeeChromosomes;
import forestry.api.genetics.alleles.ForestryAlleles;
import forestry.api.plugin.IGeneticRegistration;

public class ExtraBeesTaxonomy {
    @SuppressWarnings("CodeBlock2Expr")
    public static void defineTaxa(IGeneticRegistration genetics) {
        genetics.defineTaxon(ForestryTaxa.CLASS_INSECTS, ForestryTaxa.ORDER_HYMNOPTERA, order -> {
            order.defineSubTaxon(ForestryTaxa.FAMILY_BEES, family -> {
                family.defineSubTaxon(ExtraBeesTaxa.GENUS_BARREN, genus -> {
                    genus.setDefaultChromosome(BeeChromosomes.SPEED, ForestryAlleles.SPEED_SLOWER);
                    genus.setDefaultChromosome(BeeChromosomes.LIFESPAN, ForestryAlleles.LIFESPAN_SHORT);
                    genus.setDefaultChromosome(BeeChromosomes.FERTILITY, ForestryAlleles.FERTILITY_2);
                    genus.setDefaultChromosome(BeeChromosomes.POLLINATION, ForestryAlleles.POLLINATION_SLOWER);
                    genus.setDefaultChromosome(BeeChromosomes.HUMIDITY_TOLERANCE, ForestryAlleles.TOLERANCE_UP_1);
                    genus.setDefaultChromosome(BeeChromosomes.TEMPERATURE_TOLERANCE, ForestryAlleles.TOLERANCE_UP_1);
                    genus.setDefaultChromosome(BeeChromosomes.CAVE_DWELLING, ForestryAlleles.FALSE);
                    genus.setDefaultChromosome(BeeChromosomes.TERRITORY, ForestryAlleles.TERRITORY_AVERAGE);
                    genus.setDefaultChromosome(BeeChromosomes.FLOWER_TYPE, ForestryAlleles.FLOWER_TYPE_VANILLA);
                });
                family.defineSubTaxon(ExtraBeesTaxa.GENUS_HOSTILE, genus -> {
                    genus.setDefaultChromosome(BeeChromosomes.SPEED, ForestryAlleles.SPEED_SLOWER);
                    genus.setDefaultChromosome(BeeChromosomes.LIFESPAN, ForestryAlleles.LIFESPAN_LONG);
                    genus.setDefaultChromosome(BeeChromosomes.FERTILITY, ForestryAlleles.FERTILITY_1);
                    genus.setDefaultChromosome(BeeChromosomes.POLLINATION, ForestryAlleles.POLLINATION_FASTER);
                    genus.setDefaultChromosome(BeeChromosomes.HUMIDITY_TOLERANCE, ForestryAlleles.TOLERANCE_BOTH_1);
                    genus.setDefaultChromosome(BeeChromosomes.TEMPERATURE_TOLERANCE, ForestryAlleles.TOLERANCE_BOTH_1);
                    genus.setDefaultChromosome(BeeChromosomes.CAVE_DWELLING, ForestryAlleles.FALSE);
                    genus.setDefaultChromosome(BeeChromosomes.FLOWER_TYPE, ForestryAlleles.FLOWER_TYPE_VANILLA);
                });
                family.defineSubTaxon(ExtraBeesTaxa.GENUS_ROCKY, genus -> {
                    genus.setDefaultChromosome(BeeChromosomes.SPEED, ForestryAlleles.SPEED_SLOWEST);
                    genus.setDefaultChromosome(BeeChromosomes.LIFESPAN, ForestryAlleles.LIFESPAN_SHORTEST);
                    genus.setDefaultChromosome(BeeChromosomes.FERTILITY, ForestryAlleles.FERTILITY_1);
                    genus.setDefaultChromosome(BeeChromosomes.POLLINATION, ForestryAlleles.POLLINATION_SLOWER);
                    genus.setDefaultChromosome(BeeChromosomes.HUMIDITY_TOLERANCE, ForestryAlleles.TOLERANCE_BOTH_2);
                    genus.setDefaultChromosome(BeeChromosomes.TEMPERATURE_TOLERANCE, ForestryAlleles.TOLERANCE_BOTH_2);
                    genus.setDefaultChromosome(BeeChromosomes.CAVE_DWELLING, ForestryAlleles.TRUE);
                    genus.setDefaultChromosome(BeeChromosomes.ACTIVITY, ForestryAlleles.ACTIVITY_METATURNAL);
                    genus.setDefaultChromosome(BeeChromosomes.TOLERATES_RAIN, ForestryAlleles.TRUE);
                    genus.setDefaultChromosome(BeeChromosomes.FLOWER_TYPE, ForestryAlleles.FLOWER_TYPE_CAVE);
                });
                family.defineSubTaxon(ExtraBeesTaxa.GENUS_NUCLEAR, genus -> {
                    genus.setDefaultChromosome(BeeChromosomes.SPEED, ForestryAlleles.SPEED_SLOWEST);
                    genus.setDefaultChromosome(BeeChromosomes.LIFESPAN, ForestryAlleles.LIFESPAN_SHORTEST);
                    genus.setDefaultChromosome(BeeChromosomes.FERTILITY, ForestryAlleles.FERTILITY_1);
                    genus.setDefaultChromosome(BeeChromosomes.POLLINATION, ForestryAlleles.POLLINATION_SLOWER);
                    genus.setDefaultChromosome(BeeChromosomes.HUMIDITY_TOLERANCE, ForestryAlleles.TOLERANCE_BOTH_2);
                    genus.setDefaultChromosome(BeeChromosomes.TEMPERATURE_TOLERANCE, ForestryAlleles.TOLERANCE_BOTH_2);
                    genus.setDefaultChromosome(BeeChromosomes.CAVE_DWELLING, ForestryAlleles.TRUE);
                    genus.setDefaultChromosome(BeeChromosomes.ACTIVITY, ForestryAlleles.ACTIVITY_METATURNAL);
                    genus.setDefaultChromosome(BeeChromosomes.TOLERATES_RAIN, ForestryAlleles.TRUE);
                    genus.setDefaultChromosome(BeeChromosomes.FLOWER_TYPE, ForestryAlleles.FLOWER_TYPE_CAVE);
                });
                family.defineSubTaxon(ExtraBeesTaxa.GENUS_RUSTY, genus -> {
                    genus.setDefaultChromosome(BeeChromosomes.SPEED, ForestryAlleles.SPEED_SLOWEST);
                    genus.setDefaultChromosome(BeeChromosomes.LIFESPAN, ForestryAlleles.LIFESPAN_SHORTEST);
                    genus.setDefaultChromosome(BeeChromosomes.FERTILITY, ForestryAlleles.FERTILITY_1);
                    genus.setDefaultChromosome(BeeChromosomes.POLLINATION, ForestryAlleles.POLLINATION_SLOWER);
                    genus.setDefaultChromosome(BeeChromosomes.HUMIDITY_TOLERANCE, ForestryAlleles.TOLERANCE_BOTH_2);
                    genus.setDefaultChromosome(BeeChromosomes.TEMPERATURE_TOLERANCE, ForestryAlleles.TOLERANCE_BOTH_2);
                    genus.setDefaultChromosome(BeeChromosomes.CAVE_DWELLING, ForestryAlleles.TRUE);
                    genus.setDefaultChromosome(BeeChromosomes.ACTIVITY, ForestryAlleles.ACTIVITY_METATURNAL);
                    genus.setDefaultChromosome(BeeChromosomes.TOLERATES_RAIN, ForestryAlleles.TRUE);
                    genus.setDefaultChromosome(BeeChromosomes.FLOWER_TYPE, ForestryAlleles.FLOWER_TYPE_CAVE);
                });
                family.defineSubTaxon(ExtraBeesTaxa.GENUS_GEMSTONE, genus -> {
                    genus.setDefaultChromosome(BeeChromosomes.SPEED, ForestryAlleles.SPEED_SLOWEST);
                    genus.setDefaultChromosome(BeeChromosomes.LIFESPAN, ForestryAlleles.LIFESPAN_SHORTER);
                    genus.setDefaultChromosome(BeeChromosomes.FERTILITY, ForestryAlleles.FERTILITY_1);
                    genus.setDefaultChromosome(BeeChromosomes.POLLINATION, ForestryAlleles.POLLINATION_SLOWER);
                    genus.setDefaultChromosome(BeeChromosomes.HUMIDITY_TOLERANCE, ForestryAlleles.TOLERANCE_BOTH_2);
                    genus.setDefaultChromosome(BeeChromosomes.TEMPERATURE_TOLERANCE, ForestryAlleles.TOLERANCE_BOTH_2);
                    genus.setDefaultChromosome(BeeChromosomes.CAVE_DWELLING, ForestryAlleles.TRUE);
                    genus.setDefaultChromosome(BeeChromosomes.ACTIVITY, ForestryAlleles.ACTIVITY_METATURNAL);
                    genus.setDefaultChromosome(BeeChromosomes.TOLERATES_RAIN, ForestryAlleles.TRUE);
                    genus.setDefaultChromosome(BeeChromosomes.FLOWER_TYPE, ForestryAlleles.FLOWER_TYPE_CAVE);
                });
                family.defineSubTaxon(ExtraBeesTaxa.GENUS_METALLIC, genus -> {
                    genus.setDefaultChromosome(BeeChromosomes.SPEED, ForestryAlleles.SPEED_SLOWEST);
                    genus.setDefaultChromosome(BeeChromosomes.LIFESPAN, ForestryAlleles.LIFESPAN_SHORTER);
                    genus.setDefaultChromosome(BeeChromosomes.FERTILITY, ForestryAlleles.FERTILITY_1);
                    genus.setDefaultChromosome(BeeChromosomes.POLLINATION, ForestryAlleles.POLLINATION_SLOWER);
                    genus.setDefaultChromosome(BeeChromosomes.HUMIDITY_TOLERANCE, ForestryAlleles.TOLERANCE_BOTH_2);
                    genus.setDefaultChromosome(BeeChromosomes.TEMPERATURE_TOLERANCE, ForestryAlleles.TOLERANCE_BOTH_2);
                    genus.setDefaultChromosome(BeeChromosomes.CAVE_DWELLING, ForestryAlleles.TRUE);
                    genus.setDefaultChromosome(BeeChromosomes.ACTIVITY, ForestryAlleles.ACTIVITY_METATURNAL);
                    genus.setDefaultChromosome(BeeChromosomes.TOLERATES_RAIN, ForestryAlleles.TRUE);
                    genus.setDefaultChromosome(BeeChromosomes.FLOWER_TYPE, ForestryAlleles.FLOWER_TYPE_CAVE);
                });
                family.defineSubTaxon(ExtraBeesTaxa.GENUS_PRECIOUS, genus -> {
                    genus.setDefaultChromosome(BeeChromosomes.SPEED, ForestryAlleles.SPEED_SLOWEST);
                    genus.setDefaultChromosome(BeeChromosomes.LIFESPAN, ForestryAlleles.LIFESPAN_SHORTER);
                    genus.setDefaultChromosome(BeeChromosomes.FERTILITY, ForestryAlleles.FERTILITY_1);
                    genus.setDefaultChromosome(BeeChromosomes.POLLINATION, ForestryAlleles.POLLINATION_SLOWER);
                    genus.setDefaultChromosome(BeeChromosomes.HUMIDITY_TOLERANCE, ForestryAlleles.TOLERANCE_BOTH_2);
                    genus.setDefaultChromosome(BeeChromosomes.TEMPERATURE_TOLERANCE, ForestryAlleles.TOLERANCE_BOTH_2);
                    genus.setDefaultChromosome(BeeChromosomes.CAVE_DWELLING, ForestryAlleles.TRUE);
                    genus.setDefaultChromosome(BeeChromosomes.ACTIVITY, ForestryAlleles.ACTIVITY_METATURNAL);
                    genus.setDefaultChromosome(BeeChromosomes.TOLERATES_RAIN, ForestryAlleles.TRUE);
                    genus.setDefaultChromosome(BeeChromosomes.FLOWER_TYPE, ForestryAlleles.FLOWER_TYPE_CAVE);
                });
                family.defineSubTaxon(ExtraBeesTaxa.GENUS_FOSSIL, genus -> {
                    genus.setDefaultChromosome(BeeChromosomes.SPEED, ForestryAlleles.SPEED_SLOWER);
                    genus.setDefaultChromosome(BeeChromosomes.LIFESPAN, ForestryAlleles.LIFESPAN_SHORT);
                    genus.setDefaultChromosome(BeeChromosomes.FERTILITY, ForestryAlleles.FERTILITY_2);
                    genus.setDefaultChromosome(BeeChromosomes.POLLINATION, ForestryAlleles.POLLINATION_SLOWER);
                    genus.setDefaultChromosome(BeeChromosomes.HUMIDITY_TOLERANCE, ForestryAlleles.TOLERANCE_BOTH_1);
                    genus.setDefaultChromosome(BeeChromosomes.TEMPERATURE_TOLERANCE, ForestryAlleles.TOLERANCE_BOTH_1);
                    genus.setDefaultChromosome(BeeChromosomes.CAVE_DWELLING, ForestryAlleles.FALSE);
                    genus.setDefaultChromosome(BeeChromosomes.TERRITORY, ForestryAlleles.TERRITORY_AVERAGE);
                    genus.setDefaultChromosome(BeeChromosomes.FLOWER_TYPE, ForestryAlleles.FLOWER_TYPE_VANILLA);
                });
                family.defineSubTaxon(ExtraBeesTaxa.GENUS_ENERGETIC, genus -> {
                    genus.setDefaultChromosome(BeeChromosomes.SPEED, ForestryAlleles.SPEED_SLOWER);
                    genus.setDefaultChromosome(BeeChromosomes.LIFESPAN, ForestryAlleles.LIFESPAN_SHORT);
                    genus.setDefaultChromosome(BeeChromosomes.FERTILITY, ForestryAlleles.FERTILITY_2);
                    genus.setDefaultChromosome(BeeChromosomes.POLLINATION, ForestryAlleles.POLLINATION_SLOWER);
                    genus.setDefaultChromosome(BeeChromosomes.HUMIDITY_TOLERANCE, ForestryAlleles.TOLERANCE_BOTH_1);
                    genus.setDefaultChromosome(BeeChromosomes.TEMPERATURE_TOLERANCE, ForestryAlleles.TOLERANCE_BOTH_1);
                    genus.setDefaultChromosome(BeeChromosomes.CAVE_DWELLING, ForestryAlleles.FALSE);
                    genus.setDefaultChromosome(BeeChromosomes.TERRITORY, ForestryAlleles.TERRITORY_AVERAGE);
                    genus.setDefaultChromosome(BeeChromosomes.FLOWER_TYPE, ForestryAlleles.FLOWER_TYPE_CAVE);// For now
                    //genus.setDefaultChromosome(BeeChromosomes.FLOWER_TYPE, ForestryAlleles.FLOWER_TYPE_REDSTONE);
                });
            });
        });
    }
}