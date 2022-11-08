import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class f5f implements xq<b5f$a>
{
    public static final f5f a;
    public static final List<String> b;
    
    static {
        a = new f5f();
        b = tdy.v0((Object[])new String[] { "key", "value" });
    }
    
    @Override
    public final void a(final qle qle, final bb7 bb7, final Object o) {
        final b5f$a b5f$a = (b5f$a)o;
        zzd.f((Object)qle, "writer");
        zzd.f((Object)bb7, "customScalarAdapters");
        zzd.f((Object)b5f$a, "value");
        qle.A1("key");
        ar.a.a(qle, bb7, (Object)b5f$a.a);
        qle.A1("value");
        final j5f a = j5f.a;
        final b5f$d b = b5f$a.b;
        if (!(qle instanceof dkg)) {
            final dkg dkg = new dkg();
            dkg.G();
            ((xq<b5f$d>)a).a((qle)dkg, bb7, b);
            dkg.Q();
            if (!dkg.D0) {
                throw new IllegalStateException("Check failed.".toString());
            }
            final Object c0 = dkg.C0;
            zzd.c(c0);
            wvz.l(qle, c0);
        }
        else {
            qle.G();
            ((xq<b5f$d>)a).a(qle, bb7, b);
            qle.Q();
        }
    }
    
    @Override
    public final Object b(final eie eie, final bb7 bb7) {
        zzd.f((Object)eie, "reader");
        zzd.f((Object)bb7, "customScalarAdapters");
        Object o = null;
        b5f$d b5f$d = null;
        while (true) {
            final int k3 = eie.k3((List)f5f.b);
            if (k3 != 0) {
                if (k3 != 1) {
                    break;
                }
                final j5f a = j5f.a;
                final ar$g a2 = ar.a;
                b5f$d = (b5f$d)new g4j((xq)a, true).b(eie, bb7);
            }
            else {
                o = ar.a.b(eie, bb7);
            }
        }
        zzd.c(o);
        zzd.c((Object)b5f$d);
        return new b5f$a((String)o, b5f$d);
    }
}
