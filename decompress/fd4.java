import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fd4
{
    public static final a Companion;
    public final UserIdentifier a;
    public final String b;
    
    static {
        Companion = new a();
    }
    
    public fd4(final UserIdentifier a, final String b) {
        zzd.f((Object)a, "userIdentifier");
        zzd.f((Object)b, "page");
        this.a = a;
        this.b = b;
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
