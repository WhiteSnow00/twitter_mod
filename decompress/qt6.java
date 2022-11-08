import android.os.Bundle;
import com.twitter.util.user.UserIdentifier;
import android.content.Context;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class qt6
{
    public final zid a;
    public final dyj b;
    public final aw c;
    public final i7k d;
    
    public qt6(final qt6.qt6$a qt6$a) {
        final Context a = qt6$a.a;
        final g3g c = qt6$a.c;
        final UserIdentifier b = qt6$a.b;
        final kq6 d = qt6$a.d;
        final zid a2 = new zid(a, c, b, 100);
        this.a = a2;
        a2.G0 = qt6$a.e;
        final dyj b2 = new dyj(a, c, b, 101);
        this.b = b2;
        b2.G0 = qt6$a.f;
        final aw c2 = new aw(a, c, b);
        this.c = c2;
        Objects.requireNonNull(d);
        c2.F0 = (aw$a)new l71((Object)d, 23);
        final i7k d2 = new i7k(a, c, b);
        this.d = d2;
        d2.F0 = qt6$a.g;
    }
    
    public final void a() {
        this.a.a();
        this.b.a();
        final aw c = this.c;
        if (c.G0) {
            c.D0.e(103, (Bundle)null, (g3g$a)c);
        }
        else {
            c.D0.d(103, (Bundle)null, (g3g$a)c);
            c.G0 = true;
        }
        final i7k d = this.d;
        if (d.H0) {
            d.D0.e(102, (Bundle)null, (g3g$a)d);
        }
        else {
            d.D0.d(102, (Bundle)null, (g3g$a)d);
            d.H0 = true;
        }
    }
}
