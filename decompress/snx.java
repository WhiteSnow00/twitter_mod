import java.util.Collection;
import java.util.Arrays;
import java.util.Set;
import android.os.Build$VERSION;
import java.util.HashSet;
import android.os.Build;

// 
// Decompiled by Procyon v0.6.0
// 

public enum snx implements xf6
{
    I0("FORCE_DARK", "FORCE_DARK"), 
    J0("FORCE_DARK_STRATEGY", "FORCE_DARK_BEHAVIOR");
    
    public static final snx[] K0;
    public final String F0;
    public final String G0;
    public final int H0;
    
    public snx(final String s2, final String s3) {
        this(s2, s3, -1);
    }
    
    public snx(final String f0, final String g0, final int h0) {
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
    }
    
    public final String b() {
        return this.F0;
    }
    
    public final boolean e() {
        final HashSet a = snx.a.a;
        final String g0 = this.G0;
        final boolean contains = a.contains(g0);
        final boolean b = false;
        if (!contains) {
            final String type = Build.TYPE;
            final boolean b2 = "eng".equals(type) || "userdebug".equals(type);
            boolean b3 = b;
            if (!b2) {
                return b3;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append(g0);
            sb.append(":dev");
            b3 = b;
            if (!a.contains(sb.toString())) {
                return b3;
            }
        }
        return true;
    }
    
    public final boolean isSupported() {
        final int h0 = this.H0;
        boolean b = false;
        boolean b2 = false;
        Label_0029: {
            if (h0 != -1) {
                if (Build$VERSION.SDK_INT >= h0) {
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
            snx.a.a = new HashSet((Collection<? extends E>)Arrays.asList(tnx.b.a.e()));
        }
    }
}
