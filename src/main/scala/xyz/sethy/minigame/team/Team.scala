package xyz.sethy.minigame.team

import org.bukkit.ChatColor
import org.bukkit.entity.Player

/**
  * Created by Seth on 29/04/2017.
  */
class Team(colour: ChatColor)
{
  private var _players : List[Player] = _
  private var _commander : Player = _
  private var _energy : Double = 0

  def players: List[Player] = _players

  def commander: Player = _commander

  def commander_= (value: Player): Unit = _commander = value
}
