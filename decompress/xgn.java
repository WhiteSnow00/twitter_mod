import java.util.concurrent.TimeUnit;
import java.util.Map;
import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class xgn implements wgn
{
    public static final xgn.xgn$c Companion;
    public static final nxe<xgn$c$b> c;
    public static final nxe<xgn$c$a> d;
    public static final hg6<UserIdentifier, Map<h2a, n1a>> e;
    public final UserIdentifier a;
    public final h5s b;
    
    static {
        Companion = new xgn.xgn$c();
        final h5s h5s = xgn.c = (h5s)jty.N((ptb)xgn$b.F0);
        final h5s h5s2 = xgn.d = (h5s)jty.N((ptb)xgn$a.F0);
        final hg6$a hg6$a = new hg6$a();
        hg6$a.d = (cqe)cqe.c;
        hg6$a.b = "space_emoji_colors";
        hg6$a.c = (nmp)new fr4((nmp)h5s.getValue(), (nmp)h5s2.getValue());
        hg6$a.a = new sjr(new kfg(1, 1), TimeUnit.DAYS.toMillis(30L));
        e = new hg6(hg6$a);
    }
    
    public xgn(final qmv qmv, final UserIdentifier a) {
        e0e.f((Object)qmv, "repositoryManager");
        e0e.f((Object)a, "owner");
        this.a = a;
        this.b = (h5s)jty.N((ptb)new xgn$f(qmv));
    }
    
    @Override
    public final bbq<Map<h2a, n1a>> a() {
        return (bbq<Map<h2a, n1a>>)this.d().get((Object)this.a).w((rtb)new dql((stb)xgn$d.F0, 17));
    }
    
    @Override
    public final yz5 b(final Map<h2a, ? extends n1a> map) {
        return yz5.m((idq)this.d().e((Object)this.a, (Object)map));
    }
    
    @Override
    public final t5j<Map<h2a, n1a>> c() {
        final t5j flatMapSingle = this.d().m().flatMapSingle((rtb)new t3i((stb)new xgn$e(this), 23));
        e0e.e((Object)flatMapSingle, "override fun observeEmoj\u2026else Single.never()\n    }");
        return (t5j<Map<h2a, n1a>>)flatMapSingle;
    }
    
    public final omv<UserIdentifier, Map<h2a, n1a>> d() {
        return (omv<UserIdentifier, Map<h2a, n1a>>)this.b.getValue();
    }
}
