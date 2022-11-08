import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class l8t extends kus implements dfc, pec, usw, mm3
{
    public final hfv q;
    public final String r;
    public final boolean s;
    public final ozl.c t;
    public final List<hfv> u;
    
    public l8t(final a a) {
        super((kus.a)a, 18);
        final hfv p = a.p;
        pf8.r(p);
        this.q = p;
        this.r = a.q;
        this.s = a.s;
        this.u = (ced)ijf.v((Object)p);
        this.t = a.t;
    }
    
    public final List<hfv> e() {
        return (List<hfv>)this.u;
    }
    
    public final hil h() {
        return this.q.a1;
    }
    
    public static final class a extends kus.a<l8t, a>
    {
        public hfv p;
        public String q;
        public hil r;
        public boolean s;
        public ozl.c t;
        
        public final Object i() {
            return new l8t(this);
        }
        
        @Override
        public final boolean l() {
            return super.l() && this.p != null;
        }
        
        @Override
        public final void m() {
            super.m();
            final hfv p = this.p;
            if (p != null && this.r != null) {
                final hfv$b hfv$b = new hfv$b(p);
                ((hfv$a)hfv$b).B = this.r;
                final int a = w4j.a;
                this.p = (hfv)((h4j)hfv$b).e();
            }
        }
    }
}
