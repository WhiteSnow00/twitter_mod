import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class s16 implements xq<o06$m>
{
    public static final s16 a;
    public static final List<String> b;
    
    static {
        a = new s16();
        b = s9i.s("app_store_data", "destination_obj", "use_dominant_color");
    }
    
    public final /* bridge */ void a(final ale ale, final fa7 fa7, final Object o) {
        this.d(ale, fa7, (o06$m)o);
    }
    
    public final /* bridge */ Object b(final ohe ohe, final fa7 fa7) {
        return this.c(ohe, fa7);
    }
    
    public final o06$m c(final ohe ohe, final fa7 fa7) {
        czd.f((Object)ohe, "reader");
        czd.f((Object)fa7, "customScalarAdapters");
        List c = null;
        o06$c o06$c = null;
        Boolean b = null;
        while (true) {
            final int j3 = ohe.j3((List)s16.b);
            if (j3 != 0) {
                if (j3 != 1) {
                    if (j3 != 2) {
                        break;
                    }
                    b = (Boolean)ar.l.b(ohe, fa7);
                }
                else {
                    o06$c = (o06$c)ar.b((xq)ar.c((xq)i16.a, true)).b(ohe, fa7);
                }
            }
            else {
                c = ar.a((xq)ar.c((xq)f16.a, true)).c(ohe, fa7);
            }
        }
        czd.c((Object)c);
        return new o06$m(c, o06$c, b);
    }
    
    public final void d(final ale ale, final fa7 fa7, final o06$m o06$m) {
        czd.f((Object)ale, "writer");
        czd.f((Object)fa7, "customScalarAdapters");
        czd.f((Object)o06$m, "value");
        ale.z1("app_store_data");
        ar.a((xq)ar.c((xq)f16.a, true)).d(ale, fa7, o06$m.a);
        ale.z1("destination_obj");
        ar.b((xq)ar.c((xq)i16.a, true)).a(ale, fa7, (Object)o06$m.b);
        ale.z1("use_dominant_color");
        ar.l.a(ale, fa7, (Object)o06$m.c);
    }
}
