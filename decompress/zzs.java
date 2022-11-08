import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class zzs extends wws implements wws$a
{
    public final wzs j;
    
    public zzs(final String s, final long n, final qzo qzo, final cvs cvs, final long n2, final wzs j, final boolean b, final t0t t0t, final vlh vlh) {
        super(s, n, qzo, cvs, n2, b, t0t, vlh);
        this.j = j;
    }
    
    public final kus.a a(final u4c u4c, final frm frm) {
        final api p2 = u4c.e.get(this.j.a);
        Object q;
        if (p2 == null) {
            q = ced.D0;
            final int a = w4j.a;
        }
        else {
            q = hr4.c(p2.b, (kub)new nj1((Object)u4c, 1));
        }
        final cwa cwa = null;
        rh0 c;
        if (p2 == null) {
            c = null;
        }
        else {
            c = u4c.c(String.valueOf(p2.k));
        }
        final xzs$a xzs$a = new xzs$a();
        xzs$a.p = p2;
        xzs$a.q = (List)q;
        xzs$a.r = c;
        ((kus.a)xzs$a).a = ((pus)this).b;
        ((kus.a)xzs$a).c = ((pus)this).c;
        ((kus.a)xzs$a).f = super.e;
        final cvs f = super.f;
        cwa a2 = cwa;
        if (f != null) {
            a2 = frm.a(f);
        }
        ((kus.a)xzs$a).g = a2;
        final wzs j = this.j;
        xzs$a.s = j.b;
        ((kus.a)xzs$a).n = super.h;
        ((kus.a)xzs$a).h = (d4t)j.c;
        ((kus.a)xzs$a).o = super.i;
        return (kus.a)xzs$a;
    }
}
