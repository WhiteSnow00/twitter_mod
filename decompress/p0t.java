import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class p0t extends mxs implements mxs$a
{
    public final m0t j;
    
    public p0t(final String s, final long n, final h0p h0p, final qvs qvs, final long n2, final m0t j, final boolean b, final j1t j1t, final amh amh) {
        super(s, n, h0p, qvs, n2, b, j1t, amh);
        this.j = j;
    }
    
    public final zus$a a(final w3c w3c, final wrm wrm) {
        final fpi p2 = w3c.e.get(this.j.a);
        Object q;
        if (p2 == null) {
            q = gdd.E0;
            final int a = c5j.a;
        }
        else {
            q = fq4.c((List)p2.b, (jtb)new hj1((Object)w3c, 1));
        }
        final xua xua = null;
        nh0 c;
        if (p2 == null) {
            c = null;
        }
        else {
            c = w3c.c(String.valueOf(p2.k));
        }
        final n0t$a n0t$a = new n0t$a();
        n0t$a.p = p2;
        n0t$a.q = (List)q;
        n0t$a.r = c;
        ((zus$a)n0t$a).a = ((evs)this).b;
        ((zus$a)n0t$a).c = ((evs)this).c;
        ((zus$a)n0t$a).f = super.e;
        final qvs f = super.f;
        xua a2 = xua;
        if (f != null) {
            a2 = wrm.a(f);
        }
        ((zus$a)n0t$a).g = a2;
        final m0t j = this.j;
        n0t$a.s = j.b;
        ((zus$a)n0t$a).n = super.h;
        ((zus$a)n0t$a).h = (u4t)j.c;
        ((zus$a)n0t$a).o = super.i;
        return (zus$a)n0t$a;
    }
}
