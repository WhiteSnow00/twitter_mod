import com.twitter.media.ui.image.AspectRatioFrameLayout;
import android.view.View;
import com.twitter.media.ui.image.c;
import android.view.View$OnClickListener;
import com.twitter.model.liveevent.LiveEventConfiguration$a;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ColorDrawable;
import java.util.Objects;
import android.content.Context;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lsf extends wv6
{
    public final kqf Y0;
    public final osf Z0;
    
    public lsf(final Activity activity, final j19 j19, final kj3 kj3, final qh3 qh3, final uh3 uh3, final tj3 tj3, final sj3 sj3, final osf z0, final efv efv, final kqf y0, final rv1 rv1) {
        super(activity, j19, kj3, qh3, uh3, tj3, sj3, ive.g((Context)activity, j19), efv, rv1);
        this.Y0 = y0;
        this.Z0 = z0;
        ((x7x)this).C1(z0.a);
    }
    
    public final /* bridge */ void E1(final Object o) {
        this.I1((m9i)o);
    }
    
    public final void I1(final m9i m9i) {
        super.I1(m9i);
        final osf z0 = this.Z0;
        final jqf a = this.Y0.a(m9i.b(), m9i.b.f, super.T0, (hvf)null);
        final msf b = z0.b;
        Objects.requireNonNull(b);
        final String e = a.e;
        String text = "";
        String text2 = e;
        if (e == null) {
            text2 = "";
        }
        final String d = a.d;
        if (d != null) {
            text = d;
        }
        final nsf a2 = b.a;
        final z6d h = a.h;
        ((c)a2.E0).setDefaultDrawable((Drawable)new ColorDrawable(d4j.i(a2.D0.getContext(), 2130968590)));
        if (h != null) {
            ((View)a2.E0).setVisibility(0);
            ((c)a2.E0).setImageType("card");
            ((c)a2.E0).p(y7d.d(h.D0, h.E0, (k6w)null));
            ((View)a2.E0).setTag((Object)"thumbnail");
            ((AspectRatioFrameLayout)a2.E0).setAspectRatio(h.d(1.0f));
        }
        else {
            ((c)a2.E0).p((x7d$a)null);
            ((View)a2.E0).setVisibility(8);
            ((View)a2.E0).setTag((Object)null);
        }
        b.a.G0.setText((CharSequence)text2);
        b.a.F0.setText((CharSequence)text);
        b.a.D0.setOnClickListener((View$OnClickListener)new esk((Object)new was((Object)b, (Object)((n4j)new LiveEventConfiguration$a(a.c)).e(), 1), 1));
    }
}
