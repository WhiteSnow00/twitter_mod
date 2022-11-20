import java.util.List;
import java.util.WeakHashMap;
import android.view.View$MeasureSpec;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class uhc extends eax<View>
{
    public final Rect c;
    public final Rect d;
    public int e;
    public int f;
    
    public uhc() {
        this.c = new Rect();
        this.d = new Rect();
        this.e = 0;
    }
    
    public uhc(final Context context, final AttributeSet set) {
        super(context, set);
        this.c = new Rect();
        this.d = new Rect();
        this.e = 0;
    }
    
    public final boolean j(final CoordinatorLayout coordinatorLayout, final View view, final int n, final int n2, int n3) {
        final int height = view.getLayoutParams().height;
        if (height == -1 || height == -2) {
            final View w = this.w(coordinatorLayout.g(view));
            if (w != null) {
                final int size = View$MeasureSpec.getSize(n3);
                if (size > 0) {
                    final WeakHashMap a = j6x.a;
                    n3 = size;
                    if (j6x$d.b(w)) {
                        final opx lastWindowInsets = coordinatorLayout.getLastWindowInsets();
                        n3 = size;
                        if (lastWindowInsets != null) {
                            n3 = lastWindowInsets.i();
                            n3 = size + (lastWindowInsets.f() + n3);
                        }
                    }
                }
                else {
                    n3 = ((View)coordinatorLayout).getHeight();
                }
                final int z = this.z(w);
                final int measuredHeight = w.getMeasuredHeight();
                int n4;
                if (height == -1) {
                    n4 = 1073741824;
                }
                else {
                    n4 = Integer.MIN_VALUE;
                }
                coordinatorLayout.v(view, n, n2, View$MeasureSpec.makeMeasureSpec(z + n3 - measuredHeight, n4));
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final void u(final CoordinatorLayout coordinatorLayout, final View view, int x) {
        final View w = this.w(coordinatorLayout.g(view));
        if (w != null) {
            final f f = (f)view.getLayoutParams();
            final Rect c = this.c;
            c.set(((View)coordinatorLayout).getPaddingLeft() + f.leftMargin, w.getBottom() + f.topMargin, ((View)coordinatorLayout).getWidth() - ((View)coordinatorLayout).getPaddingRight() - f.rightMargin, w.getBottom() + ((View)coordinatorLayout).getHeight() - ((View)coordinatorLayout).getPaddingBottom() - f.bottomMargin);
            final opx lastWindowInsets = coordinatorLayout.getLastWindowInsets();
            if (lastWindowInsets != null) {
                final WeakHashMap a = j6x.a;
                if (j6x$d.b((View)coordinatorLayout) && !j6x$d.b(view)) {
                    c.left += lastWindowInsets.g();
                    c.right -= lastWindowInsets.h();
                }
            }
            final Rect d = this.d;
            int c2 = f.c;
            if (c2 == 0) {
                c2 = 8388659;
            }
            q7c.b(c2, view.getMeasuredWidth(), view.getMeasuredHeight(), c, d, x);
            x = this.x(w);
            view.layout(d.left, d.top - x, d.right, d.bottom - x);
            this.e = d.top - w.getBottom();
        }
        else {
            coordinatorLayout.u(view, x);
            this.e = 0;
        }
    }
    
    public abstract View w(final List<View> p0);
    
    public final int x(final View view) {
        final int f = this.f;
        int d = 0;
        if (f != 0) {
            final float y = this.y(view);
            final int f2 = this.f;
            d = ffz.D((int)(y * f2), 0, f2);
        }
        return d;
    }
    
    public float y(final View view) {
        return 1.0f;
    }
    
    public int z(final View view) {
        return view.getMeasuredHeight();
    }
}
