import java.lang.ref.SoftReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kie
{
    public static final ThreadLocal<SoftReference<kie>> b;
    public p53 a;
    
    static {
        dt3.a.clone();
        dt3.b.clone();
        b = new ThreadLocal<SoftReference<kie>>();
    }
    
    public static void a(final int n) {
        throw new IllegalArgumentException(osv.a(n));
    }
}
