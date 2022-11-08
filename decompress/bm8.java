import com.facebook.imagepipeline.request.a;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ScheduledExecutorService;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bm8 implements p0l<wi4<ui4>>
{
    public final p0l<wi4<ui4>> a;
    public final ScheduledExecutorService b;
    
    public bm8(final p0l<wi4<ui4>> a, final ScheduledExecutorService b) {
        this.a = a;
        this.b = b;
    }
    
    public final void a(final dk6<wi4<ui4>> dk6, final q0l q0l) {
        final a l = q0l.l();
        final ScheduledExecutorService b = this.b;
        if (b != null) {
            b.schedule((Runnable)new bm8$a(this, (dk6)dk6, q0l), l.q, TimeUnit.MILLISECONDS);
        }
        else {
            this.a.a((dk6)dk6, q0l);
        }
    }
}
