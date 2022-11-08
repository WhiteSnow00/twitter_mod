import java.util.WeakHashMap;
import java.util.Objects;
import android.view.View;
import com.google.android.material.appbar.CollapsingToolbarLayout;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jq4 implements ogj
{
    public final /* synthetic */ CollapsingToolbarLayout C0;
    
    public jq4(final CollapsingToolbarLayout c0) {
        this.C0 = c0;
    }
    
    public final vox a(final View view, final vox vox) {
        final CollapsingToolbarLayout c0 = this.C0;
        Objects.requireNonNull(c0);
        final WeakHashMap a = p5x.a;
        vox a2;
        if (p5x$d.b((View)c0)) {
            a2 = vox;
        }
        else {
            a2 = null;
        }
        if (!a5j.a((Object)c0.a1, (Object)a2)) {
            c0.a1 = a2;
            ((View)c0).requestLayout();
        }
        return vox.a();
    }
}
