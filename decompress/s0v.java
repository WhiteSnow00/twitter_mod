import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class s0v implements xq<o0v>
{
    public static final s0v a;
    public static final List<String> b;
    
    static {
        a = new s0v();
        b = s9i.s("__typename", "quoted_status_result");
    }
    
    public final /* bridge */ void a(final ale ale, final fa7 fa7, final Object o) {
        this.d(ale, fa7, (o0v)o);
    }
    
    public final /* bridge */ Object b(final ohe ohe, final fa7 fa7) {
        return this.c(ohe, fa7);
    }
    
    public final o0v c(final ohe ohe, final fa7 fa7) {
        czd.f((Object)ohe, "reader");
        czd.f((Object)fa7, "customScalarAdapters");
        Object o = null;
        o0v$b o0v$b = null;
        while (true) {
            final int j3 = ohe.j3((List)s0v.b);
            if (j3 != 0) {
                if (j3 != 1) {
                    break;
                }
                final q0v a = q0v.a;
                final ar$g a2 = ar.a;
                o0v$b = (o0v$b)ar.b((xq)new m4j((xq)a, true)).b(ohe, fa7);
            }
            else {
                o = ar.a.b(ohe, fa7);
            }
        }
        ohe.G();
        final jku c = mlu.a.c(ohe, fa7);
        czd.c(o);
        return new o0v((String)o, o0v$b, c);
    }
    
    public final void d(final ale ale, final fa7 fa7, final o0v o0v) {
        czd.f((Object)ale, "writer");
        czd.f((Object)fa7, "customScalarAdapters");
        czd.f((Object)o0v, "value");
        ale.z1("__typename");
        ar.a.a(ale, fa7, (Object)o0v.a);
        ale.z1("quoted_status_result");
        ar.b((xq)new m4j((xq)q0v.a, true)).a(ale, fa7, (Object)o0v.b);
        mlu.a.d(ale, fa7, o0v.c);
    }
}
