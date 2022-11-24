import android.view.View;
import android.util.SparseArray;
import androidx.recyclerview.widget.RecyclerView$c0;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kwk extends RecyclerView$c0
{
    public final SparseArray<View> Z0;
    public boolean a1;
    public boolean b1;
    
    public kwk(final View view) {
        super(view);
        final SparseArray z0 = new SparseArray(4);
        (this.Z0 = (SparseArray<View>)z0).put(16908310, (Object)view.findViewById(16908310));
        z0.put(16908304, (Object)view.findViewById(16908304));
        z0.put(16908294, (Object)view.findViewById(16908294));
        z0.put(2131429517, (Object)view.findViewById(2131429517));
        z0.put(16908350, (Object)view.findViewById(16908350));
    }
    
    public final View q0(final int n) {
        final View view = (View)this.Z0.get(n);
        if (view != null) {
            return view;
        }
        final View viewById = super.F0.findViewById(n);
        if (viewById != null) {
            this.Z0.put(n, (Object)viewById);
        }
        return viewById;
    }
}
