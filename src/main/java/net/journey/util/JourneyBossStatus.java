package net.journey.util;

import net.journey.api.entity.IEssenceBoss;

public final class JourneyBossStatus {

    public static float healthScale;
    public static int statusBarTime;
    public static boolean hasColorModifier;
    public static String bar;
    public static String bossName;
    public static EnumHexColorHelper stringTextColor;
    public static EnumHexColorHelper stringOutlineColor;

    public static void setStatus(IEssenceBoss boss, String id1, EnumHexColorHelper bossTextColor, EnumHexColorHelper textOutlineColor) {
        healthScale = boss.getModHealth() / boss.getModMaxHealth();
        statusBarTime = 100;
        bar = id1;
        bossName = id1;
        stringTextColor = bossTextColor;
        stringTextColor = textOutlineColor;
    }
}