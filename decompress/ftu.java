import java.util.List;
import com.twitter.notifications.settings.implementation.TweetSettingsViewModel;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ftu extends ste implements qsb<itu, itu>
{
    public final TweetSettingsViewModel D0;
    public final List<pui> E0;
    
    public ftu(final TweetSettingsViewModel d0, final List<pui> e0) {
        this.D0 = d0;
        this.E0 = e0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        czd.f((Object)o, "$this$setState");
        final String quantityString = this.D0.P0.getResources().getQuantityString(2131820669, this.E0.size(), new Object[] { this.E0.size() });
        czd.e((Object)quantityString, "context.resources.getQua\u2026ize\n                    )");
        return new itu(quantityString, (List)this.E0);
    }
}
