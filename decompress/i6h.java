import android.view.View;
import android.view.View$OnLongClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class i6h implements View$OnLongClickListener
{
    public final m6h D0;
    public final fk1 E0;
    public final p6h F0;
    
    public i6h(final m6h d0, final fk1 e0, final p6h f0) {
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
    }
    
    public final boolean onLongClick(final View view) {
        final m6h d0 = this.D0;
        final fk1 e0 = this.E0;
        final p6h f0 = this.F0;
        czd.f((Object)d0, "this$0");
        czd.f((Object)e0, "$entry");
        czd.f((Object)f0, "$viewHolder");
        return ((lj7)d0.g).a(e0, d0.o(f0, e0));
    }
}
