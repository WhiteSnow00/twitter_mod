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

public final class gtf extends cx6
{
    public final hrf a1;
    public final jtf b1;
    
    public gtf(final Activity activity, final r29 r29, final lk3 lk3, final ri3 ri3, final vi3 vi3, final vk3 vk3, final uk3 uk3, final jtf b1, final sfv sfv, final hrf a1, final zv1 zv1) {
        super(activity, r29, lk3, ri3, vi3, vk3, uk3, fwe.g((Context)activity, r29), sfv, zv1);
        this.a1 = a1;
        this.b1 = b1;
        ((p8x)this).C1(b1.a);
    }
    
    public final /* bridge */ void E1(final Object o) {
        this.I1((fai)o);
    }
    
    public final void I1(final fai fai) {
        super.I1(fai);
        final jtf b1 = this.b1;
        final grf a = this.a1.a(fai.b(), fai.b.f, super.V0, (cwf)null);
        final htf b2 = b1.b;
        Objects.requireNonNull(b2);
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
        final itf a2 = b2.a;
        final b8d h = a.h;
        ((c)a2.G0).setDefaultDrawable((Drawable)new ColorDrawable(b1b.B(a2.F0.getContext(), 2130968590)));
        if (h != null) {
            ((View)a2.G0).setVisibility(0);
            ((c)a2.G0).setImageType("card");
            ((c)a2.G0).p(a9d.d(h.F0, h.G0, (z6w)null));
            ((View)a2.G0).setTag((Object)"thumbnail");
            ((AspectRatioFrameLayout)a2.G0).setAspectRatio(h.d(1.0f));
        }
        else {
            ((c)a2.G0).p((z8d$a)null);
            ((View)a2.G0).setVisibility(8);
            ((View)a2.G0).setTag((Object)null);
        }
        b2.a.I0.setText((CharSequence)text2);
        b2.a.H0.setText((CharSequence)text);
        b2.a.F0.setOnClickListener((View$OnClickListener)new qsk((Object)new obs((Object)b2, (Object)((z4j)new LiveEventConfiguration$a(a.c)).e(), 1), 1));
    }
}
