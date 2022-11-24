import java.util.Objects;
import android.view.View;
import com.twitter.tweetview.core.TweetViewViewModel;
import com.twitter.tweetview.core.ui.tombstone.InnerTombstoneViewDelegateBinder;
import android.view.View$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class qrd implements View$OnClickListener
{
    public final InnerTombstoneViewDelegateBinder F0;
    public final iuu G0;
    public final TweetViewViewModel H0;
    public final mit I0;
    public final iba J0;
    public final d1p K0;
    
    public qrd(final InnerTombstoneViewDelegateBinder f0, final iuu g0, final TweetViewViewModel h0, final mit i0, final iba j0, final d1p k0) {
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
        this.J0 = j0;
        this.K0 = k0;
    }
    
    public final void onClick(final View view) {
        final InnerTombstoneViewDelegateBinder f0 = this.F0;
        final iuu g0 = this.G0;
        final TweetViewViewModel h0 = this.H0;
        final mit i0 = this.I0;
        final iba j0 = this.J0;
        final d1p k0 = this.K0;
        Objects.requireNonNull(f0);
        hp6 h2;
        if (g0 == null) {
            h2 = null;
        }
        else {
            h2 = g0.k.H0;
        }
        final xzu b = h0.b();
        int h3;
        if (g0 == null) {
            h3 = -1;
        }
        else {
            h3 = ((vxs)g0).h();
        }
        if (z8t.a(h3)) {
            i0.b0(false);
            cqu cqu = TweetViewViewModel.I0;
            jv1 s = new jv1((uda)null);
            hp6 a;
            boolean c;
            boolean e;
            iuu f2;
            boolean m;
            int l2;
            boolean o;
            String u;
            boolean b2;
            boolean b3;
            boolean b4;
            boolean b5;
            String s2;
            nkq nkq;
            boolean b6;
            boolean b7;
            if (b != null) {
                a = b.a;
                c = b.c;
                final boolean d = b.d;
                e = b.e;
                f2 = b.f;
                cqu = b.g;
                final boolean h4 = b.h;
                final boolean l = b.i;
                m = b.j;
                final boolean k2 = b.k;
                l2 = b.l;
                final String m2 = b.m;
                final nkq n = b.n;
                o = b.o;
                final boolean p = b.p;
                final boolean q = b.q;
                s = b.s;
                u = b.u;
                b2 = d;
                b3 = h4;
                b4 = l;
                b5 = k2;
                s2 = m2;
                nkq = n;
                b6 = p;
                b7 = q;
            }
            else {
                a = null;
                c = true;
                b2 = false;
                e = false;
                f2 = null;
                b3 = false;
                b4 = false;
                m = false;
                b5 = false;
                l2 = 1;
                s2 = null;
                nkq = null;
                o = false;
                b6 = false;
                b7 = false;
                u = null;
            }
            xzu xzu;
            if (a != null) {
                xzu = new xzu(a, true, c, b2, e, f2, cqu, b3, b4, m, b5, l2, s2, nkq, o, b6, b7, (xzu$b)null, s, u, 655360);
            }
            else {
                xzu = null;
            }
            h0.i(xzu);
        }
        else if (h2 != null) {
            final gra d2 = f0.d;
            final iuu$b iuu$b = new iuu$b(h2.D());
            ((iuu$a)iuu$b).k = h2;
            final int a2 = o5j.a;
            hsv p2;
            if (g0 == null) {
                p2 = null;
            }
            else {
                p2 = g0.p;
            }
            ((iuu$a)iuu$b).o = p2;
            ((iuu$a)iuu$b).n = "NonCompliant";
            ((View$OnClickListener)d2.a((Object)((z4j)iuu$b).e())).onClick(view);
        }
        if (j0 != null) {
            final fg4 fg4 = new fg4(dda.Companion.b(j0, "inner_tombstone", "click"));
            ((o1p)fg4).i(k0);
            sbw.b((tlm)fg4);
        }
    }
}
