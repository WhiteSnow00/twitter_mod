import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hli
{
    public static final a Companion;
    public final UserIdentifier a;
    public final kba b;
    public final dda c;
    public final dda d;
    
    static {
        Companion = new a();
    }
    
    public hli(final qda qda, final UserIdentifier a) {
        e0e.f((Object)a, "userIdentifier");
        this.a = a;
        final iba a2 = iba.Companion.a(qda, "no_module");
        this.b = (kba)a2;
        final dda.a companion = dda.Companion;
        this.c = companion.b(a2, "", "impression");
        this.d = companion.b(a2, "cta_configure", "click");
    }
    
    public static final class a
    {
    }
}
