import android.app.Activity;
import android.content.Context;
import java.util.Objects;
import com.twitter.app.common.args.ContentViewArgs;
import com.twitter.business.api.ModuleOverviewContentViewArgs;
import com.twitter.business.api.ModuleOverviewContentViewResult;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lmh implements okx<qmh, Object, kmh>
{
    public final kn C0;
    public final a4l D0;
    public final rmh E0;
    
    public lmh(final View view, final kn c0, final a4l d0, final rmh e0) {
        zzd.f((Object)view, "rootView");
        zzd.f((Object)c0, "activityFinisher");
        zzd.f((Object)d0, "professionalConversionFlowLauncher");
        zzd.f((Object)e0, "moduleOverviewScreenLauncher");
        this.C0 = c0;
        this.D0 = d0;
        this.E0 = e0;
    }
    
    public final void T(final oax oax) {
        zzd.f((Object)oax, "state");
    }
    
    public final void s(final Object o) {
        final kmh kmh = (kmh)o;
        zzd.f((Object)kmh, "effect");
        if (kmh instanceof kmh$b) {
            final xn6<ContentViewArgs, ModuleOverviewContentViewResult> a = this.E0.a.a(ModuleOverviewContentViewResult.class);
            a.d((ContentViewArgs)ModuleOverviewContentViewArgs.INSTANCE);
            a.c();
        }
        else if (kmh instanceof kmh$a) {
            final a4l d0 = this.D0;
            Objects.requireNonNull(d0);
            final Activity a2 = d0.a;
            a2.startActivity(rez.p((Context)a2, 4));
        }
        this.C0.a();
    }
    
    public final b5j<Object> x() {
        final b5j empty = b5j.empty();
        zzd.e((Object)empty, "empty()");
        return (b5j<Object>)empty;
    }
}
