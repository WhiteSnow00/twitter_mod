import com.twitter.media.ui.image.c;
import android.view.View;
import android.widget.TextView;
import android.view.ViewGroup;
import com.twitter.media.ui.fresco.FrescoMediaImageView;
import android.view.View$OnClickListener;
import com.twitter.media.ui.image.b$a;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class b7w extends ue<e7w>
{
    public final s5r d;
    
    public b7w(final s5r d) {
        this.d = d;
    }
    
    public final void k(final v7x v7x, final Object o, final xbm xbm) {
        final e7w e7w = (e7w)v7x;
        final fsv fsv = (fsv)o;
        ((a3e)this).i((d3e)new te());
        Objects.requireNonNull(e7w);
        final scv k = fsv.k;
        final d7w d0 = e7w.D0;
        jee.l((Object)k);
        Objects.requireNonNull(d0);
        if (k.a() != null) {
            final xh1 a = k.a();
            ((c)d0.F0).setCroppingRectangleProvider((b$a)new c7w((Object)d0, (Object)a, 0));
            final FrescoMediaImageView f0 = d0.F0;
            final soj a2 = a.a();
            ((c)f0).p(y7d.d(a2.a, a2.b, (k6w)null));
        }
        else {
            final String q0 = k.Q0;
            if (q0 != null) {
                ((c)d0.F0).p(new x7d$a(q0, (jvg)null));
            }
        }
        e7w.D0.E0.setText((CharSequence)k.N0);
        e7w.D0.D0.setOnClickListener((View$OnClickListener)new eoa((Object)e7w, (Object)k, 3));
    }
    
    public final v7x l(final ViewGroup viewGroup) {
        final View h = da8.h(viewGroup, 2131625930, viewGroup, false);
        return (v7x)new e7w(new d7w(h, (TextView)h.findViewById(2131428174), (FrescoMediaImageView)h.findViewById(2131428513)), this.d);
    }
}
