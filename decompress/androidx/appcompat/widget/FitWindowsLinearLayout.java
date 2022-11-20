// 
// Decompiled by Procyon v0.6.0
// 

package androidx.appcompat.widget;

import android.graphics.Rect;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.LinearLayout;

public class FitWindowsLinearLayout extends LinearLayout
{
    public r0b D0;
    
    public FitWindowsLinearLayout(final Context context, final AttributeSet set) {
        super(context, set);
    }
    
    public final boolean fitSystemWindows(final Rect rect) {
        final r0b d0 = this.D0;
        if (d0 != null) {
            d0.a();
        }
        return super.fitSystemWindows(rect);
    }
    
    public void setOnFitSystemWindowsListener(final r0b d0) {
        this.D0 = d0;
    }
}
