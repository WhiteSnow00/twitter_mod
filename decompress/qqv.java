import com.twitter.api.legacy.request.urt.darkreads.DarkReadException;
import com.twitter.util.user.UserIdentifier;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class qqv extends nqv
{
    public qqv(final Context context, final UserIdentifier userIdentifier, final UserIdentifier userIdentifier2, final int n, final int n2, final yov yov, final String s, final pqv pqv, final vav vav) {
        super(context, userIdentifier, userIdentifier2, n, n2, yov, s, pqv, vav);
    }
    
    public final n48 A0(final g7c g7c, final orc$a<n48> orc$a) {
        final n48 n48 = new n48(g7c, super.q1, ((anm)this).Q0, UserIdentifier.fromId(super.o1.c), super.o1.a, super.l1, super.t1, super.r1);
        n48.j1 = super.j1;
        final int a = c5j.a;
        n48.k1 = super.k1;
        if (orc$a != null) {
            ((anm)n48).U((wv0$b)orc$a);
        }
        return n48;
    }
    
    public abstract g7c B0();
    
    public abstract boolean C0();
    
    public abstract boolean D0();
    
    @Override
    public void n0(final xrc<r2t, kbv> xrc) {
        if (this.D0()) {
            trc.c().f((orc)this.A0(this.B0(), (orc$a<n48>)new orc$a<n48>(this, xrc) {
                public final xrc D0;
                public final qqv E0;
                
                public final void a(final wv0 wv0) {
                }
                
                public final void b(final wv0 wv0) {
                    final n48 n48 = (n48)wv0;
                    final lws o1 = this.E0.o1;
                    final int a = o1.a;
                    final long c = o1.c;
                    final r2t f1 = n48.F1;
                    final r2t r2t = (r2t)this.D0.g;
                    final pw8$a pw8$a = new pw8$a();
                    y9m.c((Object)r2t, (Object)f1, pw8$a, "timelineResponse", (Class)null);
                    final pw8 pw8 = (pw8)((n4j)pw8$a).e();
                    if (pw8.a != 0) {
                        final StringBuilder j = fu8.j("There are ");
                        k0c.k(j, pw8.a, " differences between graphql and rest response for timeline type ", a, " and owner id ");
                        j.append(c);
                        final StringBuilder sb = new StringBuilder(j.toString());
                        if (asa.b().b("android_graphql_dark_read_verbose_msg_enabled", false)) {
                            sb.append(". Differences: ");
                            sb.append(pw8.b);
                        }
                        m8a.c(new h8a((Throwable)new DarkReadException(sb.toString())));
                    }
                }
                
                public final void c(final wv0 wv0, final boolean b) {
                }
            }));
        }
        if (this.C0() && asa.b().b("android_diffy_request_enabled", false)) {
            final arc f = xrc.f;
            if (f != null) {
                final String j = f.j("X-Twitter-Diffy-Request-Key");
                if (j != null) {
                    final g7c$a g7c$a = new g7c$a(this.B0());
                    ((qjg)g7c$a.d).w((Object)"X-Twitter-Diffy-Request-Key", (Object)j);
                    trc.c().f((orc)this.A0((g7c)((n4j)g7c$a).e(), null));
                }
            }
        }
        super.n0(xrc);
    }
}
