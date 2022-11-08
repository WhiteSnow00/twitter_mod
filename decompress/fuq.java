import androidx.recyclerview.widget.RecyclerView$m;
import java.util.Set;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$r;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fuq extends RecyclerView$r
{
    public final /* synthetic */ euq a;
    public final /* synthetic */ c4e<wdr> b;
    
    public fuq(final euq a, final c4e<wdr> b) {
        this.a = a;
        this.b = b;
    }
    
    public final void a(final RecyclerView recyclerView, final int n) {
        zzd.f((Object)recyclerView, "recyclerView");
        if (n == 0 && this.a.Z0.get()) {
            final udr i0 = this.a.I0;
            final y4e f0 = this.b.F0;
            zzd.e((Object)f0, "adapter.itemProvider");
            final RecyclerView$m layoutManager = ((RecyclerView)this.a.O0).getLayoutManager();
            zzd.d((Object)layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            i0.a(f0, (LinearLayoutManager)layoutManager, (Set)this.a.Y0);
        }
    }
}
