import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class vzu implements xq<tzu$b>
{
    public static final vzu a;
    public static final List<String> b;
    
    static {
        a = new vzu();
        b = tdy.v0((Object[])new String[] { "__typename", "result" });
    }
    
    @Override
    public final void a(final qle qle, final bb7 bb7, final Object o) {
        final tzu$b tzu$b = (tzu$b)o;
        zzd.f((Object)qle, "writer");
        zzd.f((Object)bb7, "customScalarAdapters");
        zzd.f((Object)tzu$b, "value");
        qle.A1("__typename");
        ar.a.a(qle, bb7, (Object)tzu$b.a);
        qle.A1("result");
        ar.b((xq<tzu$c>)new g4j((xq)wzu.a, true)).a(qle, bb7, tzu$b.b);
        npu.a.d(qle, bb7, tzu$b.c);
    }
    
    @Override
    public final Object b(final eie eie, final bb7 bb7) {
        zzd.f((Object)eie, "reader");
        zzd.f((Object)bb7, "customScalarAdapters");
        Object o = null;
        tzu$c tzu$c = null;
        while (true) {
            final int k3 = eie.k3((List)vzu.b);
            if (k3 != 0) {
                if (k3 != 1) {
                    break;
                }
                final wzu a = wzu.a;
                final ar$g a2 = ar.a;
                tzu$c = ar.b((xq<tzu$c>)new g4j((xq)a, true)).b(eie, bb7);
            }
            else {
                o = ar.a.b(eie, bb7);
            }
        }
        eie.H();
        final jpu c = npu.a.c(eie, bb7);
        zzd.c(o);
        return new tzu$b((String)o, tzu$c, c);
    }
}
