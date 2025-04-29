package extrabees;

import extrabees.items.ExtraBeesItems;
import extrabees.util.CreativeTab;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraftforge.common.ForgeMod;

import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;

import extrabees.api.ExtraBeesConstants;

@Mod(ExtraBeesConstants.MOD_ID)
@SuppressWarnings("removal")
public class ExtraBees {
	public static final boolean DEBUG = ModList.get().isLoaded("modkit");
	public static final Logger LOGGER = LogManager.getLogger(ExtraBeesConstants.MOD_ID);

	public ExtraBees() {
		IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

		ExtraBeesItems.register(modEventBus);
		CreativeTab.TABS.register(modEventBus);

		//modEventBus.addListener(this::commonSetup);
		MinecraftForge.EVENT_BUS.register(this);
	}
}
