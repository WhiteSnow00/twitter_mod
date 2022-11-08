import java.util.Objects;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ivp extends gue implements rtb<jp7, oyv>
{
    public final /* synthetic */ kvp C0;
    public final /* synthetic */ String D0;
    public final /* synthetic */ jt7 E0;
    public final /* synthetic */ gub<kk7, Context, oyv> F0;
    
    public ivp(final kvp c0, final String d0, final jt7 e0, final gub<? super kk7, ? super Context, oyv> f0) {
        this.C0 = c0;
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = (gub<kk7, Context, oyv>)f0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final jp7 jp7 = (jp7)o;
        final kvp c0 = this.C0;
        zzd.e((Object)jp7, "finalInboxItem");
        final String d0 = this.D0;
        final jt7 e0 = this.E0;
        final gub<kk7, Context, oyv> f0 = this.F0;
        Objects.requireNonNull(c0);
        zzd.f((Object)d0, "messageText");
        zzd.f((Object)e0, "content");
        zzd.f((Object)f0, "goToConversation");
        c0.h.c(psc.c().b((ksc)c0.c(jp7, d0, e0)).G((fk6)new tna((rtb)new jvp(c0, jp7, e0, (gub)f0), 8), (fk6)jvb.e));
        return oyv.a;
    }
}
