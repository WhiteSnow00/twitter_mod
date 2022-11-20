import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class deb
{
    public static final aml<ceb> a;
    public static final okh b;
    
    static {
        a = fli.n0((nsb)deb$a.D0);
        final okh$a companion = okh.Companion;
        final tkh<neb> tkh = (tkh<neb>)new tkh<neb>() {
            public final okh E(final okh okh) {
                return k6e.a((okh)this, okh);
            }
            
            public final boolean H(final qsb qsb) {
                return da8.a((okh$b)this, qsb);
            }
            
            public final Object X(final Object o, final ftb ftb) {
                czd.f((Object)ftb, "operation");
                return ftb.invoke(o, (Object)this);
            }
            
            public final aml<neb> getKey() {
                return (aml<neb>)keb.a;
            }
            
            public final /* bridge */ Object getValue() {
                return null;
            }
        };
        Objects.requireNonNull(companion);
        b = ((okh)tkh).E((okh)new tkh<wdb>() {
            public final okh E(final okh okh) {
                return k6e.a((okh)this, okh);
            }
            
            public final boolean H(final qsb qsb) {
                return da8.a((okh$b)this, qsb);
            }
            
            public final Object X(final Object o, final ftb ftb) {
                czd.f((Object)ftb, "operation");
                return ftb.invoke(o, (Object)this);
            }
            
            public final aml<wdb> getKey() {
                return (aml<wdb>)tdb.a;
            }
            
            public final /* bridge */ Object getValue() {
                return null;
            }
        }).E((okh)new tkh<seb>() {
            public final okh E(final okh okh) {
                return k6e.a((okh)this, okh);
            }
            
            public final boolean H(final qsb qsb) {
                return da8.a((okh$b)this, qsb);
            }
            
            public final Object X(final Object o, final ftb ftb) {
                czd.f((Object)ftb, "operation");
                return ftb.invoke(o, (Object)this);
            }
            
            public final aml<seb> getKey() {
                return reb.a;
            }
            
            public final /* bridge */ Object getValue() {
                return null;
            }
        });
    }
    
    public static final okh a(final okh okh, final ceb ceb) {
        czd.f((Object)okh, "<this>");
        czd.f((Object)ceb, "focusModifier");
        return okh.E((okh)ceb).E(deb.b);
    }
}
