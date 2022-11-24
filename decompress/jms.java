import androidx.recyclerview.widget.RecyclerView$c0;
import java.util.List;
import android.view.ViewGroup;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jms extends bms<ims>
{
    public final cra<ViewGroup, ims, hms> N0;
    
    public jms(final List<xls> list, final ims ims, final cra<ViewGroup, ims, hms> n0, final bms$a bms$a, final int n2) {
        super((List)list, bms$a, (ga)ims, n2);
        this.N0 = n0;
    }
    
    public final RecyclerView$c0 r(final ViewGroup viewGroup, final int n) {
        return (RecyclerView$c0)this.N0.a((Object)viewGroup, (Object)super.I0);
    }
}
