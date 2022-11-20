import android.view.ViewGroup;
import java.util.WeakHashMap;
import android.view.View;
import androidx.compose.ui.platform.AndroidComposeView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class p20 extends ste implements nsb<fzv>
{
    public final AndroidComposeView D0;
    public final r70 E0;
    
    public p20(final AndroidComposeView d0, final r70 e0) {
        this.D0 = d0;
        this.E0 = e0;
        super(0);
    }
    
    public final Object invoke() {
        ((ViewGroup)this.D0.getAndroidViewsHandler$ui_release()).removeViewInLayout((View)this.E0);
        ckv.c((Object)this.D0.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder()).remove(this.D0.getAndroidViewsHandler$ui_release().getHolderToLayoutNode().remove(this.E0));
        final r70 e0 = this.E0;
        final WeakHashMap a = j6x.a;
        j6x$d.s((View)e0, 0);
        return fzv.a;
    }
}
