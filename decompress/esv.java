import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class esv extends tvs implements cuw, afc, wec, vdc, t0s
{
    public final csv q;
    public final u5t r;
    
    public esv(final a a) {
        super((tvs.a)a, 28);
        final csv p = a.p;
        vmw.g((Object)p);
        this.q = p;
        final o7t c = p.c;
        u5t r;
        if (a.q != null) {
            final u5t$a u5t$a = new u5t$a();
            ((tvs.a)u5t$a).b = super.b;
            ((tvs.a)u5t$a).a = super.a;
            u5t$a.p = a.q;
            if (c != null) {
                u5t$a.r = c.e;
                u5t$a.q = c.d;
                u5t$a.t = c.f;
                u5t$a.s = c.b;
                ((tvs.a)u5t$a).h = c.c;
                u5t$a.u = c.g;
                ((tvs.a)u5t$a).f = super.f;
                u5t$a.w = c.j;
                u5t$a.C = c.p;
                u5t$a.F = c.s;
                u5t$a.H = c.u;
                u5t$a.K = c.w;
                if (ita.b().b("soft_interventions_inner_qt_forward_pivot_enabled", false)) {
                    u5t$a.D = c.q;
                }
                if (ita.b().b("tweet_with_visibility_results_prefer_gql_tweet_interstitials_enabled", false)) {
                    u5t$a.E = c.r;
                }
            }
            r = (u5t)((z4j)u5t$a).j();
        }
        else {
            r = null;
        }
        this.r = r;
    }
    
    public final String a() {
        final u5t r = this.r;
        String y0;
        if (r == null) {
            y0 = null;
        }
        else {
            y0 = r.q.K0.Y0();
        }
        return y0;
    }
    
    public final List<u5t> b() {
        return ojf.v((Object)this.r);
    }
    
    public final String d() {
        String string;
        if (this.r != null) {
            final StringBuilder f = ehk.f("tombstone-");
            f.append(this.r.q.K0.Y0());
            string = f.toString();
        }
        else {
            string = null;
        }
        return string;
    }
    
    public final List<oh0> g() {
        final u5t r = this.r;
        Object o;
        if (r != null) {
            o = ojf.v((Object)r.q);
        }
        else {
            o = ged.G0;
            final int a = o5j.a;
        }
        return (List<oh0>)o;
    }
    
    public static final class a extends tvs.a<esv, a>
    {
        public csv p;
        public oh0 q;
        
        public final Object i() {
            return new esv(this);
        }
        
        @Override
        public final boolean k() {
            return super.k() && this.p != null;
        }
    }
}
