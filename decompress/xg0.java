import java.util.Objects;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class xg0 implements xq<wg0>
{
    public static final xg0 a;
    public static final List<String> b;
    
    static {
        a = new xg0();
        b = s9i.s("id_str", "indices", "name", "screen_name");
    }
    
    public final /* bridge */ void a(final ale ale, final fa7 fa7, final Object o) {
        this.d(ale, fa7, (wg0)o);
    }
    
    public final /* bridge */ Object b(final ohe ohe, final fa7 fa7) {
        return this.c(ohe, fa7);
    }
    
    public final wg0 c(final ohe ohe, final fa7 fa7) {
        czd.f((Object)ohe, "reader");
        czd.f((Object)fa7, "customScalarAdapters");
        String s = null;
        List list = null;
        String s3;
        String s2 = s3 = null;
        while (true) {
            final int j3 = ohe.j3((List)xg0.b);
            if (j3 != 0) {
                if (j3 != 1) {
                    if (j3 != 2) {
                        if (j3 != 3) {
                            break;
                        }
                        s3 = (String)ar.i.b(ohe, fa7);
                    }
                    else {
                        s2 = (String)ar.i.b(ohe, fa7);
                    }
                }
                else {
                    Objects.requireNonNull(ysd.Companion);
                    list = (List)ar.b((xq)ar.a((xq)fa7.a(ysd.a))).b(ohe, fa7);
                }
            }
            else {
                s = (String)ar.i.b(ohe, fa7);
            }
        }
        return new wg0(s, list, s2, s3);
    }
    
    public final void d(final ale ale, final fa7 fa7, final wg0 wg0) {
        czd.f((Object)ale, "writer");
        czd.f((Object)fa7, "customScalarAdapters");
        czd.f((Object)wg0, "value");
        ale.z1("id_str");
        final i2j i = ar.i;
        i.a(ale, fa7, (Object)wg0.a);
        ale.z1("indices");
        Objects.requireNonNull(ysd.Companion);
        ar.b((xq)ar.a((xq)fa7.a(ysd.a))).a(ale, fa7, (Object)wg0.b);
        ale.z1("name");
        i.a(ale, fa7, (Object)wg0.c);
        ale.z1("screen_name");
        i.a(ale, fa7, (Object)wg0.d);
    }
}
