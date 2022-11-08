// 
// Decompiled by Procyon v0.6.0
// 

package androidx.legacy.widget;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.view.View$MeasureSpec;
import android.util.AttributeSet;
import android.content.Context;
import android.view.View;

@Deprecated
public class Space extends View
{
    @Deprecated
    public Space(final Context context, final AttributeSet set) {
        super(context, set, 0);
        if (this.getVisibility() == 0) {
            this.setVisibility(4);
        }
    }
    
    public static int a(int min, int size) {
        final int mode = View$MeasureSpec.getMode(size);
        size = View$MeasureSpec.getSize(size);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 1073741824) {
                min = size;
            }
        }
        else {
            min = Math.min(min, size);
        }
        return min;
    }
    
    @Deprecated
    @SuppressLint({ "MissingSuperCall" })
    public final void draw(final Canvas canvas) {
    }
    
    @Deprecated
    public final void onMeasure(final int n, final int n2) {
        this.setMeasuredDimension(a(this.getSuggestedMinimumWidth(), n), a(this.getSuggestedMinimumHeight(), n2));
    }
}
