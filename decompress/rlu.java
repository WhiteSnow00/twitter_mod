import java.util.Objects;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rlu implements xq<jku$g0>
{
    public static final rlu a;
    public static final List<String> b;
    
    static {
        a = new rlu();
        b = s9i.r("id");
    }
    
    public final void a(final ale ale, final fa7 fa7, final Object o) {
        final jku$g0 jku$g0 = (jku$g0)o;
        czd.f((Object)ale, "writer");
        czd.f((Object)fa7, "customScalarAdapters");
        czd.f((Object)jku$g0, "value");
        ale.z1("id");
        Objects.requireNonNull(c3j.Companion);
        fa7.a(c3j.a).a(ale, fa7, (Object)jku$g0.a);
    }
    
    public final Object b(final ohe ohe, final fa7 fa7) {
        czd.f((Object)ohe, "reader");
        czd.f((Object)fa7, "customScalarAdapters");
        Object o = null;
        while (ohe.j3((List)rlu.b) == 0) {
            Objects.requireNonNull(c3j.Companion);
            o = fa7.a(c3j.a).b(ohe, fa7);
        }
        czd.c(o);
        return new jku$g0((String)o);
    }
}
