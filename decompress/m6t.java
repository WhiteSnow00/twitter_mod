// 
// Decompiled by Procyon v0.6.0
// 

public final class m6t extends wws implements wws$a
{
    public final g6t j;
    
    public m6t(final String s, final long n, final qzo qzo, final cvs cvs, final long n2, final g6t j, final boolean b, final vlh vlh) {
        super(s, n, qzo, cvs, n2, b, (t0t)null, vlh);
        this.j = j;
    }
    
    public final kus.a a(final u4c u4c, final frm frm) {
        final i6t$a i6t$a = new i6t$a();
        ((kus.a)i6t$a).a = ((pus)this).b;
        ((kus.a)i6t$a).c = ((pus)this).c;
        ((kus.a)i6t$a).f = super.e;
        i6t$a.p = this.j;
        final cvs f = super.f;
        cwa a;
        if (f != null) {
            a = frm.a(f);
        }
        else {
            a = null;
        }
        ((kus.a)i6t$a).g = a;
        ((kus.a)i6t$a).n = super.h;
        ((kus.a)i6t$a).o = super.i;
        return (kus.a)i6t$a;
    }
}
