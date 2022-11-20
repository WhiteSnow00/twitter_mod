import java.util.Objects;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class n6w implements xq<m6w>
{
    public static final n6w a;
    public static final List<String> b;
    
    static {
        a = new n6w();
        b = s9i.s("display_url", "expanded_url", "indices", "url");
    }
    
    public final /* bridge */ void a(final ale ale, final fa7 fa7, final Object o) {
        this.d(ale, fa7, (m6w)o);
    }
    
    public final /* bridge */ Object b(final ohe ohe, final fa7 fa7) {
        return this.c(ohe, fa7);
    }
    
    public final m6w c(final ohe ohe, final fa7 fa7) {
        czd.f((Object)ohe, "reader");
        czd.f((Object)fa7, "customScalarAdapters");
        String s = null;
        String s2 = null;
        String s3;
        Object o = s3 = null;
        while (true) {
            final int j3 = ohe.j3((List)n6w.b);
            if (j3 != 0) {
                if (j3 != 1) {
                    if (j3 != 2) {
                        if (j3 != 3) {
                            break;
                        }
                        s3 = (String)ar.i.b(ohe, fa7);
                    }
                    else {
                        Objects.requireNonNull(ysd.Companion);
                        o = ar.b((xq)ar.a((xq)fa7.a(ysd.a))).b(ohe, fa7);
                    }
                }
                else {
                    s2 = (String)ar.i.b(ohe, fa7);
                }
            }
            else {
                s = (String)ar.i.b(ohe, fa7);
            }
        }
        return new m6w(s, s2, (List)o, s3);
    }
    
    public final void d(final ale ale, final fa7 fa7, final m6w m6w) {
        czd.f((Object)ale, "writer");
        czd.f((Object)fa7, "customScalarAdapters");
        czd.f((Object)m6w, "value");
        ale.z1("display_url");
        final i2j i = ar.i;
        i.a(ale, fa7, (Object)m6w.a);
        ale.z1("expanded_url");
        i.a(ale, fa7, (Object)m6w.b);
        ale.z1("indices");
        Objects.requireNonNull(ysd.Companion);
        ar.b((xq)ar.a((xq)fa7.a(ysd.a))).a(ale, fa7, (Object)m6w.c);
        ale.z1("url");
        i.a(ale, fa7, (Object)m6w.d);
    }
}
