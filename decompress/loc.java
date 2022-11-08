// 
// Decompiled by Procyon v0.6.0
// 

public final class loc extends c7t
{
    public final String B;
    public final fxe<Boolean> C;
    public final grq D;
    public final qeu E;
    
    public loc(final gob gob, final rnd rnd, final jev jev, final nca nca, final rcu rcu, final w7t w7t, final String b, final qvd qvd, final xr3 xr3, final crt crt, final fxe<Boolean> c, final dsb dsb, final grq d, final mbi<?> mbi, final juu juu, final xuu xuu, final mtv mtv, final rsv rsv, final qeu e, final ty8 ty8, final uiu$a uiu$a) {
        super(gob, rnd, jev, nca, rcu, w7t, dsb, qvd, xr3, crt, (mbi)mbi, juu, xuu, mtv, rsv, ty8, uiu$a);
        this.B = b;
        this.C = c;
        this.D = d;
        this.E = e;
    }
    
    public final void F(final String s) {
        final jev e = ((br1)this).e;
        String f = "";
        String e2;
        if (e != null) {
            e2 = ((vyo)e).e;
        }
        else {
            e2 = "";
        }
        if (e != null) {
            f = ((vyo)e).f;
        }
        this.D.e(s, this.B, e2, f);
    }
    
    public final void d(final vo6 vo6, final w5w w5w) {
        w5w a = w5w;
        if (crt.b(w5w.I0)) {
            a = crt.a(w5w, (boolean)this.C.get());
        }
        final qzo o0 = vo6.O0;
        if (o0 != null && pjr.g((CharSequence)o0.f)) {
            final String f = vo6.O0.f;
            ((br1)this).f.d(vo6, a);
        }
        else {
            ((br1)this).f.d(vo6, a);
        }
    }
    
    public final void k(final vo6 vo6, final atu atu) {
        final boolean b = dta.b().b("mte_social_proof_tweet_details_navigation_enabled", false);
        final int n = 1;
        int n2;
        if (b && vo6.H0 == null) {
            n2 = n;
        }
        else {
            n2 = 0;
        }
        if (n2 != 0) {
            this.M(vo6.X2(), atu);
            this.E.h(vo6).k(sfu.J0).l(((br1)this).e).g(false).start();
        }
        else {
            super.k(vo6, atu);
        }
    }
}
