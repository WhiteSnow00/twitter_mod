import android.util.AttributeSet;
import android.content.Context;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public class eax<V extends View> extends c<V>
{
    public gax a;
    public int b;
    
    public eax() {
        this.b = 0;
    }
    
    public eax(final Context context, final AttributeSet set) {
        super(context, set);
        this.b = 0;
    }
    
    @Override
    public boolean i(final CoordinatorLayout coordinatorLayout, final V v, int b) {
        this.u(coordinatorLayout, v, b);
        if (this.a == null) {
            this.a = new gax((View)v);
        }
        final gax a = this.a;
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
        final gax a = this.a;
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
        coordinatorLayout.u(v, n);
    }
    
    public final boolean v(final int b) {
        final gax a = this.a;
        if (a != null) {
            return a.b(b);
        }
        this.b = b;
        return false;
    }
}
