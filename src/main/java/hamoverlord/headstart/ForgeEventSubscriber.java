package hamoverlord.headstart;

import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

/**
 * Subscribe to events from the FORGE EventBus that should be handled on both PHYSICAL sides in this class
 *
 * @author Cadiboo
 */
@EventBusSubscriber(modid = Headstart.MODID, bus = EventBusSubscriber.Bus.FORGE)
public final class ForgeEventSubscriber {

}