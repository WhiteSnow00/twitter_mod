import java.util.concurrent.TimeUnit;

// 
// Decompiled by Procyon v0.6.0
// 

public final class yfo
{
    public static final nmp<ufo> a;
    public static final long b;
    
    static {
        yfo.a = new tda();
        b = TimeUnit.DAYS.toMillis(30L);
    }
    
    public static final ufo a(String s) {
        final boolean b = s.length() > 0;
        ufo ufo = null;
        if (!b) {
            s = null;
        }
        if (s != null) {
            ufo = (ufo)gmp.a(qi1.a(s), (nmp)yfo.a);
        }
        return ufo;
    }
}
