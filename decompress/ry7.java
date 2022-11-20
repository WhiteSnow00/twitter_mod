import android.graphics.Canvas;
import androidx.recyclerview.widget.RecyclerView;
import android.view.View;
import android.graphics.Rect;
import android.content.Context;
import android.graphics.Paint;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ry7 extends h3e$a
{
    public final int a;
    public final Paint b;
    
    public ry7(final Context context) {
        czd.f((Object)context, "context");
        this.a = context.getResources().getDimensionPixelSize(2131165342);
        final Paint b = new Paint();
        b.setColor(d4j.i(context, 2130969041));
        this.b = b;
    }
    
    public final void k(final Rect rect, final View view, final RecyclerView recyclerView, final v7x v7x) {
        czd.f((Object)rect, "outRect");
        czd.f((Object)view, "view");
        czd.f((Object)recyclerView, "parent");
        czd.f((Object)v7x, "viewHolder");
        rect.bottom += this.a;
    }
    
    public final void l(final Canvas canvas, final View view, final RecyclerView recyclerView, final v7x v7x) {
        czd.f((Object)canvas, "canvas");
        czd.f((Object)recyclerView, "parent");
        czd.f((Object)v7x, "viewHolder");
        canvas.drawRect(new Rect(view.getLeft(), view.getBottom(), view.getRight(), view.getBottom() + this.a), this.b);
    }
}
