// 
// Decompiled by Procyon v0.6.0
// 

public final class wg1
{
    public static final alp<wg1> d;
    public static final mnv e;
    public static final mnv f;
    public final mnv a;
    public final mnv b;
    public final String c;
    
    static {
        wg1.d = new wg1.wg1$a();
        e = mnv.D0;
        f = mnv.O0;
    }
    
    public wg1(mnv b, final mnv mnv, final String c) {
        final mnv e = wg1.e;
        mnv a = b;
        if (b == null) {
            a = e;
        }
        this.a = a;
        final mnv f = wg1.f;
        if ((b = mnv) == null) {
            b = f;
        }
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && wg1.class == o.getClass()) {
            final wg1 wg1 = (wg1)o;
            if (!w4j.a((Object)this.a, (Object)wg1.a) || !w4j.a((Object)this.b, (Object)wg1.b) || !w4j.a((Object)this.c, (Object)wg1.c)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return w4j.h((Object)this.a, (Object)this.b, (Object)this.c);
    }
}
