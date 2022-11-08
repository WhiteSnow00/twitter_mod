// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.tabs;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;

public class TabItem extends View
{
    public final CharSequence C0;
    public final Drawable D0;
    public final int E0;
    
    public TabItem(final Context context, final AttributeSet set) {
        super(context, set);
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, rp2.y1);
        this.C0 = obtainStyledAttributes.getText(2);
        Drawable d0 = null;
        Label_0058: {
            if (obtainStyledAttributes.hasValue(0)) {
                final int resourceId = obtainStyledAttributes.getResourceId(0, 0);
                if (resourceId != 0) {
                    d0 = qli.g(context, resourceId);
                    break Label_0058;
                }
            }
            d0 = obtainStyledAttributes.getDrawable(0);
        }
        this.D0 = d0;
        this.E0 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
    }
}
