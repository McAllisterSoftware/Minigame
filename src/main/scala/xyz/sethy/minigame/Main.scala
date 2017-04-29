package xyz.sethy.minigame

import org.bukkit.plugin.java.JavaPlugin

/**
  * Created by Seth on 29/04/2017.
  */
object Main extends JavaPlugin
{
  val gameState : GameState = GameState.LOADING

  override def onEnable(): Unit =
  {

  }
}
