import java.util.Iterator;
import android.view.View;
import java.lang.ref.WeakReference;
import com.twitter.ui.widget.DockLayout$c;

// 
// Decompiled by Procyon v0.6.0
// 

public final class vtj extends DockLayout$c
{
    public final WeakReference<utj> a;
    public final View b;
    public boolean c;
    
    public vtj(final utj utj, final View b) {
        this.c = true;
        this.a = new WeakReference<utj>(utj);
        this.b = b;
    }
    
    public final void b(final int n) {
        final utj utj = this.a.get();
        if (utj == null) {
            return;
        }
        final dtj e2 = utj.E2();
        if (e2 == null) {
            return;
        }
        final Iterator iterator = e2.a().iterator();
        while (iterator.hasNext()) {
            final g1u g1u = (g1u)tqb.B(utj.y3((ysj)iterator.next()), g1u.class);
            if (g1u != null) {
                int height;
                if (this.c) {
                    height = this.b.getHeight();
                }
                else {
                    height = 0;
                }
                g1u.N(height + n);
            }
        }
    }
    
    public final void d(final boolean c) {
        this.c = c;
    }
}
