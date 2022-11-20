import com.twitter.onboarding.ocf.NavigationHandler;

// 
// Decompiled by Procyon v0.6.0
// 

public final class x3a implements szd<w3a>
{
    public final NavigationHandler a;
    
    public x3a(final NavigationHandler a) {
        czd.f((Object)a, "navigationHandler");
        this.a = a;
    }
    
    public final void a(final ssr ssr) {
        final int k = ((y3a)((ssr)ssr).b).k;
        Object o;
        if (k != 3) {
            if (k != 4) {
                m8a.d((Throwable)new RuntimeException("Invalid navigation type"));
                o = new d7();
            }
            else {
                o = new d7();
            }
        }
        else {
            o = new tza();
        }
        this.a.e(new ssv((zai)o, "end-flow", null, 28));
    }
    
    public static final class a extends szd$a<w3a>
    {
        public a() {
            super((Class)w3a.class);
        }
    }
    
    public static final class b extends szd$b<w3a>
    {
        public b(final a a, final pwe<x3a> pwe) {
            czd.f((Object)a, "matcher");
            czd.f((Object)pwe, "handler");
            super((szd$a)a, (pwe)pwe);
        }
    }
}
