import android.view.View;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView$c0;
import kotlin.NoWhenBranchMatchedException;
import java.util.ArrayList;
import java.util.List;
import androidx.recyclerview.widget.RecyclerView$e;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fue extends RecyclerView$e<bue<? super aue>>
{
    public final d6w I0;
    public final List<aue> J0;
    
    public fue(final d6w i0) {
        e0e.f((Object)i0, "uriNavigator");
        this.I0 = i0;
        this.J0 = new ArrayList();
    }
    
    public final int c() {
        return this.J0.size();
    }
    
    public final int e(int n) {
        final aue aue = this.J0.get(n);
        if (aue instanceof aue.b) {
            n = 0;
        }
        else {
            if (!(aue instanceof aue.a)) {
                throw new NoWhenBranchMatchedException();
            }
            n = 1;
        }
        return n;
    }
    
    public final void p(final RecyclerView$c0 recyclerView$c0, final int n) {
        ((bue)recyclerView$c0).q0((aue)this.J0.get(n));
    }
    
    public final RecyclerView$c0 r(final ViewGroup viewGroup, final int n) {
        e0e.f((Object)viewGroup, "parent");
        final LayoutInflater from = LayoutInflater.from(((View)viewGroup).getContext());
        Object o;
        if (n != 0) {
            if (n != 1) {
                throw new Exception("Invalid view type.");
            }
            final View inflate = from.inflate(2131624681, viewGroup, false);
            e0e.e((Object)inflate, "layoutInflater.inflate(R\u2026m_feature, parent, false)");
            o = new gue(inflate, this.I0);
        }
        else {
            final View inflate2 = from.inflate(2131624680, viewGroup, false);
            e0e.e((Object)inflate2, "layoutInflater.inflate(R\u2026scription, parent, false)");
            o = new hue(inflate2);
        }
        return (RecyclerView$c0)o;
    }
}
