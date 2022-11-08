import java.io.Serializable;
import java.util.Objects;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ve0 implements xq<se0$b>
{
    public static final ve0 a;
    public static final List<String> b;
    
    static {
        a = new ve0();
        b = tdy.v0((Object[])new String[] { "alt", "height", "url", "width" });
    }
    
    @Override
    public final void a(final qle qle, final bb7 bb7, final Object o) {
        final se0$b se0$b = (se0$b)o;
        zzd.f((Object)qle, "writer");
        zzd.f((Object)bb7, "customScalarAdapters");
        zzd.f((Object)se0$b, "value");
        qle.A1("alt");
        final c2j<String> i = ar.i;
        i.a(qle, bb7, se0$b.a);
        qle.A1("height");
        Objects.requireNonNull(vtd.Companion);
        final cb7 a = vtd.a;
        ar.b((xq<Integer>)bb7.a(a)).a(qle, bb7, se0$b.b);
        qle.A1("url");
        i.a(qle, bb7, se0$b.c);
        qle.A1("width");
        ar.b((xq<Integer>)bb7.a(a)).a(qle, bb7, se0$b.d);
    }
    
    @Override
    public final Object b(final eie eie, final bb7 bb7) {
        zzd.f((Object)eie, "reader");
        zzd.f((Object)bb7, "customScalarAdapters");
        String s = null;
        Integer n = null;
        Integer n2;
        Serializable s2 = n2 = n;
        while (true) {
            final int k3 = eie.k3((List)ve0.b);
            if (k3 != 0) {
                if (k3 != 1) {
                    if (k3 != 2) {
                        if (k3 != 3) {
                            break;
                        }
                        Objects.requireNonNull(vtd.Companion);
                        n2 = (Integer)xa0.A(bb7, vtd.a, eie, bb7);
                    }
                    else {
                        s2 = ar.i.b(eie, bb7);
                    }
                }
                else {
                    Objects.requireNonNull(vtd.Companion);
                    n = (Integer)xa0.A(bb7, vtd.a, eie, bb7);
                }
            }
            else {
                s = ar.i.b(eie, bb7);
            }
        }
        return new se0$b(s, n, (String)s2, n2);
    }
}
