import android.graphics.Rect;
import android.view.View;
import android.view.View$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class t6h implements View$OnClickListener
{
    public final u6h$b D0;
    public final u6h E0;
    public final fk1 F0;
    public final boolean G0;
    
    public t6h(final u6h$b d0, final u6h e0, final fk1 f0, final boolean g0) {
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
    }
    
    public final void onClick(final View view) {
        final u6h$b d0 = this.D0;
        final u6h e0 = this.E0;
        final fk1 f0 = this.F0;
        final boolean g0 = this.G0;
        czd.f((Object)d0, "$viewHolder");
        czd.f((Object)e0, "this$0");
        czd.f((Object)f0, "$entry");
        final Rect rect = new Rect();
        ((View)d0.N0).getGlobalVisibleRect(rect);
        ((lj7)e0.s).b(f0, rect, g0, e0.C.o(d0.Q0, f0), "cell_heart_button");
    }
}
