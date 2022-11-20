// 
// Decompiled by Procyon v0.6.0
// 

public final class h9t extends mxs implements mxs$a
{
    @d5d
    public final s8t j;
    
    public h9t(final String s, final long n, final h0p h0p, final qvs qvs, final long n2, final s8t j, final boolean b, final amh amh) {
        super(s, n, h0p, qvs, n2, b, (j1t)null, amh);
        this.j = j;
    }
    
    public final zus$a a(final w3c w3c, final wrm wrm) {
        final cgv f = w3c.f(this.j.a);
        final b9t$a b9t$a = new b9t$a();
        b9t$a.p = f;
        final s8t j = this.j;
        b9t$a.r = j.c;
        b9t$a.q = j.b;
        b9t$a.s = j.e;
        ((zus$a)b9t$a).c = ((evs)this).c;
        ((zus$a)b9t$a).a = ((evs)this).b;
        ((zus$a)b9t$a).h = (u4t)j.d;
        final qvs f2 = super.f;
        xua a;
        if (f2 != null) {
            a = wrm.a(f2);
        }
        else {
            a = null;
        }
        ((zus$a)b9t$a).g = a;
        ((zus$a)b9t$a).f = super.e;
        ((zus$a)b9t$a).n = super.h;
        ((zus$a)b9t$a).o = super.i;
        b9t$a.t = this.j.f;
        return (zus$a)b9t$a;
    }
    
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (!(o instanceof h9t)) {
            return false;
        }
        final h9t h9t = (h9t)o;
        if (!super.equals(o) || !c5j.a((Object)this.j, (Object)h9t.j)) {
            b = false;
        }
        return b;
    }
    
    public final int hashCode() {
        return c5j.g((Object)this.j, (Object)super.hashCode());
    }
}
