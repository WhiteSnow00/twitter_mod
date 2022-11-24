import android.view.View;
import java.util.Objects;
import android.view.ViewGroup;
import java.util.ArrayList;
import com.twitter.media.ui.fresco.FrescoMediaImageView;
import java.util.List;
import android.util.SparseArray;
import com.twitter.util.user.UserIdentifier;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class vwb extends wuj
{
    public final sfv H0;
    public final Context I0;
    public final UserIdentifier J0;
    public final vwb.vwb$a K0;
    public final dnl L0;
    public final xxb M0;
    public final SparseArray<wwb> N0;
    public final List<FrescoMediaImageView> O0;
    public List<oxb> P0;
    public m2s$c Q0;
    
    public vwb(final Context i0, final UserIdentifier j0, final xxb m0, final sfv h0, final dnl l0, final vwb.vwb$a k0) {
        this.I0 = i0;
        this.J0 = j0;
        this.M0 = m0;
        this.H0 = h0;
        this.L0 = l0;
        this.K0 = k0;
        this.N0 = (SparseArray<wwb>)new SparseArray();
        this.O0 = new ArrayList();
    }
    
    public final Object H(final ViewGroup viewGroup, final int n) {
        final oxb oxb = this.P0.get(n);
        final dnl l0 = this.L0;
        final Context i0 = this.I0;
        final xxb m0 = this.M0;
        final sfv h0 = this.H0;
        final ArrayList o0 = this.O0;
        Objects.requireNonNull(l0);
        final int a = oxb.a();
        Object o2;
        if (a != 1) {
            if (a != 2) {
                throw new IllegalArgumentException("Gallery item type not supported");
            }
            o2 = new fyb(i0, viewGroup, n, m0, h0, (List)o0);
        }
        else {
            o2 = new wxb(i0, viewGroup, n, m0, h0, (List)o0);
        }
        ((wwb)o2).a(oxb, this.Q0, this.K0);
        final ViewGroup b = ((wwb)o2).b;
        viewGroup.addView((View)b);
        this.N0.append(n, o2);
        return b;
    }
    
    public final boolean I(final View view, final Object o) {
        return o == view;
    }
    
    public final wwb Q(final int n) {
        return (wwb)this.N0.get(n);
    }
    
    public final oxb R(final int n) {
        final List<oxb> p = this.P0;
        if (p != null && n >= 0 && p.size() > n) {
            return this.P0.get(n);
        }
        return null;
    }
    
    public final void S(final List<oxb> p) {
        this.P0 = p;
        this.J();
    }
    
    public final int getCount() {
        final List<oxb> p0 = this.P0;
        if (p0 == null) {
            return 0;
        }
        return p0.size();
    }
    
    public final void i(final ViewGroup viewGroup, final int n, final Object o) {
        final View view = (View)o;
        final wwb wwb = (wwb)this.N0.get(n);
        if (wwb != null) {
            wwb.b();
            viewGroup.removeView(view);
            this.N0.remove(n);
        }
    }
    
    public final int k(final Object o) {
        int n;
        if (((wwb)((View)o).getTag()).a < this.getCount()) {
            n = -1;
        }
        else {
            n = -2;
        }
        return n;
    }
}
