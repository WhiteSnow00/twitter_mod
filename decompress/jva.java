import com.twitter.onboarding.ocf.NavigationHandler;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jva implements szd<kva>
{
    public final NavigationHandler a;
    public final e67 b;
    
    public jva(final NavigationHandler a, final e67 b) {
        czd.f((Object)a, "navigationHandler");
        czd.f((Object)b, "credentialStash");
        this.a = a;
        this.b = b;
    }
    
    public final void a(final ssr ssr) {
        final dtr b = ((ssr)ssr).b;
        czd.e((Object)b, "subtask.properties");
        final mva mva = (mva)b;
        final int ordinal = ((Enum)mva.j).ordinal();
        Object o;
        if (ordinal != 1) {
            if (ordinal != 2) {
                o = null;
            }
            else {
                o = this.b(mva.j, this.b.c());
            }
        }
        else {
            o = this.b(mva.j, this.b.a());
        }
        if (o == null) {
            final NavigationHandler a = this.a;
            final ssv b2 = ((dtr)mva).b;
            czd.c((Object)b2);
            a.d(new pqd(b2, (tqd)null), (String)null);
        }
        else {
            final NavigationHandler a2 = this.a;
            final ssv a3 = ((dtr)mva).a;
            czd.c((Object)a3);
            a2.d(new pqd(a3, (tqd)o), (String)null);
        }
    }
    
    public final lva b(final mva$b mva$b, final String s) {
        lva lva;
        if (s == null || vkr.V((CharSequence)s)) {
            lva = null;
        }
        else {
            lva = new lva(mva$b, s);
        }
        return lva;
    }
    
    public static final class a extends szd$a<kva>
    {
        public a() {
            super((Class)kva.class);
        }
    }
    
    public static final class b extends szd$b<kva>
    {
        public b(final a a, final pwe<jva> pwe) {
            czd.f((Object)a, "matcher");
            czd.f((Object)pwe, "handler");
            super((szd$a)a, (pwe)pwe);
        }
    }
}
