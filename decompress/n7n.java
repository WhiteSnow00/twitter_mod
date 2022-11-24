import java.util.Map;
import tv.periscope.android.api.PsAudioSpaceParticipantsResponse;
import kotlin.NoWhenBranchMatchedException;
import java.util.concurrent.TimeUnit;
import com.twitter.rooms.model.AudioSpaceTopicItem;
import java.util.List;
import tv.periscope.android.api.AuthedApiService;

// 
// Decompiled by Procyon v0.6.0
// 

public final class n7n implements m7n
{
    public static final n7n.n7n$c Companion;
    public static final nxe<Long> l;
    public final icu a;
    public final j11 b;
    public final AuthedApiService c;
    public final mun d;
    public final unp e;
    public final lmw f;
    public final oe5 g;
    public final bxo h;
    public final bfg<String, n7n.n7n$a> i;
    public final znl<String> j;
    public final e39 k;
    
    static {
        Companion = new n7n.n7n$c();
        n7n.l = (h5s)jty.N((ptb)n7n$b.F0);
    }
    
    public n7n(final icu a, final j11 b, final AuthedApiService c, final mun d, final unp e, final lmw f, final oe5 g, final kcm kcm, final bxo h) {
        e0e.f((Object)a, "twSystemClock");
        e0e.f((Object)b, "audioSpaceDataSource");
        e0e.f((Object)c, "authedApiService");
        e0e.f((Object)d, "roomPeriscopeAuthenticator");
        e0e.f((Object)e, "sessionCache");
        e0e.f((Object)f, "usersCache");
        e0e.f((Object)g, "communitiesRepository");
        e0e.f((Object)kcm, "releaseCompletable");
        e0e.f((Object)h, "pollingScheduler");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = (bfg<String, n7n.n7n$a>)new bfg(10);
        this.j = (znl<String>)new znl();
        this.k = new e39();
        kcm.i((sj)new qbk((Object)this, 20));
    }
    
    public final void a(final String s, final String s2, final long n, final List<AudioSpaceTopicItem> list, final boolean b) {
        this.k.c(this.h(s).G((rk6)new b6l((stb)new n7n$j(this, s, s2, n, (List)list, b), 12), (rk6)new aic((stb)n7n$k.F0, 20)));
    }
    
    public final t5j<String> b() {
        return (t5j<String>)this.j;
    }
    
    public final void c(final String s, final String s2) {
        e0e.f((Object)s, "id");
        e0e.f((Object)s2, "canceledAt");
        this.k.c(this.h(s).G((rk6)new gpl((stb)new n7n$n(this, s, s2), 20), (rk6)new rm8((stb)n7n$o.F0, 22)));
    }
    
    public final t5j<String> d(final String s) {
        e0e.f((Object)s, "id");
        final t5j filter = ((t5j)this.j).filter((ouk)new du1((stb)new n7n$h(s), 18));
        e0e.e((Object)filter, "id: String): Observable<\u2026bject.filter { it == id }");
        return (t5j<String>)filter;
    }
    
    public final void e(final String s) {
        e0e.f((Object)s, "audioSpaceId");
        ((Map<String, n7n.n7n$a>)this.i).put(s, null);
    }
    
    public final t5j<awj<x21, z21>> f(final String s) {
        e0e.f((Object)s, "audioSpaceId");
        final n7n.n7n$c companion = n7n.Companion;
        final t5j flatMapSingle = t5j.interval(companion.a(), companion.a(), TimeUnit.MILLISECONDS, this.h).flatMapSingle((rtb)new yql((stb)new n7n$i(this, s), 25));
        e0e.e((Object)flatMapSingle, "override fun pollAudioSp\u2026oSpaceId)\n        }\n    }");
        return (t5j<awj<x21, z21>>)flatMapSingle;
    }
    
    public final void g(final String s, final boolean b) {
        e0e.f((Object)s, "id");
        this.k.c(this.h(s).G((rk6)new gpl((stb)new n7n$l(this, s, b), 19), (rk6)new rm8((stb)n7n$m.F0, 21)));
    }
    
    public final bbq<awj<x21, z21>> h(final String s) {
        e0e.f((Object)s, "audioSpaceId");
        final n7n.n7n$a n7n$a = (n7n.n7n$a)this.i.get((Object)s);
        if (n7n$a != null && this.a.a() - n7n$a.a < n7n.Companion.a()) {
            bbq bbq;
            if (n7n$a instanceof n7n.n7n$a.b) {
                final n7n.n7n$a.b b = (n7n.n7n$a.b)n7n$a;
                bbq = bbq.v((Object)new awj((Object)b.b, (Object)b.c));
            }
            else {
                if (!(n7n$a instanceof n7n.n7n$a.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                bbq = bbq.n(((n7n.n7n$a.a)n7n$a).b);
            }
            return (bbq<awj<x21, z21>>)bbq;
        }
        final bbq h = this.b.h(new j11$a(s, false, 2, (wg8)null));
        bbq bbq2;
        if (vjo.u()) {
            bbq2 = bbq.v((Object)PsAudioSpaceParticipantsResponse.Companion.getEMPTY());
        }
        else {
            bbq2 = this.d.b().p((rtb)new x2i((stb)new n7n$d(s, this), 25));
        }
        return (bbq<awj<x21, z21>>)bbq.Q((idq)h, (idq)bbq2, (hw1)tu8.I0).f(this.d.c()).p((rtb)new yql((stb)new n7n$e(this), 24)).m((rk6)new xql((stb)new n7n$f(this, s), 24)).k((rk6)new ucj((stb)new n7n$g(this, s), 10));
    }
}
