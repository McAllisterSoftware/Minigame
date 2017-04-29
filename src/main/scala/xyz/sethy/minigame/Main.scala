package xyz.sethy.minigame

import org.bukkit.{Bukkit, ChatColor}
import org.bukkit.plugin.java.JavaPlugin
import xyz.sethy.minigame.listeners.PreJoinListener
import xyz.sethy.minigame.team.Team

/**
  * Created by Seth on 29/04/2017.
  */
object Main extends JavaPlugin
{
  val gameState : GameState = GameState.LOADING

  override def onEnable(): Unit =
  {
    getServer.getPluginManager.registerEvents(new PreJoinListener(), this)
  }
}
