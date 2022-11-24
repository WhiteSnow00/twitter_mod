import java.io.IOException;
import java.util.HashMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class g5z implements b5j<xfz>
{
    public static final g5z a;
    public static final lxa b;
    public static final lxa c;
    public static final lxa d;
    public static final lxa e;
    public static final lxa f;
    public static final lxa g;
    
    static {
        final vry f2 = vry.F0;
        a = new g5z();
        final cry cry = new cry(1, f2);
        final HashMap hashMap = new HashMap();
        hashMap.put(cry.annotationType(), cry);
        b = new lxa("maxMs", wa0.A(hashMap), null);
        final cry cry2 = new cry(2, f2);
        final HashMap hashMap2 = new HashMap();
        hashMap2.put(cry2.annotationType(), cry2);
        c = new lxa("minMs", wa0.A(hashMap2), null);
        final cry cry3 = new cry(3, f2);
        final HashMap hashMap3 = new HashMap();
        hashMap3.put(cry3.annotationType(), cry3);
        d = new lxa("avgMs", wa0.A(hashMap3), null);
        final cry cry4 = new cry(4, f2);
        final HashMap hashMap4 = new HashMap();
        hashMap4.put(cry4.annotationType(), cry4);
        e = new lxa("firstQuartileMs", wa0.A(hashMap4), null);
        final cry cry5 = new cry(5, f2);
        final HashMap hashMap5 = new HashMap();
        hashMap5.put(cry5.annotationType(), cry5);
        f = new lxa("medianMs", wa0.A(hashMap5), null);
        final cry cry6 = new cry(6, f2);
        final HashMap hashMap6 = new HashMap();
        hashMap6.put(cry6.annotationType(), cry6);
        g = new lxa("thirdQuartileMs", wa0.A(hashMap6), null);
    }
    
    public final void a(final Object o, final Object o2) throws IOException {
        final xfz xfz = (xfz)o;
        final c5j c5j = (c5j)o2;
        c5j.a(g5z.b, xfz.a);
        c5j.a(g5z.c, xfz.b);
        c5j.a(g5z.d, xfz.c);
        c5j.a(g5z.e, xfz.d);
        c5j.a(g5z.f, xfz.e);
        c5j.a(g5z.g, xfz.f);
    }
}
