import android.app.Activity;
import com.twitter.app.common.args.ContentViewArgs;
import android.content.Context;
import java.util.Objects;
import com.twitter.business.api.ModuleOverviewContentViewArgs;
import com.twitter.business.api.ModuleOverviewContentViewResult;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fnh implements xlx<knh, Object, enh>
{
    public final nn F0;
    public final y4l G0;
    public final lnh H0;
    
    public fnh(final View view, final nn f0, final y4l g0, final lnh h0) {
        e0e.f((Object)view, "rootView");
        e0e.f((Object)f0, "activityFinisher");
        e0e.f((Object)g0, "professionalConversionFlowLauncher");
        e0e.f((Object)h0, "moduleOverviewScreenLauncher");
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
    }
    
    public final void T(final ccx ccx) {
        e0e.f((Object)ccx, "state");
    }
    
    public final void r(final Object o) {
        final enh enh = (enh)o;
        e0e.f((Object)enh, "effect");
        if (enh instanceof enh$b) {
            final jo6<ContentViewArgs, ModuleOverviewContentViewResult> a = this.H0.a.a(ModuleOverviewContentViewResult.class);
            a.d((Object)ModuleOverviewContentViewArgs.INSTANCE);
            a.c();
        }
        else if (enh instanceof enh$a) {
            final y4l g0 = this.G0;
            Objects.requireNonNull(g0);
            final Activity a2 = g0.a;
            a2.startActivity(ak1.p((Context)a2, 4));
        }
        this.F0.a();
    }
    
    public final t5j<Object> w() {
        final t5j empty = t5j.empty();
        e0e.e((Object)empty, "empty()");
        return (t5j<Object>)empty;
    }
}
