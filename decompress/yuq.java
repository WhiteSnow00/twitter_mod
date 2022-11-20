import androidx.recyclerview.widget.RecyclerView$m;
import java.util.Set;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$r;

// 
// Decompiled by Procyon v0.6.0
// 

public final class yuq extends RecyclerView$r
{
    public final xuq a;
    public final h3e<ser> b;
    
    public yuq(final xuq a, final h3e<ser> b) {
        this.a = a;
        this.b = b;
    }
    
    public final void a(final RecyclerView recyclerView, final int n) {
        czd.f((Object)recyclerView, "recyclerView");
        if (n == 0 && this.a.a1.get()) {
            final qer j0 = this.a.J0;
            final d4e g0 = this.b.G0;
            czd.e((Object)g0, "adapter.itemProvider");
            final RecyclerView$m layoutManager = ((RecyclerView)this.a.P0).getLayoutManager();
            czd.d((Object)layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            j0.a((d4e<ser>)g0, (LinearLayoutManager)layoutManager, this.a.Z0);
        }
    }
}
