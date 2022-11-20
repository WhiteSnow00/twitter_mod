import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ybf extends ajr$b
{
    public static final ybf.ybf$c Companion;
    public static final zr2<ybf, a> b;
    public final List<qbf> a;
    
    static {
        Companion = new ybf.ybf$c();
        ybf.b = new zr2<ybf, a>() {
            public final rlp<List<qbf>> c = new vp4$a((rlp)qbf.c);
            
            public final void f(final wlp wlp, final Object o) {
                final ybf ybf = (ybf)o;
                czd.f((Object)wlp, "output");
                czd.f((Object)ybf, "limitedActionResults");
                wlp.A((Object)ybf.a, (rlp)this.c);
            }
            
            public final n4j g() {
                return new a();
            }
            
            public final void h(final vlp vlp, final n4j n4j, final int n) {
                final a a = (a)n4j;
                czd.f((Object)vlp, "input");
                czd.f((Object)a, "builder");
                final Object z = vlp.z((rlp)this.c);
                czd.e(z, "input.readNotNullObject(limitedActionsSerializer)");
                a.a = (List<qbf>)z;
            }
        };
    }
    
    public ybf(final List<qbf> a) {
        czd.f((Object)a, "limitedActions");
        this.a = a;
    }
    
    public final boolean equals(final Object o) {
        return this == o || (o instanceof ybf && czd.a((Object)this.a, (Object)((ybf)o).a));
    }
    
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    public final String toString() {
        return wc0.z("LimitedActionResults(limitedActions=", (List)this.a, ")");
    }
    
    public static final class a extends n4j<ybf>
    {
        public List<qbf> a;
        
        public final Object i() {
            final List<qbf> a = this.a;
            if (a != null) {
                return new ybf(a);
            }
            czd.m("limitedActions");
            throw null;
        }
    }
}
