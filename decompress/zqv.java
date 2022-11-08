// 
// Decompiled by Procyon v0.6.0
// 

public final class zqv extends wws implements wws$a
{
    public final wqv j;
    
    public zqv(final String s, final long n, final qzo qzo, final cvs cvs, final long n2, final wqv j, final boolean b, final vlh vlh) {
        super(s, n, qzo, cvs, n2, b, (t0t)null, vlh);
        this.j = j;
    }
    
    public final kus.a a(final u4c u4c, final frm frm) {
        final yqv$a yqv$a = new yqv$a();
        final wqv j = this.j;
        yqv$a.p = j;
        ((kus.a)yqv$a).c = ((pus)this).c;
        ((kus.a)yqv$a).f = super.e;
        ((kus.a)yqv$a).a = ((pus)this).b;
        ((kus.a)yqv$a).n = super.h;
        ((kus.a)yqv$a).o = super.i;
        final c6t c = j.c;
        if (c != null) {
            yqv$a.q = u4c.c(c.a);
        }
        return (kus.a)yqv$a;
    }
    
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (!(o instanceof zqv)) {
            return false;
        }
        final zqv zqv = (zqv)o;
        if (!super.equals(o) || !w4j.a((Object)this.j, (Object)zqv.j)) {
            b = false;
        }
        return b;
    }
    
    public final int hashCode() {
        return w4j.g((Object)this.j, (Object)super.hashCode());
    }
}
