import java.io.IOException;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class drl extends jo1<Long>
{
    public final /* synthetic */ erl D0;
    
    public drl(final erl d0) {
        this.D0 = d0;
    }
    
    public final void onComplete() {
        final brl c = this.D0.c;
        Objects.requireNonNull(c);
        brl.a(new zf4(nca.f((ada)c.b, "", "", "success")));
    }
    
    public final void onError(final Throwable t) {
        if (!(t instanceof IOException)) {
            e9a.d(t);
        }
        final brl c = this.D0.c;
        Objects.requireNonNull(c);
        brl.a(new zf4(nca.f((ada)c.b, "", "", "failure")));
        this.D0.e.a(21600000L);
    }
    
    public final void onNext(final Object o) {
        final long longValue = (long)o;
        final t3s a = mq1.a;
        this.D0.e.a(Math.max(longValue - System.currentTimeMillis(), 1L));
    }
}
