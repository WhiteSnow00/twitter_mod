import java.util.Iterator;
import android.graphics.Rect;
import java.util.Collection;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class zqe implements ViewTreeObserver$OnGlobalLayoutListener
{
    public final are$a D0;
    
    public zqe(final are$a d0) {
        this.D0 = d0;
    }
    
    public final void onGlobalLayout() {
        final are$a d0 = this.D0;
        czd.f((Object)d0, "this$0");
        if (!d0.c.isEmpty()) {
            d0.d.setEmpty();
            d0.a.getWindowVisibleDisplayFrame(d0.d);
            final int height = d0.a.getRootView().getHeight();
            final Rect d2 = d0.d;
            final int e = height - (d2.bottom - d2.top);
            if (e < d0.b) {
                d0.e = e;
            }
            final int e2 = d0.e;
            final ArrayList list = new ArrayList();
            for (final WeakReference weakReference : d0.c) {
                final are$a$a are$a$a = (are$a$a)weakReference.get();
                if (are$a$a == null) {
                    list.add(weakReference);
                }
                else if (e > d0.b) {
                    are$a$a.c(e - e2);
                }
                else {
                    are$a$a.b();
                }
            }
            d0.c.removeAll(list);
        }
    }
}
