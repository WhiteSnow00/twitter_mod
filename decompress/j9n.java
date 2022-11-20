import android.view.View;
import android.widget.TextView;
import com.twitter.ui.components.text.legacy.TypefacesTextView;
import java.util.Iterator;
import java.util.Set;
import java.util.List;
import com.twitter.rooms.model.helpers.RoomUserItem;
import tv.periscope.model.NarrowcastSpaceType$SuperFollowerOnly;

// 
// Decompiled by Procyon v0.6.0
// 

public final class j9n extends ste implements qsb<nan, fzv>
{
    public final d9n D0;
    
    public j9n(final d9n d0) {
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final nan nan = (nan)o;
        czd.f((Object)nan, "$this$distinct");
        final boolean b = czd.a((Object)nan.y, (Object)NarrowcastSpaceType$SuperFollowerOnly.INSTANCE) && nan.z;
        final Set a1 = onp.a1(nan.e, (Iterable)nan.f);
        int n;
        if (a1.isEmpty()) {
            n = 0;
        }
        else {
            final Iterator iterator = a1.iterator();
            int n2 = 0;
            while (true) {
                n = n2;
                if (!iterator.hasNext()) {
                    break;
                }
                if (!czd.a((Object)((RoomUserItem)iterator.next()).isBlocked(), (Object)Boolean.TRUE)) {
                    continue;
                }
                if (++n2 >= 0) {
                    continue;
                }
                s9i.D();
                throw null;
            }
        }
        final d9n d0 = this.D0;
        final TypefacesTextView z0 = d0.Z0;
        int visibility;
        if (n > 0 && !b) {
            ((TextView)z0).setText((CharSequence)d0.D0.getResources().getQuantityString(2131820673, n, new Object[] { n }));
            visibility = 0;
        }
        else {
            visibility = 8;
        }
        ((View)z0).setVisibility(visibility);
        final Set a2 = onp.a1(a1, (Iterable)nan.g);
        if (nan.w && !b) {
            ((View)this.D0.M0).setVisibility(8);
        }
        else {
            ((View)this.D0.M0).setVisibility(0);
        }
        final String c = nan.c;
        if (c != null && c.length() != 0 && (a2.isEmpty() ^ true)) {
            final ye3 d2 = nan.d;
            if (d2 != ye3.F0 && !b) {
                if (d2 == ye3.D0 && !djo.i()) {
                    final d9n d3 = this.D0;
                    d3.T0.setCheckedGuestType(1);
                    ((View)d3.T0).animate().alpha(1.0f).setDuration(300L).withStartAction((Runnable)new ol6((Object)d3, 16)).start();
                }
                else {
                    ((View)this.D0.T0).setVisibility(8);
                }
                final d9n d4 = this.D0;
                final int k = nan.k;
                Object o2;
                if (k > 0) {
                    o2 = s9i.r(new ntn(k, nan.c));
                }
                else {
                    o2 = f2a.D0;
                }
                d9n.b(d4, a2, (List)o2);
                ((View)this.D0.P0).setVisibility(0);
                ((View)this.D0.Q0).setVisibility(0);
                ((View)this.D0.S0).setVisibility(0);
                ((View)this.D0.U0.c).setVisibility(4);
                ((View)this.D0.U0.b).setVisibility(0);
                ((View)this.D0.U0.b).setVisibility(8);
                d9n.a(this.D0).setVisibility(8);
                this.D0.U0.c.b((Runnable)null);
                return fzv.a;
            }
        }
        if (b) {
            d9n.b(this.D0, (Set)p2a.D0, (List)f2a.D0);
            ((View)this.D0.P0).setVisibility(4);
            ((View)this.D0.T0).setVisibility(4);
            ((View)this.D0.Q0).setVisibility(0);
            ((View)this.D0.S0).setVisibility(0);
            ((View)this.D0.U0.c).setVisibility(4);
            ((View)this.D0.U0.b).setVisibility(8);
            this.D0.U0.c.b((Runnable)null);
            d9n.a(this.D0).setVisibility(0);
        }
        else {
            d9n.b(this.D0, (Set)p2a.D0, (List)f2a.D0);
            ((View)this.D0.P0).setVisibility(4);
            ((View)this.D0.T0).setVisibility(4);
            ((View)this.D0.Q0).setVisibility(4);
            if (((View)this.D0.U0.c).getVisibility() != 0) {
                ((View)this.D0.U0.c).setVisibility(0);
                this.D0.U0.c.c();
            }
            ((View)this.D0.U0.b).setVisibility(4);
            d9n.a(this.D0).setVisibility(8);
        }
        return fzv.a;
    }
}
