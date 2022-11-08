import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class e48 implements xq<b48$b>
{
    public static final e48 a;
    public static final List<String> b;
    
    static {
        a = new e48();
        b = tdy.u0((Object)"__typename");
    }
    
    @Override
    public final void a(final qle qle, final bb7 bb7, final Object o) {
        final b48$b b48$b = (b48$b)o;
        zzd.f((Object)qle, "writer");
        zzd.f((Object)bb7, "customScalarAdapters");
        zzd.f((Object)b48$b, "value");
        qle.A1("__typename");
        ar.a.a(qle, bb7, (Object)b48$b.a);
        c6w.a.d(qle, bb7, b48$b.b);
    }
    
    @Override
    public final Object b(final eie eie, final bb7 bb7) {
        zzd.f((Object)eie, "reader");
        zzd.f((Object)bb7, "customScalarAdapters");
        Object o = null;
        while (eie.k3((List)e48.b) == 0) {
            o = ar.a.b(eie, bb7);
        }
        eie.H();
        final b6w c = c6w.a.c(eie, bb7);
        zzd.c(o);
        return new b48$b((String)o, c);
    }
}
