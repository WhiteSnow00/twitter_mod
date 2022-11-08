import java.util.regex.Pattern;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hq6
{
    public static final alp<hq6> c;
    public long a;
    public String b;
    
    static {
        hq6.c = new hq6.hq6$a();
    }
    
    public hq6(final long a, final String b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && hq6.class == o.getClass()) {
            final hq6 hq6 = (hq6)o;
            if (this.a == hq6.a) {
                final String b2 = this.b;
                final String b3 = hq6.b;
                final Pattern a = pjr.a;
                if (zzd.a((Object)b2, (Object)b3)) {
                    return b;
                }
            }
            b = false;
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return w4j.g((Object)this.a, (Object)this.b);
    }
}
