import android.view.ViewGroup;
import android.view.View$MeasureSpec;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import android.view.Window;

// 
// Decompiled by Procyon v0.6.0
// 

public final class iw8 extends gb
{
    public final Window J0;
    public final cwj K0;
    public boolean L0;
    public boolean M0;
    
    public iw8(final Context context, final Window j0) {
        super(context, (AttributeSet)null, 0, 6, (hg8)null);
        this.J0 = j0;
        final m36 a = m36.a;
        this.K0 = (cwj)nkz.r((Object)m36.b);
    }
    
    public final void a(m76 h, final int n) {
        h = h.h(1735448596);
        final ea6$b a = ea6.a;
        ((gub)((nhq)this.K0).getValue()).invoke((Object)h, (Object)0);
        final vwo k = h.k();
        if (k != null) {
            k.a((gub)new iw8$a(this, n));
        }
    }
    
    public final void f(final boolean b, final int n, final int n2, final int n3, final int n4) {
        super.f(b, n, n2, n3, n4);
        final View child = ((ViewGroup)this).getChildAt(0);
        if (child == null) {
            return;
        }
        this.J0.setLayout(child.getMeasuredWidth(), child.getMeasuredHeight());
    }
    
    public final void g(int measureSpec, final int n) {
        if (this.L0) {
            super.g(measureSpec, n);
        }
        else {
            measureSpec = View$MeasureSpec.makeMeasureSpec(q0b.p(((View)this).getContext().getResources().getConfiguration().screenWidthDp * ((View)this).getContext().getResources().getDisplayMetrics().density), Integer.MIN_VALUE);
            super.g(measureSpec, View$MeasureSpec.makeMeasureSpec(q0b.p(((View)this).getContext().getResources().getConfiguration().screenHeightDp * ((View)this).getContext().getResources().getDisplayMetrics().density), Integer.MIN_VALUE));
        }
    }
    
    public final boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.M0;
    }
}
