// 
// Decompiled by Procyon v0.6.0
// 

package androidx.appcompat.widget;

import android.view.View;
import android.graphics.drawable.Drawable;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.LinearLayout;

public class ActivityChooserView$InnerLayout extends LinearLayout
{
    public static final int[] D0;
    
    static {
        D0 = new int[] { 16842964 };
    }
    
    public ActivityChooserView$InnerLayout(final Context context, final AttributeSet set) {
        super(context, set);
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, ActivityChooserView$InnerLayout.D0);
        Drawable backgroundDrawable = null;
        Label_0049: {
            if (obtainStyledAttributes.hasValue(0)) {
                final int resourceId = obtainStyledAttributes.getResourceId(0, 0);
                if (resourceId != 0) {
                    backgroundDrawable = v68.x(context, resourceId);
                    break Label_0049;
                }
            }
            backgroundDrawable = obtainStyledAttributes.getDrawable(0);
        }
        ((View)this).setBackgroundDrawable(backgroundDrawable);
        obtainStyledAttributes.recycle();
    }
}
