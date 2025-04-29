package extrabees;

import extrabees.items.ExtraBeesItems;
import extrabees.util.CreativeTab;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import net.minecraftforge.fml.common.Mod;

import extrabees.api.ExtraBeesConstants;

@Mod(ExtraBeesConstants.MOD_ID)
@SuppressWarnings("removal")
public class ExtraBees {

	public ExtraBees() {
		IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

		ExtraBeesItems.register(modEventBus);
		CreativeTab.TABS.register(modEventBus);

		//modEventBus.addListener(this::commonSetup);
		MinecraftForge.EVENT_BUS.register(this);
	}
}
