// 
// Decompiled by Procyon v0.6.0
// 

public final class m0t extends wws implements wws$a
{
    public final kvv j;
    
    public m0t(final String s, final long n, final qzo qzo, final cvs cvs, final long n2, final boolean b, final kvv j, final vlh vlh) {
        super(s, n, qzo, cvs, n2, b, (t0t)null, vlh);
        this.j = j;
    }
    
    public final kus.a a(final u4c u4c, final frm frm) {
        final h0t$a h0t$a = new h0t$a();
        h0t$a.p = this.j.a(u4c);
        ((kus.a)h0t$a).a = ((pus)this).b;
        ((kus.a)h0t$a).c = ((pus)this).c;
        ((kus.a)h0t$a).f = super.e;
        ((kus.a)h0t$a).n = super.h;
        final cvs f = super.f;
        cwa a;
        if (f != null) {
            a = frm.a(f);
        }
        else {
            a = null;
        }
        ((kus.a)h0t$a).g = a;
        ((kus.a)h0t$a).o = super.i;
        return (kus.a)h0t$a;
    }
}
