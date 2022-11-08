import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pgs implements res
{
    public final /* synthetic */ rgs a;
    
    public pgs(final rgs a) {
        this.a = a;
    }
    
    public final void a() {
        rgs.b(this.a, zbc.C0);
        final rgs a = this.a;
        ((nhq)a.p).setValue((Object)new qfj(fep.a(a.j(true))));
    }
    
    public final void b(final long n) {
        final rgs a = this.a;
        a.l = fep.a(a.j(true));
        final rgs a2 = this.a;
        ((nhq)a2.p).setValue((Object)new qfj(a2.l));
        final rgs a3 = this.a;
        Objects.requireNonNull(qfj.Companion);
        a3.n = qfj.b;
        rgs.b(this.a, zbc.C0);
    }
    
    public final void c() {
        rgs.b(this.a, (zbc)null);
        rgs.a(this.a, (qfj)null);
    }
    
    public final void d(long f) {
        final rgs a = this.a;
        a.n = qfj.h(a.n, f);
        final chs d = this.a.d;
        if (d != null) {
            final eis c = d.c();
            if (c != null) {
                final dis a2 = c.a;
                if (a2 != null) {
                    final rgs a3 = this.a;
                    ((nhq)a3.p).setValue((Object)new qfj(qfj.h(a3.l, a3.n)));
                    final tfj b = a3.b;
                    final qfj i = a3.i();
                    zzd.c((Object)i);
                    final int a4 = b.a(a2.l(i.a));
                    f = h6q.f(a4, a4);
                    if (mis.b(f, a3.k().b)) {
                        return;
                    }
                    final scc j = a3.i;
                    if (j != null) {
                        Objects.requireNonNull(tcc.Companion);
                        j.a(9);
                    }
                    a3.c.invoke((Object)a3.e(a3.k().a, f));
                }
            }
        }
    }
    
    public final void k() {
        rgs.b(this.a, (zbc)null);
        rgs.a(this.a, (qfj)null);
    }
    
    public final void onCancel() {
    }
}
