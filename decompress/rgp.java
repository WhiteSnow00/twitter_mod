import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rgp
{
    public static final lml<ogp> a;
    
    static {
        rgp.a = (jp9)ef6.c((ptb)rgp$a.F0);
    }
    
    public static final boolean a(final ogp ogp, final long n) {
        if (ogp != null) {
            final Map<Long, hfp> c = ogp.c();
            if (c != null) {
                return c.containsKey(n);
            }
        }
        return false;
    }
}
