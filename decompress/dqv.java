import java.util.Locale;
import com.twitter.core.ui.styles.icons.implementation.Icon;

// 
// Decompiled by Procyon v0.6.0
// 

public enum dqv
{
    public static final a Companion;
    
    G0(jpc.a), 
    H0(jpc.B), 
    I0(jpc.Q), 
    J0(jpc.E0), 
    K0(jpc.x1), 
    L0(jpc.y1), 
    M0(jpc.E1), 
    N0(jpc.D1);
    
    public static final dqv[] O0;
    public final Icon F0;
    
    static {
        Companion = new a();
    }
    
    public dqv(final Icon f0) {
        this.F0 = f0;
    }
    
    public static final dqv b(final String s) {
        return dqv.Companion.a(s);
    }
    
    public static final class a
    {
        public final dqv a(final String s) {
            final dqv dqv = null;
            String upperCase;
            if (s != null) {
                final Locale english = Locale.ENGLISH;
                e0e.e((Object)english, "ENGLISH");
                upperCase = s.toUpperCase(english);
                e0e.e((Object)upperCase, "this as java.lang.String).toUpperCase(locale)");
            }
            else {
                upperCase = null;
            }
            final dqv[] values = dqv.values();
            final int length = values.length;
            int n = 0;
            dqv dqv2;
            while (true) {
                dqv2 = dqv;
                if (n >= length) {
                    break;
                }
                dqv2 = values[n];
                if (e0e.a((Object)dqv2.name(), (Object)upperCase) || e0e.a((Object)slr.n1(dqv2.name(), "_", "", false), (Object)upperCase)) {
                    break;
                }
                ++n;
            }
            dqv g0;
            if ((g0 = dqv2) == null) {
                g0 = dqv.G0;
            }
            return g0;
        }
    }
}
