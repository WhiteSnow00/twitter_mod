import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class b7 implements xq<a7$b>
{
    public static final b7 a;
    public static final List<String> b;
    
    static {
        a = new b7();
        b = s9i.r("aaid_consent_put");
    }
    
    public final void a(final ale ale, final fa7 fa7, final Object o) {
        final a7$b a7$b = (a7$b)o;
        czd.f((Object)ale, "writer");
        czd.f((Object)fa7, "customScalarAdapters");
        czd.f((Object)a7$b, "value");
        ale.z1("aaid_consent_put");
        ar.b((xq)q69.a).a(ale, fa7, (Object)a7$b.a);
    }
    
    public final Object b(final ohe ohe, final fa7 fa7) {
        czd.f((Object)ohe, "reader");
        czd.f((Object)fa7, "customScalarAdapters");
        o69 o69 = null;
        while (ohe.j3((List)b7.b) == 0) {
            o69 = (o69)ar.b((xq)q69.a).b(ohe, fa7);
        }
        return new a7$b(o69);
    }
}
