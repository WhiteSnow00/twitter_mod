import java.util.Iterator;
import android.os.Handler;
import android.database.ContentObserver;

// 
// Decompiled by Procyon v0.6.0
// 

public final class qbz extends ContentObserver
{
    public final tbz a;
    
    public qbz(final tbz a) {
        this.a = a;
        super((Handler)null);
    }
    
    public final void onChange(final boolean b) {
        final tbz a = this.a;
        synchronized (a.d) {
            a.e = null;
            bez.h.incrementAndGet();
            monitorexit(a.d);
            synchronized (a) {
                final Iterator iterator = a.f.iterator();
                while (iterator.hasNext()) {
                    ((xbz)iterator.next()).a();
                }
            }
        }
    }
}
