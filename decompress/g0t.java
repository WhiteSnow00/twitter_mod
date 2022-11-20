// 
// Decompiled by Procyon v0.6.0
// 

public final class g0t extends mxs implements mxs$a
{
    public final e0t j;
    
    public g0t(final String s, final long n, final h0p h0p, final qvs qvs, final long n2, final e0t j, final boolean b, final amh amh) {
        super(s, n, h0p, qvs, n2, b, (j1t)null, amh);
        this.j = j;
    }
    
    public final zus$a a(final w3c w3c, final wrm wrm) {
        final roh p2 = w3c.c.get(this.j.a);
        nh0 c = null;
        Label_0052: {
            if (p2 != null) {
                final aph t = p2.t;
                if (t != null) {
                    c = w3c.c(String.valueOf(t.a));
                    break Label_0052;
                }
            }
            c = null;
        }
        final f0t$a f0t$a = new f0t$a();
        f0t$a.p = p2;
        f0t$a.s = c;
        final e0t j = this.j;
        f0t$a.q = j.b;
        f0t$a.r = j.c;
        ((zus$a)f0t$a).h = (u4t)j.d;
        ((zus$a)f0t$a).c = ((evs)this).c;
        ((zus$a)f0t$a).f = super.e;
        ((zus$a)f0t$a).a = ((evs)this).b;
        ((zus$a)f0t$a).n = super.h;
        ((zus$a)f0t$a).o = super.i;
        return (zus$a)f0t$a;
    }
}
