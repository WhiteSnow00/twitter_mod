import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class vy8 extends enm<String, msm<uy8, hbv>, wy8>
{
    public final UserIdentifier E0;
    
    public vy8(final UserIdentifier e0) {
        this.E0 = e0;
    }
    
    public final orc c(final Object o) {
        return (orc)new wy8(this.E0, (String)o);
    }
    
    public final Object d(final orc orc) {
        final wy8 wy8 = (wy8)orc;
        final uy8 j1 = wy8.j1;
        msm msm;
        if (j1 != null) {
            jee.l((Object)j1);
            msm = msm.e((Object)j1);
        }
        else {
            final hbv k1 = wy8.k1;
            jee.l((Object)k1);
            msm = msm.a((Object)k1);
        }
        return msm;
    }
}
