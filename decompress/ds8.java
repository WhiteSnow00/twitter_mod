import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ds8 implements xq<vr8>
{
    public static final ds8 a;
    public static final List<String> b;
    
    static {
        a = new ds8();
        b = tdy.u0((Object)"__typename");
    }
    
    public final vr8 c(final eie eie, final bb7 bb7) {
        zzd.f((Object)eie, "reader");
        zzd.f((Object)bb7, "customScalarAdapters");
        Object c = null;
        String s = null;
        while (eie.k3((List)ds8.b) == 0) {
            s = (String)ar.a.b(eie, bb7);
        }
        if (s != null) {
            Object c2;
            if (kq9.I0(kq9.a1(new String[] { "CardBrowserDestination" }), bb7.C0.a(), s, bb7.C0)) {
                eie.H();
                c2 = js8.a.c(eie, bb7);
            }
            else {
                c2 = null;
            }
            Object c3;
            if (kq9.I0(kq9.a1(new String[] { "CardBrowserWithDockedMediaDestination" }), bb7.C0.a(), s, bb7.C0)) {
                eie.H();
                c3 = ks8.a.c(eie, bb7);
            }
            else {
                c3 = null;
            }
            Object c4;
            if (kq9.I0(kq9.a1(new String[] { "CardAppStoreDestination" }), bb7.C0.a(), s, bb7.C0)) {
                eie.H();
                c4 = hs8.a.c(eie, bb7);
            }
            else {
                c4 = null;
            }
            Object c5;
            if (kq9.I0(kq9.a1(new String[] { "CardAppStoreWithDockedMediaDestination" }), bb7.C0.a(), s, bb7.C0)) {
                eie.H();
                c5 = is8.a.c(eie, bb7);
            }
            else {
                c5 = null;
            }
            Object c6;
            if (kq9.I0(kq9.a1(new String[] { "CardPlayableDestination" }), bb7.C0.a(), s, bb7.C0)) {
                eie.H();
                c6 = ls8.a.c(eie, bb7);
            }
            else {
                c6 = null;
            }
            Object c7;
            if (kq9.I0(kq9.a1(new String[] { "CardTweetComposerDestination" }), bb7.C0.a(), s, bb7.C0)) {
                eie.H();
                c7 = ns8.a.c(eie, bb7);
            }
            else {
                c7 = null;
            }
            if (kq9.I0(kq9.a1(new String[] { "CardProfileDestination" }), bb7.C0.a(), s, bb7.C0)) {
                eie.H();
                c = ms8.a.c(eie, bb7);
            }
            return new vr8(s, (vr8.l)c2, (vr8.m)c3, (vr8.j)c4, (vr8.k)c5, (vr8.n)c6, (vr8.p)c7, (vr8.o)c);
        }
        throw new IllegalStateException("__typename was not found".toString());
    }
    
    public final void d(final qle qle, final bb7 bb7, final vr8 vr8) {
        zzd.f((Object)qle, "writer");
        zzd.f((Object)bb7, "customScalarAdapters");
        zzd.f((Object)vr8, "value");
        qle.A1("__typename");
        ar.a.a(qle, bb7, (Object)vr8.a);
        final vr8.l b = vr8.b;
        if (b != null) {
            js8.a.d(qle, bb7, b);
        }
        final vr8.m c = vr8.c;
        if (c != null) {
            ks8.a.d(qle, bb7, c);
        }
        final vr8.j d = vr8.d;
        if (d != null) {
            hs8.a.d(qle, bb7, d);
        }
        final vr8.k e = vr8.e;
        if (e != null) {
            is8.a.d(qle, bb7, e);
        }
        final vr8.n f = vr8.f;
        if (f != null) {
            ls8.a.d(qle, bb7, f);
        }
        final vr8.p g = vr8.g;
        if (g != null) {
            ns8.a.d(qle, bb7, g);
        }
        final vr8.o h = vr8.h;
        if (h != null) {
            ms8.a.d(qle, bb7, h);
        }
    }
}
