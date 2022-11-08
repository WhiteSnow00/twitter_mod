import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lp
{
    public static final iw1<Integer, wv> a;
    public static final int b;
    
    static {
        int b2 = 0;
        final iw1 a2 = new iw1(0);
        (a = a2).put((Object)16384, (Object)wv.E0);
        a2.put((Object)32768, (Object)wv.F0);
        a2.put((Object)65536, (Object)wv.G0);
        a2.put((Object)131072, (Object)wv.H0);
        a2.put((Object)262144, (Object)wv.I0);
        a2.put((Object)524288, (Object)wv.J0);
        a2.put((Object)1048576, (Object)wv.K0);
        final Iterator iterator = a2.keySet().iterator();
        while (iterator.hasNext()) {
            b2 |= (int)iterator.next();
        }
        b = b2;
    }
}
