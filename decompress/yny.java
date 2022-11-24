import android.os.BaseBundle;
import android.util.Log;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class yny extends wpy
{
    public final AtomicReference a;
    public boolean b;
    
    public yny() {
        this.a = new AtomicReference();
    }
    
    public static final Object D1(final Bundle bundle, final Class clazz) {
        if (bundle != null) {
            final Object value = ((BaseBundle)bundle).get("r");
            if (value != null) {
                try {
                    return clazz.cast(value);
                }
                catch (final ClassCastException ex) {
                    Log.w("AM", String.format("Unexpected object type. Expected, Received: %s, %s", clazz.getCanonicalName(), value.getClass().getCanonicalName()), (Throwable)ex);
                    throw ex;
                }
            }
        }
        return null;
    }
    
    public final String U0(final long n) {
        return (String)D1(this.x(n), String.class);
    }
    
    public final void m(final Bundle bundle) {
        final AtomicReference a = this.a;
        monitorenter(a);
        try {
            this.a.set(bundle);
            this.b = true;
            return;
        }
        finally {
            this.a.notify();
        }
        try {}
        finally {
            monitorexit(a);
        }
    }
    
    public final Bundle x(final long n) {
        synchronized (this.a) {
            if (!this.b) {
                try {
                    this.a.wait(n);
                }
                catch (final InterruptedException ex) {
                    return null;
                }
            }
            return this.a.get();
        }
    }
}
