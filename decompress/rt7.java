import java.util.Objects;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rt7 implements xq<qt7>
{
    public static final rt7 a;
    public static final List<String> b;
    
    static {
        a = new rt7();
        b = s9i.s("reason", "message");
    }
    
    public final /* bridge */ void a(final ale ale, final fa7 fa7, final Object o) {
        this.d(ale, fa7, (qt7)o);
    }
    
    public final /* bridge */ Object b(final ohe ohe, final fa7 fa7) {
        return this.c(ohe, fa7);
    }
    
    public final qt7 c(final ohe ohe, final fa7 fa7) {
        czd.f((Object)ohe, "reader");
        czd.f((Object)fa7, "customScalarAdapters");
        st7 e0 = null;
        String s = null;
    Label_0018:
        while (true) {
            final int j3 = ohe.j3((List)rt7.b);
            if (j3 == 0) {
                final String r1 = ohe.R1();
                czd.c((Object)r1);
                Objects.requireNonNull(st7.Companion);
                final st7[] values = st7.values();
                final int length = values.length;
                int i = 0;
                while (true) {
                    while (i < length) {
                        final st7 st7 = values[i];
                        if (czd.a((Object)st7.D0, (Object)r1)) {
                            e0 = st7;
                            if (st7 == null) {
                                e0 = st7.E0;
                                continue Label_0018;
                            }
                            continue Label_0018;
                        }
                        else {
                            ++i;
                        }
                    }
                    final st7 st7 = null;
                    continue;
                }
            }
            if (j3 != 1) {
                break;
            }
            s = (String)ar.i.b(ohe, fa7);
        }
        czd.c((Object)e0);
        return new qt7(e0, s);
    }
    
    public final void d(final ale ale, final fa7 fa7, final qt7 qt7) {
        czd.f((Object)ale, "writer");
        czd.f((Object)fa7, "customScalarAdapters");
        czd.f((Object)qt7, "value");
        ale.z1("reason");
        final st7 a = qt7.a;
        czd.f((Object)a, "value");
        ale.h2(a.D0);
        ale.z1("message");
        ar.i.a(ale, fa7, (Object)qt7.b);
    }
}
