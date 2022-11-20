import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bg0 implements xq<zf0$a>
{
    public static final bg0 a;
    public static final List<String> b;
    
    static {
        a = new bg0();
        b = s9i.r("r");
    }
    
    public final void a(final ale ale, final fa7 fa7, final Object o) {
        final zf0$a zf0$a = (zf0$a)o;
        czd.f((Object)ale, "writer");
        czd.f((Object)fa7, "customScalarAdapters");
        czd.f((Object)zf0$a, "value");
        ale.z1("r");
        ar.b((xq)ar.c((xq)dg0.a, false)).a(ale, fa7, (Object)zf0$a.a);
    }
    
    public final Object b(final ohe ohe, final fa7 fa7) {
        czd.f((Object)ohe, "reader");
        czd.f((Object)fa7, "customScalarAdapters");
        zf0$c zf0$c = null;
        while (ohe.j3((List)bg0.b) == 0) {
            zf0$c = (zf0$c)ar.b((xq)ar.c((xq)dg0.a, false)).b(ohe, fa7);
        }
        return new zf0$a(zf0$c);
    }
}
