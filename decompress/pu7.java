import java.util.Objects;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pu7 implements zq<nu7>
{
    public static final pu7 a;
    public static final List<String> b;
    
    static {
        a = new pu7();
        b = shw.y0((Object[])new String[] { "id", "reaction_key", "created_at_millis", "sender_results" });
    }
    
    @Override
    public final /* bridge */ void a(final yle yle, final lb7 lb7, final Object o) {
        this.d(yle, lb7, (nu7)o);
    }
    
    @Override
    public final /* bridge */ Object b(final kie kie, final lb7 lb7) {
        return this.c(kie, lb7);
    }
    
    public final nu7 c(final kie kie, final lb7 lb7) {
        e0e.f((Object)kie, "reader");
        e0e.f((Object)lb7, "customScalarAdapters");
        String s = null;
        String s2 = null;
        String s3;
        Object o = s3 = null;
        while (true) {
            final int k3 = kie.k3((List)pu7.b);
            if (k3 != 0) {
                if (k3 != 1) {
                    if (k3 != 2) {
                        if (k3 != 3) {
                            break;
                        }
                        final qu7 a = qu7.a;
                        final zq<String> a2 = cr.a;
                        o = new y4j((zq)a, false).b(kie, lb7);
                    }
                    else {
                        Objects.requireNonNull(p3j.Companion);
                        s3 = (String)zk.x(lb7, p3j.a, kie, lb7);
                    }
                }
                else {
                    s2 = (String)cr.a.b(kie, lb7);
                }
            }
            else {
                Objects.requireNonNull(p3j.Companion);
                s = lb7.a(p3j.a).b(kie, lb7);
            }
        }
        e0e.c((Object)s);
        e0e.c((Object)s2);
        e0e.c(o);
        return new nu7(s, s2, s3, (nu7$a)o);
    }
    
    public final void d(final yle yle, final lb7 lb7, final nu7 nu7) {
        e0e.f((Object)yle, "writer");
        e0e.f((Object)lb7, "customScalarAdapters");
        e0e.f((Object)nu7, "value");
        yle.A1("id");
        Objects.requireNonNull(p3j.Companion);
        final mb7 a = p3j.a;
        lb7.a(a).a(yle, lb7, nu7.a);
        yle.A1("reaction_key");
        cr.a.a(yle, lb7, nu7.b);
        yle.A1("created_at_millis");
        cr.b((zq)lb7.a(a)).a(yle, lb7, (Object)nu7.c);
        yle.A1("sender_results");
        final qu7 a2 = qu7.a;
        final nu7$a d = nu7.d;
        yle.G();
        ((zq<nu7$a>)a2).a(yle, lb7, d);
        yle.Q();
    }
}
