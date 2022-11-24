import java.lang.annotation.Annotation;
import java.io.IOException;
import java.util.HashMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class osy implements b5j<i5z>
{
    public static final osy a;
    public static final lxa b;
    public static final lxa c;
    public static final lxa d;
    public static final lxa e;
    public static final lxa f;
    public static final lxa g;
    public static final lxa h;
    
    static {
        final z000 f2 = z000.F0;
        a = new osy();
        final czz czz = new czz(1, f2);
        final HashMap hashMap = new HashMap();
        hashMap.put(((Annotation)czz).annotationType(), czz);
        b = new lxa("durationMs", wa0.A(hashMap), null);
        final czz czz2 = new czz(2, f2);
        final HashMap hashMap2 = new HashMap();
        hashMap2.put(((Annotation)czz2).annotationType(), czz2);
        c = new lxa("imageSource", wa0.A(hashMap2), null);
        final czz czz3 = new czz(3, f2);
        final HashMap hashMap3 = new HashMap();
        hashMap3.put(((Annotation)czz3).annotationType(), czz3);
        d = new lxa("imageFormat", wa0.A(hashMap3), null);
        final czz czz4 = new czz(4, f2);
        final HashMap hashMap4 = new HashMap();
        hashMap4.put(((Annotation)czz4).annotationType(), czz4);
        e = new lxa("imageByteSize", wa0.A(hashMap4), null);
        final czz czz5 = new czz(5, f2);
        final HashMap hashMap5 = new HashMap();
        hashMap5.put(((Annotation)czz5).annotationType(), czz5);
        f = new lxa("imageWidth", wa0.A(hashMap5), null);
        final czz czz6 = new czz(6, f2);
        final HashMap hashMap6 = new HashMap();
        hashMap6.put(((Annotation)czz6).annotationType(), czz6);
        g = new lxa("imageHeight", wa0.A(hashMap6), null);
        final czz czz7 = new czz(7, f2);
        final HashMap hashMap7 = new HashMap();
        hashMap7.put(((Annotation)czz7).annotationType(), czz7);
        h = new lxa("rotationDegrees", wa0.A(hashMap7), null);
    }
    
    public final void a(final Object o, final Object o2) throws IOException {
        final i5z i5z = (i5z)o;
        final c5j c5j = (c5j)o2;
        c5j.a(osy.b, i5z.a);
        c5j.a(osy.c, i5z.b);
        c5j.a(osy.d, i5z.c);
        c5j.a(osy.e, i5z.d);
        c5j.a(osy.f, i5z.e);
        c5j.a(osy.g, i5z.f);
        c5j.a(osy.h, i5z.g);
    }
}
