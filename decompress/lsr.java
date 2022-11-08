import j$.util.stream.Collectors;
import j$.util.function.Function;
import java.util.Collection;
import j$.util.Collection$_EL;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class lsr
{
    public static final alp<lsr> i;
    public final xrv a;
    public final xrv b;
    public final xrv c;
    public final int d;
    public final xrv e;
    public final iej f;
    public final List<wyo> g;
    public final n16 h;
    
    static {
        lsr.i = (jx6)hx6.b(new pkp[] { new pkp((Class)s6a.class, (alp)new s6a$b()), new pkp((Class)z77.class, (alp)new z77$b()), new pkp((Class)m6q.class, (alp)new m6q$b()), new pkp((Class)z5q.class, (alp)new z5q$b()), new pkp((Class)u1g.class, (alp)new u1g$b()), new pkp((Class)tw.class, (alp)new tw$a()), new pkp((Class)cck.class, (alp)cck.r), new pkp((Class)p0a.class, (alp)p0a.q), new pkp((Class)o4h.class, (alp)new o4h$b()), new pkp((Class)o17.class, (alp)new o17$b()), new pkp((Class)gmj.class, (alp)new gmj$b()), new pkp((Class)b0l.class, (alp)new b0l$b()), new pkp((Class)jmj.class, (alp)new jmj$b()), new pkp((Class)hgw.class, (alp)hgw.r), new pkp((Class)tgw.class, (alp)tgw.n), new pkp((Class)fwd.class, (alp)new fwd$b()), new pkp((Class)cxa.class, (alp)cxa.k), new pkp((Class)qyj.class, (alp)new qyj$b()), new pkp((Class)z6a.class, (alp)new z6a$b()), new pkp((Class)c87.class, (alp)new c87$b()), new pkp((Class)cop.class, (alp)new cop$b()), new pkp((Class)ahx.class, (alp)new ahx$c()), new pkp((Class)o4a.class, (alp)new o4a$b()), new pkp((Class)fcp.class, (alp)new fcp$b()), new pkp((Class)kcp.class, (alp)new kcp$b()), new pkp((Class)w3w.class, (alp)new w3w$b()), new pkp((Class)l94.class, (alp)new l94$b()), new pkp((Class)zst.class, (alp)new zst$b()), new pkp((Class)p3w.class, (alp)new p3w$b()), new pkp((Class)n6a.class, (alp)new n6a$b()), new pkp((Class)j5a.class, (alp)new j5a$b()), new pkp((Class)tgd.class, (alp)new tgd$b()), new pkp((Class)b74.class, (alp)new b74$b()), new pkp((Class)m6g.class, (alp)m6g.p), new pkp((Class)jxi.class, (alp)jxi.q), new pkp((Class)l1c.class, (alp)new l1c$b()), new pkp((Class)jlx.class, (alp)new jlx$b()), new pkp((Class)w4r.class, (alp)new w4r$b()), new pkp((Class)e5a.class, (alp)new e5a$b()), new pkp((Class)qk.class, (alp)new qk$b()), new pkp((Class)wce.class, (alp)new wce$b()), new pkp((Class)ilj.class, (alp)new ilj$b()), new pkp((Class)qn0.class, (alp)qn0$b.c), new pkp((Class)cmj.class, (alp)new cmj$b()), new pkp((Class)j3q.class, (alp)new j3q$b()), new pkp((Class)xap.class, (alp)new xap$b()), new pkp((Class)iru.class, (alp)new iru$b()), new pkp((Class)qwa.class, (alp)new qwa$c()) });
    }
    
    public lsr(final lsr.lsr$a lsr$a) {
        this.a = lsr$a.a;
        this.b = lsr$a.b;
        this.c = lsr$a.c;
        this.d = lsr$a.d;
        this.e = lsr$a.e;
        iej h = lsr$a.h;
        if (h == null) {
            h = new iej(lsr$a.f, lsr$a.g, (kdj)null, (hfv)null);
        }
        this.f = h;
        this.g = lsr$a.i;
        this.h = lsr$a.j;
    }
    
    public List<rh0> a() {
        final ijf h = ijf.H();
        final n16 h2 = this.h;
        if (h2 != null) {
            final List<? extends fqp> a = h2.a;
            if (a != null) {
                h.q((Iterable)Collection$_EL.stream((Collection)a).flatMap((Function)kfe.c).collect(Collectors.toList()));
            }
            final List<? extends fqp> c = this.h.c;
            if (c != null) {
                h.q((Iterable)Collection$_EL.stream((Collection)c).flatMap((Function)ksr.a).collect(Collectors.toList()));
            }
        }
        return (List)((h4j)h).e();
    }
    
    public abstract asr b(final String p0);
}
