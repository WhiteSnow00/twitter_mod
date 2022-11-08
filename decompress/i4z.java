import java.lang.annotation.Annotation;
import java.io.IOException;
import java.util.HashMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class i4z implements j4j<wez>
{
    public static final i4z a;
    public static final lxa b;
    public static final lxa c;
    public static final lxa d;
    public static final lxa e;
    
    static {
        a = new i4z();
        final vpy vpy = new vpy(0);
        vpy.b = 1;
        final qqy f = vpy.f();
        final HashMap hashMap = new HashMap();
        hashMap.put(((Annotation)f).annotationType(), f);
        b = new lxa("imageFormat", xa0.C(hashMap), (lxa$a)null);
        final vpy vpy2 = new vpy(0);
        vpy2.b = 2;
        final qqy f2 = vpy2.f();
        final HashMap hashMap2 = new HashMap();
        hashMap2.put(((Annotation)f2).annotationType(), f2);
        c = new lxa("originalImageSize", xa0.C(hashMap2), (lxa$a)null);
        final vpy vpy3 = new vpy(0);
        vpy3.b = 3;
        final qqy f3 = vpy3.f();
        final HashMap hashMap3 = new HashMap();
        hashMap3.put(((Annotation)f3).annotationType(), f3);
        d = new lxa("compressedImageSize", xa0.C(hashMap3), (lxa$a)null);
        final vpy vpy4 = new vpy(0);
        vpy4.b = 4;
        final qqy f4 = vpy4.f();
        final HashMap hashMap4 = new HashMap();
        hashMap4.put(((Annotation)f4).annotationType(), f4);
        e = new lxa("isOdmlImage", xa0.C(hashMap4), (lxa$a)null);
    }
    
    public final void a(final Object o, final Object o2) throws IOException {
        final wez wez = (wez)o;
        final k4j k4j = (k4j)o2;
        k4j.a(i4z.b, (Object)wez.a);
        k4j.a(i4z.c, (Object)wez.b);
        k4j.a(i4z.d, (Object)null);
        k4j.a(i4z.e, (Object)null);
    }
}
