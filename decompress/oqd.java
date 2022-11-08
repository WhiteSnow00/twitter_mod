import java.util.Map;
import java.util.List;
import com.twitter.onboarding.ocf.settings.AbstractSettingsViewModel;

// 
// Decompiled by Procyon v0.6.0
// 

public final class oqd extends AbstractSettingsViewModel
{
    public oqd(final sso sso) {
        super(sso);
    }
    
    public final void c(final List<fqp> list, final Map<String, snp> map) {
        if (!super.a.isEmpty()) {
            return;
        }
        final Map<String, snp> a = fqp.a(list);
        super.a.putAll(a);
        super.b.putAll(a);
        final rv1 c = super.c;
        final rcj$b a2 = rcj.a;
        c.onNext((Object)rcj.a((List)list, (rtb)rcj.a, list.size()));
    }
}
