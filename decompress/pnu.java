import java.util.Objects;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pnu implements zq<mnu$a>
{
    public static final pnu a;
    public static final List<String> b;
    
    static {
        a = new pnu();
        b = shw.y0((Object[])new String[] { "display_type", "text", "reveal_text" });
    }
    
    @Override
    public final /* bridge */ void a(final yle yle, final lb7 lb7, final Object o) {
        this.d(yle, lb7, (mnu$a)o);
    }
    
    @Override
    public final /* bridge */ Object b(final kie kie, final lb7 lb7) {
        return this.c(kie, lb7);
    }
    
    public final mnu$a c(final kie kie, final lb7 lb7) {
        e0e.f((Object)kie, "reader");
        e0e.f((Object)lb7, "customScalarAdapters");
        onu g0 = null;
        mnu$b mnu$b;
        Object o = mnu$b = null;
    Label_0022:
        while (true) {
            final int k3 = kie.k3((List)pnu.b);
            if (k3 == 0) {
                final String s1 = kie.S1();
                e0e.c((Object)s1);
                Objects.requireNonNull(onu.Companion);
                final onu[] values = onu.values();
                final int length = values.length;
                int i = 0;
                while (true) {
                    while (i < length) {
                        final onu onu = values[i];
                        if (e0e.a((Object)onu.F0, (Object)s1)) {
                            g0 = onu;
                            if (onu == null) {
                                g0 = onu.G0;
                                continue Label_0022;
                            }
                            continue Label_0022;
                        }
                        else {
                            ++i;
                        }
                    }
                    final onu onu = null;
                    continue;
                }
            }
            if (k3 != 1) {
                if (k3 != 2) {
                    break;
                }
                mnu$b = (mnu$b)cr.c((zq)qnu.a, true).b(kie, lb7);
            }
            else {
                o = cr.c((zq)rnu.a, true).b(kie, lb7);
            }
        }
        e0e.c((Object)g0);
        e0e.c(o);
        e0e.c((Object)mnu$b);
        return new mnu$a(g0, (mnu$c)o, mnu$b);
    }
    
    public final void d(final yle yle, final lb7 lb7, final mnu$a mnu$a) {
        e0e.f((Object)yle, "writer");
        e0e.f((Object)lb7, "customScalarAdapters");
        e0e.f((Object)mnu$a, "value");
        yle.A1("display_type");
        final onu a = mnu$a.a;
        e0e.f((Object)a, "value");
        yle.i2(a.F0);
        yle.A1("text");
        cr.c((zq)rnu.a, true).a(yle, lb7, (Object)mnu$a.b);
        yle.A1("reveal_text");
        cr.c((zq)qnu.a, true).a(yle, lb7, (Object)mnu$a.c);
    }
}
