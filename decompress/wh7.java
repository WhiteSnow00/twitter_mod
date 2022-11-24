import java.io.Serializable;
import java.util.Objects;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class wh7 implements zq<vh7>
{
    public static final wh7 a;
    public static final List<String> b;
    
    static {
        a = new wh7();
        b = shw.y0((Object[])new String[] { "event_id", "event_type", "created_at_millis", "event_detail", "request_id", "affects_sort", "initiating_user_results" });
    }
    
    @Override
    public final /* bridge */ void a(final yle yle, final lb7 lb7, final Object o) {
        this.d(yle, lb7, (vh7)o);
    }
    
    @Override
    public final /* bridge */ Object b(final kie kie, final lb7 lb7) {
        return this.c(kie, lb7);
    }
    
    public final vh7 c(final kie kie, final lb7 lb7) {
        e0e.f((Object)kie, "reader");
        e0e.f((Object)lb7, "customScalarAdapters");
        final String s = null;
        final vh7$b vh7$b2;
        final vh7$b vh7$b = vh7$b2 = null;
        Object o;
        final vh7$b vh7$b3 = (vh7$b)(o = vh7$b2);
        Object o2;
        Serializable s2 = (Serializable)(o2 = o);
        Object o3 = vh7$b3;
        Object o4 = vh7$b2;
        Object h0 = vh7$b;
        String s3 = s;
    Label_0054:
        while (true) {
            while (true) {
                switch (kie.k3((List)wh7.b)) {
                    default: {
                        e0e.c(h0);
                        return new vh7(s3, (ho7)h0, (String)o4, (vh7$a)o3, (String)o, (Boolean)s2, (vh7$b)o2);
                    }
                    case 6: {
                        o2 = cr.b((zq)cr.c((zq)yh7.a, true)).b(kie, lb7);
                        continue;
                    }
                    case 5: {
                        s2 = (Boolean)cr.l.b(kie, lb7);
                        continue;
                    }
                    case 4: {
                        o = cr.i.b(kie, lb7);
                        continue;
                    }
                    case 3: {
                        o3 = cr.b((zq)cr.c((zq)xh7.a, true)).b(kie, lb7);
                        continue;
                    }
                    case 2: {
                        Objects.requireNonNull(p3j.Companion);
                        o4 = zk.x(lb7, p3j.a, kie, lb7);
                        continue;
                    }
                    case 1: {
                        final String s4 = kie.S1();
                        e0e.c((Object)s4);
                        Objects.requireNonNull(ho7.Companion);
                        final ho7[] values = ho7.values();
                        final int length = values.length;
                        int i = 0;
                        while (true) {
                            while (i < length) {
                                final ho7 ho7 = values[i];
                                if (e0e.a((Object)ho7.F0, (Object)s4)) {
                                    h0 = ho7;
                                    if (ho7 == null) {
                                        h0 = ho7.H0;
                                        continue Label_0054;
                                    }
                                    continue Label_0054;
                                }
                                else {
                                    ++i;
                                }
                            }
                            final ho7 ho7 = null;
                            continue;
                        }
                    }
                    case 0: {
                        Objects.requireNonNull(p3j.Companion);
                        s3 = (String)zk.x(lb7, p3j.a, kie, lb7);
                        continue;
                    }
                }
            }
            break;
        }
    }
    
    public final void d(final yle yle, final lb7 lb7, final vh7 vh7) {
        e0e.f((Object)yle, "writer");
        e0e.f((Object)lb7, "customScalarAdapters");
        e0e.f((Object)vh7, "value");
        yle.A1("event_id");
        final p3j.a companion = p3j.Companion;
        Objects.requireNonNull(companion);
        final mb7 a = p3j.a;
        cr.b((zq)lb7.a(a)).a(yle, lb7, (Object)vh7.a);
        yle.A1("event_type");
        final ho7 b = vh7.b;
        e0e.f((Object)b, "value");
        yle.i2(b.F0);
        yle.A1("created_at_millis");
        Objects.requireNonNull(companion);
        cr.b((zq)lb7.a(a)).a(yle, lb7, (Object)vh7.c);
        yle.A1("event_detail");
        cr.b((zq)cr.c((zq)xh7.a, true)).a(yle, lb7, (Object)vh7.d);
        yle.A1("request_id");
        cr.i.a(yle, lb7, (Object)vh7.e);
        yle.A1("affects_sort");
        cr.l.a(yle, lb7, (Object)vh7.f);
        yle.A1("initiating_user_results");
        cr.b((zq)cr.c((zq)yh7.a, true)).a(yle, lb7, (Object)vh7.g);
    }
}
