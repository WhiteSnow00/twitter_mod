import java.util.Objects;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class yvp extends ste implements qsb<qo7, fzv>
{
    public final awp D0;
    public final String E0;
    public final us7 F0;
    public final ftb<tj7, Context, fzv> G0;
    
    public yvp(final awp d0, final String e0, final us7 f0, final ftb<? super tj7, ? super Context, fzv> g0) {
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = (ftb<tj7, Context, fzv>)g0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final qo7 qo7 = (qo7)o;
        final awp d0 = this.D0;
        czd.e((Object)qo7, "finalInboxItem");
        final String e0 = this.E0;
        final us7 f0 = this.F0;
        final ftb<tj7, Context, fzv> g0 = this.G0;
        Objects.requireNonNull(d0);
        czd.f((Object)e0, "messageText");
        czd.f((Object)f0, "content");
        czd.f((Object)g0, "goToConversation");
        d0.h.c(trc.c().b((orc)d0.c(qo7, e0, f0)).G((lj6)new tg((qsb)new zvp(d0, qo7, f0, g0), 12), (lj6)jub.e));
        return fzv.a;
    }
}
