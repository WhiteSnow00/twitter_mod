import com.twitter.media.ui.image.c;
import com.twitter.media.ui.fresco.FrescoMediaImageView;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.Objects;
import android.widget.ImageView$ScaleType;
import android.view.View;
import android.view.View$OnClickListener;
import java.util.Arrays;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ax7 extends pue implements stb<gx7$c$b, vzv>
{
    public final tw7 F0;
    
    public ax7(final tw7 f0) {
        this.F0 = f0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final gx7$c$b gx7$c$b = (gx7$c$b)o;
        e0e.f((Object)gx7$c$b, "$this$distinct");
        final tw7 f0 = this.F0;
        final CharSequence c = gx7$c$b.c;
        f0.G0.g((List)h3a.F0);
        final TextView o2 = f0.O0;
        final String format = String.format(f0.U0, Arrays.copyOf(new Object[] { c }, 1));
        e0e.e((Object)format, "format(format, *args)");
        o2.setText((CharSequence)format);
        f0.Q0.setText((CharSequence)f0.V0);
        ((TextView)f0.R0).setText((CharSequence)f0.W0);
        final TextView m0 = f0.M0;
        e0e.e((Object)m0, "unSearchedTextView");
        ((View)m0).setVisibility(8);
        final ViewGroup n0 = f0.N0;
        e0e.e((Object)n0, "noResultsContainer");
        ((View)n0).setVisibility(0);
        ((View)f0.R0).setOnClickListener((View$OnClickListener)new d1x((Object)f0, 8));
        if (egz.s()) {
            final zrm$a companion = zrm.Companion;
            final FrescoMediaImageView p = f0.P0;
            e0e.e((Object)p, "noResultsImageView");
            final zrm b = companion.b((View)p);
            final FrescoMediaImageView p2 = f0.P0;
            final t3a t0 = t3a.T0;
            ((c)p2).setDefaultDrawable(b.j(2131231227));
            final FrescoMediaImageView p3 = f0.P0;
            e0e.e((Object)p3, "noResultsImageView");
            ((View)p3).setVisibility(0);
            ((c)f0.P0).setDefaultDrawableScaleType(ImageView$ScaleType.CENTER_INSIDE);
        }
        else {
            final FrescoMediaImageView p4 = f0.P0;
            e0e.e((Object)p4, "noResultsImageView");
            ((View)p4).setVisibility(0);
        }
        Objects.requireNonNull(this.F0);
        final p18 a = p18.a;
        sbw.b((tlm)new fg4(p18.d));
        return vzv.a;
    }
}
