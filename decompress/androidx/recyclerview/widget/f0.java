// 
// Decompiled by Procyon v0.6.0
// 

package androidx.recyclerview.widget;

import android.view.View;

public final class f0
{
    public static int a(final RecyclerView$y recyclerView$y, final a0 a0, final View view, final View view2, final RecyclerView$m recyclerView$m, final boolean b) {
        if (recyclerView$m.L() == 0 || recyclerView$y.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!b) {
            return Math.abs(recyclerView$m.b0(view) - recyclerView$m.b0(view2)) + 1;
        }
        return Math.min(a0.l(), a0.b(view2) - a0.e(view));
    }
    
    public static int b(final RecyclerView$y recyclerView$y, final a0 a0, final View view, final View view2, final RecyclerView$m recyclerView$m, final boolean b, final boolean b2) {
        if (recyclerView$m.L() == 0 || recyclerView$y.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        final int min = Math.min(recyclerView$m.b0(view), recyclerView$m.b0(view2));
        final int max = Math.max(recyclerView$m.b0(view), recyclerView$m.b0(view2));
        int n;
        if (b2) {
            n = Math.max(0, recyclerView$y.b() - max - 1);
        }
        else {
            n = Math.max(0, min);
        }
        if (!b) {
            return n;
        }
        return Math.round(n * (Math.abs(a0.b(view2) - a0.e(view)) / (float)(Math.abs(recyclerView$m.b0(view) - recyclerView$m.b0(view2)) + 1)) + (a0.k() - a0.e(view)));
    }
    
    public static int c(final RecyclerView$y recyclerView$y, final a0 a0, final View view, final View view2, final RecyclerView$m recyclerView$m, final boolean b) {
        if (recyclerView$m.L() == 0 || recyclerView$y.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!b) {
            return recyclerView$y.b();
        }
        return (int)((a0.b(view2) - a0.e(view)) / (float)(Math.abs(recyclerView$m.b0(view) - recyclerView$m.b0(view2)) + 1) * recyclerView$y.b());
    }
}
