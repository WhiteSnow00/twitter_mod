import com.twitter.onboarding.ocf.analytics.OcfEventReporter;
import java.util.Locale;

// 
// Decompiled by Procyon v0.6.0
// 

public final class in0 extends ste implements qsb<bo, fzv>
{
    public final fn0 D0;
    public final Locale E0;
    public final ssv F0;
    public final w9h G0;
    
    public in0(final fn0 d0, final Locale e0, final ssv f0, final w9h g0) {
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final bo bo = (bo)o;
        czd.f((Object)bo, "result");
        if (bo.b == 0) {
            this.D0.b.h(this.E0);
            this.D0.e.e(this.F0);
            final OcfEventReporter f = this.D0.f;
            final af4 af4 = new af4();
            final vba$a companion = vba.Companion;
            final daa j = saa.j;
            czd.e((Object)j, "APP_LOCALE_UPDATE_PREFIX");
            ((u0p)af4).T = companion.b((baa)j, "user_confirmation", "reject").toString();
            final int a = c5j.a;
            f.b(af4, (String)null);
        }
        else {
            this.D0.e.k();
            this.G0.h();
            final OcfEventReporter f2 = this.D0.f;
            final af4 af5 = new af4();
            final vba$a companion2 = vba.Companion;
            final daa i = saa.j;
            czd.e((Object)i, "APP_LOCALE_UPDATE_PREFIX");
            ((u0p)af5).T = companion2.b((baa)i, "user_confirmation", "accept").toString();
            final int a2 = c5j.a;
            f2.b(af5, (String)null);
        }
        return fzv.a;
    }
}
