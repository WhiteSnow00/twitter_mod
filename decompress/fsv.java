// 
// Decompiled by Procyon v0.6.0
// 

public final class fsv extends fys implements fys$a
{
    public final csv j;
    
    public fsv(final String s, final long n, final b1p b1p, final kws kws, final long n2, final csv j, final boolean b, final pmh pmh) {
        super(s, n, b1p, kws, n2, b, (c2t)null, pmh);
        this.j = j;
    }
    
    public final tvs.a a(final y4c y4c, final lsm lsm) {
        final esv.a a = new esv.a();
        final csv j = this.j;
        a.p = j;
        a.c = ((yvs)this).c;
        a.f = super.e;
        a.a = ((yvs)this).b;
        a.n = super.h;
        a.o = super.i;
        final o7t c = j.c;
        if (c != null) {
            a.q = y4c.c(c.a);
        }
        return a;
    }
    
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (!(o instanceof fsv)) {
            return false;
        }
        final fsv fsv = (fsv)o;
        if (!super.equals(o) || !o5j.a((Object)this.j, (Object)fsv.j)) {
            b = false;
        }
        return b;
    }
    
    public final int hashCode() {
        return o5j.g((Object)this.j, (Object)super.hashCode());
    }
}
