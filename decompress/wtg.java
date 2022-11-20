import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class wtg implements xq<rtg.d>
{
    public static final wtg a;
    public static final List<String> b;
    
    static {
        a = new wtg();
        b = s9i.s("user_id", "name", "screen_name");
    }
    
    public final void a(final ale ale, final fa7 fa7, final Object o) {
        final rtg.d d = (rtg.d)o;
        czd.f((Object)ale, "writer");
        czd.f((Object)fa7, "customScalarAdapters");
        czd.f((Object)d, "value");
        ale.z1("user_id");
        final i2j i = ar.i;
        i.a(ale, fa7, (Object)d.a);
        ale.z1("name");
        i.a(ale, fa7, (Object)d.b);
        ale.z1("screen_name");
        i.a(ale, fa7, (Object)d.c);
    }
    
    public final Object b(final ohe ohe, final fa7 fa7) {
        czd.f((Object)ohe, "reader");
        czd.f((Object)fa7, "customScalarAdapters");
        String s = null;
        String s2 = null;
        String s3 = null;
        while (true) {
            final int j3 = ohe.j3((List)wtg.b);
            if (j3 != 0) {
                if (j3 != 1) {
                    if (j3 != 2) {
                        break;
                    }
                    s3 = (String)ar.i.b(ohe, fa7);
                }
                else {
                    s2 = (String)ar.i.b(ohe, fa7);
                }
            }
            else {
                s = (String)ar.i.b(ohe, fa7);
            }
        }
        return new rtg.d(s, s2, s3);
    }
}
