import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jf0 implements xq<hf0>
{
    public static final jf0 a;
    public static final List<String> b;
    
    static {
        a = new jf0();
        b = s9i.s("alt_text", "aspect_ratio", "preview_image", "variants");
    }
    
    public final /* bridge */ void a(final ale ale, final fa7 fa7, final Object o) {
        this.d(ale, fa7, (hf0)o);
    }
    
    public final /* bridge */ Object b(final ohe ohe, final fa7 fa7) {
        return this.c(ohe, fa7);
    }
    
    public final hf0 c(final ohe ohe, final fa7 fa7) {
        czd.f((Object)ohe, "reader");
        czd.f((Object)fa7, "customScalarAdapters");
        String s = null;
        Object o = null;
        List c;
        Object o2 = c = null;
        while (true) {
            final int j3 = ohe.j3((List)jf0.b);
            if (j3 != 0) {
                if (j3 != 1) {
                    if (j3 != 2) {
                        if (j3 != 3) {
                            break;
                        }
                        c = ar.a((xq)ar.c((xq)mf0.a, true)).c(ohe, fa7);
                    }
                    else {
                        o2 = ar.b((xq)ar.c((xq)lf0.a, true)).b(ohe, fa7);
                    }
                }
                else {
                    o = ar.c((xq)kf0.a, true).b(ohe, fa7);
                }
            }
            else {
                s = (String)ar.i.b(ohe, fa7);
            }
        }
        czd.c(o);
        czd.c((Object)c);
        return new hf0(s, (hf0$a)o, (hf0$b)o2, c);
    }
    
    public final void d(final ale ale, final fa7 fa7, final hf0 hf0) {
        czd.f((Object)ale, "writer");
        czd.f((Object)fa7, "customScalarAdapters");
        czd.f((Object)hf0, "value");
        ale.z1("alt_text");
        ar.i.a(ale, fa7, (Object)hf0.a);
        ale.z1("aspect_ratio");
        ar.c((xq)kf0.a, true).a(ale, fa7, (Object)hf0.b);
        ale.z1("preview_image");
        ar.b((xq)ar.c((xq)lf0.a, true)).a(ale, fa7, (Object)hf0.c);
        ale.z1("variants");
        ar.a((xq)ar.c((xq)mf0.a, true)).d(ale, fa7, hf0.d);
    }
}
