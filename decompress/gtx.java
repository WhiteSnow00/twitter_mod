import android.annotation.SuppressLint;
import java.util.concurrent.CancellationException;
import android.util.Log;
import java.util.concurrent.ExecutionException;
import androidx.work.c$a;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gtx implements Runnable
{
    public final String D0;
    public final htx E0;
    
    public gtx(final htx e0, final String d0) {
        this.E0 = e0;
        this.D0 = d0;
    }
    
    @SuppressLint({ "SyntheticAccessor" })
    @Override
    public final void run() {
        try {
            try {
                final c$a k0 = (c$a)((xb)this.E0.T0).get();
                if (k0 == null) {
                    final o9g e = o9g.e();
                    final String v0 = htx.V0;
                    final StringBuilder sb = new StringBuilder();
                    sb.append(this.E0.H0.c);
                    sb.append(" returned a null result. Treating it as a failure.");
                    e.c(v0, sb.toString());
                }
                final o9g e2 = o9g.e();
                final String v2 = htx.V0;
                final StringBuilder sb2 = new StringBuilder();
                sb2.append(this.E0.H0.c);
                sb2.append(" returned a ");
                sb2.append(k0);
                sb2.append(".");
                e2.a(v2, sb2.toString());
                this.E0.K0 = k0;
            }
            finally {}
        }
        catch (final ExecutionException t) {
            goto Label_0152;
        }
        catch (final InterruptedException ex) {}
        catch (final CancellationException ex2) {
            final o9g e3 = o9g.e();
            final String v3 = htx.V0;
            final StringBuilder sb3 = new StringBuilder();
            sb3.append(this.D0);
            sb3.append(" was cancelled");
            final String string = sb3.toString();
            if (((o9g$a)e3).c <= 4) {
                Log.i(v3, string, (Throwable)ex2);
            }
        }
        this.E0.c();
        return;
        this.E0.c();
    }
}
