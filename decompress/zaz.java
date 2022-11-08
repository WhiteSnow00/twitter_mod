import java.lang.annotation.Annotation;
import java.io.IOException;
import java.util.HashMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class zaz implements j4j<zkz>
{
    public static final zaz a;
    public static final lxa b;
    public static final lxa c;
    public static final lxa d;
    
    static {
        a = new zaz();
        final vpy vpy = new vpy(0);
        vpy.b = 3;
        final qqy f = vpy.f();
        final HashMap hashMap = new HashMap();
        hashMap.put(((Annotation)f).annotationType(), f);
        b = new lxa("languageOption", xa0.C(hashMap), (lxa$a)null);
        final vpy vpy2 = new vpy(0);
        vpy2.b = 4;
        final qqy f2 = vpy2.f();
        final HashMap hashMap2 = new HashMap();
        hashMap2.put(((Annotation)f2).annotationType(), f2);
        c = new lxa("isUsingLegacyApi", xa0.C(hashMap2), (lxa$a)null);
        final vpy vpy3 = new vpy(0);
        vpy3.b = 5;
        final qqy f3 = vpy3.f();
        final HashMap hashMap3 = new HashMap();
        hashMap3.put(((Annotation)f3).annotationType(), f3);
        d = new lxa("sdkVersion", xa0.C(hashMap3), (lxa$a)null);
    }
    
    public final void a(final Object o, final Object o2) throws IOException {
        final zkz zkz = (zkz)o;
        final k4j k4j = (k4j)o2;
        k4j.a(zaz.b, (Object)zkz.a);
        k4j.a(zaz.c, (Object)null);
        k4j.a(zaz.d, (Object)null);
    }
}
