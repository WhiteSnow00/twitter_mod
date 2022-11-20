import android.view.ViewGroup$MarginLayoutParams;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView$n;
import android.graphics.Canvas;
import androidx.recyclerview.widget.RecyclerView$y;
import androidx.recyclerview.widget.RecyclerView;
import android.view.View;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.recyclerview.widget.RecyclerView$l;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jxh extends RecyclerView$l
{
    public final Drawable a;
    
    public jxh(final Drawable a) {
        this.a = a;
    }
    
    public final void g(final Rect rect, final View view, final RecyclerView recyclerView, final RecyclerView$y recyclerView$y) {
        super.g(rect, view, recyclerView, recyclerView$y);
        if (recyclerView.O(view) == 0) {
            return;
        }
        rect.top = this.a.getIntrinsicHeight();
    }
    
    public final void h(final Canvas canvas, final RecyclerView recyclerView) {
        final int paddingLeft = ((View)recyclerView).getPaddingLeft();
        final int width = ((View)recyclerView).getWidth();
        final int paddingRight = ((View)recyclerView).getPaddingRight();
        for (int childCount = ((ViewGroup)recyclerView).getChildCount(), i = 0; i < childCount - 1; ++i) {
            final View child = ((ViewGroup)recyclerView).getChildAt(i);
            final int n = child.getBottom() + ((ViewGroup$MarginLayoutParams)child.getLayoutParams()).bottomMargin;
            this.a.setBounds(paddingLeft, n, width - paddingRight, this.a.getIntrinsicHeight() + n);
            this.a.draw(canvas);
        }
    }
}
