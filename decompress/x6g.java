import android.view.View;
import android.view.ViewGroup$LayoutParams;
import androidx.recyclerview.widget.RecyclerView$n;
import android.view.ViewGroup;

// 
// Decompiled by Procyon v0.6.0
// 

public final class x6g implements ypa<ViewGroup, y6g>
{
    public final /* bridge */ Object a(final Object o) {
        return this.f((ViewGroup)o);
    }
    
    public final y6g f(final ViewGroup viewGroup) {
        final w6g w6g = new w6g(((View)viewGroup).getContext());
        ((View)w6g).setLayoutParams((ViewGroup$LayoutParams)new RecyclerView$n(-1, -2));
        return new y6g(w6g);
    }
}
