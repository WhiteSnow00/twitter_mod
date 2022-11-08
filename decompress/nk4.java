import android.widget.BaseAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

public final class nk4 implements ksc$a<ys8>
{
    public final /* synthetic */ qk4 C0;
    
    public nk4(final qk4 c0) {
        this.C0 = c0;
    }
    
    public final void b(final cw0 cw0) {
        final ys8 ys8 = (ys8)cw0;
        if (ys8.l1 == 20) {
            final long j1 = ys8.j1;
            if (!((ksc)ys8).T().b && qk4.k(this.C0, (kmm)ys8)) {
                this.C0.D0.d.j(j1, 1);
                final sk4 n0 = this.C0.N0;
                if (n0 != null) {
                    ((BaseAdapter)n0).notifyDataSetChanged();
                }
                p88.f().b(2131959472, 1);
            }
            this.C0.n();
        }
    }
}
