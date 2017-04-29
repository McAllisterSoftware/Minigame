package xyz.sethy.minigame.team

import org.bukkit.ChatColor
import org.bukkit.entity.Player

/**
  * Created by Seth on 29/04/2017.
  */
abstract class Team
{
  var colour : ChatColor
  var players : List[Player]
  var commander : Player
  var energy : Double

  def Team(colour: ChatColor, players : List[Player], commander : Player): Unit =
  {
    this.colour = colour
    this.players = players
    this.commander = commander
    this.energy = 0.0D
  }

  def getColour() : Unit =
  {
    colour
  }

  def getPlayers() : Unit =
  {
    players
  }

  def setCommander(commander : Player): Unit =
  {
    this.commander = commander
  }
}
