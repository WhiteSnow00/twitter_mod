import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bx2
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
        Companion = new a();
        b = m0n.Z("about_module_main_settings", "website", (String)null, 12);
        c = m0n.Z("about_module_main_settings", "address", (String)null, 12);
        d = m0n.Z("about_module_main_settings", "hours", (String)null, 12);
        e = m0n.Z("about_module_main_settings", "email", (String)null, 12);
        f = m0n.Z("about_module_main_settings", "phone", (String)null, 12);
        g = m0n.Z("about_module_main_settings", "display_map", (String)null, 12);
        h = m0n.v0("about_module_main_settings", "fetch_maps_url");
        i = m0n.w0("about_module_main_settings", "fetch_maps_url");
        j = m0n.u0("about_module_main_settings", "fetch_maps_url");
    }
    
    public bx2(final UserIdentifier a) {
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
    }
}
