import androidx.recyclerview.widget.RecyclerView;
import android.view.View;
import android.graphics.Rect;
import android.content.res.Resources;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bjd extends c4e$a
{
    public final int a;
    
    public bjd(final Resources resources) {
        zzd.f((Object)resources, "res");
        this.a = resources.getDimensionPixelSize(2131166410);
    }
    
    public final void k(final Rect rect, final View view, final RecyclerView recyclerView, final c7x c7x) {
        zzd.f((Object)rect, "outRect");
        zzd.f((Object)view, "view");
        zzd.f((Object)recyclerView, "parent");
        zzd.f((Object)c7x, "viewHolder");
        if (c7x instanceof hp7$a) {
            rect.top = this.a;
        }
    }
}
