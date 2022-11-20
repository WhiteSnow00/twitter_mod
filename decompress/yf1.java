import android.content.res.Configuration;
import android.os.Bundle;
import android.app.Activity;
import java.util.Iterator;
import android.content.ComponentCallbacks;
import android.app.Application;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import android.content.ComponentCallbacks2;
import android.app.Application$ActivityLifecycleCallbacks;

// 
// Decompiled by Procyon v0.6.0
// 

public final class yf1 implements Application$ActivityLifecycleCallbacks, ComponentCallbacks2
{
    public static final yf1 H0;
    public final AtomicBoolean D0;
    public final AtomicBoolean E0;
    public final ArrayList<a> F0;
    public boolean G0;
    
    static {
        H0 = new yf1();
    }
    
    public yf1() {
        this.D0 = new AtomicBoolean();
        this.E0 = new AtomicBoolean();
        this.F0 = new ArrayList<a>();
        this.G0 = false;
    }
    
    public static void a(final Application application) {
        final yf1 h0 = yf1.H0;
        synchronized (h0) {
            if (!h0.G0) {
                application.registerActivityLifecycleCallbacks((Application$ActivityLifecycleCallbacks)h0);
                application.registerComponentCallbacks((ComponentCallbacks)h0);
                h0.G0 = true;
            }
        }
    }
    
    public final void b(final boolean b) {
        synchronized (yf1.H0) {
            final Iterator<a> iterator = this.F0.iterator();
            while (iterator.hasNext()) {
                iterator.next().a(b);
            }
        }
    }
    
    public final void onActivityCreated(final Activity activity, final Bundle bundle) {
        final boolean compareAndSet = this.D0.compareAndSet(true, false);
        this.E0.set(true);
        if (compareAndSet) {
            this.b(false);
        }
    }
    
    public final void onActivityDestroyed(final Activity activity) {
    }
    
    public final void onActivityPaused(final Activity activity) {
    }
    
    public final void onActivityResumed(final Activity activity) {
        final boolean compareAndSet = this.D0.compareAndSet(true, false);
        this.E0.set(true);
        if (compareAndSet) {
            this.b(false);
        }
    }
    
    public final void onActivitySaveInstanceState(final Activity activity, final Bundle bundle) {
    }
    
    public final void onActivityStarted(final Activity activity) {
    }
    
    public final void onActivityStopped(final Activity activity) {
    }
    
    public final void onConfigurationChanged(final Configuration configuration) {
    }
    
    public final void onLowMemory() {
    }
    
    public final void onTrimMemory(final int n) {
        if (n == 20 && this.D0.compareAndSet(false, true)) {
            this.E0.set(true);
            this.b(true);
        }
    }
    
    public interface a
    {
        void a(final boolean p0);
    }
}
