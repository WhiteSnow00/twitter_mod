import java.util.List;
import com.twitter.notifications.settings.implementation.TweetSettingsViewModel;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ksu extends gue implements rtb<nsu, nsu>
{
    public final /* synthetic */ TweetSettingsViewModel C0;
    public final /* synthetic */ List<oui> D0;
    
    public ksu(final TweetSettingsViewModel c0, final List<oui> d0) {
        this.C0 = c0;
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        zzd.f((Object)o, "$this$setState");
        final String quantityString = this.C0.O0.getResources().getQuantityString(2131820669, this.D0.size(), new Object[] { this.D0.size() });
        zzd.e((Object)quantityString, "context.resources.getQua\u2026ize\n                    )");
        return new nsu(quantityString, (List)this.D0);
    }
}
