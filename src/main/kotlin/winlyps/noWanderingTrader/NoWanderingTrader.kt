package winlyps.noWanderingTrader

import org.bukkit.plugin.java.JavaPlugin

class NoWanderingTrader : JavaPlugin() {

    override fun onEnable() {
        // Plugin startup logic
        server.worlds.forEach { world ->
            world.setGameRuleValue("doTraderSpawning", "false")
        }
        logger.info("NoWanderingTrader plugin has been enabled.")
    }

    override fun onDisable() {
        // Plugin shutdown logic
        server.worlds.forEach { world ->
            world.setGameRuleValue("doTraderSpawning", "true")
            logger.info("NoWanderingTrader plugin has been disabled.")
        }
    }
}