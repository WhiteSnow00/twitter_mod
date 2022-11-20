import android.content.Context;
import android.view.View$OnClickListener;
import com.twitter.media.ui.image.d;
import android.widget.TextView;
import android.view.View;
import com.twitter.media.ui.image.UserImageView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.twitter.media.ui.image.MediaImageView;
import com.twitter.ui.widget.BadgeView;
import android.content.res.Resources;
import android.widget.ImageView;
import java.util.Collection;
import java.util.Objects;
import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fph extends a3e<eph, rph>
{
    public final cnb d;
    public final vxs e;
    public final e3r f;
    public final UserIdentifier g;
    public final obi<?> h;
    
    public fph(final cnb d, final vxs e, final e3r f, final UserIdentifier g, final obi<?> h) {
        super((Class)eph.class);
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    public final void k(final v7x v7x, Object m0, final xbm xbm) {
        final rph rph = (rph)v7x;
        final eph eph = (eph)m0;
        Objects.requireNonNull(rph);
        final roh k = eph.k;
        ((hph)rph.E0).E0.a.setText((CharSequence)k.b);
        final t51 i = k.m;
        if (i != null) {
            final hph hph = (hph)rph.E0;
            Objects.requireNonNull(hph);
            final String c = i.c;
            jee.l((Object)c);
            hph.g(c);
            hph.F0.L(i.e);
            ((View)hph.F0).setVisibility(0);
            final ImageView g0 = hph.G0;
            int visibility;
            if (i.b) {
                visibility = 0;
            }
            else {
                visibility = 8;
            }
            g0.setVisibility(visibility);
        }
        else {
            final hph hph2 = (hph)rph.E0;
            Objects.requireNonNull(hph2);
            final String f = k.f;
            jee.l((Object)f);
            hph2.g(f);
            ((View)hph2.F0).setVisibility(8);
            hph2.G0.setVisibility(8);
        }
        final roh j = eph.k;
        final Resources f2 = rph.F0;
        final boolean d = j.d;
        String text;
        if ((text = j.g) == null) {
            text = "";
        }
        if (d) {
            text = f2.getString(2131955148);
        }
        if (!text.isEmpty()) {
            final hph hph3 = (hph)rph.E0;
            hph3.E0.c.setText((CharSequence)text);
            final hph.a e0 = hph3.E0;
            ((View)e0.c).setVisibility(0);
            e0.d.setVisibility(0);
        }
        else {
            final hph.a e2 = ((hph)rph.E0).E0;
            ((View)e2.c).setVisibility(8);
            e2.d.setVisibility(8);
        }
        final uil n = j.n;
        if (n != null && "Promoted".equalsIgnoreCase(n.b)) {
            final BadgeView j2 = ((hph)rph.E0).J0;
            final uil n2 = j.n;
            String f3;
            if (n2 != null) {
                f3 = n2.f;
            }
            else {
                f3 = null;
            }
            if (f3 != null) {
                final Resources resources = ((View)j2).getResources();
                String text2;
                if (f3.equalsIgnoreCase(j.f)) {
                    text2 = resources.getString(2131955996);
                }
                else {
                    text2 = eli.y(resources, f3);
                }
                ((TextView)j2).setText((CharSequence)text2);
                ((View)j2).setVisibility(0);
            }
        }
        else {
            ((View)((hph)rph.E0).J0).setVisibility(8);
        }
        final cph e3 = rph.E0;
        final int a = c5j.a;
        final hph hph4 = (hph)e3;
        final mfv l = eph.m;
        Label_0756: {
            if (l != null) {
                final String n3 = l.N0;
                if (n3 != null) {
                    hph4.b(n3);
                    if (!fq4.t((Collection)l.P0)) {
                        hph4.H0.L((String)l.P0.get(0));
                        ((View)hph4.H0).setVisibility(0);
                        break Label_0756;
                    }
                    hph4.a();
                    break Label_0756;
                }
            }
            final t51 m2 = j.m;
            if (m2 != null && rph.I0.hasId(m2.a)) {
                if (j.x == sph.D0) {
                    hph4.b(rph.F0.getString(2131955124));
                    hph4.E0.e.setTextColor(hph4.K0);
                }
                else {
                    hph4.b(rph.F0.getString(2131955119));
                    hph4.E0.e.setTextColor(hph4.L0);
                }
                hph4.a();
            }
            else {
                final long s = j.s;
                if (s > 0L) {
                    final Resources f4 = rph.F0;
                    hph4.b(f4.getQuantityString(2131820615, (int)s, new Object[] { o1d.g(f4, s) }));
                    hph4.a();
                }
                else {
                    ((View)hph4.E0.e).setVisibility(8);
                    hph4.a();
                }
            }
        }
        final aph t = k.t;
        if (t != null) {
            final bo6 l2 = eph.l;
            final MediaImageView i2 = ((hph)rph.E0).I0;
            final float n4 = ((View)i2).getResources().getDimensionPixelSize(2131166487) / (float)d4j.m(((View)i2).getContext(), 2130970175, 2131166485);
            i2.setScaleFactor(2.0f);
            final kph d2 = t.d;
            Objects.requireNonNull(d2);
            String s2;
            if (kph.O0.contains(d2) && l2 != null) {
                final z6d c2 = x6.c(l2);
                if (c2 != null) {
                    s2 = c2.D0;
                }
                else {
                    s2 = null;
                }
            }
            else {
                s2 = t.b.c;
            }
            if (s2 != null) {
                final edq b = t.b.b;
                final j67 a2 = l67.a(t.c, n4);
                final x7d$a d3 = y7d.d(s2, b, (k6w)null);
                ((mrm$a)d3).g = (mrm$b)new v9c(a2, b, i2);
                ((d)i2).p(d3);
            }
            else {
                ((d)i2).p((x7d$a)null);
            }
        }
        final cph e4 = rph.E0;
        m0 = new eoa((Object)rph, (Object)eph, 19);
        ((hph)e4).M0 = (View$OnClickListener)m0;
        final mph v = eph.k.v;
        if (v != null) {
            rph.H0.a((w2r)v);
        }
        else {
            rph.H0.c();
        }
        xbm.i((oj)new dt1((Object)rph, 14));
    }
    
    public final v7x l(final ViewGroup viewGroup) {
        final cnb d = this.d;
        final e3r f = this.f;
        final vxs e = this.e;
        final UserIdentifier g = this.g;
        final gph gph = new gph();
        final obi<?> h = this.h;
        final LayoutInflater from = LayoutInflater.from(((View)viewGroup).getContext());
        final ViewGroup viewGroup2 = (ViewGroup)from.inflate(2131624579, viewGroup, false);
        final View inflate = from.inflate(2131624847, viewGroup2, true);
        final UserImageView userImageView = (UserImageView)((View)viewGroup2).findViewById(2131427693);
        final UserImageView userImageView2 = (UserImageView)((View)viewGroup2).findViewById(2131431518);
        final BadgeView badgeView = (BadgeView)((View)viewGroup2).findViewById(2131430787);
        final MediaImageView mediaImageView = (MediaImageView)((View)viewGroup2).findViewById(2131432016);
        final ImageView imageView = (ImageView)((View)viewGroup2).findViewById(2131432013);
        final ImageView imageView2 = (ImageView)((View)viewGroup2).findViewById(2131432527);
        ((View)viewGroup2).findViewById(2131432012);
        final Resources resources = ((View)viewGroup).getResources();
        final int color = resources.getColor(2131100454);
        final float n = (float)resources.getDimensionPixelSize(2131165342);
        final ImageView j1 = mediaImageView.j1;
        if (j1 instanceof v72) {
            ((v72)j1).a(color, n);
        }
        final hph.a a = new hph.a(viewGroup2);
        final i71 i = nh1.i;
        return (v7x)new rph(((Context)d).getResources(), (cph)new hph(viewGroup2, a, userImageView, imageView2, userImageView2, badgeView, mediaImageView, imageView, d4j.i(inflate.getContext(), 2130969093), inflate.getResources().getColor(2131099729)), fyo.b((View)viewGroup2, f), e, g, gph, (obi)h);
    }
    
    public static final class a extends a3e$a<eph>
    {
        public a(final pwe<fph> pwe) {
            super((Class)eph.class, (pwe)pwe);
        }
        
        public final boolean a(final Object o) {
            final int n = ((eph)o).n;
            boolean b = true;
            if (n != 1) {
                b = false;
            }
            return b;
        }
    }
}
