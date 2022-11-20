import com.twitter.onboarding.ocf.NavigationHandler;

// 
// Decompiled by Procyon v0.6.0
// 

public final class nmj implements szd<mmj>
{
    public final NavigationHandler a;
    public final uaq<nzo, msm<tmi, kbv>> b;
    
    public nmj(final NavigationHandler a, final uaq<nzo, msm<tmi, kbv>> b) {
        czd.f((Object)a, "navigationHandler");
        czd.f((Object)b, "callbackDataSource");
        this.a = a;
        this.b = b;
    }
    
    public final void a(final ssr ssr) {
        final mmj mmj = (mmj)ssr;
        if (ikr.g((CharSequence)((omj)((ssr)mmj).b).k)) {
            final uaq<nzo, msm<tmi, kbv>> b = this.b;
            final String k = ((omj)((ssr)mmj).b).k;
            czd.c((Object)k);
            b.R((Object)new nzo(k)).c((ecq)new tp1());
        }
        this.a.e(((omj)((ssr)mmj).b).j);
    }
    
    public static final class a extends szd$a<mmj>
    {
        public a() {
            super((Class)mmj.class);
        }
    }
    
    public static final class b extends szd$b<mmj>
    {
        public b(final a a, final pwe<nmj> pwe) {
            czd.f((Object)a, "matcher");
            czd.f((Object)pwe, "handler");
            super((szd$a)a, (pwe)pwe);
        }
    }
}
