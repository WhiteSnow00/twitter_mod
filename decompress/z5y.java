import java.util.Objects;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.concurrent.TimeUnit;
import com.google.android.gms.common.api.Status;

// 
// Decompiled by Procyon v0.6.0
// 

public final class z5y implements u2k$a
{
    public final u2k a;
    public final rcs b;
    public final v2k.a c;
    
    public z5y(final u2k a, final rcs b, final v2k.a c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final void a(Status status) {
        if (status.p()) {
            final u2k a = this.a;
            final TimeUnit milliseconds = TimeUnit.MILLISECONDS;
            status = (Status)a;
            Objects.requireNonNull(status);
            iuk.H(((BasePendingResult)status).j ^ true, (Object)"Result has already been consumed.");
            try {
                if (!((BasePendingResult)status).d.await(0L, milliseconds)) {
                    ((BasePendingResult)status).e(Status.N0);
                }
            }
            catch (final InterruptedException ex) {
                ((BasePendingResult)status).e(Status.L0);
            }
            iuk.H(((BasePendingResult)status).f(), (Object)"Result is not ready.");
            this.b.b(this.c.a(((BasePendingResult)status).h()));
            return;
        }
        this.b.a(iuk.T(status));
    }
}
