import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class wr8 implements xq<er8.p>
{
    public static final wr8 a;
    public static final List<String> b;
    
    static {
        a = new wr8();
        b = s9i.s("is_prefix", "apiMedia", "text");
    }
    
    public final /* bridge */ void a(final ale ale, final fa7 fa7, final Object o) {
        this.d(ale, fa7, (er8.p)o);
    }
    
    public final /* bridge */ Object b(final ohe ohe, final fa7 fa7) {
        return this.c(ohe, fa7);
    }
    
    public final er8.p c(final ohe ohe, final fa7 fa7) {
        czd.f((Object)ohe, "reader");
        czd.f((Object)fa7, "customScalarAdapters");
        Boolean b = null;
        er8.a a = null;
        String s = null;
        while (true) {
            final int j3 = ohe.j3((List)wr8.b);
            if (j3 != 0) {
                if (j3 != 1) {
                    if (j3 != 2) {
                        break;
                    }
                    s = (String)ar.i.b(ohe, fa7);
                }
                else {
                    a = (er8.a)ar.b((xq)ar.c((xq)gr8.a, true)).b(ohe, fa7);
                }
            }
            else {
                b = (Boolean)ar.l.b(ohe, fa7);
            }
        }
        return new er8.p(b, a, s);
    }
    
    public final void d(final ale ale, final fa7 fa7, final er8.p p3) {
        czd.f((Object)ale, "writer");
        czd.f((Object)fa7, "customScalarAdapters");
        czd.f((Object)p3, "value");
        ale.z1("is_prefix");
        ar.l.a(ale, fa7, (Object)p3.a);
        ale.z1("apiMedia");
        ar.b((xq)ar.c((xq)gr8.a, true)).a(ale, fa7, (Object)p3.b);
        ale.z1("text");
        ar.i.a(ale, fa7, (Object)p3.c);
    }
}
