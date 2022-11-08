import java.util.Set;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class vhr implements Runnable
{
    public static final String F0;
    public final irx C0;
    public final e7r D0;
    public final boolean E0;
    
    static {
        F0 = y9g.g("StopWorkRunnable");
    }
    
    public vhr(final irx c0, final e7r d0, final boolean e0) {
        this.C0 = c0;
        this.D0 = d0;
        this.E0 = e0;
    }
    
    @Override
    public final void run() {
        Label_0342: {
            if (this.E0) {
                final l0l f = this.C0.f;
                final e7r d0 = this.D0;
                Objects.requireNonNull(f);
                final String a = d0.a.a;
                synchronized (f.N0) {
                    final y9g e = y9g.e();
                    final String o0 = l0l.O0;
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Processor stopping foreground work ");
                    sb.append(a);
                    e.a(o0, sb.toString());
                    final rsx rsx = f.H0.remove(a);
                    if (rsx != null) {
                        f.J0.remove(a);
                    }
                    monitorexit(f.N0);
                    final boolean b = l0l.c(a, rsx);
                    break Label_0342;
                }
            }
            final l0l f2 = this.C0.f;
            final e7r d2 = this.D0;
            Objects.requireNonNull(f2);
            final String a2 = d2.a.a;
            Object o2 = f2.N0;
            synchronized (o2) {
                final rsx rsx2 = f2.I0.remove(a2);
                if (rsx2 == null) {
                    final y9g e2 = y9g.e();
                    final String o3 = l0l.O0;
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append("WorkerWrapper could not be found for ");
                    sb2.append(a2);
                    e2.a(o3, sb2.toString());
                    monitorexit(o2);
                }
                else {
                    final Set set = f2.J0.get(a2);
                    if (set != null && set.contains(d2)) {
                        final y9g e3 = y9g.e();
                        final String o4 = l0l.O0;
                        final StringBuilder sb3 = new StringBuilder();
                        sb3.append("Processor stopping background work ");
                        sb3.append(a2);
                        e3.a(o4, sb3.toString());
                        f2.J0.remove(a2);
                        monitorexit(o2);
                        final boolean b = l0l.c(a2, rsx2);
                        break Label_0342;
                    }
                    monitorexit(o2);
                }
                final boolean b = false;
                o2 = y9g.e();
                final String f3 = vhr.F0;
                final StringBuilder g = w48.g("StopWorkRunnable for ");
                g.append(this.D0.a.a);
                g.append("; Processor.stopWork = ");
                g.append(b);
                ((y9g)o2).a(f3, g.toString());
            }
        }
    }
}
