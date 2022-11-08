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

public final class kkk extends gue implements rtb<gq2, oyv>
{
    public final /* synthetic */ bkk C0;
    
    public kkk(final bkk c0) {
        this.C0 = c0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final gq2 gq2 = (gq2)o;
        zzd.f((Object)gq2, "$this$distinct");
        final bkk c0 = this.C0;
        final gq2.a d = gq2.d;
        final ViewStub r0 = c0.R0;
        Label_0166: {
            if (c0.X0 == null) {
                final boolean b = d instanceof gq2.a.a;
                int layoutResource;
                if (b) {
                    layoutResource = 2131625152;
                }
                else {
                    if (!(d instanceof gq2.a.c)) {
                        break Label_0166;
                    }
                    layoutResource = 2131625158;
                }
                r0.setLayoutResource(layoutResource);
                c0.X0 = c0.R0.inflate();
                c0.S0 = (FrescoMediaImageView)c0.C0.findViewById(2131427860);
                final View x0 = c0.X0;
                if (x0 != null) {
                    c0.T0 = (TextView)x0.findViewById(2131427862);
                    c0.U0 = (TextView)x0.findViewById(2131427861);
                    if (b) {
                        c0.V0 = (RatingBar)x0.findViewById(2131430870);
                        c0.W0 = (TextView)x0.findViewById(2131430428);
                    }
                }
            }
        }
        final bkk c2 = this.C0;
        final String a = gq2.d.a();
        Objects.requireNonNull(c2);
        if (a == null || ckr.h1((CharSequence)a)) {
            final FrescoMediaImageView s0 = c2.S0;
            if (s0 != null) {
                ((View)s0).setVisibility(8);
            }
        }
        else {
            final t8d$a g = t8d.g(a);
            final FrescoMediaImageView s2 = c2.S0;
            if (s2 != null) {
                ((c)s2).p(g);
            }
            final FrescoMediaImageView s3 = c2.S0;
            if (s3 != null) {
                ((View)s3).setVisibility(0);
            }
            final FrescoMediaImageView o2 = c2.O0;
            if (o2 != null) {
                ((c)o2).p(g);
            }
        }
        final TextView t0 = this.C0.T0;
        if (t0 != null) {
            t0.setText((CharSequence)gq2.d.c());
        }
        final gq2.a d2 = gq2.d;
        if (d2 instanceof gq2.a.c) {
            final TextView u0 = this.C0.U0;
            if (u0 != null) {
                final String b2 = d2.b();
                final StringBuilder sb = new StringBuilder();
                sb.append("@");
                sb.append(b2);
                u0.setText((CharSequence)sb.toString());
            }
            final bkk c3 = this.C0;
            ((TextView)c3.L0).setText((CharSequence)((Context)c3.D0).getString(2131952968));
            final View x2 = this.C0.X0;
            if (x2 != null) {
                x2.setVisibility(0);
            }
        }
        else if (d2 instanceof gq2.a.a) {
            final RatingBar v0 = this.C0.V0;
            if (v0 != null) {
                v0.setRating(((gq2.a.a)d2).g.a);
            }
            final TextView w0 = this.C0.W0;
            String string = null;
            Label_0525: {
                if (w0 != null) {
                    final Resources resources = ((View)w0).getResources();
                    if (resources != null) {
                        string = resources.getString(2131953588, new Object[] { j2d.h(this.C0.C0.getResources(), ((gq2.a.a)gq2.d).g.b, true) });
                        break Label_0525;
                    }
                }
                string = null;
            }
            final TextView w2 = this.C0.W0;
            if (w2 != null) {
                w2.setText((CharSequence)string);
            }
            final TextView u2 = this.C0.U0;
            if (u2 != null) {
                u2.setText((CharSequence)gq2.d.b());
            }
            final bkk c4 = this.C0;
            ((TextView)c4.L0).setText((CharSequence)((Context)c4.D0).getString(2131952956));
            final View x3 = this.C0.X0;
            if (x3 != null) {
                x3.setVisibility(0);
            }
        }
        else if (zzd.a((Object)d2, (Object)gq2.a.b.d)) {
            final View x4 = this.C0.X0;
            if (x4 != null) {
                x4.setVisibility(8);
            }
        }
        return oyv.a;
    }
}
