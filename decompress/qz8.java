import android.content.Context;
import android.preference.Preference;
import java.util.Collection;
import com.twitter.android.settings.DiscoverabilityActivity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class qz8 implements ksc$a<k0a>
{
    public final /* synthetic */ DiscoverabilityActivity C0;
    
    public qz8(final DiscoverabilityActivity c0) {
        this.C0 = c0;
    }
    
    public final void b(final cw0 cw0) {
        final k0a k0a = (k0a)cw0;
        final oaw j1 = k0a.j1;
        if (((ksc)k0a).T().b && j1 != null && hr4.t((Collection)j1.a)) {
            final DiscoverabilityActivity c0 = this.C0;
            ((Preference)c0.Y0).setSummary((CharSequence)((Context)c0).getString(2131957732));
        }
    }
}
