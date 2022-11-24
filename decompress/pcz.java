import java.util.Iterator;
import android.os.Handler;
import android.database.ContentObserver;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pcz extends ContentObserver
{
    public final scz a;
    
    public pcz(final scz a) {
        this.a = a;
        super((Handler)null);
    }
    
    public final void onChange(final boolean b) {
        final scz a = this.a;
        synchronized (a.d) {
            a.e = null;
            afz.h.incrementAndGet();
            monitorexit(a.d);
            synchronized (a) {
                final Iterator iterator = a.f.iterator();
                while (iterator.hasNext()) {
                    ((wcz)iterator.next()).a();
                }
            }
        }
    }
}
