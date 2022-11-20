import java.util.concurrent.TimeUnit;
import com.twitter.app.dm.request.inbox.RequestInboxViewModel;

// 
// Decompiled by Procyon v0.6.0
// 

public final class qom extends ste implements qsb<tmi, taj<? extends zr6>>
{
    public final long D0;
    public final RequestInboxViewModel E0;
    
    public qom(final long d0, final RequestInboxViewModel e0) {
        this.D0 = d0;
        this.E0 = e0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        czd.f((Object)o, "it");
        return h5j.interval(0L, this.D0, TimeUnit.MILLISECONDS).flatMap((psb)new di((qsb)new pom(this.E0), 6)).takeUntil((taj)this.E0.S0.g());
    }
}
