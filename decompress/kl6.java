import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kl6
{
    public final gcu a;
    public final g2g b;
    
    public kl6(final UserIdentifier userIdentifier, final g2g b) {
        this.b = b;
        this.a = fcu.e(userIdentifier, "ContactLoaderHelper");
    }
    
    public final boolean a() {
        return this.a.e("contacts_uploaded", this.b.d());
    }
}
