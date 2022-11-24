import androidx.recyclerview.widget.RecyclerView$c0;
import android.view.View;
import android.view.View$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kyi extends j4e<lvi>
{
    public rop N0;
    
    public kyi(final f5e<lvi> f5e, final kcm kcm) {
        super((f5e)f5e, (d4e)new kyi.kyi$a(), kcm);
    }
    
    public final void D(final j4e$b j4e$b, final int n) {
        super.D(j4e$b, n);
        final View f0 = ((RecyclerView$c0)j4e$b).F0;
        Object onClickListener;
        if (this.N0 != null) {
            onClickListener = new jyi((Object)this, n, 0);
        }
        else {
            onClickListener = null;
        }
        f0.setOnClickListener((View$OnClickListener)onClickListener);
    }
    
    public final /* bridge */ void p(final RecyclerView$c0 recyclerView$c0, final int n) {
        this.D((j4e$b)recyclerView$c0, n);
    }
}
