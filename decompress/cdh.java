import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cdh
{
    public static final a Companion;
    public static final nca b;
    public static final nca c;
    public static final nca d;
    public final UserIdentifier a;
    
    static {
        Companion = new a();
        b = m0n.Y("mobile_app_module_configuration", (String)null, "discard", 10);
        c = m0n.Z("mobile_app_module_configuration", "discard", "cancel", 8);
        d = m0n.Z("mobile_app_module_configuration", "discard", "confirm", 8);
    }
    
    public cdh(final UserIdentifier a) {
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
