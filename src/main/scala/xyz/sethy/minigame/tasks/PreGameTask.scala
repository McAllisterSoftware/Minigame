package xyz.sethy.minigame.tasks

import org.bukkit.entity.Player
import org.bukkit.{Bukkit, ChatColor, GameMode, Location}
import org.bukkit.scheduler.BukkitRunnable

/**
  * Created by Seth on 29/04/2017.
  */
class PreGameTask extends BukkitRunnable
{
  override def run(): Unit =
  {
    val online = Bukkit.getOnlinePlayers.size()
    if(online < 20)
    {
        new BukkitRunnable
        {
          val i = 10
          override def run(): Unit =
          {
            if(i != 10)
            {
              Bukkit.broadcastMessage(ChatColor.translateAlternateColorCodes('&', "&7[Game] &eThe game is starting in &a" + i + "&e seconds."))
            }
            val it = Bukkit.getOnlinePlayers.iterator()
            while(it.hasNext)
            {

              val player = it.next()
              player.setGameMode(GameMode.SURVIVAL)
              player.teleport(new Location(Bukkit.getWorld("world"), 0, 0, 0))
            }
          }
        }
    }
  }
}
