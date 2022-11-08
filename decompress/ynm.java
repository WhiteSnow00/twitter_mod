import java.util.concurrent.TimeUnit;
import com.twitter.app.dm.request.inbox.RequestInboxViewModel;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ynm extends gue implements rtb<pmi, naj<? extends us6>>
{
    public final /* synthetic */ long C0;
    public final /* synthetic */ RequestInboxViewModel D0;
    
    public ynm(final long c0, final RequestInboxViewModel d0) {
        this.C0 = c0;
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        zzd.f((Object)o, "it");
        return b5j.interval(0L, this.C0, TimeUnit.MILLISECONDS).flatMap((qtb)new c9v((rtb)new xnm(this.D0), 6)).takeUntil((naj)this.D0.R0.g());
    }
}
