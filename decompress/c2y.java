import android.os.Handler;
import com.google.android.gms.common.api.Scope;
import java.util.Set;
import com.google.android.gms.common.api.a;

// 
// Decompiled by Procyon v0.6.0
// 

public final class c2y implements c, x2y
{
    public final com.google.android.gms.common.api.a.f a;
    public final wf0<?> b;
    public l2d c;
    public Set<Scope> d;
    public boolean e;
    public final /* synthetic */ p5c f;
    
    public c2y(final p5c f, final com.google.android.gms.common.api.a.f a, final wf0<?> b) {
        this.f = f;
        this.c = null;
        this.d = null;
        this.e = false;
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void a(final ph6 ph6) {
        ((Handler)this.f.P0).post((Runnable)new b2y(this, ph6));
    }
    
    public final void b(final ph6 ph6) {
        final z1y z1y = (z1y)this.f.L0.get((Object)this.b);
        if (z1y != null) {
            xd.n((Handler)z1y.m.P0);
            final com.google.android.gms.common.api.a.f b = z1y.b;
            final String name = b.getClass().getName();
            final String value = String.valueOf(ph6);
            b.f(hi.J(new StringBuilder(name.length() + 25 + value.length()), "onSignInFailed for ", name, " with ", value));
            z1y.q(ph6, null);
        }
    }
}
