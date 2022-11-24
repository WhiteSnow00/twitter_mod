import android.annotation.SuppressLint;
import java.util.concurrent.CancellationException;
import android.util.Log;
import java.util.concurrent.ExecutionException;
import androidx.work.c$a;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ztx implements Runnable
{
    public final String F0;
    public final aux G0;
    
    public ztx(final aux g0, final String f0) {
        this.G0 = g0;
        this.F0 = f0;
    }
    
    @SuppressLint({ "SyntheticAccessor" })
    @Override
    public final void run() {
        try {
            try {
                final c$a m0 = (c$a)this.G0.V0.get();
                if (m0 == null) {
                    final jag e = jag.e();
                    final String x0 = aux.X0;
                    final StringBuilder sb = new StringBuilder();
                    sb.append(this.G0.J0.c);
                    sb.append(" returned a null result. Treating it as a failure.");
                    e.c(x0, sb.toString());
                }
                final jag e2 = jag.e();
                final String x2 = aux.X0;
                final StringBuilder sb2 = new StringBuilder();
                sb2.append(this.G0.J0.c);
                sb2.append(" returned a ");
                sb2.append(m0);
                sb2.append(".");
                e2.a(x2, sb2.toString());
                this.G0.M0 = m0;
            }
            finally {}
        }
        catch (final ExecutionException t) {
            goto Label_0150;
        }
        catch (final InterruptedException ex) {}
        catch (final CancellationException ex2) {
            final jag e3 = jag.e();
            final String x3 = aux.X0;
            final StringBuilder sb3 = new StringBuilder();
            sb3.append(this.F0);
            sb3.append(" was cancelled");
            final String string = sb3.toString();
            if (((jag$a)e3).c <= 4) {
                Log.i(x3, string, (Throwable)ex2);
            }
        }
        this.G0.c();
        return;
        this.G0.c();
    }
}
