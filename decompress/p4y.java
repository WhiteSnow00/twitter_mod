import java.util.Objects;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.concurrent.TimeUnit;
import com.google.android.gms.common.api.Status;

// 
// Decompiled by Procyon v0.6.0
// 

public final class p4y implements b2k$a
{
    public final /* synthetic */ b2k a;
    public final /* synthetic */ ebs b;
    public final /* synthetic */ c2k$a c;
    
    public p4y(final b2k a, final ebs b, final c2k$a c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final void a(Status status) {
        if (status.r()) {
            final b2k a = this.a;
            final TimeUnit milliseconds = TimeUnit.MILLISECONDS;
            status = (Status)a;
            Objects.requireNonNull(status);
            xd.w(((BasePendingResult)status).j ^ true, (Object)"Result has already been consumed.");
            try {
                if (!((BasePendingResult)status).d.await(0L, milliseconds)) {
                    ((BasePendingResult)status).e(Status.K0);
                }
            }
            catch (final InterruptedException ex) {
                ((BasePendingResult)status).e(Status.I0);
            }
            xd.w(((BasePendingResult)status).f(), (Object)"Result is not ready.");
            this.b.b(this.c.a(((BasePendingResult<xrm>)status).h()));
            return;
        }
        this.b.a((Exception)wvz.k(status));
    }
}
