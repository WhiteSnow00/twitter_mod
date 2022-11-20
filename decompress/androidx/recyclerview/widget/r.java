// 
// Decompiled by Procyon v0.6.0
// 

package androidx.recyclerview.widget;

import android.view.View;

public final class r implements Runnable
{
    public final q.f D0;
    public final int E0;
    public final q F0;
    
    public r(final q f0, final q.f d0, final int e0) {
        this.F0 = f0;
        this.D0 = d0;
        this.E0 = e0;
    }
    
    @Override
    public final void run() {
        final RecyclerView r = this.F0.r;
        if (r != null && r.isAttachedToWindow()) {
            final q.f d0 = this.D0;
            if (!d0.N0 && d0.H0.F() != -1) {
                final RecyclerView$j itemAnimator = this.F0.r.getItemAnimator();
                if (itemAnimator == null || !itemAnimator.l()) {
                    final q f0 = this.F0;
                    final int size = f0.p.size();
                    final int n = 0;
                    int n2 = 0;
                    int n3;
                    while (true) {
                        n3 = n;
                        if (n2 >= size) {
                            break;
                        }
                        if (!((q.f)f0.p.get(n2)).O0) {
                            n3 = 1;
                            break;
                        }
                        ++n2;
                    }
                    if (n3 == 0) {
                        this.F0.m.m(this.D0.H0);
                        return;
                    }
                }
                ((View)this.F0.r).post((Runnable)this);
            }
        }
    }
}
