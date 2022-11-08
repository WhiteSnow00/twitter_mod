import android.view.View;
import android.util.SparseArray;
import androidx.recyclerview.widget.RecyclerView$c0;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lvk extends RecyclerView$c0
{
    public final SparseArray<View> W0;
    public boolean X0;
    public boolean Y0;
    
    public lvk(final View view) {
        super(view);
        final SparseArray w0 = new SparseArray(4);
        (this.W0 = (SparseArray<View>)w0).put(16908310, (Object)view.findViewById(16908310));
        w0.put(16908304, (Object)view.findViewById(16908304));
        w0.put(16908294, (Object)view.findViewById(16908294));
        w0.put(2131429516, (Object)view.findViewById(2131429516));
        w0.put(16908350, (Object)view.findViewById(16908350));
    }
    
    public final View q0(final int n) {
        final View view = (View)this.W0.get(n);
        if (view != null) {
            return view;
        }
        final View viewById = super.C0.findViewById(n);
        if (viewById != null) {
            this.W0.put(n, (Object)viewById);
        }
        return viewById;
    }
}
