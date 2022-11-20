import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class d6k extends ste implements qsb<UserIdentifier, fzv>
{
    public final w3k D0;
    public final mgv E0;
    
    public d6k(final w3k d0, final mgv e0) {
        this.D0 = d0;
        this.E0 = e0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final UserIdentifier userIdentifier = (UserIdentifier)o;
        czd.f((Object)userIdentifier, "userIdentifier");
        this.D0.e(this.E0.g(userIdentifier));
        return fzv.a;
    }
}
