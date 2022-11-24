import com.twitter.media.ui.image.c;
import android.view.View;
import android.view.ViewGroup;
import com.twitter.media.ui.fresco.FrescoMediaImageView;
import tv.periscope.model.b;
import java.util.regex.Pattern;
import android.widget.ImageView;
import android.graphics.drawable.ColorDrawable;
import java.util.Objects;
import android.graphics.drawable.Drawable;
import java.util.List;
import android.view.View$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class qsf extends b4e<mm3, rsf>
{
    public final lsf d;
    public final ssf e;
    public final osf f;
    
    public qsf(final lsf d, final ssf e, final osf f) {
        super((Class)mm3.class);
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public final void k(final n8x n8x, final Object o, final kcm kcm) {
        final rsf rsf = (rsf)n8x;
        final mm3 mm3 = (mm3)o;
        ((View)rsf.M0).setTag(2131428123, (Object)mm3.a);
        final lsf$a b = this.d.b(mm3);
        rsf.H0.setText((CharSequence)b.a);
        final boolean b2 = b.b;
        final ImageView i0 = rsf.I0;
        int visibility;
        if (b2) {
            visibility = 0;
        }
        else {
            visibility = 8;
        }
        i0.setVisibility(visibility);
        rsf.J0.setText(this.d.a(mm3));
        ((View)rsf.M0).setOnClickListener((View$OnClickListener)this.f);
        if (mm3.c == null) {
            final afq a = mm3.a();
            if (a != null) {
                final b8d l = zzz.L((List)a.e);
                if (l != null && flr.g((CharSequence)l.F0)) {
                    ((c)rsf.G0).p(new z8d$a(l.F0, (dwg)null));
                }
            }
        }
        final ssf e = this.e;
        final noj noj = (noj)((lhm)e.F0).c();
        final int n = 1;
        boolean b3 = false;
        Label_0254: {
            if (noj != null && noj.f()) {
                final String a2 = ((mm3)noj.c()).a;
                final String a3 = mm3.a;
                final Pattern a4 = flr.a;
                if (e0e.a((Object)a2, (Object)a3)) {
                    b3 = true;
                    break Label_0254;
                }
            }
            b3 = false;
        }
        if (b3) {
            rsf.G0.setOverlayDrawable(2131232629);
        }
        else {
            rsf.G0.setOverlayDrawable((Drawable)null);
        }
        final int j = mm3.j;
        final boolean b4 = j == 1;
        String s = "";
        if (b4) {
            final b b5 = mm3.b;
            vmw.g((Object)b5);
            final dn3 h = mm3.h;
            if (h.a != -1) {
                s = o2d.g(e.G0, h.b);
            }
            if (b5.F()) {
                ((View)rsf.N0).setVisibility(8);
                uks.f(rsf.K0, 2132017856);
                rsf.K0.setText(2131956440);
                rsf.m0(s, 2131232634, 2131232635);
            }
            else {
                ((View)rsf.N0).setVisibility(8);
                uks.f(rsf.K0, 2132017856);
                rsf.K0.setText(2131956331);
                rsf.m0(s, 2131232631, 2131232632);
            }
        }
        else {
            boolean b6 = false;
            Label_0500: {
                if (j == 3) {
                    final xnu g = mm3.g;
                    vmw.g((Object)g);
                    final hp6 a5 = e.a(g.a);
                    if (a5 != null && a5.Q()) {
                        b6 = true;
                        break Label_0500;
                    }
                }
                b6 = false;
            }
            if (b6) {
                final xnu g2 = mm3.g;
                String p3 = null;
                Label_0549: {
                    if (g2 != null) {
                        final hp6 a6 = e.a(g2.a);
                        if (a6 != null && (p3 = qds.p(a6)) != null) {
                            break Label_0549;
                        }
                    }
                    p3 = "";
                }
                final dn3 h2 = mm3.h;
                if (h2.a != -1) {
                    s = o2d.g(e.G0, h2.b);
                }
                ((View)rsf.N0).setVisibility(8);
                uks.f(rsf.K0, 2132017856);
                rsf.K0.setText((CharSequence)p3);
                rsf.m0(s, 2131232631, 2131232632);
            }
            else {
                boolean b7 = false;
                Label_0678: {
                    if (mm3.j == 3) {
                        final xnu g3 = mm3.g;
                        vmw.g((Object)g3);
                        final hp6 a7 = e.a(g3.a);
                        if (a7 != null && a7.P()) {
                            b7 = true;
                            break Label_0678;
                        }
                    }
                    b7 = false;
                }
                if (b7) {
                    ((View)rsf.N0).setVisibility(8);
                    ((View)rsf.L0).setVisibility(8);
                    uks.f(rsf.K0, 2132017856);
                    ((View)rsf.K0).setBackgroundResource(2131232631);
                    rsf.K0.setText(2131954758);
                }
                else {
                    int n2;
                    if (mm3.j == 5) {
                        n2 = n;
                    }
                    else {
                        n2 = 0;
                    }
                    if (n2 != 0) {
                        final opf c = mm3.c;
                        vmw.g((Object)c);
                        final qgv k = c.j;
                        Objects.requireNonNull(k);
                        ((View)rsf.N0).setVisibility(0);
                        rsf.N0.H(k);
                        final FrescoMediaImageView g4 = rsf.G0;
                        final Integer u = lp7.u(k.t1);
                        int n3;
                        if (u != null) {
                            n3 = u;
                        }
                        else {
                            n3 = ((View)rsf.M0).getResources().getColor(2131099763);
                        }
                        ((c)g4).setDefaultDrawable((Drawable)new ColorDrawable((int)n3));
                        if (c.a()) {
                            uks.f(rsf.K0, 2132017856);
                            rsf.K0.setText(2131954744);
                            rsf.n0(2131232631);
                        }
                        else if (c.b()) {
                            uks.f(rsf.K0, 2132017856);
                            rsf.K0.setText(2131954745);
                            rsf.n0(2131232631);
                        }
                        else {
                            uks.f(rsf.K0, 2132017856);
                            rsf.K0.setText(2131954743);
                            rsf.n0(2131232630);
                        }
                    }
                    else {
                        rsf.l0();
                    }
                }
            }
        }
        kcm.i((sj)new psf(this, rsf, 0));
    }
    
    public final n8x l(final ViewGroup viewGroup) {
        return (n8x)new rsf(m51.w(viewGroup, 2131624734, viewGroup, false));
    }
}
