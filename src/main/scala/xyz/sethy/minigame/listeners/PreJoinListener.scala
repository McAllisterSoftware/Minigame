package xyz.sethy.minigame.listeners

import org.bukkit.event.player.AsyncPlayerPreLoginEvent
import org.bukkit.event.{EventHandler, Listener}
import xyz.sethy.minigame.{GameState, Main}

/**
  * Created by Seth on 29/04/2017.
  */
class PreJoinListener extends Listener
{
  @EventHandler
  def onPreJoin(event: AsyncPlayerPreLoginEvent): Unit =
  {
    if(Main.gameState != GameState.PREGAME)
    {
      event.disallow(AsyncPlayerPreLoginEvent.Result.KICK_OTHER, "You can only join the game while it's in pre-game.")
    }
  }
}
