import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class p3t implements xq<f3t.j>
{
    public static final p3t a;
    public static final List<String> b;
    
    static {
        a = new p3t();
        b = tdy.u0((Object)"__typename");
    }
    
    @Override
    public final void a(final qle qle, final bb7 bb7, final Object o) {
        final f3t.j j = (f3t.j)o;
        zzd.f((Object)qle, "writer");
        zzd.f((Object)bb7, "customScalarAdapters");
        zzd.f((Object)j, "value");
        qle.A1("__typename");
        ar.a.a(qle, bb7, (Object)j.a);
        final f3t.b b = j.b;
        if (b != null) {
            h3t.a.d(qle, bb7, b);
        }
        final f3t.c c = j.c;
        if (c != null) {
            i3t.a.d(qle, bb7, c);
        }
        final f3t.d d = j.d;
        if (d != null) {
            j3t.a.d(qle, bb7, d);
        }
        final f3t.e e = j.e;
        if (e != null) {
            k3t.a.d(qle, bb7, e);
        }
        final f3t.f f = j.f;
        if (f != null) {
            l3t.a.d(qle, bb7, f);
        }
        final f3t.g g = j.g;
        if (g != null) {
            m3t.a.d(qle, bb7, g);
        }
    }
    
    @Override
    public final Object b(final eie eie, final bb7 bb7) {
        zzd.f((Object)eie, "reader");
        zzd.f((Object)bb7, "customScalarAdapters");
        f3t.g c = null;
        String s = null;
        while (eie.k3((List)p3t.b) == 0) {
            s = (String)ar.a.b(eie, bb7);
        }
        if (s != null) {
            f3t.b c2;
            if (kq9.I0(kq9.a1(new String[] { "TimelineRichTextCashtag" }), bb7.C0.a(), s, bb7.C0)) {
                eie.H();
                c2 = h3t.a.c(eie, bb7);
            }
            else {
                c2 = null;
            }
            f3t.c c3;
            if (kq9.I0(kq9.a1(new String[] { "TimelineRichTextHashtag" }), bb7.C0.a(), s, bb7.C0)) {
                eie.H();
                c3 = i3t.a.c(eie, bb7);
            }
            else {
                c3 = null;
            }
            f3t.d c4;
            if (kq9.I0(kq9.a1(new String[] { "TimelineRichTextList" }), bb7.C0.a(), s, bb7.C0)) {
                eie.H();
                c4 = j3t.a.c(eie, bb7);
            }
            else {
                c4 = null;
            }
            f3t.e c5;
            if (kq9.I0(kq9.a1(new String[] { "TimelineRichTextMention" }), bb7.C0.a(), s, bb7.C0)) {
                eie.H();
                c5 = k3t.a.c(eie, bb7);
            }
            else {
                c5 = null;
            }
            f3t.f c6;
            if (kq9.I0(kq9.a1(new String[] { "TimelineRichTextUser" }), bb7.C0.a(), s, bb7.C0)) {
                eie.H();
                c6 = l3t.a.c(eie, bb7);
            }
            else {
                c6 = null;
            }
            if (kq9.I0(kq9.a1(new String[] { "TimelineUrl" }), bb7.C0.a(), s, bb7.C0)) {
                eie.H();
                c = m3t.a.c(eie, bb7);
            }
            return new f3t.j(s, c2, c3, c4, c5, c6, c);
        }
        throw new IllegalStateException("__typename was not found".toString());
    }
}
