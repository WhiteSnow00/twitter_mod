import com.twitter.util.user.UserIdentifier;
import java.util.Locale;
import android.os.Build;

// 
// Decompiled by Procyon v0.6.0
// 

public final class y2k
{
    public final aah a;
    public final hr0 b;
    public final cl0 c;
    public final gew d;
    public final qll<ezo> e;
    public final qll<x3h> f;
    public final qll<y88> g;
    
    public y2k(final aah a, final hr0 b, final cl0 c, final gew d, final qll<ezo> e, final qll<x3h> f, final qll<y88> g) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        if (Build.MANUFACTURER.toLowerCase(Locale.ENGLISH).contains("kyocera")) {
            a.a();
        }
        c.a();
        final lz6 b2 = lz6.B("api::scribe::size", a, UserIdentifier.LOGGED_OUT, (u9h$b)u9h.k);
        ((ejg)b2).h();
        ((ezo)e.get()).c = b2;
        f.get();
        dta.d().n().subscribe((fk6)thd.H0);
    }
}
