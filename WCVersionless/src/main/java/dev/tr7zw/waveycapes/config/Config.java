package dev.tr7zw.waveycapes.config;

import dev.tr7zw.waveycapes.CapeMovement;
import dev.tr7zw.waveycapes.CapeStyle;
import dev.tr7zw.waveycapes.WindMode;

public class Config {

    public int configVersion = 2;
    public WindMode windMode = WindMode.NONE;
    public CapeStyle capeStyle = CapeStyle.SMOOTH;
    public CapeMovement capeMovement = CapeMovement.BASIC_SIMULATION_3D;
    //public int capeParts = 16;
    public int gravity = 25;
    public int heightMultiplier = 6;
    public int straveMultiplier = 2;
    //public int maxBend = 5;
}
