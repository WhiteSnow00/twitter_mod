import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class iux extends enm<z7p, Boolean, jux>
{
    public final UserIdentifier E0;
    
    public iux(final UserIdentifier e0) {
        this.E0 = e0;
    }
    
    public final orc c(final Object o) {
        final z7p z7p = (z7p)o;
        final UserIdentifier e0 = this.E0;
        final z7p d = z7p.d;
        z7p z7p2 = z7p;
        if (z7p == null) {
            z7p2 = d;
        }
        return (orc)new jux(e0, z7p2);
    }
    
    public final Object d(final orc orc) {
        return ((orc)orc).T().b;
    }
}
