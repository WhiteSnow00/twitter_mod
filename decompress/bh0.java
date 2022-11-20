import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bh0 implements xq<yg0.b>
{
    public static final bh0 a;
    public static final List<String> b;
    
    static {
        a = new bh0();
        b = s9i.s("coordinates", "type");
    }
    
    public final void a(final ale ale, final fa7 fa7, final Object o) {
        final yg0.b b = (yg0.b)o;
        czd.f((Object)ale, "writer");
        czd.f((Object)fa7, "customScalarAdapters");
        czd.f((Object)b, "value");
        ale.z1("coordinates");
        ar.b((xq)new hif((xq)new hif((xq)new hif((xq)ar.c)))).a(ale, fa7, (Object)b.a);
        ale.z1("type");
        ar.i.a(ale, fa7, (Object)b.b);
    }
    
    public final Object b(final ohe ohe, final fa7 fa7) {
        czd.f((Object)ohe, "reader");
        czd.f((Object)fa7, "customScalarAdapters");
        List<? extends List<? extends List<Double>>> list = null;
        String s = null;
        while (true) {
            final int j3 = ohe.j3((List)bh0.b);
            if (j3 != 0) {
                if (j3 != 1) {
                    break;
                }
                s = (String)ar.i.b(ohe, fa7);
            }
            else {
                list = (List)ar.b((xq)new hif((xq)new hif((xq)new hif((xq)ar.c)))).b(ohe, fa7);
            }
        }
        return new yg0.b(list, s);
    }
}
