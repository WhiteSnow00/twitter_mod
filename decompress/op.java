import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class op
{
    public static final lw1<Integer, wv> a;
    public static final int b;
    
    static {
        int b2 = 0;
        final lw1 a2 = new lw1(0);
        (a = a2).put((Object)16384, (Object)wv.H0);
        a2.put((Object)32768, (Object)wv.I0);
        a2.put((Object)65536, (Object)wv.J0);
        a2.put((Object)131072, (Object)wv.K0);
        a2.put((Object)262144, (Object)wv.L0);
        a2.put((Object)524288, (Object)wv.M0);
        a2.put((Object)1048576, (Object)wv.N0);
        final Iterator iterator = a2.keySet().iterator();
        while (iterator.hasNext()) {
            b2 |= (int)iterator.next();
        }
        b = b2;
    }
}
