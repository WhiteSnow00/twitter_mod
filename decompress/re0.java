import java.io.Serializable;
import java.util.Objects;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class re0 implements xq<oe0$b>
{
    public static final re0 a;
    public static final List<String> b;
    
    static {
        a = new re0();
        b = s9i.s("alt", "height", "url", "width");
    }
    
    public final void a(final ale ale, final fa7 fa7, final Object o) {
        final oe0$b oe0$b = (oe0$b)o;
        czd.f((Object)ale, "writer");
        czd.f((Object)fa7, "customScalarAdapters");
        czd.f((Object)oe0$b, "value");
        ale.z1("alt");
        final i2j i = ar.i;
        i.a(ale, fa7, (Object)oe0$b.a);
        ale.z1("height");
        Objects.requireNonNull(ysd.Companion);
        final ga7 a = ysd.a;
        ar.b((xq)fa7.a(a)).a(ale, fa7, (Object)oe0$b.b);
        ale.z1("url");
        i.a(ale, fa7, (Object)oe0$b.c);
        ale.z1("width");
        ar.b((xq)fa7.a(a)).a(ale, fa7, (Object)oe0$b.d);
    }
    
    public final Object b(final ohe ohe, final fa7 fa7) {
        czd.f((Object)ohe, "reader");
        czd.f((Object)fa7, "customScalarAdapters");
        String s = null;
        Integer n = null;
        Integer n2;
        Serializable s2 = n2 = null;
        while (true) {
            final int j3 = ohe.j3((List)re0.b);
            if (j3 != 0) {
                if (j3 != 1) {
                    if (j3 != 2) {
                        if (j3 != 3) {
                            break;
                        }
                        Objects.requireNonNull(ysd.Companion);
                        n2 = (Integer)x70.B(fa7, ysd.a, ohe, fa7);
                    }
                    else {
                        s2 = (String)ar.i.b(ohe, fa7);
                    }
                }
                else {
                    Objects.requireNonNull(ysd.Companion);
                    n = (Integer)x70.B(fa7, ysd.a, ohe, fa7);
                }
            }
            else {
                s = (String)ar.i.b(ohe, fa7);
            }
        }
        return new oe0$b(s, n, (String)s2, n2);
    }
}
