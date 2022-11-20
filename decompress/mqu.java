import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mqu implements xq<iqu$d>
{
    public static final mqu a;
    public static final List<String> b;
    
    static {
        a = new mqu();
        b = s9i.r("__typename");
    }
    
    public final void a(final ale ale, final fa7 fa7, final Object o) {
        final iqu$d iqu$d = (iqu$d)o;
        czd.f((Object)ale, "writer");
        czd.f((Object)fa7, "customScalarAdapters");
        czd.f((Object)iqu$d, "value");
        ale.z1("__typename");
        ar.a.a(ale, fa7, (Object)iqu$d.a);
        s3t.a.d(ale, fa7, iqu$d.b);
    }
    
    public final Object b(final ohe ohe, final fa7 fa7) {
        czd.f((Object)ohe, "reader");
        czd.f((Object)fa7, "customScalarAdapters");
        Object o = null;
        while (ohe.j3((List)mqu.b) == 0) {
            o = ar.a.b(ohe, fa7);
        }
        ohe.G();
        final f3t c = s3t.a.c(ohe, fa7);
        czd.c(o);
        return new iqu$d((String)o, c);
    }
}
