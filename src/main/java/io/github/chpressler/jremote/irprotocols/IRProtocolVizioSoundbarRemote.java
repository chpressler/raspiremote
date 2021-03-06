/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.chpressler.jremote.irprotocols;

import com.raspoid.additionalcomponents.ir.IRProtocol;
import com.raspoid.additionalcomponents.ir.IRSignal;

/**
 *
 * @author christian
 */
public class IRProtocolVizioSoundbarRemote extends IRProtocol {

    public static final IRSignal button_on_off = new IRSignal("button_on_off",
            new int[]{0, 8840,
                4420, 540,
                560, 560,
                540, 560,
                540, 560,
                540, 560,
                560, 540,
                560, 540,
                540, 580,
                560, 540,
                1680, 560,
                1640, 580,
                1680, 540,
                1660, 540,
                1660, 540,
                1660, 540,
                1640, 580,
                1660, 560,
                540, 560,
                560, 540,
                560, 560,
                540, 560,
                540, 540,
                540, 560,
                1640, 560,
                560, 540,
                1680, 540,
                1660, 540,
                1660, 540,
                1660, 540,
                1640, 560,
                1640, 540,
                560, 560,
                1640, 560});

    public static final IRSignal button_volumeUp = new IRSignal("button_volumeUp",
            new int[]{0, 8940,
                4460, 560,
                580, 540,
                520, 580,
                560, 560,
                560, 540,
                560, 540,
                560, 540,
                560, 540,
                560, 540,
                1660, 560,
                1680, 560,
                1680, 560,
                1680, 560,
                1680, 560,
                1640, 580,
                1640, 560,
                1640, 540,
                1660, 540,
                560, 540,
                560, 540,
                580, 560,
                560, 540,
                580, 540,
                1660, 560,
                560, 560,
                560, 560,
                1660, 540,
                1680, 540,
                1660, 560,
                1660, 540,
                1680, 560,
                560, 560,
                1680, 560});

    public static final IRSignal button_volumeDown = new IRSignal("button_volumeDown",
            new int[]{0, 8840,
                4460, 560,
                580, 560,
                560, 560,
                560, 560,
                580, 540,
                560, 540,
                560, 540,
                560, 560,
                580, 560,
                1680, 560,
                1680, 560,
                1680, 540,
                1660, 540,
                1660, 540,
                1640, 540,
                1640, 540,
                1660, 540,
                1640, 560,
                560, 540,
                1640, 540,
                540, 540,
                560, 540,
                540, 560,
                1640, 560,
                560, 540,
                560, 540,
                1660, 540,
                560, 540,
                1620, 560,
                1640, 560,
                1660, 540,
                560, 540,
                1640, 540,
                38420, 8720,
                2180, 540});

    public static final IRSignal button_mute = new IRSignal("button_mute",
            new int[]{0, 8760,
                4440, 540,
                540, 580,
                540, 560,
                540, 560,
                560, 540,
                560, 540,
                560, 560,
                560, 540,
                560, 560,
                1660, 580,
                1680, 560,
                1660, 560,
                1660, 540,
                1660, 560,
                1640, 580,
                1680, 560,
                1680, 560,
                560, 560,
                560, 540,
                580, 540,
                1660, 560,
                540, 560,
                560, 520,
                1680, 540,
                560, 520,
                1680, 560,
                1660, 520,
                1720, 520,
                600, 520,
                1700, 540,
                1720, 520,
                580, 540,
                1700, 520,
                38920, 8800,
                2200, 540});

    public IRProtocolVizioSoundbarRemote() {
        addSignal(button_on_off);
        addSignal(button_volumeUp);
        addSignal(button_volumeDown);
        addSignal(button_mute);
    }

}
