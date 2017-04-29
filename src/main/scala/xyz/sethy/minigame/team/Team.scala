package xyz.sethy.minigame.team

import org.bukkit.ChatColor
import org.bukkit.entity.Player

import scala.collection.mutable.ListBuffer

/**
  * Created by Seth on 29/04/2017.
  */
class Team(val colour: ChatColor, val players: List[Player], var commander: Player, var energy: Double)
{
  def this(colour: ChatColor) =
  {
    this(colour, ListBuffer(), None, 0)
  }
}
