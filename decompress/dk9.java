import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dk9 implements xq<ck9$a>
{
    public static final dk9 a;
    public static final List<String> b;
    
    static {
        a = new dk9();
        b = tdy.u0((Object)"itemsResults");
    }
    
    @Override
    public final void a(final qle qle, final bb7 bb7, final Object o) {
        final ck9$a ck9$a = (ck9$a)o;
        zzd.f((Object)qle, "writer");
        zzd.f((Object)bb7, "customScalarAdapters");
        zzd.f((Object)ck9$a, "value");
        qle.A1("itemsResults");
        ar.a((xq<Object>)ar.c((xq<Object>)gk9.a, false)).d(qle, bb7, ck9$a.a);
    }
    
    @Override
    public final Object b(final eie eie, final bb7 bb7) {
        zzd.f((Object)eie, "reader");
        zzd.f((Object)bb7, "customScalarAdapters");
        List c = null;
        while (eie.k3((List)dk9.b) == 0) {
            c = ar.a((xq<Object>)ar.c((xq<Object>)gk9.a, false)).c(eie, bb7);
        }
        zzd.c((Object)c);
        return new ck9$a(c);
    }
}
