import com.twitter.android.liveevent.landing.scribe.a;
import com.twitter.util.user.UserIdentifier;
import java.util.Objects;
import com.twitter.model.liveevent.LiveEventConfiguration;

// 
// Decompiled by Procyon v0.6.0
// 

public final class o7t implements z4e<y1t, kmm<?, ?>>
{
    public final lyf a;
    public final ozf b;
    public final cyf c;
    public final LiveEventConfiguration d;
    public final m29 e;
    public o7t.o7t$a f;
    
    public o7t(final lyf a, final ozf b, final cyf c, final LiveEventConfiguration d) {
        this.e = new m29();
        this.f = (o7t.o7t$a)o7t.o7t$a.g0;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final Object a(final Object o) {
        final y1t y1t = (y1t)o;
        final lyf a = this.a;
        final cyf c = this.c;
        final String c2 = ((qrs)c).c;
        final String r = c.r();
        final String source = this.d.source;
        Objects.requireNonNull(a);
        final yov yov = new yov(a.a, y1t.f, UserIdentifier.fromId(y1t.a.a.c), y1t.g, a2t.b(y1t), c2, a.b, r, source, aav.d2(y1t.f));
        ((kmm)yov).Q0 = y1t.e;
        final int a2 = w4j.a;
        final a c3 = a.c;
        ((kmm)yov).R0 = (szo)c3.m(c3.i);
        return yov;
    }
}
