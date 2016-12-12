/*******************************************************************************
 * Copyright (c) 2016 Julien Louette & Gaël Wittorski
 * 
 * This file is part of Raspoid.
 * 
 * Raspoid is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * Raspoid is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public License
 * along with Raspoid.  If not, see <http://www.gnu.org/licenses/>.
 ******************************************************************************/
package com.raspoid.examples.additionalcomponents;

import com.raspoid.GPIOPin;
import com.raspoid.Tools;
import com.raspoid.additionalcomponents.LED;

/**
 * Example of use of various LEDs connected through Gpio pin.
 * 
 * @see LED
 * 
 * @author Julien Louette &amp; Ga&euml;l Wittorski
 * @version 1.0
 */
public class LEDExample {
    
    /**
     * Private constructor to hide the implicit public one.
     */
    private LEDExample() {
    }
    
    /**
     * Command-line interface.
     * @param args unused here.
     */
    public static void main(String[] args) {
        LED white = new LED(GPIOPin.GPIO_26);
        LED green = new LED(GPIOPin.GPIO_27);
        LED red = new LED(GPIOPin.GPIO_28);
        LED yellow = new LED(GPIOPin.GPIO_29);

        while (true) {
            white.toggle();
            Tools.sleepMilliseconds(250);
            green.toggle();
            Tools.sleepMilliseconds(250);
            red.toggle();
            Tools.sleepMilliseconds(250);
            yellow.toggle();
            Tools.sleepMilliseconds(250);
        }
    }
}
