import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class u13
{
    public static final a Companion;
    public static final dda b;
    public static final dda c;
    public static final dda d;
    public static final dda e;
    public static final dda f;
    public static final dda g;
    public static final dda h;
    public static final dda i;
    public final UserIdentifier a;
    
    static {
        Companion = new a();
        b = shw.L("about_module_timezone_settings", (String)null, "list", 10);
        c = shw.L("about_module_country_settings", (String)null, "list", 10);
        d = shw.L("link_module_cta_settings", (String)null, "list", 10);
        e = shw.L("shop_module_currency_code_settings", (String)null, "list", 10);
        f = shw.u("about_module_timezone_settings", (String)null, "row", 6);
        g = shw.u("about_module_country_settings", (String)null, "row", 6);
        h = shw.u("link_module_cta_settings", (String)null, "row", 6);
        i = shw.u("shop_module_currency_code_settings", (String)null, "row", 6);
    }
    
    public u13(final UserIdentifier a) {
        e0e.f((Object)a, "userIdentifier");
        this.a = a;
    }
    
    public final void a(final dda dda) {
        final fg4 fg4 = new fg4(dda);
        ((o1p)fg4).r = this.a;
        final int a = o5j.a;
        sbw.b((tlm)fg4);
    }
    
    public static final class a
    {
    }
}
