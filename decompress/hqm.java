import java.util.concurrent.Future;
import android.net.Uri;
import java.util.Locale;
import android.os.SystemClock;
import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hqm extends kmm<pmi, pmi> implements gqm
{
    public final String V0;
    public final UserIdentifier W0;
    public final long X0;
    public boolean Y0;
    public hqm Z0;
    public final gqm$c a1;
    public boolean b1;
    public final int c1;
    public final dca<Double> d1;
    public final String e1;
    public volatile xrc f1;
    
    public hqm(final hqm.hqm$c hqm$c) {
        super(((gqm$a)hqm$c).c);
        this.Y0 = false;
        this.b1 = false;
        this.V0 = ((gqm$a)hqm$c).a;
        UserIdentifier c;
        if (((gqm$a)hqm$c).d) {
            c = ((gqm$a)hqm$c).c;
        }
        else {
            c = null;
        }
        this.W0 = c;
        final int e = ((gqm$a)hqm$c).e;
        this.c1 = e;
        this.e1 = ((gqm$a)hqm$c).f;
        this.d1 = (dca<Double>)((gqm$a)hqm$c).g;
        this.a1 = ((gqm$a)hqm$c).h;
        ((cw0)this).f();
        if (e == 1) {
            ((cw0)this).Q(2);
            ((cw0)this).I();
            ((cw0)this).G((ysm)new xci());
        }
        else if (e == 2 || e == 3) {
            ((cw0)this).Q(7);
            ((cw0)this).K0 = Integer.MAX_VALUE;
            final int a = w4j.a;
        }
        this.X0 = SystemClock.elapsedRealtime();
        this.U((cw0$b)new hqm$a(this));
    }
    
    public final tsc<pmi, pmi> b() {
        tsc a = null;
        Label_0100: {
            if (!this.a1.d()) {
                a = new tsc();
            }
            else {
                final boolean k = xcs.a().k();
                if (this.c1 == 2 && !k) {
                    a = new tsc();
                }
                else {
                    final hqm z0 = this.Z0;
                    if (z0 != null) {
                        final xrc f = ((ksc)z0).T().f;
                        if (f != null && f.z()) {
                            this.Y0 = true;
                            a = tsc.a(f, (wsc)null);
                            break Label_0100;
                        }
                        this.Z0 = null;
                    }
                    a = null;
                }
            }
        }
        if (a != null) {
            return (tsc<pmi, pmi>)a;
        }
        this.b1 = true;
        final int c1 = this.c1;
        final yrc a2 = kwe.a((qmm)this, (CharSequence)this.V0, new nyd(c1 == 2 || c1 == 3, this.e1));
        Object c2;
        if (this.W0 != null) {
            c2 = ldv.c();
        }
        else {
            c2 = null;
        }
        a2.q = (isc)c2;
        final int a3 = w4j.a;
        a2.j = (hsc)new hqm$b(this);
        a2.k = 45000;
        a2.o = this.d1;
        a2.l = true;
        final xrc e = a2.e();
        (this.f1 = e).d();
        return (tsc<pmi, pmi>)tsc.a(e, (wsc)null);
    }
    
    public final Runnable d(final cw0 cw0) {
        if (cw0 instanceof hqm) {
            this.Z0 = (hqm)cw0;
        }
        return null;
    }
    
    public final void e(final ism<tsc<pmi, pmi>> ism) {
        super.e((ism)ism);
        final boolean y0 = this.Y0;
        final int n = 0;
        if (!y0 && ffa.q("resource_fetch_scribe_sample", cro.g).b()) {
            final long elapsedRealtime = SystemClock.elapsedRealtime();
            final long x0 = this.X0;
            final tsc tsc = (tsc)ism.d();
            String s;
            if (tsc.b) {
                s = "success";
            }
            else {
                s = "failure";
            }
            final int size = ism.b().size();
            final zf4 zf4 = new zf4(super.P0);
            zf4.q(new String[] { "app:twitter_service:media:downloaded", s });
            final xcs$a d = xcs.a().d();
            String string;
            if (d.a) {
                if (d.b) {
                    string = "wifi";
                }
                else {
                    final StringBuilder g = w48.g("cellular_");
                    g.append(d.c);
                    string = g.toString();
                }
            }
            else {
                string = "disconnected";
            }
            ici.a(zf4);
            final xsc d2 = tsc.d();
            final xrc f = tsc.f;
            if (d2 != null && f != null) {
                ici.d((d0p)zf4, f.c.toString(), d2);
            }
            zf4.s((long)(size - 1));
            zf4.c = string;
            final int a = w4j.a;
            String name = null;
            Label_0298: {
                if (d2 != null) {
                    final Exception c = d2.c;
                    if (c != null) {
                        name = c.getClass().getName();
                        break Label_0298;
                    }
                }
                name = "none";
            }
            final Locale english = Locale.ENGLISH;
            final boolean n2 = ((cw0)this).N();
            int q;
            if (d2 != null) {
                q = d2.q;
            }
            else {
                q = 0;
            }
            zf4.t = String.format(english, "total_duration_ms:%d,is_canceled:%b,content_length:%d,exception:%s,executed:%b", elapsedRealtime - x0, n2, q, name, this.b1);
            saw.b((okm)zf4);
        }
        final xsc d3 = ((tsc)ism.d()).d();
        final gqm$c a2 = this.a1;
        int a3 = n;
        if (d3 != null) {
            a3 = d3.a;
        }
        a2.c(a3);
    }
    
    public final String l() {
        return Uri.parse(this.V0).getHost();
    }
    
    public final String s() {
        final StringBuilder g = w48.g("resource_fetch_");
        g.append(this.V0);
        g.append(mag.r(this.c1));
        return g.toString();
    }
    
    public final Future<?> start() {
        psc.c().f((ksc)this);
        return (Future<?>)((cw0)this).L();
    }
}
