import android.view.View;
import android.view.View$OnClickListener;
import android.view.ViewGroup;
import tv.periscope.model.b;
import androidx.recyclerview.widget.RecyclerView$c0;
import androidx.recyclerview.widget.RecyclerView$e;

// 
// Decompiled by Procyon v0.6.0
// 

public final class qj2 extends RecyclerView$e<RecyclerView$c0>
{
    public final d4e<b> G0;
    public final s2h H0;
    public final nnl<b> I0;
    public boolean J0;
    
    public qj2(final d4e<b> g0, final l9w l9w, final hf2 hf2, final m8d m8d) {
        this.I0 = (nnl<b>)new nnl();
        this.G0 = g0;
        this.H0 = new s2h(hf2, l9w, m8d);
    }
    
    public final int c() {
        return this.G0.a() + (this.J0 ? 1 : 0);
    }
    
    public final long d(final int n) {
        if (n < this.G0.a()) {
            return this.G0.getItemId(n);
        }
        return -1L;
    }
    
    public final int e(int n) {
        if (n < this.G0.a()) {
            n = 0;
        }
        else {
            n = 1;
        }
        return n;
    }
    
    public final void p(final RecyclerView$c0 recyclerView$c0, final int n) {
        if (n < this.G0.a()) {
            final s2h h0 = this.H0;
            final int a = c5j.a;
            ((om2)h0).b((dn2)recyclerView$c0, (b)this.G0.getItem(n));
        }
    }
    
    public final RecyclerView$c0 r(final ViewGroup viewGroup, final int n) {
        if (n == 0) {
            return (RecyclerView$c0)new t2h(da8.h(viewGroup, 2131624128, viewGroup, false), (View$OnClickListener)new fpf(this, 21));
        }
        final ehl ehl = new ehl(da8.h(viewGroup, 2131624636, viewGroup, false));
        ((View)ehl.X0).setVisibility(0);
        return (RecyclerView$c0)ehl;
    }
}
