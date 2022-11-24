import android.os.Handler;
import java.util.Objects;
import android.content.Intent;
import java.util.Iterator;
import java.io.PrintWriter;
import java.io.FileDescriptor;
import android.os.Looper;
import j$.util.DesugarCollections;
import android.os.Bundle;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.util.Map;
import java.lang.ref.WeakReference;
import android.app.Activity;
import java.util.WeakHashMap;
import android.app.Fragment;

// 
// Decompiled by Procyon v0.6.0
// 

public final class njy extends Fragment implements rbf
{
    public static final WeakHashMap<Activity, WeakReference<njy>> I0;
    public final Map<String, LifecycleCallback> F0;
    public int G0;
    public Bundle H0;
    
    static {
        I0 = new WeakHashMap<Activity, WeakReference<njy>>();
    }
    
    public njy() {
        this.F0 = DesugarCollections.synchronizedMap((Map)new ws0());
        this.G0 = 0;
    }
    
    public final void a(final String s, final LifecycleCallback lifecycleCallback) {
        if (!this.F0.containsKey(s)) {
            this.F0.put(s, lifecycleCallback);
            if (this.G0 > 0) {
                ((Handler)new kfz(Looper.getMainLooper())).post((Runnable)new lay(this, lifecycleCallback, s));
            }
            return;
        }
        throw new IllegalArgumentException(wa0.y(new StringBuilder(s.length() + 59), "LifecycleCallback with tag ", s, " already added to this fragment."));
    }
    
    public final void dump(final String s, final FileDescriptor fileDescriptor, final PrintWriter printWriter, final String[] array) {
        super.dump(s, fileDescriptor, printWriter, array);
        final Iterator<LifecycleCallback> iterator = this.F0.values().iterator();
        while (iterator.hasNext()) {
            iterator.next().a(s, fileDescriptor, printWriter, array);
        }
    }
    
    public final <T extends LifecycleCallback> T k(final String s, final Class<T> clazz) {
        return clazz.cast(this.F0.get(s));
    }
    
    public final Activity o0() {
        return this.getActivity();
    }
    
    public final void onActivityResult(final int n, final int n2, final Intent intent) {
        super.onActivityResult(n, n2, intent);
        final Iterator<LifecycleCallback> iterator = this.F0.values().iterator();
        while (iterator.hasNext()) {
            iterator.next().d(n, n2, intent);
        }
    }
    
    public final void onCreate(final Bundle h0) {
        super.onCreate(h0);
        this.G0 = 1;
        this.H0 = h0;
        for (final Map.Entry<K, LifecycleCallback> entry : this.F0.entrySet()) {
            final LifecycleCallback lifecycleCallback = entry.getValue();
            Bundle bundle;
            if (h0 != null) {
                bundle = h0.getBundle((String)entry.getKey());
            }
            else {
                bundle = null;
            }
            lifecycleCallback.e(bundle);
        }
    }
    
    public final void onDestroy() {
        super.onDestroy();
        this.G0 = 5;
        final Iterator<LifecycleCallback> iterator = this.F0.values().iterator();
        while (iterator.hasNext()) {
            Objects.requireNonNull((Object)iterator.next());
        }
    }
    
    public final void onResume() {
        super.onResume();
        this.G0 = 3;
        final Iterator<LifecycleCallback> iterator = this.F0.values().iterator();
        while (iterator.hasNext()) {
            iterator.next().f();
        }
    }
    
    public final void onSaveInstanceState(final Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle == null) {
            return;
        }
        for (final Map.Entry<K, LifecycleCallback> entry : this.F0.entrySet()) {
            final Bundle bundle2 = new Bundle();
            entry.getValue().g(bundle2);
            bundle.putBundle((String)entry.getKey(), bundle2);
        }
    }
    
    public final void onStart() {
        super.onStart();
        this.G0 = 2;
        final Iterator<LifecycleCallback> iterator = this.F0.values().iterator();
        while (iterator.hasNext()) {
            iterator.next().h();
        }
    }
    
    public final void onStop() {
        super.onStop();
        this.G0 = 4;
        final Iterator<LifecycleCallback> iterator = this.F0.values().iterator();
        while (iterator.hasNext()) {
            iterator.next().i();
        }
    }
}
