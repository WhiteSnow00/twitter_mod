import java.util.Objects;
import java.util.Collection;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gwm extends gue implements rtb<String, oyv>
{
    public final /* synthetic */ fwm C0;
    
    public gwm(final fwm c0) {
        this.C0 = c0;
        super(1);
    }
    
    public final Object invoke(Object o) {
        final String k0 = (String)o;
        zzd.f((Object)k0, "currentHost");
        o = this.C0;
        synchronized (o) {
            if (((fwm)o).J0 != null) {
                monitorexit(o);
            }
            else {
                final String e = ((fwm)o).e(k0);
                final Collection<String> f = ((fwm)o).f(k0, e);
                if (f.isEmpty()) {
                    monitorexit(o);
                }
                else {
                    ((fwm)o).K0 = k0;
                    ((fwm)o).L0 = e;
                    final wr2 wr2 = new wr2(o, 22);
                    final psc d0 = ((fwm)o).D0;
                    final m4s$a b = m4s.b;
                    ((fwm)o).J0 = new v1b((u93)wr2, d0, (Collection)f);
                    monitorexit(o);
                    final fwt i0 = ((fwm)o).I0;
                    Objects.requireNonNull(i0);
                    final cro q = ffa.q("scribe_traffic_event_sample_size", cro.b);
                    zzd.e((Object)q, "obtainSampler(\n         \u2026r.ALWAYS_SELECT\n        )");
                    i0.a(new zf4(fwt.c), q);
                    o = ((fwm)o).J0;
                    zzd.c(o);
                    ((yjp)o).d();
                }
            }
            return oyv.a;
        }
    }
}
