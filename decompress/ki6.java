import java.util.LinkedHashSet;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class ki6<T>
{
    public final gcs a;
    public final Context b;
    public final Object c;
    public final LinkedHashSet<ji6<T>> d;
    public T e;
    
    public ki6(Context applicationContext, final gcs a) {
        this.a = a;
        applicationContext = applicationContext.getApplicationContext();
        czd.e((Object)applicationContext, "context.applicationContext");
        this.b = applicationContext;
        this.c = new Object();
        this.d = new LinkedHashSet<ji6<T>>();
    }
    
    public abstract T a();
    
    public final void b(final ji6<T> ji6) {
        czd.f((Object)ji6, "listener");
        synchronized (this.c) {
            if (this.d.remove(ji6) && this.d.isEmpty()) {
                this.e();
            }
        }
    }
    
    public final void c(final T e) {
        synchronized (this.c) {
            final T e2 = this.e;
            if (e2 != null && czd.a((Object)e2, (Object)e)) {
                return;
            }
            this.e = e;
            ((bsx)this.a).c.execute((Runnable)new a2r((Object)mq4.M0((Iterable)this.d), (Object)this, 1));
        }
    }
    
    public abstract void d();
    
    public abstract void e();
}
