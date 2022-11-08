import android.app.Application$ActivityLifecycleCallbacks;
import android.app.Application;

// 
// Decompiled by Procyon v0.6.0
// 

public final class xn implements Runnable
{
    public final /* synthetic */ Application C0;
    public final /* synthetic */ zn$a D0;
    
    public xn(final Application c0, final zn$a d0) {
        this.C0 = c0;
        this.D0 = d0;
    }
    
    @Override
    public final void run() {
        this.C0.unregisterActivityLifecycleCallbacks((Application$ActivityLifecycleCallbacks)this.D0);
    }
}
