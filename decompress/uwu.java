import androidx.recyclerview.widget.RecyclerView;
import com.twitter.android.videocarousel.carousel.CarouselRecyclerView;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView$e;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class uwu extends b4e<kts<?>, xwu>
{
    public final swu d;
    public final twu e;
    public final oys f;
    public final kcm g;
    
    public uwu(final swu d, final twu e, final oys f, final kcm g) {
        e0e.f((Object)d, "adapterFactory");
        e0e.f((Object)e, "eventReporter");
        e0e.f((Object)f, "timelineItemScribeReporter");
        e0e.f((Object)g, "releaseCompletable");
        super((Class)kts.class);
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
    }
    
    public final void k(final n8x n8x, Object next, final kcm kcm) {
        final xwu xwu = (xwu)n8x;
        final kts kts = (kts)next;
        e0e.f((Object)xwu, "viewHolder");
        e0e.f((Object)kts, "item");
        final List k = kts.k;
        e0e.e((Object)k, "timelineCarousel.carouselItems");
        final List r1 = qr4.r1((Iterable)k, (Class)iuu.class);
        final ArrayList j0 = new ArrayList();
        final Iterator iterator = ((ArrayList)r1).iterator();
        while (iterator.hasNext()) {
            next = iterator.next();
            if (((iuu)next).k.c0()) {
                j0.add(next);
            }
        }
        final ArrayList list = new ArrayList<hp6>(nr4.d1((Iterable)j0, 10));
        final Iterator iterator2 = j0.iterator();
        while (iterator2.hasNext()) {
            list.add(((iuu)iterator2.next()).k);
        }
        final ArrayList j2 = xwu.J0;
        Object o;
        if (j2 != null) {
            next = new ArrayList(nr4.d1((Iterable)j2, 10));
            final Iterator iterator3 = j2.iterator();
            while (true) {
                o = next;
                if (!iterator3.hasNext()) {
                    break;
                }
                ((ArrayList<hp6>)next).add(((iuu)iterator3.next()).k);
            }
        }
        else {
            o = null;
        }
        if (!e0e.a((Object)list, o)) {
            xwu.J0 = j0;
            xwu.G0.d((p4e)new zkf((Iterable)j0));
            xwu.K0.c.a();
            final b1p i = ((vxs)kts).j;
            if (i != null) {
                final wwu k2 = xwu.K0;
                Objects.requireNonNull(k2);
                k2.c.c(k2.b.a().subscribe((rk6)new ug((stb)new vwu(k2, i), 12)));
            }
        }
    }
    
    public final n8x l(final ViewGroup viewGroup) {
        e0e.f((Object)viewGroup, "parent");
        final View inflate = LayoutInflater.from(((View)viewGroup).getContext()).inflate(2131625885, viewGroup, false);
        e0e.e((Object)inflate, "from(parent.context).inf\u2026ousel_row, parent, false)");
        final xwu xwu = new xwu(inflate, this.f, this.g);
        final swu d = this.d;
        e0e.f((Object)d, "adapterFactory");
        final CarouselRecyclerView i0 = xwu.I0;
        final s4e g0 = xwu.G0;
        final em3 h0 = xwu.H0;
        e0e.f((Object)g0, "itemProvider");
        e0e.f((Object)h0, "carouselAutoPlayManager");
        ((RecyclerView)i0).setAdapter((RecyclerView$e)new rwu(h0, (f5e<iuu>)g0, (qcq<iuu>)new qcq((b4e)d.a.get()), d.b));
        return (n8x)xwu;
    }
    
    public final void m(final n8x n8x, final Object o) {
        final xwu xwu = (xwu)n8x;
        final kts kts = (kts)o;
        e0e.f((Object)xwu, "viewHolder");
        e0e.f((Object)kts, "item");
        final twu e = this.e;
        Objects.requireNonNull(e);
        final umh b = ((vxs)kts).b;
        b1p b2;
        if (b != null) {
            b2 = b.b;
        }
        else {
            b2 = null;
        }
        String f;
        if (b2 == null || (f = b2.f) == null) {
            f = "";
        }
        final fg4 a = e.a(f, "", "impression");
        final ufv ufv = new ufv();
        ufv.R0 = b2;
        ufv.v = String.valueOf(kts.k.size());
        ((o1p)a).i((d1p)ufv);
        e.b.c((tlm)a);
    }
    
    public static final class a extends b4e$a<kts<?>>
    {
        public a(final mxe<uwu> mxe) {
            e0e.f((Object)mxe, "lazyItemBinder");
            super((Class)kts.class, (mxe)mxe);
        }
        
        public final boolean a(final Object o) {
            final kts kts = (kts)o;
            e0e.f((Object)kts, "item");
            final List k = kts.k;
            e0e.e((Object)k, "item.carouselItems");
            final boolean empty = k.isEmpty();
            boolean b = false;
            if (!empty) {
                for (final vxs vxs : k) {
                    if (!(vxs instanceof iuu) || !e0e.a((Object)((iuu)vxs).l, (Object)"Media")) {
                        return b;
                    }
                }
            }
            b = true;
            return b;
        }
    }
}
