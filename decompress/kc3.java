import java.util.Objects;
import androidx.recyclerview.widget.RecyclerView$y;
import androidx.recyclerview.widget.RecyclerView;
import android.view.View;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kc3 extends hkf
{
    public final int c;
    
    public kc3(final Drawable drawable, final int c) {
        this.c = c;
        super(drawable);
    }
    
    public final void g(final Rect rect, final View view, final RecyclerView recyclerView, final RecyclerView$y recyclerView$y) {
        Objects.requireNonNull(recyclerView.Q(view));
        rect.top = super.a.getIntrinsicHeight() + 0;
        final int c = this.c;
        rect.left = c;
        rect.right = c;
    }
}
