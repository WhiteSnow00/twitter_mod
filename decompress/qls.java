import androidx.recyclerview.widget.RecyclerView$c0;
import java.util.List;
import android.view.ViewGroup;

// 
// Decompiled by Procyon v0.6.0
// 

public final class qls extends ils<pls>
{
    public final upa<ViewGroup, pls, ols> L0;
    
    public qls(final List<fls> list, final pls pls, final upa<ViewGroup, pls, ols> l0, final ils$a ils$a, final int n) {
        super((List)list, ils$a, (ga)pls, n);
        this.L0 = l0;
    }
    
    public final RecyclerView$c0 r(final ViewGroup viewGroup, final int n) {
        return (RecyclerView$c0)this.L0.a((Object)viewGroup, (Object)super.G0);
    }
}
