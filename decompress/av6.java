import java.util.Objects;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class av6 implements zq<zu6>
{
    public static final av6 a;
    public static final List<String> b;
    
    static {
        a = new av6();
        b = shw.y0((Object[])new String[] { "message", "unavailableReason" });
    }
    
    @Override
    public final /* bridge */ void a(final yle yle, final lb7 lb7, final Object o) {
        this.d(yle, lb7, (zu6)o);
    }
    
    @Override
    public final /* bridge */ Object b(final kie kie, final lb7 lb7) {
        return this.c(kie, lb7);
    }
    
    public final zu6 c(final kie kie, final lb7 lb7) {
        e0e.f((Object)kie, "reader");
        e0e.f((Object)lb7, "customScalarAdapters");
        fm7 g0 = null;
        String s = null;
    Label_0018:
        while (true) {
            final int k3 = kie.k3((List)av6.b);
            if (k3 != 0) {
                if (k3 != 1) {
                    break;
                }
                final String s2 = kie.S1();
                e0e.c((Object)s2);
                Objects.requireNonNull(fm7.Companion);
                final fm7[] values = fm7.values();
                final int length = values.length;
                int i = 0;
                while (true) {
                    while (i < length) {
                        final fm7 fm7 = values[i];
                        if (e0e.a((Object)fm7.F0, (Object)s2)) {
                            g0 = fm7;
                            if (fm7 == null) {
                                g0 = fm7.G0;
                                continue Label_0018;
                            }
                            continue Label_0018;
                        }
                        else {
                            ++i;
                        }
                    }
                    final fm7 fm7 = null;
                    continue;
                }
            }
            else {
                s = (String)cr.i.b(kie, lb7);
            }
        }
        e0e.c((Object)g0);
        return new zu6(s, g0);
    }
    
    public final void d(final yle yle, final lb7 lb7, final zu6 zu6) {
        e0e.f((Object)yle, "writer");
        e0e.f((Object)lb7, "customScalarAdapters");
        e0e.f((Object)zu6, "value");
        yle.A1("message");
        cr.i.a(yle, lb7, (Object)zu6.a);
        yle.A1("unavailableReason");
        final fm7 b = zu6.b;
        e0e.f((Object)b, "value");
        yle.i2(b.F0);
    }
}
