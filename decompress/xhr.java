import com.twitter.media.ui.image.MediaImageView;
import androidx.recyclerview.widget.RecyclerView$y;
import androidx.recyclerview.widget.RecyclerView;
import android.view.View;
import android.graphics.Rect;
import androidx.recyclerview.widget.RecyclerView$l;

// 
// Decompiled by Procyon v0.6.0
// 

public final class xhr extends RecyclerView$l
{
    public final int a;
    
    public xhr(final int a) {
        this.a = a;
    }
    
    public final void g(final Rect rect, final View view, final RecyclerView recyclerView, final RecyclerView$y recyclerView$y) {
        if (view instanceof MediaImageView) {
            final int a = this.a;
            rect.set(a, a, a, a);
        }
    }
}
