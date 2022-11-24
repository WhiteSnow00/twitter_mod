import androidx.coordinatorlayout.widget.CoordinatorLayout;
import android.util.AttributeSet;
import android.content.Context;
import androidx.coordinatorlayout.widget.CoordinatorLayout$c;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public class xax<V extends View> extends CoordinatorLayout$c<V>
{
    public zax a;
    public int b;
    
    public xax() {
        this.b = 0;
    }
    
    public xax(final Context context, final AttributeSet set) {
        super(context, set);
        this.b = 0;
    }
    
    public boolean i(final CoordinatorLayout coordinatorLayout, final V v, int b) {
        this.u(coordinatorLayout, v, b);
        if (this.a == null) {
            this.a = new zax((View)v);
        }
        final zax a = this.a;
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
        final zax a = this.a;
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
        final zax a = this.a;
        if (a != null) {
            return a.b(b);
        }
        this.b = b;
        return false;
    }
}
