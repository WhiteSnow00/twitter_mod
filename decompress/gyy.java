import android.os.Bundle;
import android.app.Activity;
import android.app.Application$ActivityLifecycleCallbacks;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gyy implements Application$ActivityLifecycleCallbacks
{
    public final kyy D0;
    
    public gyy(final kyy d0) {
        this.D0 = d0;
    }
    
    public final void onActivityCreated(final Activity activity, final Bundle bundle) {
        this.D0.b((xvy)new iwy(this, bundle, activity));
    }
    
    public final void onActivityDestroyed(final Activity activity) {
        this.D0.b((xvy)new fty(this, activity));
    }
    
    public final void onActivityPaused(final Activity activity) {
        this.D0.b((xvy)new uwy(this, activity));
    }
    
    public final void onActivityResumed(final Activity activity) {
        this.D0.b((xvy)new hry(this, activity));
    }
    
    public final void onActivitySaveInstanceState(final Activity activity, final Bundle bundle) {
        final eny eny = new eny();
        this.D0.b((xvy)new zxy(this, activity, eny));
        final Bundle x = eny.x(50L);
        if (x != null) {
            bundle.putAll(x);
        }
    }
    
    public final void onActivityStarted(final Activity activity) {
        this.D0.b((xvy)new mwy(this, activity));
    }
    
    public final void onActivityStopped(final Activity activity) {
        this.D0.b((xvy)new zry(this, activity));
    }
}
