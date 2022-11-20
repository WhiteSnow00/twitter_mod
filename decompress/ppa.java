import android.view.ViewGroup$MarginLayoutParams;
import androidx.appcompat.widget.AppCompatTextView;
import java.util.Objects;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import android.widget.TextView;
import android.util.AttributeSet;
import com.twitter.ui.components.text.legacy.TypefacesTextView;
import java.util.List;
import com.twitter.media.ui.image.UserImageView;
import java.util.LinkedHashMap;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ppa implements ilx<wpq, woq, emq>
{
    public static final ppa.ppa$b Companion;
    public final Context D0;
    public final ViewGroup E0;
    public final int F0;
    public final int G0;
    public final int H0;
    public final rhh<wpq> I0;
    
    static {
        Companion = new ppa.ppa$b();
    }
    
    public ppa(final View view, final Context d0, final Resources resources) {
        czd.f((Object)view, "view");
        czd.f((Object)d0, "context");
        czd.f((Object)resources, "resources");
        this.D0 = d0;
        this.E0 = (ViewGroup)view;
        this.F0 = resources.getDimensionPixelOffset(2131167451);
        this.G0 = resources.getDimensionPixelOffset(2131167452);
        this.H0 = kn6.b(d0, 2131100880);
        this.I0 = (rhh<wpq>)q3j.g0((qsb)new qsb<rhh$a<wpq>, fzv>(this) {
            public final ppa D0;
            
            public final Object invoke(final Object o) {
                final rhh$a rhh$a = (rhh$a)o;
                czd.f((Object)rhh$a, "$this$watch");
                final opa opa = new opa(this.D0);
                final LinkedHashMap b = rhh$a.b;
                final rhh$a rhh$a2 = new rhh$a();
                opa.invoke((Object)rhh$a2);
                b.put(wpq.class, rhh$a2.b());
                return fzv.a;
            }
        });
    }
    
    public static final void a(final ppa ppa, final tg5 tg5) {
        ppa.E0.removeAllViews();
        ((View)ppa.E0).setVisibility(0);
        final ViewGroup e0 = ppa.E0;
        final int f0 = ppa.F0;
        final UserImageView c = c(ppa, f0, (int)(f0 * 0.33), 0, true, 4);
        final xh1 b = tg5.b();
        String a;
        if (b != null) {
            a = b.a;
        }
        else {
            a = null;
        }
        c.L(a);
        e0.addView((View)c);
    }
    
    public static final void b(final ppa ppa, final List list) {
        ppa.E0.removeAllViews();
        ((View)ppa.E0).setVisibility(0);
        final int size = list.size();
        if (size != 1) {
            if (size != 2) {
                if (size != 3) {
                    final ViewGroup e0 = ppa.E0;
                    final int n = list.size() - 3;
                    final int marginStart = (int)(ppa.F0 * 0.85);
                    final TypefacesTextView typefacesTextView = new TypefacesTextView(ppa.D0, (AttributeSet)null);
                    final Resources resources = ((View)ppa.E0).getResources();
                    int n2;
                    if ((n2 = n) > 9) {
                        n2 = 9;
                    }
                    ((TextView)typefacesTextView).setText((CharSequence)resources.getString(2131958215, new Object[] { n2 }));
                    ((AppCompatTextView)typefacesTextView).setBackgroundResource(2131230904);
                    ((TextView)typefacesTextView).setGravity(17);
                    final env b = env.b(((View)typefacesTextView).getContext());
                    czd.e((Object)b, "get(context)");
                    pps.p((TextView)typefacesTextView, b);
                    final int g0 = ppa.G0;
                    final FrameLayout$LayoutParams layoutParams = new FrameLayout$LayoutParams(g0, g0);
                    ((ViewGroup$MarginLayoutParams)layoutParams).setMarginStart(marginStart);
                    layoutParams.topMargin = 0;
                    ((View)typefacesTextView).setLayoutParams((ViewGroup$LayoutParams)layoutParams);
                    e0.addView((View)typefacesTextView);
                    final double n3 = ppa.F0;
                    final int n4 = (int)(0.58 * n3);
                    final int n5 = (int)(0.85 * n3);
                    final int n6 = (int)(n3 * 0.45);
                    final ViewGroup e2 = ppa.E0;
                    final UserImageView c = c(ppa, n4, n5, n6, false, 8);
                    c.H(list.get(2).e());
                    e2.addView((View)c);
                    final double n7 = ppa.F0;
                    final int n8 = (int)(n7 * 0.66);
                    final int n9 = (int)(0.4 * n7);
                    final int n10 = (int)(n7 * 0.8);
                    final ViewGroup e3 = ppa.E0;
                    final UserImageView c2 = c(ppa, n8, n9, n10, false, 8);
                    c2.H(list.get(1).e());
                    e3.addView((View)c2);
                    final ViewGroup e4 = ppa.E0;
                    final UserImageView c3 = c(ppa, ppa.F0, 0, 0, false, 14);
                    c3.H(list.get(0).e());
                    e4.addView((View)c3);
                }
                else {
                    final double n11 = ppa.F0;
                    final int n12 = (int)(0.58 * n11);
                    final int n13 = (int)(0.85 * n11);
                    final int n14 = (int)(n11 * 0.3);
                    final ViewGroup e5 = ppa.E0;
                    final UserImageView c4 = c(ppa, n12, n13, n14, false, 8);
                    c4.H(list.get(2).e());
                    e5.addView((View)c4);
                    final double n15 = ppa.F0;
                    final int n16 = (int)(n15 * 0.66);
                    final int n17 = (int)(0.5 * n15);
                    final int n18 = (int)(n15 * 0.8);
                    final ViewGroup e6 = ppa.E0;
                    final UserImageView c5 = c(ppa, n16, n17, n18, false, 8);
                    c5.H(list.get(1).e());
                    e6.addView((View)c5);
                    final ViewGroup e7 = ppa.E0;
                    final UserImageView c6 = c(ppa, ppa.F0, 0, 0, false, 14);
                    c6.H(list.get(0).e());
                    e7.addView((View)c6);
                }
            }
            else {
                final double n19 = ppa.F0;
                final int n20 = (int)(0.75 * n19);
                final int n21 = (int)(n19 * 0.65);
                final ViewGroup e8 = ppa.E0;
                final UserImageView c7 = c(ppa, n20, n21, n21, false, 8);
                c7.H(list.get(1).e());
                e8.addView((View)c7);
                final ViewGroup e9 = ppa.E0;
                final UserImageView c8 = c(ppa, ppa.F0, 0, 0, false, 14);
                c8.H(list.get(0).e());
                e9.addView((View)c8);
            }
        }
        else {
            final ViewGroup e10 = ppa.E0;
            final int f0 = ppa.F0;
            final UserImageView c9 = c(ppa, f0, (int)(f0 * 0.33), 0, false, 12);
            c9.H(list.get(0).e());
            e10.addView((View)c9);
        }
    }
    
    public static UserImageView c(final ppa ppa, final int size, int marginStart, int topMargin, boolean b, final int n) {
        if ((n & 0x2) != 0x0) {
            marginStart = 0;
        }
        if ((n & 0x4) != 0x0) {
            topMargin = 0;
        }
        if ((n & 0x8) != 0x0) {
            b = false;
        }
        Objects.requireNonNull(ppa);
        final UserImageView userImageView = new UserImageView(ppa.D0);
        userImageView.setSize(size);
        if (b) {
            userImageView.setShape((yrp)new mlo(ijg.a(12.0f, 12.0f, 12.0f, 12.0f)));
        }
        userImageView.F(ppa.H0, 2131167450);
        final FrameLayout$LayoutParams layoutParams = new FrameLayout$LayoutParams(size, size);
        ((ViewGroup$MarginLayoutParams)layoutParams).setMarginStart(marginStart);
        layoutParams.topMargin = topMargin;
        ((View)userImageView).setLayoutParams((ViewGroup$LayoutParams)layoutParams);
        ((View)userImageView).setVisibility(0);
        return userImageView;
    }
    
    public final void T(final jbx jbx) {
        final wpq wpq = (wpq)jbx;
        czd.f((Object)wpq, "state");
        this.I0.b((Object)wpq);
    }
    
    public final void q(final Object o) {
    }
    
    public final h5j w() {
        return zip.a();
    }
}
