import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class xfw implements xq<wfw$b>
{
    public static final xfw a;
    public static final List<String> b;
    
    static {
        a = new xfw();
        b = s9i.r("user_phone_state");
    }
    
    public final void a(final ale ale, final fa7 fa7, final Object o) {
        final wfw$b wfw$b = (wfw$b)o;
        czd.f((Object)ale, "writer");
        czd.f((Object)fa7, "customScalarAdapters");
        czd.f((Object)wfw$b, "value");
        ale.z1("user_phone_state");
        ar.b((xq)ar.c((xq)yfw.a, false)).a(ale, fa7, (Object)wfw$b.a);
    }
    
    public final Object b(final ohe ohe, final fa7 fa7) {
        czd.f((Object)ohe, "reader");
        czd.f((Object)fa7, "customScalarAdapters");
        wfw$c wfw$c = null;
        while (ohe.j3((List)xfw.b) == 0) {
            wfw$c = (wfw$c)ar.b((xq)ar.c((xq)yfw.a, false)).b(ohe, fa7);
        }
        return new wfw$b(wfw$c);
    }
}
