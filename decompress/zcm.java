import android.os.Looper;
import com.twitter.util.user.UserIdentifier;
import android.content.Context;
import java.util.List;
import android.os.Handler;
import android.net.Uri;

// 
// Decompiled by Procyon v0.6.0
// 

public final class zcm extends qn1
{
    public long I0;
    public final Uri J0;
    public final l1h K0;
    public final Handler L0;
    public final b2h M0;
    public int N0;
    public final tg4 O0;
    public final psc P0;
    public final List<c2h> Q0;
    public f4r R0;
    public elb S0;
    
    public zcm(final Context context, final UserIdentifier userIdentifier, final Uri j0, final l1h k0, final b2h m0, final q1h q1h, final dca<wgl> dca, final psc p9, final List<c2h> q0) {
        super(context, userIdentifier, q1h, (dca)dca);
        this.I0 = -1L;
        this.L0 = new Handler(Looper.getMainLooper());
        this.N0 = 20;
        this.J0 = j0;
        this.K0 = k0;
        this.M0 = m0;
        this.O0 = new tg4(wg4.X0, (tg4)null);
        this.P0 = p9;
        this.Q0 = q0;
    }
    
    public final void a() {
        super.a();
        final elb s0 = this.S0;
        if (s0 != null) {
            this.L0.removeCallbacks((Runnable)s0);
        }
        final f4r r0 = this.R0;
        if (r0 != null) {
            final kw0 h0 = ((cw0)r0).H0;
            synchronized (h0) {
                final boolean b = h0.a == 4;
                monitorexit(h0);
                if (b) {
                    ((jh0)this.R0).e0();
                }
            }
        }
        final s1h s1h = new s1h(tsc.c(1005, "Error: upload cancelled"), (kvg)null, this.I0);
        s1h.k = true;
        this.f(s1h);
    }
    
    public final void e() {
        super.G0 = 2;
        this.c(250);
        final e4r r0 = new e4r(super.C0, super.D0, this.J0, this.K0, (List)this.Q0, this.M0);
        this.R0 = (f4r)r0;
        ((j1p$a)((kmm)r0).Y()).b(this.O0);
        final f4r r2 = this.R0;
        r2.n1 = (f4r.a)new lo((Object)this, 13);
        this.P0.f((ksc)r2);
    }
    
    public final void f(final s1h s1h) {
        xca.a().b(super.D0, (okm)new sg4((ug4)((h4j)this.O0).e()));
        super.f(s1h);
    }
    
    public final void h(final int n) {
        final int n2 = this.N0 - 1;
        this.N0 = n2;
        if (n2 == 0) {
            this.f(new s1h((tsc)new s1h((kvg)null, 1005, new Exception("too many status polls")), (kvg)null, this.I0));
            return;
        }
        final elb s0 = new elb((Object)this, 3);
        this.S0 = s0;
        this.L0.postDelayed((Runnable)s0, Math.max(n, 0) * 1000L);
    }
    
    public final void i(final String s) {
        final b0p b0p = new b0p();
        b0p.d(0, (Object)this.K0.D0);
        b0p.g(this.J0);
        b0p.d(3, (Object)this.M0.D0);
        this.b("segmented_uploader", "url_async_upload", s, b0p);
    }
}
