import java.util.concurrent.atomic.AtomicLong;
import com.twitter.util.user.UserIdentifier;
import java.util.Objects;
import android.content.Context;
import java.util.concurrent.Callable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fzi implements Callable<Integer>
{
    public final Context C0;
    public final hfv D0;
    public final boolean E0;
    public final mlw F0;
    public final gzm G0;
    
    public fzi(final Context c0, final hfv d0, final boolean e0, final mlw f0, final gzm g0) {
        this.C0 = c0;
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
    }
    
    public final int a(final Context context, final hfv hfv, final int a, final gzm gzm) {
        final UserIdentifier f = hfv.f();
        Objects.requireNonNull(this.F0);
        mlw.n(f, a, "started");
        final UserIdentifier f2 = hfv.f();
        final qll j2 = aav.J2(f2);
        final aws$a aws$a = new aws$a();
        aws$a.c = hfv.C0;
        aws$a.a = a;
        final zyi zyi = new zyi(context, f2, a, 2, k98.b(j2, (aws)((h4j)aws$a).e()), (aav)((hcq)j2).C0);
        final xsc d = ((ksc)zyi).R().d();
        int a2;
        if (d == null) {
            a2 = 0;
        }
        else {
            a2 = d.a;
        }
        if (a2 == 200) {
            Objects.requireNonNull(this.F0);
            mlw.n(f, a, "success");
            final xau$c i = wau.e(UserIdentifier.fromId(f.getId()), "activity_times").i();
            final t3s a3 = mq1.a;
            i.c("last_activity_sync", System.currentTimeMillis()).e();
            return ((rpv)zyi).y1.c;
        }
        Objects.requireNonNull(this.F0);
        mlw.n(f, a, "fail");
        if (a2 == 0) {
            ((AtomicLong)gzm.D0).incrementAndGet();
        }
        else if (a2 == 401) {
            ((AtomicLong)gzm.C0).incrementAndGet();
        }
        return 0;
    }
    
    @Override
    public final Object call() throws Exception {
        final Context c0 = this.C0;
        final hfv d0 = this.D0;
        final gzm g0 = this.G0;
        final int a = this.a(c0, d0, 7, g0);
        int n;
        if (!this.E0 && a > 0) {
            final wts wts = new wts(aav.J2(d0.f()));
            final aws$a aws$a = new aws$a();
            aws$a.c = d0.C0;
            aws$a.a = 7;
            n = (int)wts.i((aws)((h4j)aws$a).e());
        }
        else {
            n = 0;
        }
        this.a(c0, d0, 8, g0);
        if (d0.M0) {
            this.a(c0, d0, 9, g0);
        }
        final Boolean z1 = d0.z1;
        final Boolean false = Boolean.FALSE;
        Boolean b;
        if ((b = z1) == null) {
            b = false;
        }
        if (b && dta.b().b("android_ntab_super_followers_tab_enabled", false)) {
            this.a(c0, d0, 6, g0);
        }
        final UserIdentifier f = d0.f();
        final int a2 = mm7.a;
        ((ksc)new g0w(c0, d0.f(), nm7.Companion.a(f).L())).R();
        return n;
    }
}
