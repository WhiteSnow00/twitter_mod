import java.io.IOException;
import java.util.HashMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dzy implements p4j<ybz>
{
    public static final dzy a;
    public static final hwa b;
    public static final hwa c;
    public static final hwa d;
    public static final hwa e;
    public static final hwa f;
    public static final hwa g;
    public static final hwa h;
    public static final hwa i;
    public static final hwa j;
    public static final hwa k;
    public static final hwa l;
    public static final hwa m;
    public static final hwa n;
    
    static {
        final zzz d2 = zzz.D0;
        a = new dzy();
        final dyz dyz = new dyz(1, d2);
        final HashMap hashMap = new HashMap();
        hashMap.put(dyz.annotationType(), dyz);
        b = new hwa("appId", i81.w(hashMap), (hwa$a)null);
        final dyz dyz2 = new dyz(2, d2);
        final HashMap hashMap2 = new HashMap();
        hashMap2.put(dyz2.annotationType(), dyz2);
        c = new hwa("appVersion", i81.w(hashMap2), (hwa$a)null);
        final dyz dyz3 = new dyz(3, d2);
        final HashMap hashMap3 = new HashMap();
        hashMap3.put(dyz3.annotationType(), dyz3);
        d = new hwa("firebaseProjectId", i81.w(hashMap3), (hwa$a)null);
        final dyz dyz4 = new dyz(4, d2);
        final HashMap hashMap4 = new HashMap();
        hashMap4.put(dyz4.annotationType(), dyz4);
        e = new hwa("mlSdkVersion", i81.w(hashMap4), (hwa$a)null);
        final dyz dyz5 = new dyz(5, d2);
        final HashMap hashMap5 = new HashMap();
        hashMap5.put(dyz5.annotationType(), dyz5);
        f = new hwa("tfliteSchemaVersion", i81.w(hashMap5), (hwa$a)null);
        final dyz dyz6 = new dyz(6, d2);
        final HashMap hashMap6 = new HashMap();
        hashMap6.put(dyz6.annotationType(), dyz6);
        g = new hwa("gcmSenderId", i81.w(hashMap6), (hwa$a)null);
        final dyz dyz7 = new dyz(7, d2);
        final HashMap hashMap7 = new HashMap();
        hashMap7.put(dyz7.annotationType(), dyz7);
        h = new hwa("apiKey", i81.w(hashMap7), (hwa$a)null);
        final dyz dyz8 = new dyz(8, d2);
        final HashMap hashMap8 = new HashMap();
        hashMap8.put(dyz8.annotationType(), dyz8);
        i = new hwa("languages", i81.w(hashMap8), (hwa$a)null);
        final dyz dyz9 = new dyz(9, d2);
        final HashMap hashMap9 = new HashMap();
        hashMap9.put(dyz9.annotationType(), dyz9);
        j = new hwa("mlSdkInstanceId", i81.w(hashMap9), (hwa$a)null);
        final dyz dyz10 = new dyz(10, d2);
        final HashMap hashMap10 = new HashMap();
        hashMap10.put(dyz10.annotationType(), dyz10);
        k = new hwa("isClearcutClient", i81.w(hashMap10), (hwa$a)null);
        final dyz dyz11 = new dyz(11, d2);
        final HashMap hashMap11 = new HashMap();
        hashMap11.put(dyz11.annotationType(), dyz11);
        l = new hwa("isStandaloneMlkit", i81.w(hashMap11), (hwa$a)null);
        final dyz dyz12 = new dyz(12, d2);
        final HashMap hashMap12 = new HashMap();
        hashMap12.put(dyz12.annotationType(), dyz12);
        m = new hwa("isJsonLogging", i81.w(hashMap12), (hwa$a)null);
        final dyz dyz13 = new dyz(13, d2);
        final HashMap hashMap13 = new HashMap();
        hashMap13.put(dyz13.annotationType(), dyz13);
        n = new hwa("buildLevel", i81.w(hashMap13), (hwa$a)null);
    }
    
    public final void a(final Object o, final Object o2) throws IOException {
        final ybz ybz = (ybz)o;
        final q4j q4j = (q4j)o2;
        q4j.a(dzy.b, ybz.a);
        q4j.a(dzy.c, ybz.b);
        q4j.a(dzy.d, null);
        q4j.a(dzy.e, ybz.c);
        q4j.a(dzy.f, ybz.d);
        q4j.a(dzy.g, null);
        q4j.a(dzy.h, null);
        q4j.a(dzy.i, ybz.e);
        q4j.a(dzy.j, ybz.f);
        q4j.a(dzy.k, ybz.g);
        q4j.a(dzy.l, ybz.h);
        q4j.a(dzy.m, ybz.i);
        q4j.a(dzy.n, ybz.j);
    }
}
