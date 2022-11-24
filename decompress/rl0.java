import kotlin.NoWhenBranchMatchedException;
import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rl0 implements ql0
{
    public final nda<tlm> a;
    public final UserIdentifier b;
    
    public rl0(final nda<tlm> a, final UserIdentifier b) {
        e0e.f((Object)a, "eventReporter");
        e0e.f((Object)b, "userIdentifier");
        this.a = a;
        this.b = b;
    }
    
    public final void a(final pl0 pl0) {
        final bca a = bca.a;
        final fg4 fg4 = new fg4(bca.b);
        final String d = pl0.a.d();
        final gl0 b = pl0.b;
        String s;
        if (e0e.a((Object)b, (Object)gl0$a.a)) {
            s = "change_by_user";
        }
        else if (e0e.a((Object)b, (Object)gl0$b.a)) {
            s = "expire";
        }
        else if (e0e.a((Object)b, (Object)gl0$c.a)) {
            s = "feature_switch_off";
        }
        else if (e0e.a((Object)b, (Object)gl0$d.a)) {
            s = "icon_unavailable";
        }
        else if (e0e.a((Object)b, (Object)gl0$e.a)) {
            s = "logged_out";
        }
        else {
            if (!e0e.a((Object)b, (Object)gl0$f.a)) {
                throw new NoWhenBranchMatchedException();
            }
            s = "unsubscribe";
        }
        fg4.V0 = new tor(null, null, null, null, null, null, null, null, null, null, null, null, d, s, pl0.c, null, null, null, null, null, null, 2068479);
        this.a.b(this.b, (tlm)fg4);
    }
}
