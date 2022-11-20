import java.util.Locale;
import com.twitter.core.ui.styles.icons.implementation.Icon;

// 
// Decompiled by Procyon v0.6.0
// 

public enum spv
{
    public static final a Companion;
    
    E0(joc.a), 
    F0(joc.B), 
    G0(joc.Q), 
    H0(joc.E0), 
    I0(joc.x1), 
    J0(joc.y1), 
    K0(joc.E1), 
    L0(joc.D1);
    
    public static final spv[] M0;
    public final Icon D0;
    
    static {
        Companion = new a();
    }
    
    public spv(final Icon d0) {
        this.D0 = d0;
    }
    
    public static final spv b(final String s) {
        return spv.Companion.a(s);
    }
    
    public static final class a
    {
        public final spv a(final String s) {
            final spv spv = null;
            String upperCase;
            if (s != null) {
                final Locale english = Locale.ENGLISH;
                czd.e((Object)english, "ENGLISH");
                upperCase = s.toUpperCase(english);
                czd.e((Object)upperCase, "this as java.lang.String).toUpperCase(locale)");
            }
            else {
                upperCase = null;
            }
            final spv[] values = spv.values();
            final int length = values.length;
            int n = 0;
            spv spv2;
            while (true) {
                spv2 = spv;
                if (n >= length) {
                    break;
                }
                spv2 = values[n];
                if (czd.a((Object)spv2.name(), (Object)upperCase) || czd.a((Object)vkr.Y(spv2.name(), "_", "", false), (Object)upperCase)) {
                    break;
                }
                ++n;
            }
            spv e0;
            if ((e0 = spv2) == null) {
                e0 = spv.E0;
            }
            return e0;
        }
    }
}
