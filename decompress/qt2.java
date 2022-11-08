import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class qt2
{
    public static final a Companion;
    public static final nca b;
    public static final nca c;
    public static final nca d;
    public static final nca e;
    public static final nca f;
    public static final nca g;
    public static final nca h;
    public static final nca i;
    public static final nca j;
    public final UserIdentifier a;
    
    static {
        final a a = Companion = new a();
        b = m0n.Y("about_module_address_settings", (String)null, (String)null, 14);
        c = qt2.a.a(a, null, "done", 1);
        d = qt2.a.a(a, "street_address", null, 2);
        e = qt2.a.a(a, "zipcode", null, 2);
        f = qt2.a.a(a, "city", null, 2);
        g = qt2.a.a(a, "state", null, 2);
        h = qt2.a.a(a, "country", null, 2);
        i = m0n.K("about_module_address_settings", "discard_confirmation", "confirm", 2);
        j = m0n.K("about_module_address_settings", "discard_confirmation", "cancel", 2);
    }
    
    public qt2(final UserIdentifier a) {
        zzd.f((Object)a, "userIdentifier");
        this.a = a;
    }
    
    public final void a(final nca nca) {
        final zf4 zf4 = new zf4(nca);
        zf4.r = this.a;
        final int a = w4j.a;
        saw.b((okm)zf4);
    }
    
    public static final class a
    {
        public static nca a(final a a, String s, String s2, final int n) {
            if ((n & 0x1) != 0x0) {
                s = "";
            }
            if ((n & 0x2) != 0x0) {
                s2 = "";
            }
            return m0n.K("about_module_address_settings", s, s2, 2);
        }
    }
}
