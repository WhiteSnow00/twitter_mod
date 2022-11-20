import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bz3 implements xq<zy3$c>
{
    public static final bz3 a;
    public static final List<String> b;
    
    static {
        a = new bz3();
        b = s9i.r("__typename");
    }
    
    public final void a(final ale ale, final fa7 fa7, final Object o) {
        final zy3$c zy3$c = (zy3$c)o;
        czd.f((Object)ale, "writer");
        czd.f((Object)fa7, "customScalarAdapters");
        czd.f((Object)zy3$c, "value");
        ale.z1("__typename");
        ar.a.a(ale, fa7, (Object)zy3$c.a);
        qm7.a.d(ale, fa7, zy3$c.b);
    }
    
    public final Object b(final ohe ohe, final fa7 fa7) {
        czd.f((Object)ohe, "reader");
        czd.f((Object)fa7, "customScalarAdapters");
        Object o = null;
        while (ohe.j3((List)bz3.b) == 0) {
            o = ar.a.b(ohe, fa7);
        }
        ohe.G();
        final pm7 c = qm7.a.c(ohe, fa7);
        czd.c(o);
        return new zy3$c((String)o, c);
    }
}
