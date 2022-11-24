import android.graphics.Canvas;
import androidx.recyclerview.widget.RecyclerView;
import android.view.View;
import android.graphics.Rect;
import android.content.Context;
import android.graphics.Paint;

// 
// Decompiled by Procyon v0.6.0
// 

public final class uz7 extends j4e$a
{
    public final int a;
    public final Paint b;
    
    public uz7(final Context context) {
        e0e.f((Object)context, "context");
        this.a = context.getResources().getDimensionPixelSize(2131165342);
        final Paint b = new Paint();
        b.setColor(b1b.B(context, 2130969041));
        this.b = b;
    }
    
    public final void k(final Rect rect, final View view, final RecyclerView recyclerView, final n8x n8x) {
        e0e.f((Object)rect, "outRect");
        e0e.f((Object)view, "view");
        e0e.f((Object)recyclerView, "parent");
        e0e.f((Object)n8x, "viewHolder");
        rect.bottom += this.a;
    }
    
    public final void l(final Canvas canvas, final View view, final RecyclerView recyclerView, final n8x n8x) {
        e0e.f((Object)canvas, "canvas");
        e0e.f((Object)recyclerView, "parent");
        e0e.f((Object)n8x, "viewHolder");
        canvas.drawRect(new Rect(view.getLeft(), view.getBottom(), view.getRight(), view.getBottom() + this.a), this.b);
    }
}
