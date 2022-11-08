import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ytg implements xq<ctg$b>
{
    public static final ytg a;
    public static final List<String> b;
    
    static {
        a = new ytg();
        b = tdy.u0((Object)"is360");
    }
    
    @Override
    public final void a(final qle qle, final bb7 bb7, final Object o) {
        final ctg$b ctg$b = (ctg$b)o;
        zzd.f((Object)qle, "writer");
        zzd.f((Object)bb7, "customScalarAdapters");
        zzd.f((Object)ctg$b, "value");
        qle.A1("is360");
        ar.l.a(qle, bb7, ctg$b.a);
    }
    
    @Override
    public final Object b(final eie eie, final bb7 bb7) {
        zzd.f((Object)eie, "reader");
        zzd.f((Object)bb7, "customScalarAdapters");
        Boolean b = null;
        while (eie.k3((List)ytg.b) == 0) {
            b = ar.l.b(eie, bb7);
        }
        return new ctg$b(b);
    }
}
