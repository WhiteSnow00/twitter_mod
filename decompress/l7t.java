import java.util.Collections;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class l7t extends kus implements usw, tdc, dfc, dec, mm3
{
    public final xbv q;
    public final hfv r;
    public final int s;
    
    public l7t(final a a) {
        super((kus.a)a, 39);
        final xbv p = a.p;
        pf8.r(p);
        this.q = p;
        final hfv q = a.q;
        pf8.r(q);
        this.r = q;
        final Integer value = a.r;
        pf8.r(value);
        this.s = value;
    }
    
    public final List<xbv> c() {
        return ijf.v((Object)this.q);
    }
    
    public final String d() {
        return String.valueOf(this.q.I0);
    }
    
    public final List<hfv> e() {
        return Collections.singletonList(this.r);
    }
    
    public static final class a extends kus.a<l7t, a>
    {
        public xbv p;
        public hfv q;
        public int r;
        
        public final Object i() {
            return new l7t(this);
        }
        
        @Override
        public final boolean l() {
            return super.l() && this.p != null && this.q != null;
        }
    }
}
