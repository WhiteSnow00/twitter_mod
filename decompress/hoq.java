// 
// Decompiled by Procyon v0.6.0
// 

public final class hoq extends wqp
{
    public int f;
    
    public hoq(final a a) {
        czd.f((Object)a, "builder");
        super((wqp$a)a);
        this.f = a.e;
    }
    
    public static final class a extends wqp$a<hoq, a>
    {
        public int e;
        
        public final Object i() {
            return new hoq(this);
        }
        
        public final boolean l() {
            return super.l() && this.e > 0;
        }
    }
    
    public static final class b extends wqp$b<hoq, a>
    {
        public final n4j g() {
            return (n4j)new a();
        }
        
        public final void i(final vlp vlp, final wqp$a wqp$a, final int n) {
            final a a = (a)wqp$a;
            czd.f((Object)vlp, "input");
            czd.f((Object)a, "builder");
            super.i(vlp, (wqp$a)a, n);
            a.e = vlp.x();
        }
        
        public final void j(final wlp wlp, final wqp wqp) {
            final hoq hoq = (hoq)wqp;
            czd.f((Object)wlp, "output");
            czd.f((Object)hoq, "settingsValue");
            super.j(wlp, (wqp)hoq);
            wlp.x(hoq.f);
        }
    }
}
