import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import androidx.viewpager.widget.ViewPager;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ltf extends ksj implements i
{
    public ltf(final cnb cnb, final jyf jyf) {
        super(cnb, jyf.b, (List)f2a.D0, cnb.P());
    }
    
    public final void B3(final int n) {
    }
    
    public final void D(final int o0) {
        final jsj l = this.l();
        if (l != null) {
            this.m(l);
        }
        final jsj a = this.A(o0);
        if (a != null) {
            this.s(a);
            super.O0 = o0;
        }
    }
    
    public final void U(final sl1 sl1, final int n) {
    }
    
    public final int V(final String s) {
        czd.f((Object)s, "timelineId");
        final List n0 = super.N0;
        czd.e((Object)n0, "pages");
        final ArrayList list = new ArrayList(iq4.H((Iterable)n0, 10));
        final Iterator iterator = n0.iterator();
        while (iterator.hasNext()) {
            final vl1 m = ((jsj)iterator.next()).m;
            czd.d((Object)m, "null cannot be cast to non-null type com.twitter.android.liveevent.landing.timeline.LiveEventTimelineArgs");
            list.add((Object)m);
        }
        int n2 = 0;
        final Iterator iterator2 = list.iterator();
        while (iterator2.hasNext()) {
            if (czd.a((Object)s, (Object)((oxf)iterator2.next()).r())) {
                return n2;
            }
            ++n2;
        }
        n2 = -1;
        return n2;
    }
    
    public final void h2(final int n, final float n2, final int n3) {
    }
}
