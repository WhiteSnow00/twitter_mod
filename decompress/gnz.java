import android.os.SystemClock;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gnz extends pfy
{
    public final inz e;
    
    public gnz(final inz e, final vcz vcz) {
        this.e = e;
        super(vcz);
    }
    
    @Override
    public final void b() {
        final inz e = this.e;
        ((wxy)e.d).g();
        Objects.requireNonNull(((ocz)e.d).F0.S0);
        e.a(false, false, SystemClock.elapsedRealtime());
        final hty o = ((ocz)e.d).F0.o();
        Objects.requireNonNull(((ocz)e.d).F0.S0);
        o.j(SystemClock.elapsedRealtime());
    }
}
