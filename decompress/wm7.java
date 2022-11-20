import java.util.Objects;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class wm7 implements xq<pm7.f>
{
    public static final wm7 a;
    public static final List<String> b;
    
    static {
        a = new wm7();
        b = s9i.s("dm_event_slice_invalid_request_reason", "parameter_validation_error_response");
    }
    
    public final /* bridge */ void a(final ale ale, final fa7 fa7, final Object o) {
        this.d(ale, fa7, (pm7.f)o);
    }
    
    public final /* bridge */ Object b(final ohe ohe, final fa7 fa7) {
        return this.c(ohe, fa7);
    }
    
    public final pm7.f c(final ohe ohe, final fa7 fa7) {
        czd.f((Object)ohe, "reader");
        czd.f((Object)fa7, "customScalarAdapters");
        om7 e0 = null;
        pm7.i i = null;
    Label_0018:
        while (true) {
            final int j3 = ohe.j3((List)wm7.b);
            int k = 0;
            if (j3 == 0) {
                final String r1 = ohe.R1();
                czd.c((Object)r1);
                Objects.requireNonNull(om7.Companion);
                final om7[] values = om7.values();
                while (true) {
                    while (k < values.length) {
                        final om7 om7 = values[k];
                        if (czd.a((Object)om7.D0, (Object)r1)) {
                            e0 = om7;
                            if (om7 == null) {
                                e0 = om7.E0;
                                continue Label_0018;
                            }
                            continue Label_0018;
                        }
                        else {
                            ++k;
                        }
                    }
                    final om7 om7 = null;
                    continue;
                }
            }
            if (j3 != 1) {
                break;
            }
            i = (pm7.i)ar.c((xq)zm7.a, false).b(ohe, fa7);
        }
        czd.c((Object)e0);
        czd.c((Object)i);
        return new pm7.f(e0, i);
    }
    
    public final void d(final ale ale, final fa7 fa7, final pm7.f f) {
        czd.f((Object)ale, "writer");
        czd.f((Object)fa7, "customScalarAdapters");
        czd.f((Object)f, "value");
        ale.z1("dm_event_slice_invalid_request_reason");
        final om7 a = f.a;
        czd.f((Object)a, "value");
        ale.h2(a.D0);
        ale.z1("parameter_validation_error_response");
        ar.c((xq)zm7.a, false).a(ale, fa7, (Object)f.b);
    }
}
