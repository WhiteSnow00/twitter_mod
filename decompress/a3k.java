import com.twitter.util.user.UserIdentifier;
import java.util.Locale;
import android.os.Build;

// 
// Decompiled by Procyon v0.6.0
// 

public final class a3k
{
    public final cah a;
    public final ar0 b;
    public final xk0 c;
    public final uew d;
    public final dml<vzo> e;
    public final dml<y3h> f;
    public final dml<i88> g;
    
    public a3k(final cah a, final ar0 b, final xk0 c, final uew d, final dml<vzo> e, final dml<y3h> f, final dml<i88> g) {
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
        final py6 b2 = py6.B("api::scribe::size", a, UserIdentifier.LOGGED_OUT, (w9h$b)w9h.k);
        ((cjg)b2).h();
        ((vzo)e.get()).c = b2;
        f.get();
        asa.d().n().subscribe((lj6)wgd.I0);
    }
}
