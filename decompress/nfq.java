import androidx.recyclerview.widget.RecyclerView$m;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView$x;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.u;
import androidx.recyclerview.widget.RecyclerView$y;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;

// 
// Decompiled by Procyon v0.6.0
// 

public class nfq extends LinearLayoutManager
{
    public nfq(final Context context, final int n) {
        super(n);
    }
    
    public final void d1(final RecyclerView recyclerView, final RecyclerView$y recyclerView$y, final int a) {
        final u u = new u(((View)recyclerView).getContext()) {
            public final float k(final DisplayMetrics displayMetrics) {
                return 100.0f / displayMetrics.densityDpi;
            }
        };
        ((RecyclerView$x)u).a = a;
        ((RecyclerView$m)this).e1((RecyclerView$x)u);
    }
}
