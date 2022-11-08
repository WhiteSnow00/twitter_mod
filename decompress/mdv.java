import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mdv
{
    public final g3j a;
    public final UserIdentifier b;
    
    public mdv(final g3j a, final UserIdentifier b) {
        this.a = a;
        this.b = b;
    }
    
    public mdv(final String s, final String s2) {
        this(new g3j(s, s2), UserIdentifier.UNDEFINED);
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && mdv.class == o.getClass()) {
            final mdv mdv = (mdv)o;
            if (!this.a.equals(mdv.a) || !this.b.equals((Object)mdv.b)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return w4j.g((Object)this.a, (Object)this.b);
    }
}
