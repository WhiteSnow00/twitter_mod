import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView$m;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView$r;

// 
// Decompiled by Procyon v0.6.0
// 

public final class tnw extends RecyclerView$r
{
    public final GridLayoutManager a;
    public final p7j<Integer> b;
    
    public tnw(final GridLayoutManager a, final p7j<Integer> b) {
        this.a = a;
        this.b = b;
    }
    
    public final void b(final RecyclerView recyclerView, int w, final int n) {
        e0e.f((Object)recyclerView, "recyclerView");
        if (((RecyclerView$m)this.a).W() - ((LinearLayoutManager)this.a).t1() < 5) {
            final p7j<Integer> b = this.b;
            w = ((RecyclerView$m)this.a).W();
            ((u6j$a)b).onNext((Object)w);
        }
    }
}
