import android.app.Activity;
import com.twitter.app.dynamicdelivery.manager.DynamicDeliveryInstallManager;
import com.twitter.onboarding.ocf.analytics.OcfEventReporter;
import java.util.Locale;

// 
// Decompiled by Procyon v0.6.0
// 

public final class on0 extends gue implements rtb<ro9, oyv>
{
    public final /* synthetic */ kn0 C0;
    public final /* synthetic */ u9h D0;
    public final /* synthetic */ xrv E0;
    public final /* synthetic */ Locale F0;
    public final /* synthetic */ qn0 G0;
    
    public on0(final kn0 c0, final u9h d0, final xrv e0, final Locale f0, final qn0 g0) {
        this.C0 = c0;
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final ro9 ro9 = (ro9)o;
        if (ro9 instanceof ro9$b) {
            this.C0.e.k();
            this.D0.h();
        }
        else if (ro9 instanceof ro9$c) {
            int n;
            String s;
            if (ro9 instanceof ro9$c.a) {
                n = 2131955538;
                s = "download";
            }
            else {
                n = 2131955539;
                s = "unknown";
            }
            this.C0.e.h();
            this.C0.h.b(n, 1);
            this.C0.e.e(this.E0);
            final OcfEventReporter f = this.C0.f;
            final zf4 zf4 = new zf4();
            final nca$a companion = nca.Companion;
            final uaa j = jba.j;
            zzd.e((Object)j, "APP_LOCALE_UPDATE_PREFIX");
            zf4.T = companion.b((taa)j, "error", s).toString();
            final int a = w4j.a;
            f.b(zf4, (String)null);
        }
        else if (ro9 instanceof ro9$e) {
            this.D0.i();
            this.C0.e.h();
            this.C0.b.h(this.F0);
            this.C0.d.b(this.F0, this.G0.k);
            this.C0.e.e(this.E0);
            ((cah)this.C0.g).h(this.D0);
        }
        else if (ro9 instanceof ro9$g) {
            final kn0 c0 = this.C0;
            ro.b(c0.i, 1, (rtb)new nn0(c0, this.F0, this.E0, this.D0));
            this.D0.i();
            this.C0.e.h();
            final kn0 c2 = this.C0;
            final DynamicDeliveryInstallManager b = c2.b;
            final Activity a2 = c2.a;
            zzd.e((Object)ro9, "event");
            b.d(a2, (ro9$g)ro9);
            final OcfEventReporter f2 = this.C0.f;
            final zf4 zf5 = new zf4();
            final nca$a companion2 = nca.Companion;
            final uaa i = jba.j;
            zzd.e((Object)i, "APP_LOCALE_UPDATE_PREFIX");
            zf5.T = companion2.b((taa)i, "user_confirmation", "show").toString();
            final int a3 = w4j.a;
            f2.b(zf5, (String)null);
        }
        return oyv.a;
    }
}
