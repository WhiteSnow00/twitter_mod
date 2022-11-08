import androidx.recyclerview.widget.RecyclerView$y;
import androidx.recyclerview.widget.RecyclerView;
import android.view.View;
import android.graphics.Rect;
import android.content.res.Resources;
import androidx.recyclerview.widget.RecyclerView$l;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ynp extends RecyclerView$l
{
    public final int a;
    
    public ynp(final Resources resources) {
        this.a = resources.getDimensionPixelSize(2131166792);
    }
    
    public final void g(final Rect rect, final View view, final RecyclerView recyclerView, final RecyclerView$y recyclerView$y) {
        if (recyclerView.Q(view).H0 != 1 && recyclerView.Q(view).H0 != 2) {
            final int a = this.a;
            rect.left = a;
            rect.right = a;
        }
        else {
            rect.left = 0;
            rect.right = 0;
        }
    }
}
