/*
 * Copyright (c) 2017  Sylvain Julmy
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; see the file COPYING. If not, write to the
 * Free Software Foundation, Inc., 675 Mass Ave, Cambridge, MA 02139, USA.
 */

package com.github.SnipyJulmy.scalacolor

import scala.Console._
import scala.language.implicitConversions

object ScalaColor {

  implicit def Str2ColorStr(string: String): ColorStr = new ColorStr(string)

  class ColorStr(string: String) {

    // Text color
    def black: String = BLACK + string + RESET

    def red: String = RED + string + RESET

    def blue: String = BLUE + string + RESET

    def yellow: String = YELLOW + string + RESET

    def magenta: String = MAGENTA + string + RESET

    def cyan: String = CYAN + string + RESET

    def white: String = WHITE + string + RESET

    def green: String = GREEN + string + RESET

    // background color
    def onBlack: String = BLACK_B + string + RESET

    def onRed: String = RED_B + string + RESET

    def onBlue: String = BLUE_B + string + RESET

    def onYellow: String = YELLOW_B + string + RESET

    def onMagenta: String = MAGENTA_B + string + RESET

    def onCyan: String = CYAN_B + string + RESET

    def onWhite: String = WHITE_B + string + RESET

    def onGreen: String = GREEN_B + string + RESET

    // text properties
    def bold: String = BOLD + string + RESET

    def underline: String = UNDERLINED + string + RESET

    def blink: String = BLINK + string + RESET

    def reverse: String = REVERSED + string + RESET

    def invisible: String = INVISIBLE + string + RESET
  }
}