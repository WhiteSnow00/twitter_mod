import androidx.recyclerview.widget.RecyclerView$l;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;

// 
// Decompiled by Procyon v0.6.0
// 

public final class sqd extends sl8
{
    public final LayoutInflater G0;
    public final n7m H0;
    public final RecyclerView I0;
    
    public sqd(final LayoutInflater g0, final View view) {
        super(view);
        final RecyclerView i0 = (RecyclerView)view.findViewById(2131431383);
        this.I0 = i0;
        this.H0 = new n7m(g0.getContext(), i0);
        this.G0 = g0;
    }
    
    public final void b0(final boolean b) {
        final View f0 = super.F0;
        int visibility;
        if (b) {
            visibility = 0;
        }
        else {
            visibility = 8;
        }
        f0.setVisibility(visibility);
    }
    
    public final void l0(final d4e<ipp> d4e) {
        this.I0.h((RecyclerView$l)new cpp(this.G0.getContext().getResources(), (d4e)d4e, 0));
    }
}
