package com.framework.util.util_framework.tablayout;

import android.os.Build;
import android.support.design.widget.TabLayout;
import android.view.View;
import android.view.ViewGroup;

/**
 * While writing this code, only God and I know what it is.
 * And now only God knows it
 * <p>
 * Created by xuweijie
 * on 2018/7/26 0026.
 */
public class TabLayoutUtils {

    // public static void setIndicator(TabLayout tabs, int leftDip, int rightDip) {
    //     Class<?> tabLayout = tabs.getClass();
    //     Field tabStrip = null;
    //     try {
    //         tabStrip = tabLayout.getDeclaredField("mTabStrip");
    //     } catch (NoSuchFieldException e) {
    //         e.printStackTrace();
    //     }
    //
    //     tabStrip.setAccessible(true);
    //     LinearLayout llTab = null;
    //     try {
    //         llTab = (LinearLayout) tabStrip.get(tabs);
    //     } catch (IllegalAccessException e) {
    //         e.printStackTrace();
    //     }
    //
    //     int left = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, leftDip, Resources.getSystem().getDisplayMetrics());
    //     int right = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, rightDip, Resources.getSystem().getDisplayMetrics());
    //
    //     for (int i = 0; i < llTab.getChildCount(); i++) {
    //         View child = llTab.getChildAt(i);
    //         child.setPadding(0, 0, 0, 0);
    //         LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(0, LinearLayout.LayoutParams.MATCH_PARENT, 1);
    //         params.leftMargin = left;
    //         params.rightMargin = right;
    //         child.setLayoutParams(params);
    //         child.invalidate();
    //     }
    // }

    public static void setIndicator(TabLayout tabLayout, int externalMargin, int internalMargin) {
        View tabStrip = tabLayout.getChildAt(0);
        if (tabStrip instanceof ViewGroup) {
            ViewGroup tabStripGroup = (ViewGroup) tabStrip;
            int childCount = ((ViewGroup) tabStrip).getChildCount();
            for (int i = 0; i < childCount; i++) {
                View tabView = tabStripGroup.getChildAt(i);
                //set minimum width to 0 for instead for small texts, indicator is not wrapped as
                // expected
                tabView.setMinimumWidth(0);
                // set padding to 0 for wrapping indicator as title
                tabView.setPadding(0, tabView.getPaddingTop(), 0, tabView.getPaddingBottom());
                // setting custom margin between tabs
                if (tabView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams layoutParams = (ViewGroup.MarginLayoutParams)
                        tabView.getLayoutParams();
                    if (i == 0) {
                        // left
                        setMargin(layoutParams, externalMargin, internalMargin);
                    } else if (i == childCount - 1) {
                        // right
                        setMargin(layoutParams, internalMargin, externalMargin);
                    } else {
                        // internal
                        setMargin(layoutParams, internalMargin, internalMargin);
                    }
                }
            }

            tabLayout.requestLayout();
        }
    }

    private static void setMargin(ViewGroup.MarginLayoutParams layoutParams, int start, int end) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1) {
            layoutParams.setMarginStart(start);
            layoutParams.setMarginEnd(end);
        } else {
            layoutParams.leftMargin = start;
            layoutParams.rightMargin = end;
        }
    }
}
