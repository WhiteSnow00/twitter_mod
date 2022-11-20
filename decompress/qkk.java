import android.content.Context;
import com.twitter.media.ui.image.c;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewStub;
import java.util.Objects;
import android.widget.RatingBar;
import android.widget.TextView;
import com.twitter.media.ui.fresco.FrescoMediaImageView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class qkk extends ste implements qsb<xp2, fzv>
{
    public final hkk D0;
    
    public qkk(final hkk d0) {
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final xp2 xp2 = (xp2)o;
        czd.f((Object)xp2, "$this$distinct");
        final hkk d0 = this.D0;
        final xp2.a d2 = xp2.d;
        final ViewStub s0 = d0.S0;
        Label_0172: {
            if (d0.Y0 == null) {
                final boolean b = d2 instanceof xp2$a$a;
                int layoutResource;
                if (b) {
                    layoutResource = 2131625154;
                }
                else {
                    if (!(d2 instanceof xp2$a$c)) {
                        break Label_0172;
                    }
                    layoutResource = 2131625160;
                }
                s0.setLayoutResource(layoutResource);
                d0.Y0 = d0.S0.inflate();
                d0.T0 = (FrescoMediaImageView)d0.D0.findViewById(2131427860);
                final View y0 = d0.Y0;
                if (y0 != null) {
                    d0.U0 = (TextView)y0.findViewById(2131427862);
                    d0.V0 = (TextView)y0.findViewById(2131427861);
                    if (b) {
                        d0.W0 = (RatingBar)y0.findViewById(2131430872);
                        d0.X0 = (TextView)y0.findViewById(2131430430);
                    }
                }
            }
        }
        final hkk d3 = this.D0;
        final String a = xp2.d.a();
        Objects.requireNonNull(d3);
        if (a == null || vkr.V((CharSequence)a)) {
            final FrescoMediaImageView t0 = d3.T0;
            if (t0 != null) {
                ((View)t0).setVisibility(8);
            }
        }
        else {
            final x7d$a g = x7d.g(a);
            final FrescoMediaImageView t2 = d3.T0;
            if (t2 != null) {
                ((c)t2).p(g);
            }
            final FrescoMediaImageView t3 = d3.T0;
            if (t3 != null) {
                ((View)t3).setVisibility(0);
            }
            final FrescoMediaImageView p = d3.P0;
            if (p != null) {
                ((c)p).p(g);
            }
        }
        final TextView u0 = this.D0.U0;
        if (u0 != null) {
            u0.setText((CharSequence)xp2.d.c());
        }
        final xp2.a d4 = xp2.d;
        if (d4 instanceof xp2$a$c) {
            final TextView v0 = this.D0.V0;
            if (v0 != null) {
                final String b2 = d4.b();
                final StringBuilder sb = new StringBuilder();
                sb.append("@");
                sb.append(b2);
                v0.setText((CharSequence)sb.toString());
            }
            final hkk d5 = this.D0;
            ((TextView)d5.M0).setText((CharSequence)((Context)d5.E0).getString(2131952968));
            final View y2 = this.D0.Y0;
            if (y2 != null) {
                y2.setVisibility(0);
            }
        }
        else if (d4 instanceof xp2$a$a) {
            final RatingBar w0 = this.D0.W0;
            if (w0 != null) {
                w0.setRating(((xp2$a$a)d4).g.a);
            }
            final TextView x0 = this.D0.X0;
            String string = null;
            Label_0549: {
                if (x0 != null) {
                    final Resources resources = ((View)x0).getResources();
                    if (resources != null) {
                        string = resources.getString(2131953588, new Object[] { o1d.h(this.D0.D0.getResources(), ((xp2$a$a)xp2.d).g.b, true) });
                        break Label_0549;
                    }
                }
                string = null;
            }
            final TextView x2 = this.D0.X0;
            if (x2 != null) {
                x2.setText((CharSequence)string);
            }
            final TextView v2 = this.D0.V0;
            if (v2 != null) {
                v2.setText((CharSequence)xp2.d.b());
            }
            final hkk d6 = this.D0;
            ((TextView)d6.M0).setText((CharSequence)((Context)d6.E0).getString(2131952956));
            final View y3 = this.D0.Y0;
            if (y3 != null) {
                y3.setVisibility(0);
            }
        }
        else if (czd.a((Object)d4, (Object)xp2$a$b.d)) {
            final View y4 = this.D0.Y0;
            if (y4 != null) {
                y4.setVisibility(8);
            }
        }
        return fzv.a;
    }
}
