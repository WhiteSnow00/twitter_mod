// 
// Decompiled by Procyon v0.6.0
// 

package androidx.core.widget;

import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.ProgressBar;

public class ContentLoadingProgressBar extends ProgressBar
{
    public long C0;
    public boolean D0;
    public boolean E0;
    public boolean F0;
    public final ght G0;
    public final h16 H0;
    
    public ContentLoadingProgressBar(final Context context, final AttributeSet set) {
        super(context, set, 0);
        this.C0 = -1L;
        this.D0 = false;
        this.E0 = false;
        this.F0 = false;
        this.G0 = new ght((Object)this, 1);
        this.H0 = new h16((Object)this, 3);
    }
    
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ((View)this).removeCallbacks((Runnable)this.G0);
        ((View)this).removeCallbacks((Runnable)this.H0);
    }
    
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ((View)this).removeCallbacks((Runnable)this.G0);
        ((View)this).removeCallbacks((Runnable)this.H0);
    }
}
