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

public final class ciy extends Fragment implements jbf
{
    public static final WeakHashMap<Activity, WeakReference<ciy>> F0;
    public final Map<String, LifecycleCallback> C0;
    public int D0;
    public Bundle E0;
    
    static {
        F0 = new WeakHashMap<Activity, WeakReference<ciy>>();
    }
    
    public ciy() {
        this.C0 = DesugarCollections.synchronizedMap((Map)new at0());
        this.D0 = 0;
    }
    
    public final void a(final String s, final LifecycleCallback lifecycleCallback) {
        if (!this.C0.containsKey(s)) {
            this.C0.put(s, lifecycleCallback);
            if (this.D0 > 0) {
                ((Handler)new xdz(Looper.getMainLooper())).post((Runnable)new b9y(this, lifecycleCallback, s));
            }
            return;
        }
        throw new IllegalArgumentException(xa0.B(new StringBuilder(s.length() + 59), "LifecycleCallback with tag ", s, " already added to this fragment."));
    }
    
    public final void dump(final String s, final FileDescriptor fileDescriptor, final PrintWriter printWriter, final String[] array) {
        super.dump(s, fileDescriptor, printWriter, array);
        final Iterator<LifecycleCallback> iterator = this.C0.values().iterator();
        while (iterator.hasNext()) {
            iterator.next().a(s, fileDescriptor, printWriter, array);
        }
    }
    
    public final <T extends LifecycleCallback> T l(final String s, final Class<T> clazz) {
        return clazz.cast(this.C0.get(s));
    }
    
    public final void onActivityResult(final int n, final int n2, final Intent intent) {
        super.onActivityResult(n, n2, intent);
        final Iterator<LifecycleCallback> iterator = this.C0.values().iterator();
        while (iterator.hasNext()) {
            iterator.next().d(n, n2, intent);
        }
    }
    
    public final void onCreate(final Bundle e0) {
        super.onCreate(e0);
        this.D0 = 1;
        this.E0 = e0;
        for (final Map.Entry<K, LifecycleCallback> entry : this.C0.entrySet()) {
            final LifecycleCallback lifecycleCallback = entry.getValue();
            Bundle bundle;
            if (e0 != null) {
                bundle = e0.getBundle((String)entry.getKey());
            }
            else {
                bundle = null;
            }
            lifecycleCallback.e(bundle);
        }
    }
    
    public final void onDestroy() {
        super.onDestroy();
        this.D0 = 5;
        final Iterator<LifecycleCallback> iterator = this.C0.values().iterator();
        while (iterator.hasNext()) {
            Objects.requireNonNull((Object)iterator.next());
        }
    }
    
    public final void onResume() {
        super.onResume();
        this.D0 = 3;
        final Iterator<LifecycleCallback> iterator = this.C0.values().iterator();
        while (iterator.hasNext()) {
            iterator.next().f();
        }
    }
    
    public final void onSaveInstanceState(final Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle == null) {
            return;
        }
        for (final Map.Entry<K, LifecycleCallback> entry : this.C0.entrySet()) {
            final Bundle bundle2 = new Bundle();
            entry.getValue().g(bundle2);
            bundle.putBundle((String)entry.getKey(), bundle2);
        }
    }
    
    public final void onStart() {
        super.onStart();
        this.D0 = 2;
        final Iterator<LifecycleCallback> iterator = this.C0.values().iterator();
        while (iterator.hasNext()) {
            iterator.next().h();
        }
    }
    
    public final void onStop() {
        super.onStop();
        this.D0 = 4;
        final Iterator<LifecycleCallback> iterator = this.C0.values().iterator();
        while (iterator.hasNext()) {
            iterator.next().i();
        }
    }
    
    public final Activity p0() {
        return this.getActivity();
    }
}
