import java.util.concurrent.atomic.AtomicLong;
import com.twitter.util.user.UserIdentifier;
import java.util.Objects;
import android.content.Context;
import java.util.concurrent.Callable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lzi implements Callable<Integer>
{
    public final Context D0;
    public final cgv E0;
    public final boolean F0;
    public final nza G0;
    public final m53 H0;
    
    public lzi(final Context d0, final cgv e0, final boolean f0, final nza g0, final m53 h0) {
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
    }
    
    public final int a(final Context context, final cgv cgv, final int a, final m53 m53) {
        final UserIdentifier f = cgv.f();
        Objects.requireNonNull(this.G0);
        nza.Q1(f, a, "started");
        final UserIdentifier f2 = cgv.f();
        final dml i2 = vav.I2(f2);
        final mws$a mws$a = new mws$a();
        mws$a.c = cgv.D0;
        mws$a.a = a;
        final fzi fzi = new fzi(context, f2, a, 2, u88.b(i2, (mws)((n4j)mws$a).e()), (vav)((ycq)i2).D0);
        final bsc d = ((orc)fzi).R().d();
        int a2;
        if (d == null) {
            a2 = 0;
        }
        else {
            a2 = d.a;
        }
        if (a2 == 200) {
            Objects.requireNonNull(this.G0);
            nza.Q1(f, a, "success");
            final qbu$c j = pbu.e(UserIdentifier.fromId(f.getId()), "activity_times").i();
            final m4s a3 = hq1.a;
            j.c("last_activity_sync", System.currentTimeMillis()).e();
            return fzi.z1.c;
        }
        Objects.requireNonNull(this.G0);
        nza.Q1(f, a, "fail");
        if (a2 == 0) {
            ((AtomicLong)m53.F0).incrementAndGet();
        }
        else if (a2 == 401) {
            ((AtomicLong)m53.E0).incrementAndGet();
        }
        return 0;
    }
    
    @Override
    public final Object call() throws Exception {
        final Context d0 = this.D0;
        final cgv e0 = this.E0;
        final m53 h0 = this.H0;
        final int a = this.a(d0, e0, 7, h0);
        int n;
        if (!this.F0 && a > 0) {
            final nus nus = new nus(vav.I2(e0.f()));
            final mws$a mws$a = new mws$a();
            mws$a.c = e0.D0;
            mws$a.a = 7;
            n = (int)nus.i((mws)((n4j)mws$a).e());
        }
        else {
            n = 0;
        }
        this.a(d0, e0, 8, h0);
        if (e0.N0) {
            this.a(d0, e0, 9, h0);
        }
        final Boolean a2 = e0.A1;
        final Boolean false = Boolean.FALSE;
        Boolean b;
        if ((b = a2) == null) {
            b = false;
        }
        if (b && asa.b().b("android_ntab_super_followers_tab_enabled", false)) {
            this.a(d0, e0, 6, h0);
        }
        final UserIdentifier f = e0.f();
        final int a3 = tl7.a;
        ((orc)new w0w(d0, e0.f(), ul7.Companion.a(f).L())).R();
        return n;
    }
}
