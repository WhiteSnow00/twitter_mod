import java.util.Locale;
import java.text.SimpleDateFormat;

// 
// Decompiled by Procyon v0.6.0
// 

public final class szh
{
    public static final String a;
    public static final SimpleDateFormat b;
    public static final rzh c;
    public static final boolean d;
    
    static {
        a = ed.B(new StringBuilder(), f61.a, ".externalfileprovider");
        b = new SimpleDateFormat("'twitter_'yyyy-MM-dd-HHmmss'.narc'", Locale.US);
        c = new rzh();
        wk0.b().t();
        d = false;
    }
    
    public static void a(final int n, final int n2, final String s) {
        if (szh.d) {
            b(new io0(n, n2, s));
        }
    }
    
    public static void b(final ad ad) {
        if (szh.d) {
            synchronized ("NARCLogger") {
                szh.c.c.add((Object)ad);
            }
        }
    }
}
