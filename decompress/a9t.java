import com.twitter.android.liveevent.landing.scribe.a;
import com.twitter.util.user.UserIdentifier;
import java.util.Objects;
import com.twitter.model.liveevent.LiveEventConfiguration;

// 
// Decompiled by Procyon v0.6.0
// 

public final class a9t implements g5e<i3t, pnm<?, ?>>
{
    public final syf a;
    public final vzf b;
    public final jyf c;
    public final LiveEventConfiguration d;
    public final e39 e;
    public a9t.a9t$a f;
    
    public a9t(final syf a, final vzf b, final jyf c, final LiveEventConfiguration d) {
        this.e = new e39();
        this.f = (a9t.a9t$a)a9t.a9t$a.j0;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final Object a(final Object o) {
        final i3t i3t = (i3t)o;
        final syf a = this.a;
        final jyf c = this.c;
        final String c2 = ((bts)c).c;
        final String r = c.r();
        final String source = this.d.source;
        Objects.requireNonNull(a);
        final gqv gqv = new gqv(a.a, i3t.f, UserIdentifier.fromId(i3t.a.a.c), i3t.g, k3t.b(i3t), c2, a.b, r, source, kbv.d2(i3t.f));
        ((pnm)gqv).T0 = i3t.e;
        final int a2 = o5j.a;
        final a c3 = a.c;
        ((pnm)gqv).U0 = (d1p)c3.m(c3.i);
        return gqv;
    }
}
