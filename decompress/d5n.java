import android.view.View;
import com.twitter.ui.widget.NewItemBannerView;
import java.util.Iterator;
import java.util.Set;
import com.twitter.rooms.model.helpers.RoomUserItem;
import java.util.Collection;

// 
// Decompiled by Procyon v0.6.0
// 

public final class d5n extends ste implements qsb<t6n, fzv>
{
    public final l1n D0;
    
    public d5n(final l1n d0) {
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final t6n t6n = (t6n)o;
        czd.f((Object)t6n, "$this$distinct");
        final l1n d0 = this.D0;
        int n2 = 0;
        Label_0124: {
            if (t6n.B) {
                final Set e0 = t6n.e0;
                if (!(e0 instanceof Collection) || !e0.isEmpty()) {
                    final Iterator iterator = e0.iterator();
                    int n = 0;
                    while (true) {
                        n2 = n;
                        if (!iterator.hasNext()) {
                            break Label_0124;
                        }
                        if (((RoomUserItem)iterator.next()).getUserStatus() != wio.G0) {
                            continue;
                        }
                        if (++n >= 0) {
                            continue;
                        }
                        s9i.D();
                        throw null;
                    }
                }
            }
            n2 = 0;
        }
        if (n2 > 0) {
            d0.m1.b();
            d0.m1.setPillHeight(2131166685);
            d0.m1.d();
            final NewItemBannerView m1 = d0.m1;
            m1.setText(((View)m1).getResources().getString(2131957321, new Object[] { n2 }));
            d0.m1.c(kov.E0, kov.H0);
            d0.l(d0.m1);
        }
        else {
            d0.i(d0.m1);
        }
        return fzv.a;
    }
}
