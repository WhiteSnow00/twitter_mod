import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pnr implements zq<mnr>
{
    public static final pnr a;
    
    static {
        a = new pnr();
    }
    
    @Override
    public final /* bridge */ void a(final yle yle, final lb7 lb7, final Object o) {
        this.c(yle, lb7, (mnr)o);
    }
    
    @Override
    public final Object b(final kie kie, final lb7 lb7) {
        e0e.f((Object)kie, "reader");
        e0e.f((Object)lb7, "customScalarAdapters");
        throw new IllegalStateException("Input type used in output position");
    }
    
    public final void c(final yle yle, final lb7 lb7, final mnr mnr) {
        e0e.f((Object)yle, "writer");
        e0e.f((Object)lb7, "customScalarAdapters");
        e0e.f((Object)mnr, "value");
        yle.A1("revue_account_id");
        Objects.requireNonNull(p3j.Companion);
        lb7.a(p3j.a).a(yle, lb7, mnr.a);
        if (mnr.b instanceof moj$c) {
            yle.A1("double_opt_in");
            cr.d((zq)cr.l).c(yle, lb7, (moj$c)mnr.b);
        }
        if (mnr.c instanceof moj$c) {
            yle.A1("via");
            cr.d((zq)cr.i).c(yle, lb7, (moj$c)mnr.c);
        }
        if (mnr.d instanceof moj$c) {
            yle.A1("client");
            cr.d((zq)cr.b((zq)fxm.a)).c(yle, lb7, (moj$c)mnr.d);
        }
        if (mnr.e instanceof moj$c) {
            yle.A1("element");
            cr.d((zq)cr.i).c(yle, lb7, (moj$c)mnr.e);
        }
    }
}
