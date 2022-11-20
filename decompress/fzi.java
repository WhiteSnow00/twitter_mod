import com.twitter.util.user.UserIdentifier;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fzi extends nqv
{
    public final vav E1;
    
    public fzi(final Context context, final UserIdentifier userIdentifier, final int n, final int n2, final yov yov, final vav e1) {
        super(context, userIdentifier, userIdentifier, n, n2, yov, null, pqv.c, e1);
        this.E1 = e1;
    }
    
    public final g7c r0() {
        return null;
    }
    
    public final zvl s0() {
        final zvl$a zvl$a = new zvl$a();
        final StringBuilder j = fu8.j("/2/notifications/");
        final int a = super.o1.a;
        String s = null;
        switch (a) {
            default: {
                throw new UnsupportedOperationException(udu.z("Attempted to start NotificationsTimelineRequest for type: ", a));
            }
            case 9: {
                s = "verified";
                break;
            }
            case 8: {
                s = "mentions";
                break;
            }
            case 7: {
                s = "all";
                break;
            }
            case 6: {
                s = "superfollowers";
                break;
            }
        }
        zvl$a.a = ed.B(j, s, ".json");
        return (zvl)((n4j)zvl$a).e();
    }
    
    @Override
    public final void x0(final yrm yrm) {
        super.x0(yrm);
        if (yrm.b().a()) {
            final UserIdentifier fromId = UserIdentifier.fromId(super.o1.c);
            final mws$a mws$a = new mws$a();
            mws$a.a = 7;
            mws$a.c = super.o1.c;
            final mws mws = (mws)((n4j)mws$a).e();
            final nm6 z = ((anm)this).Z(super.q1);
            final k3c l0 = k3c.l0();
            final int o0 = l0.o0(fromId, "unread_interactions");
            final int n = (int)new nus(this.E1).i(mws);
            if (o0 != n) {
                l0.p0(fromId, "unread_interactions", n, z);
                z.b();
            }
        }
    }
    
    @Override
    public final boolean y0() {
        return false;
    }
    
    @Override
    public final boolean z0() {
        return super.l1 == 2;
    }
}
