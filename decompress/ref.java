import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ref
{
    public static final a Companion;
    public static final nca b;
    public static final nca c;
    public final UserIdentifier a;
    
    static {
        Companion = new a();
        b = m0n.Z("link_module_settings", (String)null, "url", 10);
        c = m0n.Z("link_module_settings", (String)null, "cta", 10);
    }
    
    public ref(final UserIdentifier a) {
        zzd.f((Object)a, "userIdentifier");
        this.a = a;
    }
    
    public static final class a
    {
    }
}
