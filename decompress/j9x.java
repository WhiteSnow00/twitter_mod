import android.util.AttributeSet;
import android.content.Context;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public class j9x<V extends View> extends c<V>
{
    public l9x a;
    public int b;
    
    public j9x() {
        this.b = 0;
    }
    
    public j9x(final Context context, final AttributeSet set) {
        super(context, set);
        this.b = 0;
    }
    
    @Override
    public boolean i(final CoordinatorLayout coordinatorLayout, final V v, int b) {
        this.u(coordinatorLayout, v, b);
        if (this.a == null) {
            this.a = new l9x((View)v);
        }
        final l9x a = this.a;
        a.b = a.a.getTop();
        a.c = a.a.getLeft();
        this.a.a();
        b = this.b;
        if (b != 0) {
            this.a.b(b);
            this.b = 0;
        }
        return true;
    }
    
    public final int t() {
        final l9x a = this.a;
        int d;
        if (a != null) {
            d = a.d;
        }
        else {
            d = 0;
        }
        return d;
    }
    
    public void u(final CoordinatorLayout coordinatorLayout, final V v, final int n) {
        coordinatorLayout.u((View)v, n);
    }
    
    public final boolean v(final int b) {
        final l9x a = this.a;
        if (a != null) {
            return a.b(b);
        }
        this.b = b;
        return false;
    }
}
