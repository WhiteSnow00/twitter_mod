import java.util.Objects;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mo0 implements xq<ko0>
{
    public static final mo0 a;
    public static final List<String> b;
    
    static {
        a = new mo0();
        b = s9i.s("app_icon_media_results", "category", "description", "has_in_app_purchases", "id", "is_editors_choice", "is_free", "num_installs", "ratings", "size_bytes", "title", "type", "url", "url_resolved");
    }
    
    public final /* bridge */ void a(final ale ale, final fa7 fa7, final Object o) {
        this.d(ale, fa7, (ko0)o);
    }
    
    public final /* bridge */ Object b(final ohe ohe, final fa7 fa7) {
        return this.c(ohe, fa7);
    }
    
    public final ko0 c(final ohe ohe, final fa7 fa7) {
        czd.f((Object)ohe, "reader");
        czd.f((Object)fa7, "customScalarAdapters");
        Object o = null;
        Object o2 = null;
        Object o3 = null;
        Boolean b = null;
        String s = null;
        Boolean b2 = null;
        Boolean b3 = null;
        String s2 = null;
        Object o4 = null;
        String s3 = null;
        Object o5 = null;
        ai3 e0 = null;
        String s4 = null;
        String s5 = null;
    Label_0054:
        while (true) {
            while (true) {
                switch (ohe.j3((List)mo0.b)) {
                    default: {
                        czd.c((Object)s);
                        czd.c((Object)e0);
                        return new ko0((ko0.a)o, (ko0.b)o2, (ko0.c)o3, b, s, b2, b3, s2, (ko0.d)o4, s3, (ko0.e)o5, e0, s4, s5);
                    }
                    case 13: {
                        s5 = (String)ar.i.b(ohe, fa7);
                        continue;
                    }
                    case 12: {
                        s4 = (String)ar.i.b(ohe, fa7);
                        continue;
                    }
                    case 11: {
                        final String r1 = ohe.R1();
                        czd.c((Object)r1);
                        Objects.requireNonNull(ai3.Companion);
                        final ai3[] values = ai3.values();
                        final int length = values.length;
                        int i = 0;
                        while (true) {
                            while (i < length) {
                                e0 = values[i];
                                if (czd.a((Object)e0.D0, (Object)r1)) {
                                    if (e0 == null) {
                                        e0 = ai3.E0;
                                        continue Label_0054;
                                    }
                                    continue Label_0054;
                                }
                                else {
                                    ++i;
                                }
                            }
                            e0 = null;
                            continue;
                        }
                    }
                    case 10: {
                        final ro0 a = ro0.a;
                        final ar$g a2 = ar.a;
                        o5 = ar.b((xq)new m4j((xq)a, true)).b(ohe, fa7);
                        continue;
                    }
                    case 9: {
                        Objects.requireNonNull(c3j.Companion);
                        s3 = (String)x70.B(fa7, c3j.a, ohe, fa7);
                        continue;
                    }
                    case 8: {
                        final qo0 a3 = qo0.a;
                        final ar$g a4 = ar.a;
                        o4 = ar.b((xq)new m4j((xq)a3, false)).b(ohe, fa7);
                        continue;
                    }
                    case 7: {
                        Objects.requireNonNull(c3j.Companion);
                        s2 = (String)x70.B(fa7, c3j.a, ohe, fa7);
                        continue;
                    }
                    case 6: {
                        b3 = (Boolean)ar.l.b(ohe, fa7);
                        continue;
                    }
                    case 5: {
                        b2 = (Boolean)ar.l.b(ohe, fa7);
                        continue;
                    }
                    case 4: {
                        s = (String)ar.a.b(ohe, fa7);
                        continue;
                    }
                    case 3: {
                        b = (Boolean)ar.l.b(ohe, fa7);
                        continue;
                    }
                    case 2: {
                        final po0 a5 = po0.a;
                        final ar$g a6 = ar.a;
                        o3 = ar.b((xq)new m4j((xq)a5, true)).b(ohe, fa7);
                        continue;
                    }
                    case 1: {
                        final oo0 a7 = oo0.a;
                        final ar$g a8 = ar.a;
                        o2 = ar.b((xq)new m4j((xq)a7, true)).b(ohe, fa7);
                        continue;
                    }
                    case 0: {
                        final no0 a9 = no0.a;
                        final ar$g a10 = ar.a;
                        o = ar.b((xq)new m4j((xq)a9, true)).b(ohe, fa7);
                        continue;
                    }
                }
            }
            break;
        }
    }
    
    public final void d(final ale ale, final fa7 fa7, final ko0 ko0) {
        czd.f((Object)ale, "writer");
        czd.f((Object)fa7, "customScalarAdapters");
        czd.f((Object)ko0, "value");
        ale.z1("app_icon_media_results");
        final no0 a = no0.a;
        final ar$g a2 = ar.a;
        ar.b((xq)new m4j((xq)a, true)).a(ale, fa7, (Object)ko0.a);
        ale.z1("category");
        ar.b((xq)new m4j((xq)oo0.a, true)).a(ale, fa7, (Object)ko0.b);
        ale.z1("description");
        ar.b((xq)new m4j((xq)po0.a, true)).a(ale, fa7, (Object)ko0.c);
        ale.z1("has_in_app_purchases");
        final i2j l = ar.l;
        l.a(ale, fa7, (Object)ko0.d);
        ale.z1("id");
        ar.a.a(ale, fa7, (Object)ko0.e);
        ale.z1("is_editors_choice");
        l.a(ale, fa7, (Object)ko0.f);
        ale.z1("is_free");
        l.a(ale, fa7, (Object)ko0.g);
        ale.z1("num_installs");
        Objects.requireNonNull(c3j.Companion);
        final ga7 a3 = c3j.a;
        ar.b((xq)fa7.a(a3)).a(ale, fa7, (Object)ko0.h);
        ale.z1("ratings");
        ar.b((xq)new m4j((xq)qo0.a, false)).a(ale, fa7, (Object)ko0.i);
        ale.z1("size_bytes");
        ar.b((xq)fa7.a(a3)).a(ale, fa7, (Object)ko0.j);
        ale.z1("title");
        ar.b((xq)new m4j((xq)ro0.a, true)).a(ale, fa7, (Object)ko0.k);
        ale.z1("type");
        final ai3 i = ko0.l;
        czd.f((Object)i, "value");
        ale.h2(i.D0);
        ale.z1("url");
        final i2j j = ar.i;
        j.a(ale, fa7, (Object)ko0.m);
        ale.z1("url_resolved");
        j.a(ale, fa7, (Object)ko0.n);
    }
}
