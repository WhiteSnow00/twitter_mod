import android.widget.Adapter;
import android.widget.PopupWindow$OnDismissListener;
import androidx.appcompat.view.menu.b;
import androidx.appcompat.view.menu.d;
import android.widget.HeaderViewListAdapter;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.g;
import android.view.MenuItem;
import androidx.appcompat.view.menu.e;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.view.View$MeasureSpec;
import android.content.Context;
import android.widget.ListAdapter;
import android.graphics.Rect;
import android.widget.AdapterView$OnItemClickListener;
import androidx.appcompat.view.menu.i;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class x5h implements k6q, i, AdapterView$OnItemClickListener
{
    public Rect F0;
    
    public static int j(final ListAdapter listAdapter, final Context context, final int n) {
        int i = 0;
        final int measureSpec = View$MeasureSpec.makeMeasureSpec(0, 0);
        final int measureSpec2 = View$MeasureSpec.makeMeasureSpec(0, 0);
        final int count = ((Adapter)listAdapter).getCount();
        ViewGroup viewGroup = null;
        View view = null;
        int n2 = 0;
        int n3 = 0;
        while (i < count) {
            final int itemViewType = ((Adapter)listAdapter).getItemViewType(i);
            int n4;
            if (itemViewType != (n4 = n3)) {
                view = null;
                n4 = itemViewType;
            }
            Object o;
            if ((o = viewGroup) == null) {
                o = new FrameLayout(context);
            }
            view = ((Adapter)listAdapter).getView(i, view, (ViewGroup)o);
            view.measure(measureSpec, measureSpec2);
            final int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= n) {
                return n;
            }
            int n5;
            if (measuredWidth > (n5 = n2)) {
                n5 = measuredWidth;
            }
            ++i;
            n2 = n5;
            n3 = n4;
            viewGroup = (ViewGroup)o;
        }
        return n2;
    }
    
    public static boolean s(final e e) {
        final int size = e.size();
        final boolean b = false;
        int n = 0;
        boolean b2;
        while (true) {
            b2 = b;
            if (n >= size) {
                break;
            }
            final MenuItem item = e.getItem(n);
            if (item.isVisible() && item.getIcon() != null) {
                b2 = true;
                break;
            }
            ++n;
        }
        return b2;
    }
    
    public final boolean c(final g g) {
        return false;
    }
    
    public final boolean f(final g g) {
        return false;
    }
    
    public final void h(final Context context, final e e) {
    }
    
    public abstract void i(final e p0);
    
    public abstract void k(final View p0);
    
    public abstract void m(final boolean p0);
    
    public abstract void n(final int p0);
    
    public abstract void o(final int p0);
    
    public final void onItemClick(final AdapterView<?> adapterView, final View view, int n, final long n2) {
        final ListAdapter listAdapter = (ListAdapter)adapterView.getAdapter();
        d d;
        if (listAdapter instanceof HeaderViewListAdapter) {
            d = (d)((HeaderViewListAdapter)listAdapter).getWrappedAdapter();
        }
        else {
            d = (d)listAdapter;
        }
        final e f0 = d.F0;
        final MenuItem menuItem = (MenuItem)((Adapter)listAdapter).getItem(n);
        if (this instanceof b ^ true) {
            n = 0;
        }
        else {
            n = 4;
        }
        f0.t(menuItem, (i)this, n);
    }
    
    public abstract void p(final PopupWindow$OnDismissListener p0);
    
    public abstract void q(final boolean p0);
    
    public abstract void r(final int p0);
}
