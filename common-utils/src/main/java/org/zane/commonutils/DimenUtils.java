package org.zane.commonutils;

import android.content.res.Resources;

/**
 * Dimension Utils
 */
public class DimenUtils {
    private DimenUtils() {
    }

    /**
     * Convert value from dp unit to px unit
     *
     * @param dp converted value
     * @return px value
     */
    public static int dp2px(float dp) {
        return (int) (Resources.getSystem().getDisplayMetrics().density * dp);
    }

    /**
     * Convert value from px unit to dp unit
     *
     * @param px converted value
     * @return dp value
     */
    public static float px2dp(int px) {
        return px / Resources.getSystem().getDisplayMetrics().density;
    }
}
