import com.twitter.util.user.UserIdentifier;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class n7c extends hpv
{
    public final String E1;
    public final String F1;
    public final String G1;
    public final boolean H1;
    
    public n7c(final Context context, final String e1, final String f1, final UserIdentifier userIdentifier, final UserIdentifier userIdentifier2, final int n, final int n2, final yov yov, final String s, final pqv pqv, final vav vav, final String g1, final boolean h1) {
        super(context, userIdentifier, userIdentifier2, n, n2, yov, s, pqv, vav);
        this.E1 = e1;
        this.F1 = f1;
        this.G1 = g1;
        this.H1 = h1;
    }
    
    public final g7c r0() {
        final boolean b = this.H1 && asa.b().b("rito_safety_mode_features_enabled", false);
        final g7c$a g7c$a = new g7c$a();
        g7c$a.a = this.E1;
        g7c$a.b = new f7c(new String[] { this.F1, "timeline_response", "timeline" });
        ((qjg)g7c$a.c).w((Object)"rest_id", (Object)this.G1);
        ((qjg)g7c$a.c).w((Object)"include_smart_block", (Object)b);
        ((qjg)g7c$a.c).w((Object)"includeTweetVisibilityNudge", (Object)xa8.p());
        return (g7c)((n4j)g7c$a).e();
    }
    
    @Override
    public final boolean y0() {
        return false;
    }
    
    @Override
    public final boolean z0() {
        final int l1 = super.l1;
        boolean b = true;
        if (l1 != 2) {
            b = (l1 == 1 && b);
        }
        return b;
    }
}
