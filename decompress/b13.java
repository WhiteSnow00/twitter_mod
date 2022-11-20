import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class b13
{
    public static final a Companion;
    public static final vba b;
    public static final vba c;
    public static final vba d;
    public static final vba e;
    public static final vba f;
    public static final vba g;
    public static final vba h;
    public static final vba i;
    public final UserIdentifier a;
    
    static {
        Companion = new a();
        b = nza.f1("about_module_timezone_settings", (String)null, "list", 10);
        c = nza.f1("about_module_country_settings", (String)null, "list", 10);
        d = nza.f1("link_module_cta_settings", (String)null, "list", 10);
        e = nza.f1("shop_module_currency_code_settings", (String)null, "list", 10);
        f = nza.K0("about_module_timezone_settings", (String)null, "row", 6);
        g = nza.K0("about_module_country_settings", (String)null, "row", 6);
        h = nza.K0("link_module_cta_settings", (String)null, "row", 6);
        i = nza.K0("shop_module_currency_code_settings", (String)null, "row", 6);
    }
    
    public b13(final UserIdentifier a) {
        czd.f((Object)a, "userIdentifier");
        this.a = a;
    }
    
    public final void a(final vba vba) {
        final af4 af4 = new af4(vba);
        ((u0p)af4).r = this.a;
        final int a = c5j.a;
        cbw.b((elm)af4);
    }
    
    public static final class a
    {
    }
}
