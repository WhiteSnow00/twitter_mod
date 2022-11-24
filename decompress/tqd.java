import java.util.Map;
import java.util.List;
import com.twitter.onboarding.ocf.settings.AbstractSettingsViewModel;

// 
// Decompiled by Procyon v0.6.0
// 

public final class tqd extends AbstractSettingsViewModel
{
    public tqd(final duo duo) {
        super(duo);
    }
    
    public final void c(final List<rrp> list, final Map<String, fpp> map) {
        if (!super.a.isEmpty()) {
            return;
        }
        final Map a = rrp.a((List)list);
        super.a.putAll(a);
        super.b.putAll(a);
        final uv1<List<ipp>> c = (uv1<List<ipp>>)super.c;
        final stb<rrp, ipp> a2 = (stb<rrp, ipp>)jdj.a;
        c.onNext((Object)jdj.a((List)list, (stb)jdj.a, list.size()));
    }
}
