// 
// Decompiled by Procyon v0.6.0
// 

package androidx.browser.browseractions;

import android.view.View;
import android.view.View$MeasureSpec;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.LinearLayout;

public class BrowserActionsFallbackMenuView extends LinearLayout
{
    public final int D0;
    public final int E0;
    
    public BrowserActionsFallbackMenuView(final Context context, final AttributeSet set) {
        super(context, set);
        this.D0 = ((View)this).getResources().getDimensionPixelOffset(2131165367);
        this.E0 = ((View)this).getResources().getDimensionPixelOffset(2131165366);
    }
    
    public final void onMeasure(final int n, final int n2) {
        super.onMeasure(View$MeasureSpec.makeMeasureSpec(Math.min(((View)this).getResources().getDisplayMetrics().widthPixels - this.D0 * 2, this.E0), 1073741824), n2);
    }
}
