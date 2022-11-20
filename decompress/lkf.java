import java.util.Iterator;
import com.twitter.util.user.UserIdentifier;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lkf extends hpv
{
    public lkf(final Context context, final UserIdentifier userIdentifier, final UserIdentifier userIdentifier2, final int n, final yov yov, final String s, final pqv pqv, final vav vav) {
        super(context, userIdentifier, userIdentifier2, 50, n, yov, s, pqv, vav);
    }
    
    public final g7c r0() {
        final g7c$a g7c$a = new g7c$a();
        g7c$a.a = "viewer_list_management_timeline";
        g7c$a.b = new f7c(new String[] { "viewer", "timeline_response", "timeline" });
        ((qjg)g7c$a.c).w((Object)"includeTweetVisibilityNudge", (Object)xa8.p());
        return (g7c)((n4j)g7c$a).e();
    }
    
    @Override
    public final void x0(final yrm yrm) {
        super.x0(yrm);
        final Iterator iterator = yrm.c((Class)ir$a.class).iterator();
        int n = 0;
        int n2 = 0;
    Label_0098:
        do {
            n2 = n;
            if (!iterator.hasNext()) {
                break;
            }
            final Iterator iterator2 = ((ir$a)iterator.next()).c.iterator();
            zus zus;
            do {
                n2 = n;
                if (!iterator2.hasNext()) {
                    continue Label_0098;
                }
                zus = (zus)iterator2.next();
            } while (!(zus instanceof wov) || ((wov)zus).q.b != 3);
            n2 = 1;
        } while ((n = n2) == 0);
        if (n2 == 0) {
            super.D1 = 1;
        }
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
