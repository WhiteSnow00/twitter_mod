import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$r;

// 
// Decompiled by Procyon v0.6.0
// 

public final class r4b extends RecyclerView$r
{
    public final p7j<kni> a;
    
    public r4b(final p7j<kni> a) {
        this.a = a;
    }
    
    public final void a(final RecyclerView recyclerView, final int n) {
        e0e.f((Object)recyclerView, "recyclerView");
        if (n == 2) {
            ((u6j$a)this.a).onNext((Object)kni.a);
        }
    }
}
