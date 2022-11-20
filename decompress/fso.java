import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fso
{
    public static final a Companion;
    public final UserIdentifier a;
    public final cbw b;
    
    static {
        Companion = new a();
    }
    
    public fso(final UserIdentifier a, final cbw b) {
        czd.f((Object)a, "userIdentifier");
        czd.f((Object)b, "eventReporter");
        this.a = a;
        this.b = b;
    }
    
    public static final class a
    {
    }
}
