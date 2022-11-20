import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jg0 implements xq<tf0$e>
{
    public static final jg0 a;
    public static final List<String> b;
    
    static {
        a = new jg0();
        b = s9i.r("copyright_holder_name");
    }
    
    public final /* bridge */ void a(final ale ale, final fa7 fa7, final Object o) {
        this.d(ale, fa7, (tf0$e)o);
    }
    
    public final /* bridge */ Object b(final ohe ohe, final fa7 fa7) {
        return this.c(ohe, fa7);
    }
    
    public final tf0$e c(final ohe ohe, final fa7 fa7) {
        czd.f((Object)ohe, "reader");
        czd.f((Object)fa7, "customScalarAdapters");
        Object o = null;
        while (ohe.j3((List)jg0.b) == 0) {
            o = ar.a.b(ohe, fa7);
        }
        czd.c(o);
        return new tf0$e((String)o);
    }
    
    public final void d(final ale ale, final fa7 fa7, final tf0$e tf0$e) {
        czd.f((Object)ale, "writer");
        czd.f((Object)fa7, "customScalarAdapters");
        czd.f((Object)tf0$e, "value");
        ale.z1("copyright_holder_name");
        ar.a.a(ale, fa7, (Object)tf0$e.a);
    }
}
