import com.twitter.android.unifiedlanding.header.api.di.UnifiedLandingHeaderObjectGraph$a;
import android.view.View;
import com.twitter.app.di.app.DaggerTwApplOG$uy0;
import com.twitter.android.unifiedlanding.topic.plugin.implementation.header.di.TopicPageHeaderObjectGraph$b;
import com.twitter.app.di.app.DaggerTwApplOG$ty0;
import java.util.Objects;
import com.twitter.android.unifiedlanding.header.api.di.UnifiedLandingHeaderObjectGraph;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import com.twitter.android.unifiedlanding.topic.plugin.implementation.header.di.TopicPageHeaderObjectGraph$a;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ppt implements wsj<mpt>
{
    public final TopicPageHeaderObjectGraph$a a;
    public final LayoutInflater b;
    public final hst c;
    
    public ppt(final TopicPageHeaderObjectGraph$a a, final LayoutInflater b, final hst c) {
        e0e.f((Object)b, "layoutInflater");
        e0e.f((Object)c, "features");
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final UnifiedLandingHeaderObjectGraph a(final ViewGroup viewGroup, final vsj e, final kcm g) {
        Objects.requireNonNull(this.c);
        int n;
        if (ita.b().b("topic_landing_page_clearer_controls_enabled", false)) {
            n = 2131625826;
        }
        else {
            n = 2131625825;
        }
        final View inflate = this.b.inflate(n, viewGroup, true);
        e0e.d((Object)inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        final ViewGroup f = (ViewGroup)inflate;
        final DaggerTwApplOG$ty0 daggerTwApplOG$ty0 = (DaggerTwApplOG$ty0)this.a;
        Objects.requireNonNull(daggerTwApplOG$ty0);
        daggerTwApplOG$ty0.e = e;
        daggerTwApplOG$ty0.f = f;
        daggerTwApplOG$ty0.g = g;
        final UnifiedLandingHeaderObjectGraph a = daggerTwApplOG$ty0.a();
        ((UnifiedLandingHeaderObjectGraph$a)ad.b((io1)a, TopicPageHeaderObjectGraph$b.class)).a();
        return a;
    }
}
