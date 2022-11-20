// 
// Decompiled by Procyon v0.6.0
// 

public final class fex
{
    public static final zr2<fex, fex.fex$a> e;
    public final String a;
    public final String b;
    public final long c;
    public final boolean d;
    
    static {
        fex.e = new fex.fex$b();
    }
    
    public fex(final fex.fex$a fex$a) {
        final String a = fex$a.a;
        final String s = "";
        String a2 = a;
        if (a == null) {
            a2 = "";
        }
        this.a = a2;
        String b = fex$a.b;
        if (b == null) {
            b = s;
        }
        this.b = b;
        this.c = fex$a.c;
        this.d = fex$a.d;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && fex.class == o.getClass()) {
            final fex fex = (fex)o;
            if (!c5j.a((Object)this.b, (Object)fex.b) || !c5j.a((Object)this.a, (Object)fex.a) || this.c != fex.c || this.d != fex.d) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return (hmg.f(this.a, this.b.hashCode() * 31, 31) + (int)this.c) * 31 + (this.d ? 1 : 0);
    }
}
