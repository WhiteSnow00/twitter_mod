import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hzs
{
    public static final alp<hzs> d;
    public final List<String> a;
    public final boolean b;
    public final rev c;
    
    static {
        hzs.d = new hzs.hzs$b();
    }
    
    public hzs(final hzs.hzs$a hzs$a) {
        this.a = hzs$a.a;
        this.b = hzs$a.b;
        this.c = hzs$a.c;
    }
    
    public hzs(final List<String> a, final boolean b, final rev c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && hzs.class == o.getClass()) {
            final hzs hzs = (hzs)o;
            if (!w4j.a((Object)this.a, (Object)hzs.a) || !w4j.a((Object)this.b, (Object)hzs.b) || !w4j.a((Object)this.c, (Object)hzs.c)) {
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
