import java.util.Iterator;
import java.util.Collection;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class feg implements Runnable
{
    public final /* synthetic */ geg C0;
    
    public feg(final geg c0) {
        this.C0 = c0;
    }
    
    @Override
    public final void run() {
        if (this.C0.d == null) {
            return;
        }
        final eeg d = this.C0.d;
        final Object a = d.a;
        if (a != null) {
            final geg c0 = this.C0;
            synchronized (c0) {
                final Iterator iterator = new ArrayList(c0.a).iterator();
                while (iterator.hasNext()) {
                    ((wdg)iterator.next()).a(a);
                }
                return;
            }
        }
        final geg c2 = this.C0;
        final Throwable b = d.b;
        synchronized (c2) {
            final ArrayList list = new ArrayList(c2.b);
            if (list.isEmpty()) {
                z9g.c("Lottie encountered an error but no failure listener was added:", b);
                monitorexit(c2);
            }
            else {
                final Iterator iterator2 = list.iterator();
                while (iterator2.hasNext()) {
                    ((wdg)iterator2.next()).a((Object)b);
                }
            }
        }
    }
}
