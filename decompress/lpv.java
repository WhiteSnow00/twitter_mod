import com.twitter.util.user.UserIdentifier;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lpv extends nqv
{
    public lpv(final Context context, final UserIdentifier userIdentifier, final int n, final yov yov, final pqv pqv, final String s, final vav vav) {
        super(context, userIdentifier, userIdentifier, 22, n, yov, s, pqv, vav);
    }
    
    @Override
    public final asc<r2t, kbv> g0() {
        final asc<r2t, kbv> g0 = super.g0();
        final int b0 = bsm.b0;
        g0.F0 = (bsm)k0c.E0;
        return g0;
    }
    
    public final g7c r0() {
        return null;
    }
    
    public final zvl s0() {
        final zvl$a zvl$a = new zvl$a();
        zvl$a.a = "/2/guide.json";
        return (zvl)((n4j)zvl$a).e();
    }
    
    @Override
    public final boolean y0() {
        final int l1 = super.l1;
        boolean b = true;
        if (l1 != 1) {
            b = (l1 == 2 && b);
        }
        return b;
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
