import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class r0m extends enm<tmi, z7p, s0m>
{
    public final UserIdentifier E0;
    
    public r0m(final UserIdentifier e0) {
        this.E0 = e0;
    }
    
    public final orc c(final Object o) {
        final tmi tmi = (tmi)o;
        return (orc)new s0m(this.E0);
    }
    
    public final Object d(final orc orc) {
        final z7p k1 = ((s0m)orc).k1;
        final z7p d = z7p.d;
        z7p z7p = k1;
        if (k1 == null) {
            z7p = d;
        }
        return z7p;
    }
}
