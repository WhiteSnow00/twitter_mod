import java.util.Objects;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class n3t implements xq<f3t$d>
{
    public static final n3t a;
    public static final List<String> b;
    
    static {
        a = new n3t();
        b = s9i.s("id", "url");
    }
    
    public final /* bridge */ void a(final ale ale, final fa7 fa7, final Object o) {
        this.d(ale, fa7, (f3t$d)o);
    }
    
    public final /* bridge */ Object b(final ohe ohe, final fa7 fa7) {
        return this.c(ohe, fa7);
    }
    
    public final f3t$d c(final ohe ohe, final fa7 fa7) {
        czd.f((Object)ohe, "reader");
        czd.f((Object)fa7, "customScalarAdapters");
        Object o = null;
        String s = null;
        while (true) {
            final int j3 = ohe.j3((List)n3t.b);
            if (j3 != 0) {
                if (j3 != 1) {
                    break;
                }
                s = (String)ar.a.b(ohe, fa7);
            }
            else {
                Objects.requireNonNull(c3j.Companion);
                o = fa7.a(c3j.a).b(ohe, fa7);
            }
        }
        czd.c(o);
        czd.c((Object)s);
        return new f3t$d((String)o, s);
    }
    
    public final void d(final ale ale, final fa7 fa7, final f3t$d f3t$d) {
        czd.f((Object)ale, "writer");
        czd.f((Object)fa7, "customScalarAdapters");
        czd.f((Object)f3t$d, "value");
        ale.z1("id");
        Objects.requireNonNull(c3j.Companion);
        fa7.a(c3j.a).a(ale, fa7, (Object)f3t$d.a);
        ale.z1("url");
        ar.a.a(ale, fa7, (Object)f3t$d.b);
    }
}
