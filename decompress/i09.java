import android.content.Context;
import android.preference.Preference;
import java.util.Collection;
import com.twitter.android.settings.DiscoverabilityActivity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class i09 implements osc$a<x0a>
{
    public final DiscoverabilityActivity F0;
    
    public i09(final DiscoverabilityActivity f0) {
        this.F0 = f0;
    }
    
    public final void a(final aw0 aw0) {
    }
    
    public final void b(final aw0 aw0) {
        final x0a x0a = (x0a)aw0;
        final obw m1 = x0a.m1;
        if (((osc)x0a).T().b && m1 != null && kr4.t((Collection)m1.a)) {
            final DiscoverabilityActivity f0 = this.F0;
            ((Preference)f0.b1).setSummary((CharSequence)((Context)f0).getString(2131957732));
        }
    }
    
    public final void c(final aw0 aw0, final boolean b) {
    }
}
