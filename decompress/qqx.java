// 
// Decompiled by Procyon v0.6.0
// 

public final class qqx
{
    public static final rlp<qqx> e;
    public final int a;
    public final boolean b;
    public final String c;
    public final eku d;
    
    static {
        qqx.e = new qqx.qqx$b();
    }
    
    public qqx(final int a, final boolean b, final String c, final eku eku) {
        this.a = a;
        this.b = b;
        this.c = c;
        final eku h = eku.h;
        eku d = eku;
        if (eku == null) {
            d = h;
        }
        this.d = d;
    }
    
    public qqx(final qqx.qqx$a qqx$a) {
        this.a = qqx$a.a;
        this.b = qqx$a.b;
        this.c = qqx$a.c;
        final eku d = qqx$a.d;
        final eku h = eku.h;
        eku d2 = d;
        if (d == null) {
            d2 = h;
        }
        this.d = d2;
    }
    
    public final boolean a() {
        return this.a != -1;
    }
    
    @Override
    public final boolean equals(final Object o) {
        final boolean b = false;
        if (this != o) {
            boolean b2 = b;
            if (o == null) {
                return b2;
            }
            b2 = b;
            if (!(o instanceof qqx)) {
                return b2;
            }
            final qqx qqx = (qqx)o;
            final boolean b3 = this == qqx || (this.a == qqx.a && this.b == qqx.b && c5j.a((Object)this.c, (Object)qqx.c) && c5j.a((Object)this.d, (Object)qqx.d));
            b2 = b;
            if (!b3) {
                return b2;
            }
        }
        return true;
    }
    
    @Override
    public final int hashCode() {
        final int a = this.a;
        final int b = this.b ? 1 : 0;
        final int a2 = c5j.a;
        return c5j.f((Object)this.d) + oqf.l(this.c, (a * 31 + b) * 31, 31);
    }
}
