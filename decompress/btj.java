import java.util.Iterator;
import android.view.View;
import java.lang.ref.WeakReference;
import com.twitter.ui.widget.DockLayout$c;

// 
// Decompiled by Procyon v0.6.0
// 

public final class btj extends DockLayout$c
{
    public final WeakReference<atj> a;
    public final View b;
    public boolean c;
    
    public btj(final atj atj, final View b) {
        this.c = true;
        this.a = new WeakReference<atj>(atj);
        this.b = b;
    }
    
    public final void b(final int n) {
        final atj atj = this.a.get();
        if (atj == null) {
            return;
        }
        final jsj e2 = atj.E2();
        if (e2 == null) {
            return;
        }
        final Iterator iterator = e2.a().iterator();
        while (iterator.hasNext()) {
            final xzt xzt = (xzt)r9x.i(atj.y3((esj)iterator.next()), (Class)xzt.class);
            if (xzt != null) {
                int height;
                if (this.c) {
                    height = this.b.getHeight();
                }
                else {
                    height = 0;
                }
                xzt.N(height + n);
            }
        }
    }
    
    public final void d(final boolean c) {
        this.c = c;
    }
}
