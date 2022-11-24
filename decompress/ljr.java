import java.util.Set;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ljr implements Runnable
{
    public static final String I0;
    public final rsx F0;
    public final x8r G0;
    public final boolean H0;
    
    static {
        I0 = jag.g("StopWorkRunnable");
    }
    
    public ljr(final rsx f0, final x8r g0, final boolean h0) {
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
    }
    
    @Override
    public final void run() {
        Label_0352: {
            if (this.H0) {
                final i1l f = this.F0.f;
                final x8r g0 = this.G0;
                Objects.requireNonNull(f);
                final String a = g0.a.a;
                synchronized (f.Q0) {
                    final jag e = jag.e();
                    final String r0 = i1l.R0;
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Processor stopping foreground work ");
                    sb.append(a);
                    e.a(r0, sb.toString());
                    final aux aux = f.K0.remove(a);
                    if (aux != null) {
                        f.M0.remove(a);
                    }
                    monitorexit(f.Q0);
                    final boolean b = i1l.c(a, aux);
                    break Label_0352;
                }
            }
            final i1l f2 = this.F0.f;
            final x8r g2 = this.G0;
            Objects.requireNonNull(f2);
            final String a2 = g2.a.a;
            Object o = f2.Q0;
            synchronized (o) {
                final aux aux2 = f2.L0.remove(a2);
                if (aux2 == null) {
                    final jag e2 = jag.e();
                    final String r2 = i1l.R0;
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append("WorkerWrapper could not be found for ");
                    sb2.append(a2);
                    e2.a(r2, sb2.toString());
                    monitorexit(o);
                }
                else {
                    final Set set = f2.M0.get(a2);
                    if (set != null && set.contains(g2)) {
                        final jag e3 = jag.e();
                        final String r3 = i1l.R0;
                        final StringBuilder sb3 = new StringBuilder();
                        sb3.append("Processor stopping background work ");
                        sb3.append(a2);
                        e3.a(r3, sb3.toString());
                        f2.M0.remove(a2);
                        monitorexit(o);
                        final boolean b = i1l.c(a2, aux2);
                        break Label_0352;
                    }
                    monitorexit(o);
                }
                final boolean b = false;
                o = jag.e();
                final String i0 = ljr.I0;
                final StringBuilder f3 = ehk.f("StopWorkRunnable for ");
                f3.append(this.G0.a.a);
                f3.append("; Processor.stopWork = ");
                f3.append(b);
                ((jag)o).a(i0, f3.toString());
            }
        }
    }
}
