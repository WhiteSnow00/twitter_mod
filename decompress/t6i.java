import android.widget.TextView;
import android.view.View;
import android.view.ViewGroup;
import android.view.View$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class t6i extends b4e<z5i, v6i>
{
    public final znl<c6i$g> d;
    
    public t6i(final znl<c6i$g> d) {
        e0e.f((Object)d, "clickSubject");
        super((Class)z5i.class);
        this.d = d;
    }
    
    public final void k(final n8x n8x, final Object o, final kcm kcm) {
        final v6i v6i = (v6i)n8x;
        final z5i z5i = (z5i)o;
        e0e.f((Object)v6i, "viewHolder");
        e0e.f((Object)z5i, "item");
        ((TextView)v6i.Z0).setText(z9a.n(z5i.a));
        ((View)v6i.a1).setBackgroundResource(z5i.b);
        v6i.getHeldView().setOnClickListener((View$OnClickListener)new zgk((Object)this, (Object)z5i, 15));
    }
    
    public final n8x l(final ViewGroup viewGroup) {
        final View x = m51.x(viewGroup, "parent", 2131624980, viewGroup, false);
        e0e.e((Object)x, "view");
        return (n8x)new v6i(x);
    }
}
