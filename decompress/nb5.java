import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class nb5 implements xq<jb5$d>
{
    public static final nb5 a;
    public static final List<String> b;
    
    static {
        a = new nb5();
        b = s9i.r("hasCommunityMemberShips");
    }
    
    public final void a(final ale ale, final fa7 fa7, final Object o) {
        final jb5$d jb5$d = (jb5$d)o;
        czd.f((Object)ale, "writer");
        czd.f((Object)fa7, "customScalarAdapters");
        czd.f((Object)jb5$d, "value");
        ale.z1("hasCommunityMemberShips");
        ar.f.a(ale, fa7, (Object)jb5$d.a);
    }
    
    public final Object b(final ohe ohe, final fa7 fa7) {
        czd.f((Object)ohe, "reader");
        czd.f((Object)fa7, "customScalarAdapters");
        Object o = null;
        while (ohe.j3((List)nb5.b) == 0) {
            o = ar.f.b(ohe, fa7);
        }
        czd.c(o);
        return new jb5$d((boolean)o);
    }
}
