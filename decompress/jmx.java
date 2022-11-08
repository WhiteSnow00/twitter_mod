import java.util.Collection;
import java.util.Arrays;
import java.util.Set;
import android.os.Build$VERSION;
import java.util.HashSet;
import android.os.Build;

// 
// Decompiled by Procyon v0.6.0
// 

public enum jmx implements lf6
{
    F0("FORCE_DARK", "FORCE_DARK"), 
    G0("FORCE_DARK_STRATEGY", "FORCE_DARK_BEHAVIOR");
    
    public final String C0;
    public final String D0;
    public final int E0;
    
    public jmx(final String s2, final String s3) {
        this(s2, s3, -1);
    }
    
    public jmx(final String c0, final String d0, final int e0) {
        this.C0 = c0;
        this.D0 = d0;
        this.E0 = e0;
    }
    
    public final String b() {
        return this.C0;
    }
    
    public final boolean e() {
        final HashSet a = jmx.a.a;
        final String d0 = this.D0;
        final boolean contains = a.contains(d0);
        final boolean b = false;
        if (!contains) {
            final String type = Build.TYPE;
            final boolean b2 = "eng".equals(type) || "userdebug".equals(type);
            boolean b3 = b;
            if (!b2) {
                return b3;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append(d0);
            sb.append(":dev");
            b3 = b;
            if (!a.contains(sb.toString())) {
                return b3;
            }
        }
        return true;
    }
    
    public final boolean isSupported() {
        final int e0 = this.E0;
        boolean b = false;
        boolean b2 = false;
        Label_0029: {
            if (e0 != -1) {
                if (Build$VERSION.SDK_INT >= e0) {
                    b2 = true;
                    break Label_0029;
                }
            }
            b2 = false;
        }
        if (b2 || this.e()) {
            b = true;
        }
        return b;
    }
    
    public static final class a
    {
        public static final Set<String> a;
        
        static {
            jmx.a.a = new HashSet((Collection<? extends E>)Arrays.asList(kmx$b.a.b()));
        }
    }
}
