import java.util.Objects;
import java.util.concurrent.Callable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class xhj implements Callable
{
    public final yhj D0;
    public final String E0;
    public final double F0;
    public final int G0;
    
    public xhj(final yhj d0, final String e0, final double f0, final int g0) {
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
    }
    
    @Override
    public final Object call() {
        final yhj d0 = this.D0;
        final String e0 = this.E0;
        final double f0 = this.F0;
        final int g0 = this.G0;
        czd.f((Object)d0, "this$0");
        final cij b = d0.b;
        final m4s a = hq1.a;
        final long currentTimeMillis = System.currentTimeMillis();
        Objects.requireNonNull(b);
        czd.f((Object)e0, "name");
        final StringBuilder sb = new StringBuilder();
        sb.append("Reported event: ");
        sb.append(e0);
        sb.append(" for version: ");
        sb.append(g0);
        sb.append(" with value: ");
        sb.append(f0);
        s9g.a("OnDeviceMetric", sb.toString());
        final f60 c = b.b.c();
        czd.e((Object)c, "writer.rowWriter");
        ((eij.eij$c.a)c.a).a(e0).d(f0).b(g0).c("NOT_EVALUATED").e(currentTimeMillis);
        c.b();
        return fzv.a;
    }
}
