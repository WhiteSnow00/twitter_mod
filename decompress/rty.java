import android.os.Handler;
import java.util.Objects;
import android.app.Activity;
import android.content.Intent;
import android.os.Looper;
import java.io.PrintWriter;
import java.io.FileDescriptor;
import java.util.Iterator;
import j$.util.DesugarCollections;
import android.os.Bundle;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.util.Map;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import androidx.fragment.app.Fragment;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rty extends Fragment implements rbf
{
    public static final WeakHashMap<dob, WeakReference<rty>> F1;
    public final Map<String, LifecycleCallback> C1;
    public int D1;
    public Bundle E1;
    
    static {
        F1 = new WeakHashMap<dob, WeakReference<rty>>();
    }
    
    public rty() {
        this.C1 = DesugarCollections.synchronizedMap((Map)new ws0());
        this.D1 = 0;
    }
    
    public final void A1(final Bundle bundle) {
        for (final Map.Entry<K, LifecycleCallback> entry : this.C1.entrySet()) {
            final Bundle bundle2 = new Bundle();
            entry.getValue().g(bundle2);
            bundle.putBundle((String)entry.getKey(), bundle2);
        }
    }
    
    public final void B1() {
        super.k1 = true;
        this.D1 = 2;
        final Iterator<LifecycleCallback> iterator = this.C1.values().iterator();
        while (iterator.hasNext()) {
            iterator.next().h();
        }
    }
    
    public final void C1() {
        super.k1 = true;
        this.D1 = 4;
        final Iterator<LifecycleCallback> iterator = this.C1.values().iterator();
        while (iterator.hasNext()) {
            iterator.next().i();
        }
    }
    
    public final void J0(final String s, final FileDescriptor fileDescriptor, final PrintWriter printWriter, final String[] array) {
        super.J0(s, fileDescriptor, printWriter, array);
        final Iterator<LifecycleCallback> iterator = this.C1.values().iterator();
        while (iterator.hasNext()) {
            iterator.next().a(s, fileDescriptor, printWriter, array);
        }
    }
    
    public final void a(final String s, final LifecycleCallback lifecycleCallback) {
        if (!this.C1.containsKey(s)) {
            this.C1.put(s, lifecycleCallback);
            if (this.D1 > 0) {
                ((Handler)new kfz(Looper.getMainLooper())).post((Runnable)new soy(this, lifecycleCallback, s));
            }
            return;
        }
        throw new IllegalArgumentException(wa0.y(new StringBuilder(s.length() + 59), "LifecycleCallback with tag ", s, " already added to this fragment."));
    }
    
    public final void h1(final int n, final int n2, final Intent intent) {
        super.h1(n, n2, intent);
        final Iterator<LifecycleCallback> iterator = this.C1.values().iterator();
        while (iterator.hasNext()) {
            iterator.next().d(n, n2, intent);
        }
    }
    
    public final <T extends LifecycleCallback> T k(final String s, final Class<T> clazz) {
        return clazz.cast(this.C1.get(s));
    }
    
    public final void k1(final Bundle e1) {
        super.k1(e1);
        this.D1 = 1;
        this.E1 = e1;
        for (final Map.Entry<K, LifecycleCallback> entry : this.C1.entrySet()) {
            final LifecycleCallback lifecycleCallback = entry.getValue();
            Bundle bundle;
            if (e1 != null) {
                bundle = e1.getBundle((String)entry.getKey());
            }
            else {
                bundle = null;
            }
            lifecycleCallback.e(bundle);
        }
    }
    
    public final Activity o0() {
        return (Activity)this.L0();
    }
    
    public final void o1() {
        super.k1 = true;
        this.D1 = 5;
        final Iterator<LifecycleCallback> iterator = this.C1.values().iterator();
        while (iterator.hasNext()) {
            Objects.requireNonNull((Object)iterator.next());
        }
    }
    
    public final void z1() {
        super.k1 = true;
        this.D1 = 3;
        final Iterator<LifecycleCallback> iterator = this.C1.values().iterator();
        while (iterator.hasNext()) {
            iterator.next().f();
        }
    }
}
