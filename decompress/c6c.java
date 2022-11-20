import com.twitter.util.user.UserIdentifier;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class c6c extends hpv
{
    public final g7c E1;
    
    public c6c(final Context context, final UserIdentifier userIdentifier, final int n, final yov yov, final String s, final pqv pqv, final vav vav, final g7c e1) {
        super(context, userIdentifier, userIdentifier, 26, n, yov, s, pqv, vav);
        this.E1 = e1;
    }
    
    public final g7c r0() {
        return this.E1;
    }
    
    @Override
    public final boolean y0() {
        return false;
    }
    
    @Override
    public final boolean z0() {
        final int l1 = super.l1;
        boolean b = true;
        if (l1 != 1) {
            b = (l1 == 2 && b);
        }
        return b;
    }
}
