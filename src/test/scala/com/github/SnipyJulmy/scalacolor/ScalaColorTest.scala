package com.github.SnipyJulmy.scalacolor

import org.scalacheck.Gen
import org.scalacheck.Prop._
import org.scalatest.FlatSpec
import org.scalatest.prop._

import scala.Console._
import ScalaColor._

class ScalaColorTest extends FlatSpec with Checkers {

  implicit override val generatorDrivenConfig: PropertyCheckConfiguration = PropertyCheckConfiguration(
    minSuccessful = 1000
  )

  val colors = Seq(
    BLACK, BLACK_B,
    WHITE, WHITE_B,
    YELLOW, YELLOW_B,
    BLUE, BLUE_B,
    RED, RED_B,
    MAGENTA, MAGENTA_B,
    CYAN, CYAN_B,
    GREEN, GREEN_B,
    BOLD, UNDERLINED, BLINK, REVERSED, INVISIBLE
  )

  behavior of "ScalaColor"

  it should "colorized any string with any color correctly" in {
    val gen = for {
      c <- Gen.oneOf(colors)
      s <- Gen.alphaStr
    } yield (c, s)

    check {
      forAll(gen) { case ((c, s)) =>
        c match {
          case BLACK => BLACK + s + RESET == s.black
          case BLACK_B => BLACK_B + s + RESET == s.onBlack
          case WHITE => WHITE + s + RESET == s.white
          case WHITE_B => WHITE_B + s + RESET == s.onWhite
          case GREEN => GREEN + s + RESET == s.green
          case GREEN_B => GREEN_B + s + RESET == s.onGreen
          case BLUE => BLUE + s + RESET == s.blue
          case BLUE_B => BLUE_B + s + RESET == s.onBlue
          case RED => RED + s + RESET == s.red
          case RED_B => RED_B + s + RESET == s.onRed
          case CYAN => CYAN + s + RESET == s.cyan
          case CYAN_B => CYAN_B + s + RESET == s.onCyan
          case YELLOW => YELLOW + s + RESET == s.yellow
          case YELLOW_B => YELLOW_B + s + RESET == s.onYellow
          case MAGENTA => MAGENTA + s + RESET == s.magenta
          case MAGENTA_B => MAGENTA_B + s + RESET == s.onMagenta
          case UNDERLINED => UNDERLINED + s + RESET == s.underline
          case BOLD => BOLD + s + RESET == s.bold
          case INVISIBLE => INVISIBLE + s + RESET == s.invisible
          case BLINK => BLINK + s + RESET == s.blink
          case REVERSED => REVERSED + s + RESET == s.rev
          case _ => fail
        }
      }
    }
  }
}
