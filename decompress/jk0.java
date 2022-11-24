import android.view.View;
import android.graphics.drawable.Drawable;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.PopupWindow;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jk0 extends PopupWindow
{
    public jk0(final Context context, final AttributeSet set, int resourceId, final int n) {
        super(context, set, resourceId, n);
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, fr0.Z0, resourceId, n);
        if (obtainStyledAttributes.hasValue(2)) {
            hsk.a((PopupWindow)this, obtainStyledAttributes.getBoolean(2, false));
        }
        Drawable backgroundDrawable = null;
        Label_0073: {
            if (obtainStyledAttributes.hasValue(0)) {
                resourceId = obtainStyledAttributes.getResourceId(0, 0);
                if (resourceId != 0) {
                    backgroundDrawable = d4j.F(context, resourceId);
                    break Label_0073;
                }
            }
            backgroundDrawable = obtainStyledAttributes.getDrawable(0);
        }
        this.setBackgroundDrawable(backgroundDrawable);
        obtainStyledAttributes.recycle();
    }
    
    public final void showAsDropDown(final View view, final int n, final int n2) {
        super.showAsDropDown(view, n, n2);
    }
    
    public final void showAsDropDown(final View view, final int n, final int n2, final int n3) {
        super.showAsDropDown(view, n, n2, n3);
    }
    
    public final void update(final View view, final int n, final int n2, final int n3, final int n4) {
        super.update(view, n, n2, n3, n4);
    }
}
