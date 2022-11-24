import java.util.Objects;
import com.twitter.onboarding.ocf.NavigationHandler;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anj implements u0e<zmj>
{
    public static final anj.anj$a Companion;
    public final NavigationHandler a;
    public final fci<?> b;
    
    static {
        Companion = new anj.anj$a();
    }
    
    public anj(final NavigationHandler a, final fci<?> b) {
        e0e.f((Object)a, "navigationHandler");
        e0e.f((Object)b, "navigator");
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void a(final qtr qtr) {
        final bur b = ((qtr)qtr).b;
        e0e.e((Object)b, "subtask.properties");
        final bnj bnj = (bnj)b;
        Objects.requireNonNull(anj.Companion);
        final afj f = ((bur)bnj).f;
        i3a c;
        if (f.a == null && f.b == null) {
            c = null;
        }
        else {
            final i3a$a i3a$a = new i3a$a();
            final dtv j = bnj.j;
            if (j != null) {
                final String c2 = j.c;
                if (c2 != null) {
                    final qbi a = j.a;
                    e0e.d((Object)a, "null cannot be cast to non-null type com.twitter.model.core.entity.onboarding.navigationlink.DeepLinkNavigationLink");
                    i3a$a.d = ((y9)a).b;
                    i3a$a.c = lfs.a(c2);
                }
            }
            final pej a2 = ((bur)bnj).f.a;
            pej n0 = pej.N0;
            fym fym;
            if ((fym = (fym)a2) == null) {
                fym = (fym)n0;
            }
            final tx6 a3 = lfs.a;
            i3a$a.a = (lfs)new hym(fym);
            final pej b2 = ((bur)bnj).f.b;
            if (b2 != null) {
                n0 = b2;
            }
            i3a$a.b = (lfs)new hym((fym)n0);
            final sfv$a sfv$a = new sfv$a();
            ((f0p$a)sfv$a).d = "home";
            final int a4 = o5j.a;
            ((f0p$a)sfv$a).e = "open_home_timeline";
            ((f0p$a)sfv$a).f = "";
            i3a$a.g = (sfv)((z4j)sfv$a).e();
            c = (i3a)((z4j)i3a$a).e();
        }
        final fgg$a fgg$a = new fgg$a();
        fgg$a.b = pgg.H0.F0;
        fgg$a.c = c;
        fgg$a.e = true;
        final fgg fgg = (fgg)((z4j)fgg$a).e();
        final NavigationHandler a5 = this.a;
        final dtv a6 = ((bur)bnj).a;
        e0e.c((Object)a6);
        a5.e(a6);
        this.b.i((cn)fgg, new xbi(3, 2));
    }
    
    public static final class b extends a<zmj>
    {
        public b() {
            super(zmj.class);
        }
    }
    
    public static final class c extends u0e.b<zmj>
    {
        public c(final anj.b b, final mxe<anj> mxe) {
            e0e.f((Object)b, "matcher");
            e0e.f((Object)mxe, "handler");
            super(b, mxe);
        }
    }
}
