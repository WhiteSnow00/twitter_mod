import android.view.ViewGroup$MarginLayoutParams;
import androidx.recyclerview.widget.RecyclerView$n;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView$o;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dbx implements RecyclerView$o
{
    public final void b(final View view) {
    }
    
    public final void e(final View view) {
        final RecyclerView$n recyclerView$n = (RecyclerView$n)view.getLayoutParams();
        if (((ViewGroup$MarginLayoutParams)recyclerView$n).width == -1 && ((ViewGroup$MarginLayoutParams)recyclerView$n).height == -1) {
            return;
        }
        throw new IllegalStateException("Pages must fill the whole ViewPager2 (use match_parent)");
    }
}
