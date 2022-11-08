import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class v7t implements xq<p7t.c>
{
    public static final v7t a;
    public static final List<String> b;
    
    static {
        a = new v7t();
        b = tdy.v0((Object[])new String[] { "timeline", "requestParams", "title", "subtitle", "cacheId" });
    }
    
    @Override
    public final void a(final qle qle, final bb7 bb7, final Object o) {
        final p7t.c c = (p7t.c)o;
        zzd.f((Object)qle, "writer");
        zzd.f((Object)bb7, "customScalarAdapters");
        zzd.f((Object)c, "value");
        qle.A1("timeline");
        ar.b((xq<p7t.b>)ar.c((xq<Object>)t7t.a, true)).a(qle, bb7, c.a);
        qle.A1("requestParams");
        ar.b((xq<List<p7t.a>>)ar.a((xq<Object>)ar.c((xq<Object>)s7t.a, false))).a(qle, bb7, c.b);
        qle.A1("title");
        final c2j<String> i = ar.i;
        i.a(qle, bb7, c.c);
        qle.A1("subtitle");
        i.a(qle, bb7, c.d);
        qle.A1("cacheId");
        i.a(qle, bb7, c.e);
    }
    
    @Override
    public final Object b(final eie eie, final bb7 bb7) {
        zzd.f((Object)eie, "reader");
        zzd.f((Object)bb7, "customScalarAdapters");
        Object o = null;
        Object o3;
        Object o2 = o3 = o;
        Object o4;
        String s = (String)(o4 = o3);
        while (true) {
            final int k3 = eie.k3((List)v7t.b);
            if (k3 != 0) {
                if (k3 != 1) {
                    if (k3 != 2) {
                        if (k3 != 3) {
                            if (k3 != 4) {
                                break;
                            }
                            o4 = ar.i.b(eie, bb7);
                        }
                        else {
                            s = ar.i.b(eie, bb7);
                        }
                    }
                    else {
                        o3 = ar.i.b(eie, bb7);
                    }
                }
                else {
                    o2 = ar.b((xq<List<p7t.a>>)ar.a((xq<Object>)ar.c((xq<Object>)s7t.a, false))).b(eie, bb7);
                }
            }
            else {
                o = ar.b((xq<p7t.b>)ar.c((xq<Object>)t7t.a, true)).b(eie, bb7);
            }
        }
        return new p7t.c((p7t.b)o, (List<p7t.a>)o2, (String)o3, s, (String)o4);
    }
}
