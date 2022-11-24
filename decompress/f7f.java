import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class f7f implements fgw
{
    public final int F0;
    public final dgw G0;
    
    public f7f(final dgw g0, final int f0) {
        this.F0 = f0;
        this.G0 = g0;
    }
    
    public final Object get(final Object o) {
        switch (this.F0) {
            default: {
                final dgw g0 = this.G0;
                final UserIdentifier userIdentifier = (UserIdentifier)o;
                e0e.f((Object)g0, "$userObjectGraphProvider");
                e0e.f((Object)userIdentifier, "userIdentifier");
                return ((oes)g0.e(userIdentifier, (Class)oes.class)).g8();
            }
            case 2: {
                return ((swi)this.G0.e((UserIdentifier)o, (Class)swi.class)).K1();
            }
            case 1: {
                return ((zm2)this.G0.e((UserIdentifier)o, (Class)zm2.class)).v6();
            }
            case 0: {
                return ((h7f)this.G0.e((UserIdentifier)o, (Class)h7f.class)).o();
            }
        }
    }
}
