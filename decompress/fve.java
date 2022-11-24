import java.util.concurrent.TimeUnit;
import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fve
{
    public final omv<String, String> a;
    public final ngg b;
    
    public fve(final ngg b, final qmv qmv, final UserIdentifier userIdentifier) {
        this.b = b;
        final kfg kfg = new kfg(1, 1);
        final rmv a = ita.a(userIdentifier);
        final long minutes = TimeUnit.DAYS.toMinutes(7L);
        final int n = (int)minutes;
        if (minutes == n) {
            final sjr a2 = new sjr(kfg, TimeUnit.MINUTES.toMillis(a.f("android_home_last_used_tab_min", n)));
            final hg6$a b2 = hg6$a.b();
            b2.b = "last_tab_used";
            b2.c = (nmp)rx6.f;
            b2.a = a2;
            this.a = (omv<String, String>)qmv.a(new hg6(b2));
            return;
        }
        throw new ArithmeticException();
    }
}
