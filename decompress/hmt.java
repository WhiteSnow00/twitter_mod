import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hmt
{
    public static final alp<hmt> c;
    public final List<omt> a;
    public final q7t b;
    
    static {
        hmt.c = new hmt.hmt$b();
    }
    
    public hmt(final hmt.hmt$a hmt$a) {
        final List a = hmt$a.a;
        pf8.r(a);
        this.a = a;
        this.b = hmt$a.b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        final boolean b = o instanceof hmt;
        final boolean b2 = false;
        if (!b) {
            return false;
        }
        if (this == o) {
            return true;
        }
        final int a = w4j.a;
        final hmt hmt = (hmt)o;
        boolean b3 = b2;
        if (w4j.a((Object)this.a, (Object)hmt.a)) {
            b3 = b2;
            if (w4j.a((Object)this.b, (Object)hmt.b)) {
                b3 = true;
            }
        }
        return b3;
    }
    
    @Override
    public final int hashCode() {
        return w4j.g((Object)this.a, (Object)this.b);
    }
}
