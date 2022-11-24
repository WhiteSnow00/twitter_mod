import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kdj implements ouk
{
    public final long F0;
    
    public kdj(final long f0) {
        this.F0 = f0;
    }
    
    public final boolean test(final Object o) {
        return ((UserIdentifier)o).getId() == this.F0;
    }
}
