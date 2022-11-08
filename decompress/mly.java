import android.os.Build$VERSION;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mly
{
    public static final int a;
    
    static {
        int a2;
        if (Build$VERSION.SDK_INT >= 31) {
            a2 = 33554432;
        }
        else {
            a2 = 0;
        }
        a = a2;
    }
}
