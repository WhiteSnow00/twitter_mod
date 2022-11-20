import android.os.Build$VERSION;
import java.util.HashSet;
import android.os.Build;

// 
// Decompiled by Procyon v0.6.0
// 

public enum bnx implements qe6
{
    G0("FORCE_DARK", "FORCE_DARK"), 
    H0("FORCE_DARK_STRATEGY", "FORCE_DARK_BEHAVIOR");
    
    public static final bnx[] I0;
    public final String D0;
    public final String E0;
    public final int F0;
    
    public bnx(final String s2, final String s3) {
        this(s2, s3, -1);
    }
    
    public bnx(final String d0, final String e0, final int f0) {
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
    }
    
    @Override
    public final String b() {
        return this.D0;
    }
    
    public final boolean e() {
        final HashSet a = bnx.bnx$a.a;
        final String e0 = this.E0;
        final boolean contains = a.contains(e0);
        final boolean b = false;
        if (!contains) {
            final String type = Build.TYPE;
            final boolean b2 = "eng".equals(type) || "userdebug".equals(type);
            boolean b3 = b;
            if (!b2) {
                return b3;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append(e0);
            sb.append(":dev");
            b3 = b;
            if (!a.contains(sb.toString())) {
                return b3;
            }
        }
        return true;
    }
    
    @Override
    public final boolean isSupported() {
        final int f0 = this.F0;
        boolean b = false;
        boolean b2 = false;
        Label_0029: {
            if (f0 != -1) {
                if (Build$VERSION.SDK_INT >= f0) {
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
}
