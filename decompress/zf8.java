import android.util.SparseIntArray;

// 
// Decompiled by Procyon v0.6.0
// 

public final class zf8
{
    public static final SparseIntArray a;
    
    static {
        a = new SparseIntArray(0);
    }
    
    public static drk a() {
        final int n = (int)Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        int n2;
        if (n > 16777216) {
            n2 = n / 4 * 3;
        }
        else {
            n2 = n / 2;
        }
        return new drk(0, n2, zf8.a);
    }
}
