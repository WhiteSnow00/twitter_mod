import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class x5f implements xq<t5f$d>
{
    public static final x5f a;
    public static final List<String> b;
    
    static {
        a = new x5f();
        b = s9i.r("coordinates");
    }
    
    public final void a(final ale ale, final fa7 fa7, final Object o) {
        final t5f$d t5f$d = (t5f$d)o;
        czd.f((Object)ale, "writer");
        czd.f((Object)fa7, "customScalarAdapters");
        czd.f((Object)t5f$d, "value");
        ale.z1("coordinates");
        ar.b((xq)new hif((xq)ar.c)).a(ale, fa7, (Object)t5f$d.a);
    }
    
    public final Object b(final ohe ohe, final fa7 fa7) {
        czd.f((Object)ohe, "reader");
        czd.f((Object)fa7, "customScalarAdapters");
        List list = null;
        while (ohe.j3((List)x5f.b) == 0) {
            list = (List)ar.b((xq)new hif((xq)ar.c)).b(ohe, fa7);
        }
        return new t5f$d(list);
    }
}
