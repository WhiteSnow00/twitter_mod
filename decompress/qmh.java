import android.app.Activity;
import android.content.Context;
import java.util.Objects;
import com.twitter.business.api.ModuleOverviewContentViewArgs;
import com.twitter.business.api.ModuleOverviewContentViewResult;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class qmh implements ilx<vmh, Object, pmh>
{
    public final jn D0;
    public final j4l E0;
    public final wmh F0;
    
    public qmh(final View view, final jn d0, final j4l e0, final wmh f0) {
        czd.f((Object)view, "rootView");
        czd.f((Object)d0, "activityFinisher");
        czd.f((Object)e0, "professionalConversionFlowLauncher");
        czd.f((Object)f0, "moduleOverviewScreenLauncher");
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
    }
    
    public final void T(final jbx jbx) {
        czd.f((Object)jbx, "state");
    }
    
    public final void q(final Object o) {
        final pmh pmh = (pmh)o;
        czd.f((Object)pmh, "effect");
        if (pmh instanceof pmh$b) {
            final dn6 a = this.F0.a.a((Class)ModuleOverviewContentViewResult.class);
            a.d((Object)ModuleOverviewContentViewArgs.INSTANCE);
            a.c();
        }
        else if (pmh instanceof pmh$a) {
            final j4l e0 = this.E0;
            Objects.requireNonNull(e0);
            final Activity a2 = e0.a;
            a2.startActivity(gmw.r((Context)a2, 4));
        }
        this.D0.a();
    }
    
    public final h5j<Object> w() {
        final h5j empty = h5j.empty();
        czd.e((Object)empty, "empty()");
        return (h5j<Object>)empty;
    }
}
