import java.util.Iterator;
import java.util.Collection;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class peg implements Runnable
{
    public final qeg F0;
    
    public peg(final qeg f0) {
        this.F0 = f0;
    }
    
    @Override
    public final void run() {
        if (this.F0.d == null) {
            return;
        }
        final oeg d = this.F0.d;
        final V a = d.a;
        if (a != null) {
            final qeg f0 = this.F0;
            synchronized (f0) {
                final Iterator iterator = new ArrayList(f0.a).iterator();
                while (iterator.hasNext()) {
                    ((geg)iterator.next()).a((Object)a);
                }
                return;
            }
        }
        final qeg f2 = this.F0;
        final Throwable b = d.b;
        synchronized (f2) {
            final ArrayList list = new ArrayList(f2.b);
            if (list.isEmpty()) {
                kag.c("Lottie encountered an error but no failure listener was added:", b);
                monitorexit(f2);
            }
            else {
                final Iterator iterator2 = list.iterator();
                while (iterator2.hasNext()) {
                    ((geg)iterator2.next()).a((Object)b);
                }
            }
        }
    }
}
