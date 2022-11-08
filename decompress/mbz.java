import java.lang.annotation.Annotation;
import java.io.IOException;
import java.util.HashMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mbz implements j4j<mlz>
{
    public static final mbz a;
    public static final lxa b;
    public static final lxa c;
    public static final lxa d;
    public static final lxa e;
    public static final lxa f;
    public static final lxa g;
    public static final lxa h;
    public static final lxa i;
    public static final lxa j;
    public static final lxa k;
    public static final lxa l;
    public static final lxa m;
    public static final lxa n;
    
    static {
        a = new mbz();
        final vpy vpy = new vpy(0);
        vpy.b = 1;
        final qqy f2 = vpy.f();
        final HashMap hashMap = new HashMap();
        hashMap.put(((Annotation)f2).annotationType(), f2);
        b = new lxa("appId", xa0.C(hashMap), (lxa$a)null);
        final vpy vpy2 = new vpy(0);
        vpy2.b = 2;
        final qqy f3 = vpy2.f();
        final HashMap hashMap2 = new HashMap();
        hashMap2.put(((Annotation)f3).annotationType(), f3);
        c = new lxa("appVersion", xa0.C(hashMap2), (lxa$a)null);
        final vpy vpy3 = new vpy(0);
        vpy3.b = 3;
        final qqy f4 = vpy3.f();
        final HashMap hashMap3 = new HashMap();
        hashMap3.put(((Annotation)f4).annotationType(), f4);
        d = new lxa("firebaseProjectId", xa0.C(hashMap3), (lxa$a)null);
        final vpy vpy4 = new vpy(0);
        vpy4.b = 4;
        final qqy f5 = vpy4.f();
        final HashMap hashMap4 = new HashMap();
        hashMap4.put(((Annotation)f5).annotationType(), f5);
        e = new lxa("mlSdkVersion", xa0.C(hashMap4), (lxa$a)null);
        final vpy vpy5 = new vpy(0);
        vpy5.b = 5;
        final qqy f6 = vpy5.f();
        final HashMap hashMap5 = new HashMap();
        hashMap5.put(((Annotation)f6).annotationType(), f6);
        f = new lxa("tfliteSchemaVersion", xa0.C(hashMap5), (lxa$a)null);
        final vpy vpy6 = new vpy(0);
        vpy6.b = 6;
        final qqy f7 = vpy6.f();
        final HashMap hashMap6 = new HashMap();
        hashMap6.put(((Annotation)f7).annotationType(), f7);
        g = new lxa("gcmSenderId", xa0.C(hashMap6), (lxa$a)null);
        final vpy vpy7 = new vpy(0);
        vpy7.b = 7;
        final qqy f8 = vpy7.f();
        final HashMap hashMap7 = new HashMap();
        hashMap7.put(((Annotation)f8).annotationType(), f8);
        h = new lxa("apiKey", xa0.C(hashMap7), (lxa$a)null);
        final vpy vpy8 = new vpy(0);
        vpy8.b = 8;
        final qqy f9 = vpy8.f();
        final HashMap hashMap8 = new HashMap();
        hashMap8.put(((Annotation)f9).annotationType(), f9);
        i = new lxa("languages", xa0.C(hashMap8), (lxa$a)null);
        final vpy vpy9 = new vpy(0);
        vpy9.b = 9;
        final qqy f10 = vpy9.f();
        final HashMap hashMap9 = new HashMap();
        hashMap9.put(((Annotation)f10).annotationType(), f10);
        j = new lxa("mlSdkInstanceId", xa0.C(hashMap9), (lxa$a)null);
        final vpy vpy10 = new vpy(0);
        vpy10.b = 10;
        final qqy f11 = vpy10.f();
        final HashMap hashMap10 = new HashMap();
        hashMap10.put(((Annotation)f11).annotationType(), f11);
        k = new lxa("isClearcutClient", xa0.C(hashMap10), (lxa$a)null);
        final vpy vpy11 = new vpy(0);
        vpy11.b = 11;
        final qqy f12 = vpy11.f();
        final HashMap hashMap11 = new HashMap();
        hashMap11.put(((Annotation)f12).annotationType(), f12);
        l = new lxa("isStandaloneMlkit", xa0.C(hashMap11), (lxa$a)null);
        final vpy vpy12 = new vpy(0);
        vpy12.b = 12;
        final qqy f13 = vpy12.f();
        final HashMap hashMap12 = new HashMap();
        hashMap12.put(((Annotation)f13).annotationType(), f13);
        m = new lxa("isJsonLogging", xa0.C(hashMap12), (lxa$a)null);
        final vpy vpy13 = new vpy(0);
        vpy13.b = 13;
        final qqy f14 = vpy13.f();
        final HashMap hashMap13 = new HashMap();
        hashMap13.put(((Annotation)f14).annotationType(), f14);
        n = new lxa("buildLevel", xa0.C(hashMap13), (lxa$a)null);
    }
    
    public final void a(final Object o, final Object o2) throws IOException {
        final mlz mlz = (mlz)o;
        final k4j k4j = (k4j)o2;
        k4j.a(mbz.b, (Object)mlz.a);
        k4j.a(mbz.c, (Object)mlz.b);
        k4j.a(mbz.d, (Object)null);
        k4j.a(mbz.e, (Object)mlz.c);
        k4j.a(mbz.f, (Object)mlz.d);
        k4j.a(mbz.g, (Object)null);
        k4j.a(mbz.h, (Object)null);
        k4j.a(mbz.i, (Object)mlz.e);
        k4j.a(mbz.j, (Object)mlz.f);
        k4j.a(mbz.k, (Object)mlz.g);
        k4j.a(mbz.l, (Object)mlz.h);
        k4j.a(mbz.m, (Object)mlz.i);
        k4j.a(mbz.n, (Object)mlz.j);
    }
}
