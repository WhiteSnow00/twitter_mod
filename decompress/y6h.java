import android.view.View;
import android.view.View$OnLongClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class y6h implements View$OnLongClickListener
{
    public final c7h F0;
    public final jk1 G0;
    public final f7h H0;
    
    public y6h(final c7h f0, final jk1 g0, final f7h h0) {
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
    }
    
    public final boolean onLongClick(final View view) {
        final c7h f0 = this.F0;
        final jk1 g0 = this.G0;
        final f7h h0 = this.H0;
        e0e.f((Object)f0, "this$0");
        e0e.f((Object)g0, "$entry");
        e0e.f((Object)h0, "$viewHolder");
        return ((mk7)f0.g).a(g0, f0.o(h0, g0));
    }
}
