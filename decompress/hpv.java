import com.twitter.util.user.UserIdentifier;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class hpv extends nqv
{
    public hpv(final Context context, final UserIdentifier userIdentifier, final UserIdentifier userIdentifier2, final int n, final int n2, final yov yov, final String s, final pqv pqv, final vav vav) {
        super(context, userIdentifier, userIdentifier2, n, n2, yov, s, pqv, vav);
    }
    
    @Deprecated
    public final zvl s0() {
        cj1.h("Should be only used as a GraphQL request");
        return null;
    }
    
    public final boolean t0() {
        return true;
    }
}
