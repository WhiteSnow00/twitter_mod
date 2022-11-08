// 
// Decompiled by Procyon v0.6.0
// 

public final class mws extends wws implements wws$a
{
    public kws j;
    
    public mws(final String s, final long n, final qzo qzo, final cvs cvs, final long n2, final boolean b, final kws j, final vlh vlh) {
        super(s, n, qzo, cvs, n2, b, (t0t)null, vlh);
        this.j = j;
    }
    
    public final kus.a a(final u4c u4c, final frm frm) {
        final lws.a a = new lws.a();
        a.a = ((pus)this).b;
        a.c = ((pus)this).c;
        a.n = super.h;
        a.f = super.e;
        final cvs f = super.f;
        cwa a2;
        if (f != null) {
            a2 = frm.a(f);
        }
        else {
            a2 = null;
        }
        a.g = a2;
        final gxd e = u4c.e(this.j.b);
        pf8.r(e);
        a.p = e;
        a.q = this.j;
        a.o = super.i;
        return a;
    }
}
