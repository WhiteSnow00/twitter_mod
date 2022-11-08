import kotlin.NoWhenBranchMatchedException;
import java.lang.ref.WeakReference;
import java.util.Objects;
import com.twitter.onboarding.ocf.analytics.OcfEventReporter;
import com.twitter.onboarding.ocf.NavigationHandler;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dlj
{
    public final Activity a;
    public final z5c b;
    public final fxe<u5c> c;
    public final NavigationHandler d;
    public final e9a e;
    public final OcfEventReporter f;
    public final a77 g;
    
    public dlj(final Activity a, final z7x z7x, final z5c b, final fxe<u5c> c, final NavigationHandler d, final e9a e, final OcfEventReporter f, final a77 g) {
        zzd.f((Object)a, "activity");
        zzd.f((Object)z7x, "viewLifecycle");
        zzd.f((Object)b, "googleOneTapManager");
        zzd.f((Object)c, "googleOneTapClient");
        zzd.f((Object)d, "navigationHandler");
        zzd.f((Object)e, "errorReporter");
        zzd.f((Object)f, "ocfEventReporter");
        zzd.f((Object)g, "credentialStash");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        final b5j filter = ((raf)z7x).a().filter((ptk)new dzf((rtb)dlj$a.C0, 14));
        zzd.e((Object)filter, "viewLifecycle.observe()\n\u2026LifecycleEvent.ON_FOCUS }");
        final m29 m29;
        m29.c(filter.doOnComplete((rj)new dlj$e(m29 = new m29())).subscribe((fk6)new f$l2((rtb)new rtb<a8x, oyv>() {
            public final /* synthetic */ dlj C0;
            
            public final Object invoke(final Object o) {
                final a8x a8x = (a8x)o;
                final dlj c0 = this.C0;
                final z5c b = c0.b;
                Objects.requireNonNull(b);
                final WeakReference b2 = b.b;
                dlj dlj;
                if (b2 != null) {
                    dlj = (dlj)b2.get();
                }
                else {
                    dlj = null;
                }
                if (!zzd.a((Object)c0, (Object)dlj)) {
                    b.b = new WeakReference((T)c0);
                    if (b.a) {
                        b.a = false;
                        b.a();
                    }
                }
                return oyv.a;
            }
        })));
        final m29 m30;
        m30.c(z7x.o().doOnComplete((rj)new dlj$g(m30 = new m29())).subscribe((fk6)new f$l2((rtb)new rtb<pmi, oyv>() {
            public final /* synthetic */ dlj C0;
            
            public final Object invoke(final Object o) {
                final pmi pmi = (pmi)o;
                final dlj c0 = this.C0;
                final z5c b = c0.b;
                Objects.requireNonNull(b);
                final WeakReference b2 = b.b;
                dlj dlj;
                if (b2 != null) {
                    dlj = (dlj)b2.get();
                }
                else {
                    dlj = null;
                }
                if (zzd.a((Object)c0, (Object)dlj)) {
                    b.b = null;
                }
                return oyv.a;
            }
        })));
        final glj c2 = b.c;
        if (c2 != null) {
            this.b(c2, true);
        }
    }
    
    public final void a(final Throwable t, final ilj ilj) {
        zzd.f((Object)t, "error");
        this.b.d.invoke();
        this.e.f(t);
        this.f.b(new zf4(new nca("onboarding", "splash_screen", "one_tap", "dialog", "error")), t.getMessage());
        if (ilj != null) {
            final xrv c = ((lsr)ilj).c;
            if (c != null) {
                this.d.e(c);
            }
        }
    }
    
    public final void b(final glj glj, final boolean b) {
        if (xpa.b().a()) {
            final u5c u5c = (u5c)this.c.get();
            final lsr b2 = glj.b;
            zzd.e((Object)b2, "oneTapSubtask.properties");
            u5c.b((w5c)new x5c((ilj)b2), (rtb)new rtb<a6c, oyv>() {
                public final /* synthetic */ dlj C0;
                
                public final Object invoke(final Object o) {
                    final a6c a6c = (a6c)o;
                    zzd.f((Object)a6c, "it");
                    final dlj c0 = this.C0;
                    final glj d0 = glj;
                    Objects.requireNonNull(c0);
                    zzd.f((Object)d0, "subtask");
                    ((u5c)c0.c.get()).a((otb)elj.C0, (rtb)new flj(c0, d0));
                    y5c y5c;
                    if (a6c instanceof a6c.b) {
                        final y5c$b companion = y5c.Companion;
                        final String a = ((a6c.b)a6c).a;
                        final String k = ((ilj)d0.b).k;
                        Objects.requireNonNull(companion);
                        zzd.f((Object)a, "idToken");
                        zzd.f((Object)k, "state");
                        y5c = new y5c(a, k, "sso");
                    }
                    else {
                        if (!(a6c instanceof a6c.a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        final a77 g = c0.g;
                        final a6c.a a2 = (a6c.a)a6c;
                        g.b(a2.a, a2.b);
                        final y5c$b companion2 = y5c.Companion;
                        final String i = ((ilj)d0.b).k;
                        Objects.requireNonNull(companion2);
                        zzd.f((Object)i, "state");
                        y5c = new y5c((String)null, i, "saved_password");
                    }
                    final NavigationHandler d2 = c0.d;
                    final xrv j = ((ilj)d0.b).j;
                    if (j != null) {
                        d2.d(new mrd(j, (prd)y5c), d0.a);
                        c0.b.d.invoke();
                        return oyv.a;
                    }
                    throw new IllegalArgumentException("Expected javaClass to have non-null success link".toString());
                }
            }, (rtb)new rtb<Exception, oyv>() {
                public final /* synthetic */ dlj C0;
                
                public final Object invoke(final Object o) {
                    final Exception ex = (Exception)o;
                    zzd.f((Object)ex, "it");
                    this.C0.a(ex, (ilj)glj.b);
                    return oyv.a;
                }
            }, (otb)new dlj$b((Object)this), b);
            if (!b) {
                this.f.b(new zf4(new nca("onboarding", "splash_screen", "one_tap", "dialog", "impression")), (String)null);
            }
        }
        else {
            this.f.b(new zf4(new nca("onboarding", "splash_screen", "", "play_services", "unavailable")), (String)null);
            this.a(new IllegalStateException("Play services is not available"), null);
        }
    }
}
