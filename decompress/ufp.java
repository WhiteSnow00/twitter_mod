import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ufp
{
    public static final zll<rfp> a;
    
    static {
        ufp.a = (eo9)xd6.c((nsb)ufp$a.D0);
    }
    
    public static final boolean a(final rfp rfp, final long n) {
        if (rfp != null) {
            final Map<Long, kep> c = rfp.c();
            if (c != null) {
                return c.containsKey(n);
            }
        }
        return false;
    }
}
