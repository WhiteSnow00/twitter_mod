import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fk9 implements xq<ck9$d>
{
    public static final fk9 a;
    public static final List<String> b;
    
    static {
        a = new fk9();
        b = tdy.u0((Object)"userResults");
    }
    
    @Override
    public final void a(final qle qle, final bb7 bb7, final Object o) {
        final ck9$d ck9$d = (ck9$d)o;
        zzd.f((Object)qle, "writer");
        zzd.f((Object)bb7, "customScalarAdapters");
        zzd.f((Object)ck9$d, "value");
        qle.A1("userResults");
        ar.b((xq<ck9$j>)ar.c((xq<Object>)lk9.a, false)).a(qle, bb7, ck9$d.a);
    }
    
    @Override
    public final Object b(final eie eie, final bb7 bb7) {
        zzd.f((Object)eie, "reader");
        zzd.f((Object)bb7, "customScalarAdapters");
        ck9$j ck9$j = null;
        while (eie.k3((List)fk9.b) == 0) {
            ck9$j = ar.b((xq<ck9$j>)ar.c((xq<Object>)lk9.a, false)).b(eie, bb7);
        }
        return new ck9$d(ck9$j);
    }
}
