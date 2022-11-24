import com.twitter.onboarding.ocf.NavigationHandler;

// 
// Decompiled by Procyon v0.6.0
// 

public final class wgd implements u0e<vgd>
{
    public final NavigationHandler a;
    public final r9a b;
    public final tcj c;
    public final igd d;
    
    public wgd(final NavigationHandler a, final r9a b, final tcj c, final igd d) {
        e0e.f((Object)a, "navigationHandler");
        e0e.f((Object)b, "errorReporter");
        e0e.f((Object)c, "activityEventListener");
        e0e.f((Object)d, "inAppMessageManager");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public final void a(final qtr qtr) {
        final bur b = ((qtr)qtr).b;
        e0e.e((Object)b, "subtask.properties");
        final xgd xgd = (xgd)b;
        if (lp7.Y(xgd.j)) {
            this.b.f((Throwable)new IllegalArgumentException("OCF InAppNotification Message is empty"));
        }
        else {
            final q6s$a q6s$a = new q6s$a();
            final pej j = xgd.j;
            e0e.c((Object)j);
            final String f0 = ((fym)j).F0;
            e0e.e((Object)f0, "properties.message!!.text");
            q6s$a.t(f0);
            q6s$a.e = (rfd$c)rfd$c$b.b;
            q6s$a.r("in_app_notification");
            this.c.a((sj)new c(this.d, (dgd)((z4j)q6s$a).e()));
        }
        final NavigationHandler a = this.a;
        final dtv a2 = xgd.a;
        e0e.c((Object)a2);
        a.e(a2);
    }
    
    public static final class a extends u0e.a<vgd>
    {
        public a() {
            super(vgd.class);
        }
    }
    
    public static final class b extends u0e.b<vgd>
    {
        public b(final wgd.a a, final mxe<wgd> mxe) {
            e0e.f((Object)a, "matcher");
            e0e.f((Object)mxe, "handler");
            super(a, mxe);
        }
    }
    
    public static final class c implements sj
    {
        public final igd F0;
        public final dgd G0;
        
        public c(final igd f0, final dgd g0) {
            e0e.f((Object)f0, "messageManager");
            this.F0 = f0;
            this.G0 = g0;
        }
        
        public final void run() {
            this.F0.a(this.G0);
        }
    }
}
