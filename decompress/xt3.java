import java.util.HashMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public enum xt3
{
    public static final Map<Integer, xt3> E0;
    public static final Map<String, xt3> F0;
    public final int[] C0;
    public final String[] D0;
    
    static {
        xt3.E0 = new HashMap();
        xt3.F0 = new HashMap();
        for (final xt3 xt3 : values()) {
            final int[] c0 = xt3.C0;
            for (int length2 = c0.length, j = 0; j < length2; ++j) {
                xt3.E0.put(c0[j], xt3);
            }
            xt3.F0.put(xt3.name(), xt3);
            final String[] d0 = xt3.D0;
            for (int length3 = d0.length, k = 0; k < length3; ++k) {
                xt3.F0.put(d0[k], xt3);
            }
        }
    }
    
    public xt3(final int n2, final String[] d0) {
        this.C0 = new int[] { n2 };
        this.D0 = d0;
    }
    
    public xt3(final int... c0, final String[] d0) {
        this.C0 = c0;
        this.D0 = d0;
    }
}
