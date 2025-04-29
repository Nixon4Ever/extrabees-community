package extrabees.api;

import net.minecraft.resources.ResourceLocation;

public class ExtraBeesConstants {
	public static final String MOD_ID = "extrabees";
	public static ResourceLocation extrabees(String path) {
		return new ResourceLocation(MOD_ID, path);
	}
}
