import java.util.Objects;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class blu implements xq<jku$r>
{
    public static final blu a;
    public static final List<String> b;
    
    static {
        a = new blu();
        b = s9i.s("favorite_count", "reply_count", "quote_count");
    }
    
    public final void a(final ale ale, final fa7 fa7, final Object o) {
        final jku$r jku$r = (jku$r)o;
        czd.f((Object)ale, "writer");
        czd.f((Object)fa7, "customScalarAdapters");
        czd.f((Object)jku$r, "value");
        ale.z1("favorite_count");
        Objects.requireNonNull(ysd.Companion);
        final ga7 a = ysd.a;
        ar.b((xq)fa7.a(a)).a(ale, fa7, (Object)jku$r.a);
        ale.z1("reply_count");
        ar.b((xq)fa7.a(a)).a(ale, fa7, (Object)jku$r.b);
        ale.z1("quote_count");
        ar.b((xq)fa7.a(a)).a(ale, fa7, (Object)jku$r.c);
    }
    
    public final Object b(final ohe ohe, final fa7 fa7) {
        czd.f((Object)ohe, "reader");
        czd.f((Object)fa7, "customScalarAdapters");
        Integer n = null;
        Integer n2 = null;
        Integer n3 = null;
        while (true) {
            final int j3 = ohe.j3((List)blu.b);
            if (j3 != 0) {
                if (j3 != 1) {
                    if (j3 != 2) {
                        break;
                    }
                    Objects.requireNonNull(ysd.Companion);
                    n3 = (Integer)x70.B(fa7, ysd.a, ohe, fa7);
                }
                else {
                    Objects.requireNonNull(ysd.Companion);
                    n2 = (Integer)x70.B(fa7, ysd.a, ohe, fa7);
                }
            }
            else {
                Objects.requireNonNull(ysd.Companion);
                n = (Integer)x70.B(fa7, ysd.a, ohe, fa7);
            }
        }
        return new jku$r(n, n2, n3);
    }
}
