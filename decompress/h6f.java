import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class h6f implements pfw
{
    public final int D0;
    public final nfw E0;
    
    public h6f(final nfw e0, final int d0) {
        this.D0 = d0;
        this.E0 = e0;
    }
    
    public final Object get(final Object o) {
        switch (this.D0) {
            default: {
                final nfw e0 = this.E0;
                final UserIdentifier userIdentifier = (UserIdentifier)o;
                czd.f((Object)e0, "$userObjectGraphProvider");
                czd.f((Object)userIdentifier, "userIdentifier");
                return ((wds)e0.e(userIdentifier, (Class)wds.class)).g8();
            }
            case 2: {
                return ((bwi)this.E0.e((UserIdentifier)o, (Class)bwi.class)).K1();
            }
            case 1: {
                return ((jm2)this.E0.e((UserIdentifier)o, (Class)jm2.class)).v6();
            }
            case 0: {
                return ((j6f)this.E0.e((UserIdentifier)o, (Class)j6f.class)).o();
            }
        }
    }
}
