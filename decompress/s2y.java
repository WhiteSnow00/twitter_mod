import android.os.Handler;
import com.google.android.gms.common.api.Scope;
import java.util.Set;
import com.google.android.gms.common.api.a$f;

// 
// Decompiled by Procyon v0.6.0
// 

public final class s2y implements bm1$c, n3y
{
    public final a$f a;
    public final sf0<?> b;
    public q1d c;
    public Set<Scope> d;
    public boolean e;
    public final r4c f;
    
    public s2y(final r4c f, final a$f a, final sf0<?> b) {
        this.f = f;
        this.c = null;
        this.d = null;
        this.e = false;
        this.a = a;
        this.b = b;
    }
    
    public final void a(final vg6 vg6) {
        ((Handler)this.f.Q0).post((Runnable)new r2y(this, vg6));
    }
    
    public final void b(final vg6 vg6) {
        final p2y p2y = (p2y)this.f.M0.get((Object)this.b);
        if (p2y != null) {
            eli.k((Handler)p2y.m.Q0);
            final a$f b = p2y.b;
            final String name = b.getClass().getName();
            final String value = String.valueOf(vg6);
            b.f(mb0.C(new StringBuilder(name.length() + 25 + value.length()), "onSignInFailed for ", name, " with ", value));
            p2y.q(vg6, null);
        }
    }
}
