import java.util.Objects;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.concurrent.TimeUnit;
import com.google.android.gms.common.api.Status;

// 
// Decompiled by Procyon v0.6.0
// 

public final class f5y implements e2k$a
{
    public final e2k a;
    public final zbs b;
    public final f2k.a c;
    
    public f5y(final e2k a, final zbs b, final f2k.a c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final void a(final Status status) {
        if (status.r()) {
            final e2k a = this.a;
            final TimeUnit milliseconds = TimeUnit.MILLISECONDS;
            final BasePendingResult basePendingResult = (BasePendingResult)a;
            Objects.requireNonNull(basePendingResult);
            eli.t(basePendingResult.j ^ true, "Result has already been consumed.");
            try {
                if (!basePendingResult.d.await(0L, milliseconds)) {
                    basePendingResult.e(Status.L0);
                }
            }
            catch (final InterruptedException ex) {
                basePendingResult.e(Status.J0);
            }
            eli.t(basePendingResult.f(), "Result is not ready.");
            this.b.b(this.c.a(basePendingResult.h()));
            return;
        }
        this.b.a((Exception)wd.o(status));
    }
}
