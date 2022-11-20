// 
// Decompiled by Procyon v0.6.0
// 

package androidx.recyclerview.widget;

import android.util.DisplayMetrics;
import android.view.animation.Interpolator;
import android.view.View;
import android.content.Context;

public final class i0 extends u
{
    public final h0 q;
    
    public i0(final h0 q, final Context context) {
        this.q = q;
        super(context);
    }
    
    public final void f(final View view, final RecyclerView$x$a recyclerView$x$a) {
        final h0 q = this.q;
        final RecyclerView a = q.a;
        if (a == null) {
            return;
        }
        final int[] c = q.c(a.getLayoutManager(), view);
        final int n = c[0];
        final int n2 = c[1];
        final int l = this.l(Math.max(Math.abs(n), Math.abs(n2)));
        if (l > 0) {
            recyclerView$x$a.b(n, n2, l, (Interpolator)super.j);
        }
    }
    
    public final float k(final DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }
}
