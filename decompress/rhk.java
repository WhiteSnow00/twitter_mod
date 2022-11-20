import android.os.Build$VERSION;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rhk
{
    public static final qhk a;
    
    static {
        Object a2;
        if (Build$VERSION.SDK_INT >= 24) {
            a2 = new q40();
        }
        else {
            a2 = new as2();
        }
        a = (qhk)a2;
    }
}
