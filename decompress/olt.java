import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class olt
{
    public final UserIdentifier a;
    public final sbw b;
    public final sfv c;
    
    public olt(final UserIdentifier a, final sbw b, final sfv c) {
        e0e.f((Object)a, "currentUser");
        e0e.f((Object)b, "eventReporter");
        e0e.f((Object)c, "scribeAssociation");
        this.a = a;
        this.b = b;
        this.c = c;
    }
}
