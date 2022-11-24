import com.twitter.media.ui.fresco.FrescoMediaImageView;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.ViewGroup;
import android.content.res.Resources;
import com.twitter.media.ui.image.UserImageView;
import android.view.View;
import android.view.View$OnLongClickListener;
import android.view.View$OnClickListener;
import java.util.Objects;
import androidx.recyclerview.widget.RecyclerView$c0;
import android.graphics.drawable.Drawable;
import java.util.List;
import android.view.LayoutInflater;
import androidx.recyclerview.widget.RecyclerView$e;

// 
// Decompiled by Procyon v0.6.0
// 

public final class an3 extends RecyclerView$e<a>
{
    public final zrm I0;
    public final LayoutInflater J0;
    public final z9p K0;
    public final s9p$d L0;
    public final List<x9p> M0;
    public final sfv N0;
    public final p6p O0;
    public final int P0;
    
    public an3(final zrm i0, final LayoutInflater j0, final z9p k0, final s9p$d l0, final List<x9p> m0, final sfv n0, final int p8, final p6p o0) {
        this.I0 = i0;
        this.J0 = j0;
        this.K0 = k0;
        this.L0 = l0;
        this.M0 = m0;
        this.N0 = n0;
        this.P0 = p8;
        this.O0 = o0;
    }
    
    public final Drawable C(final int n) {
        return ie9.c(this.I0.j(n), -1);
    }
    
    public final void D(final a a) {
        a.b1.setSize((int)this.I0.b.getDimension(2131167684));
        a.e1.setVisibility(8);
        a.f1.setVisibility(8);
    }
    
    public final int c() {
        return this.M0.size();
    }
    
    public final void p(final RecyclerView$c0 recyclerView$c0, final int n) {
        final a a = (a)recyclerView$c0;
        final x9p x9p = this.M0.get(n);
        final kjw g = x9p.g;
        final krt h = x9p.h;
        final int n2 = 8;
        if (g != null) {
            a.Z0.setMaxLines(1);
            a.Z0.setText((CharSequence)xli.c(x9p.f, x9p.b));
            a.a1.setText((CharSequence)flr.l(g.b));
            ((View)a.a1).setVisibility(0);
            final boolean b = g.e || g.i;
            final View c1 = a.c1;
            int visibility;
            if (b) {
                visibility = 0;
            }
            else {
                visibility = 8;
            }
            c1.setVisibility(visibility);
            final View d1 = a.d1;
            int visibility2 = n2;
            if (g.f) {
                visibility2 = 0;
            }
            d1.setVisibility(visibility2);
            a.b1.setDefaultDrawable(this.C(2131232410));
            final UserImageView b2 = a.b1;
            if (g.h) {
                b2.setShape((tsp)new emo());
            }
            else {
                b2.setShape((tsp)xi4.H0);
            }
            a.b1.L(g.d);
            this.D(a);
            final p6p o0 = this.O0;
            final long a2 = g.a;
            Objects.requireNonNull(o0);
            boolean b3 = false;
            Label_0301: {
                if (xli.t()) {
                    if (o0.a.r(a2) == be1.I0) {
                        b3 = true;
                        break Label_0301;
                    }
                }
                b3 = false;
            }
            if (b3) {
                final String b4 = g.b;
                final int b5 = b1b.B(this.I0.a, 2130969036);
                final Resources b6 = this.I0.b;
                final float dimension = b6.getDimension(2131167467);
                final float dimension2 = b6.getDimension(2131167684);
                final String string = b6.getString(2131956918, new Object[] { flr.l(b4) });
                a.e1.setVisibility(0);
                a.f1.setVisibility(0);
                ((FrescoMediaImageView)a.b1).setScaleDownInsideBorders(true);
                a.b1.setSize((int)(dimension2 - 2.0f * dimension));
                a.b1.A(b5, dimension);
                ((View)a.a1).setContentDescription((CharSequence)string);
            }
        }
        else if (h != null) {
            a.Z0.setMaxLines(1);
            a.Z0.setText((CharSequence)h.a);
            a.a1.setText((CharSequence)this.J0.getContext().getString(2131956922));
            a.c1.setVisibility(8);
            a.d1.setVisibility(8);
            a.b1.setDefaultDrawable(this.C(2131232507));
            a.b1.L((String)null);
            this.D(a);
        }
        else {
            a.Z0.setMaxLines(2);
            a.Z0.setText((CharSequence)xli.c(x9p.f, x9p.b));
            ((View)a.a1).setVisibility(8);
            a.c1.setVisibility(8);
            a.d1.setVisibility(8);
            a.b1.setDefaultDrawable(this.C(2131232410));
            a.b1.L((String)null);
            this.D(a);
        }
        a.F0.setOnClickListener((View$OnClickListener)new xgp(this, x9p, n));
        hdx.v(a.F0, (View$OnLongClickListener)new zm3(this, x9p));
    }
    
    public final RecyclerView$c0 r(final ViewGroup viewGroup, int n) {
        final View inflate = this.J0.inflate(2131624164, viewGroup, false);
        n = a.g1;
        final View viewById = inflate.findViewById(2131432077);
        n = o5j.a;
        return new a(inflate, (TextView)viewById, (TextView)inflate.findViewById(2131431802), (UserImageView)inflate.findViewById(2131429535), inflate.findViewById(2131432528), inflate.findViewById(2131430813), (ImageView)inflate.findViewById(2131427683), (ImageView)inflate.findViewById(2131427685));
    }
    
    public static final class a extends RecyclerView$c0
    {
        public static final int g1 = 0;
        public final TextView Z0;
        public final TextView a1;
        public final UserImageView b1;
        public final View c1;
        public final View d1;
        public final ImageView e1;
        public final ImageView f1;
        
        public a(final View view, final TextView z0, final TextView a1, final UserImageView b1, final View c1, final View d1, final ImageView e1, final ImageView f1) {
            super(view);
            this.Z0 = z0;
            this.a1 = a1;
            this.b1 = b1;
            this.c1 = c1;
            this.d1 = d1;
            this.e1 = e1;
            this.f1 = f1;
        }
    }
}
