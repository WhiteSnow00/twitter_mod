import java.util.concurrent.TimeUnit;
import com.twitter.onboarding.ocf.NavigationHandler;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pix implements u0e<oix>
{
    public final NavigationHandler a;
    
    public pix(final NavigationHandler a) {
        e0e.f((Object)a, "navigationHandler");
        this.a = a;
    }
    
    @Override
    public final void a(final qtr qtr) {
        final oix oix = (oix)qtr;
        final NavigationHandler a = this.a;
        final dtv n = ((mix)((qtr)oix).b).n;
        e0e.e((Object)n, "properties.nextLink");
        final rrd rrd = new rrd(n, (vrd)null);
        final int j = ((mix)((qtr)oix).b).j;
        a.k();
        yz5.u((long)j, TimeUnit.MILLISECONDS).n(iqs.j()).q((sj)new u52((Object)a, (Object)rrd, 3));
    }
    
    public static final class a extends u0e.a<oix>
    {
        public a() {
            super(oix.class);
        }
    }
    
    public static final class b extends u0e.b<oix>
    {
        public b(final pix.a a, final mxe<pix> mxe) {
            e0e.f((Object)a, "matcher");
            e0e.f((Object)mxe, "handler");
            super(a, mxe);
        }
    }
}
