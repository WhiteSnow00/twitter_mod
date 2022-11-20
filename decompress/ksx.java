import androidx.work.b;
import java.util.UUID;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ksx implements Runnable
{
    public final UUID D0;
    public final b E0;
    public final rnp F0;
    public final lsx G0;
    
    public ksx(final lsx g0, final UUID d0, final b e0, final rnp f0) {
        this.G0 = g0;
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
    }
    
    @Override
    public final void run() {
        final String string = this.D0.toString();
        final o9g e = o9g.e();
        final String c = lsx.c;
        final StringBuilder j = fu8.j("Updating progress for ");
        j.append(this.D0);
        j.append(" (");
        j.append(this.E0);
        j.append(")");
        e.a(c, j.toString());
        ((tcn)this.G0.a).c();
        final Throwable t2;
        try {
            final rsx h = this.G0.a.y().h(string);
            if (h != null) {
                if (h.b == qrx$a.E0) {
                    this.G0.a.x().b(new hsx(string, this.E0));
                }
                else {
                    final o9g e2 = o9g.e();
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Ignoring setProgressAsync(...). WorkSpec (");
                    sb.append(string);
                    sb.append(") is not in a RUNNING state.");
                    e2.h(c, sb.toString());
                }
                this.F0.o((Object)null);
                ((tcn)this.G0.a).q();
                return;
            }
            throw new IllegalStateException("Calls to setProgressAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
        }
        finally {
            final o9g o9g = o9g.e();
            final String s = lsx.c;
            final String s2 = "Error updating Worker progress";
            final Throwable t = t2;
            o9g.d(s, s2, t);
            final ksx ksx = this;
            final rnp rnp = ksx.F0;
            final Throwable t3 = t2;
            rnp.p(t3);
        }
        try {
            final o9g o9g = o9g.e();
            final String s = lsx.c;
            final String s2 = "Error updating Worker progress";
            final Throwable t = t2;
            o9g.d(s, s2, t);
            final ksx ksx = this;
            final rnp rnp = ksx.F0;
            final Throwable t3 = t2;
            rnp.p(t3);
        }
        finally {
            ((tcn)this.G0.a).l();
        }
    }
}
