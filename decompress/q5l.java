import java.io.IOException;
import java.util.Objects;
import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class q5l extends gue implements rtb<hfv, oyv>
{
    public final /* synthetic */ d5l C0;
    public final /* synthetic */ int D0;
    
    public q5l(final d5l c0, final int d0) {
        this.C0 = c0;
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final hfv hfv = (hfv)o;
        zzd.f((Object)hfv, "it");
        final d5l c0 = this.C0;
        final int d0 = this.D0;
        final tiw d2 = c0.d;
        final tiw$a$a tiw$a$a = new tiw$a$a();
        tiw$a$a.b = UserIdentifier.Companion.c().getId();
        tiw$a$a.g = 1;
        ((jzi$a)tiw$a$a).a = c0.e;
        final int a = w4j.a;
        if (((fir)d2).c((Object)new tf6(((h4j)tiw$a$a).e(), (Iterable)tdy.u0((Object)hfv)))) {
            c0.e.b();
            c0.f.d(hfv);
            return oyv.a;
        }
        final a5l g = c0.g;
        Objects.requireNonNull(g);
        k1b.i(d0, "requestType");
        g.a(a5l.Companion.a(d0, "db_user_write_failure"));
        throw new IOException("failed to write user");
    }
}
