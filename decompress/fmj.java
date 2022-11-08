import java.util.Objects;
import com.twitter.onboarding.ocf.NavigationHandler;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fmj implements p0e<emj>
{
    public static final a Companion;
    public final NavigationHandler a;
    public final mbi<?> b;
    
    static {
        Companion = new a();
    }
    
    public fmj(final NavigationHandler a, final mbi<?> b) {
        zzd.f((Object)a, "navigationHandler");
        zzd.f((Object)b, "navigator");
        this.a = a;
        this.b = b;
    }
    
    public final void a(final asr asr) {
        final lsr b = asr.b;
        zzd.e((Object)b, "subtask.properties");
        final gmj gmj = (gmj)b;
        Objects.requireNonNull(fmj.Companion);
        final iej f = gmj.f;
        w2a c;
        if (f.a == null && f.b == null) {
            c = null;
        }
        else {
            final w2a$a w2a$a = new w2a$a();
            final xrv j = gmj.j;
            if (j != null) {
                final String c2 = j.c;
                if (c2 != null) {
                    final xai a = j.a;
                    zzd.d((Object)a, "null cannot be cast to non-null type com.twitter.model.core.entity.onboarding.navigationlink.DeepLinkNavigationLink");
                    w2a$a.d = ((aa)a).b;
                    w2a$a.c = yds.a(c2);
                }
            }
            final xdj a2 = gmj.f.a;
            xdj k0 = xdj.K0;
            xwm xwm;
            if ((xwm = (xwm)a2) == null) {
                xwm = (xwm)k0;
            }
            final jx6 a3 = yds.a;
            w2a$a.a = (yds)new zwm(xwm);
            final xdj b2 = gmj.f.b;
            if (b2 != null) {
                k0 = b2;
            }
            w2a$a.b = (yds)new zwm((xwm)k0);
            final jev$a jev$a = new jev$a();
            ((vyo.a)jev$a).d = "home";
            final int a4 = w4j.a;
            ((vyo.a)jev$a).e = "open_home_timeline";
            ((vyo.a)jev$a).f = "";
            w2a$a.g = (jev)((h4j)jev$a).e();
            c = (w2a)((h4j)w2a$a).e();
        }
        final vfg$a vfg$a = new vfg$a();
        vfg$a.b = fgg.E0.C0;
        vfg$a.c = c;
        vfg$a.e = true;
        final vfg vfg = (vfg)((h4j)vfg$a).e();
        final NavigationHandler a5 = this.a;
        final xrv a6 = gmj.a;
        zzd.c((Object)a6);
        a5.e(a6);
        this.b.i((zm)vfg, new ebi(3, 2));
    }
    
    public static final class a
    {
    }
    
    public static final class b extends p0e$a<emj>
    {
        public b() {
            super((Class)emj.class);
        }
    }
    
    public static final class c extends p0e$b<emj>
    {
        public c(final b b, final fxe<fmj> fxe) {
            zzd.f((Object)b, "matcher");
            zzd.f((Object)fxe, "handler");
            super((p0e$a)b, (fxe)fxe);
        }
    }
}
