// 
// Decompiled by Procyon v0.6.0
// 

public final class krs
{
    public static final s4j<krs> d;
    public static final krs e;
    public mnv a;
    public mnv b;
    public mnv c;
    
    static {
        krs.d = new krs.krs$a();
        final mnv i0 = mnv.I0;
        final mnv d2 = mnv.D0;
        e = new krs(i0, d2, d2);
    }
    
    public krs(final mnv a, final mnv b, final mnv c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final boolean a(final krs krs) {
        return this == krs || (krs != null && this.a.equals(krs.a) && this.b.equals(krs.b) && this.c.equals(krs.c));
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof krs && this.a((krs)o));
    }
    
    @Override
    public final int hashCode() {
        final mnv a = this.a;
        return w4j.h((Object)a, (Object)this.b, (Object)a);
    }
}
