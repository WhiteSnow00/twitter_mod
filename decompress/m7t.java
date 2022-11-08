// 
// Decompiled by Procyon v0.6.0
// 

public final class m7t extends wws implements wws$a
{
    public final k7t j;
    
    public m7t(final String s, final long n, final qzo qzo, final cvs cvs, final long n2, final boolean b, final k7t j, final vlh vlh) {
        super(s, n, qzo, cvs, n2, b, (t0t)null, vlh);
        this.j = j;
    }
    
    public final kus.a a(final u4c u4c, final frm frm) {
        final xbv p2 = u4c.j.get(this.j.a);
        cwa a = null;
        hfv f;
        if (p2 != null) {
            f = u4c.f(String.valueOf(p2.K0));
        }
        else {
            f = null;
        }
        final l7t.a a2 = new l7t.a();
        a2.a = ((pus)this).b;
        a2.c = ((pus)this).c;
        a2.n = super.h;
        a2.f = super.e;
        final cvs f2 = super.f;
        if (f2 != null) {
            a = frm.a(f2);
        }
        a2.g = a;
        a2.q = f;
        a2.p = p2;
        a2.r = this.j.b;
        return a2;
    }
}
