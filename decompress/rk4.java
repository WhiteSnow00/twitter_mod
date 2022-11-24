import android.widget.BaseAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rk4 implements osc$a<nt8>
{
    public final uk4 F0;
    
    public rk4(final uk4 f0) {
        this.F0 = f0;
    }
    
    public final void a(final aw0 aw0) {
    }
    
    public final void b(final aw0 aw0) {
        final nt8 nt8 = (nt8)aw0;
        if (nt8.o1 == 20) {
            final long m1 = nt8.m1;
            if (!((osc)nt8).T().b && uk4.k(this.F0, (pnm)nt8)) {
                this.F0.G0.d.j(m1, 1);
                final wk4 q0 = this.F0.Q0;
                if (q0 != null) {
                    ((BaseAdapter)q0).notifyDataSetChanged();
                }
                ehk.c().c(2131959474, 1);
            }
            this.F0.n();
        }
    }
    
    public final void c(final aw0 aw0, final boolean b) {
    }
}
