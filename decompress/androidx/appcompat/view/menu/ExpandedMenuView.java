// 
// Decompiled by Procyon v0.6.0
// 

package androidx.appcompat.view.menu;

import android.widget.Adapter;
import android.view.ViewGroup;
import android.view.View;
import android.widget.AdapterView;
import android.view.MenuItem;
import android.graphics.drawable.Drawable;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.AdapterView$OnItemClickListener;
import android.widget.ListView;

public final class ExpandedMenuView extends ListView implements e$b, j, AdapterView$OnItemClickListener
{
    public static final int[] D0;
    public e C0;
    
    static {
        D0 = new int[] { 16842964, 16843049 };
    }
    
    public ExpandedMenuView(final Context context, final AttributeSet set) {
        super(context, set);
        ((AdapterView)this).setOnItemClickListener((AdapterView$OnItemClickListener)this);
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, ExpandedMenuView.D0, 16842868, 0);
        if (obtainStyledAttributes.hasValue(0)) {
            Drawable backgroundDrawable = null;
            Label_0068: {
                if (obtainStyledAttributes.hasValue(0)) {
                    final int resourceId = obtainStyledAttributes.getResourceId(0, 0);
                    if (resourceId != 0) {
                        backgroundDrawable = qli.g(context, resourceId);
                        break Label_0068;
                    }
                }
                backgroundDrawable = obtainStyledAttributes.getDrawable(0);
            }
            ((View)this).setBackgroundDrawable(backgroundDrawable);
        }
        if (obtainStyledAttributes.hasValue(1)) {
            Drawable divider = null;
            Label_0118: {
                if (obtainStyledAttributes.hasValue(1)) {
                    final int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        divider = qli.g(context, resourceId2);
                        break Label_0118;
                    }
                }
                divider = obtainStyledAttributes.getDrawable(1);
            }
            this.setDivider(divider);
        }
        obtainStyledAttributes.recycle();
    }
    
    public final void a(final e c0) {
        this.C0 = c0;
    }
    
    public final boolean c(final g g) {
        return this.C0.t((MenuItem)g, null, 0);
    }
    
    public int getWindowAnimations() {
        return 0;
    }
    
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ((ViewGroup)this).setChildrenDrawingCacheEnabled(false);
    }
    
    public final void onItemClick(final AdapterView adapterView, final View view, final int n, final long n2) {
        this.c((g)((Adapter)this.getAdapter()).getItem(n));
    }
}
