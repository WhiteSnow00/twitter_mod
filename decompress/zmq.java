import android.animation.Animator;
import java.util.ArrayList;
import java.util.List;
import android.text.style.StyleSpan;
import android.text.SpannableString;
import kotlin.NoWhenBranchMatchedException;
import android.animation.AnimatorSet;
import android.animation.Animator$AnimatorListener;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.graphics.drawable.GradientDrawable;
import android.view.ViewGroup$LayoutParams;
import java.util.WeakHashMap;
import java.util.Iterator;
import android.view.View$OnAttachStateChangeListener;
import android.view.ViewOutlineProvider;
import java.util.Objects;
import com.twitter.common.ui.isTalkingView.IsTalkingView;
import android.widget.TextView;
import android.view.ViewGroup;
import android.widget.ViewSwitcher;
import com.twitter.media.ui.image.UserImageView;
import android.content.Context;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class zmq implements ilx<xmq, wmq, vmq>
{
    public static final a Companion;
    public final View D0;
    public final asq E0;
    public final ftn F0;
    public final sf G0;
    public final Context H0;
    public final UserImageView I0;
    public final ViewSwitcher J0;
    public final View K0;
    public final UserImageView L0;
    public final UserImageView M0;
    public final ViewGroup N0;
    public final View O0;
    public final TextView P0;
    public final TextView Q0;
    public final IsTalkingView R0;
    public final View S0;
    public final n4s T0;
    public xnq U0;
    public final w19 V0;
    public final rhh<xmq> W0;
    
    static {
        Companion = new a();
    }
    
    public zmq(final View d0, final asq e0, final ftn f0, final sf g0) {
        czd.f((Object)d0, "rootView");
        czd.f((Object)e0, "spacesLauncher");
        czd.f((Object)f0, "roomNuxTooltipController");
        czd.f((Object)g0, "accessibilityAnimationPreferences");
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = d0.getContext();
        final UserImageView i0 = (UserImageView)d0.findViewById(2131431562);
        this.I0 = i0;
        this.J0 = (ViewSwitcher)d0.findViewById(2131431572);
        this.K0 = d0.findViewById(2131431567);
        final UserImageView l0 = (UserImageView)d0.findViewById(2131431565);
        this.L0 = l0;
        final UserImageView m0 = (UserImageView)d0.findViewById(2131431566);
        this.M0 = m0;
        this.N0 = (ViewGroup)d0.findViewById(2131427603);
        this.O0 = d0.findViewById(2131431563);
        this.P0 = (TextView)d0.findViewById(2131431564);
        this.Q0 = (TextView)d0.findViewById(2131431573);
        this.R0 = (IsTalkingView)d0.findViewById(2131431571);
        this.S0 = d0.findViewById(2131431570);
        this.T0 = (n4s)pps.n((nsb)zmq$c.D0);
        this.V0 = new w19();
        for (final UserImageView userImageView : rp9.I0(i0, l0, m0)) {
            final a companion = zmq.Companion;
            czd.e((Object)userImageView, "it");
            Objects.requireNonNull(companion);
            final Context context = ((View)userImageView).getContext();
            czd.e((Object)context, "context");
            userImageView.F(d4j.i(context, 2130969036), 2131167433);
            ((View)userImageView).setOutlineProvider((ViewOutlineProvider)null);
        }
        final a companion2 = zmq.Companion;
        final IsTalkingView r0 = this.R0;
        czd.e((Object)r0, "liveIndicator");
        Objects.requireNonNull(companion2);
        final WeakHashMap a = j6x.a;
        if (j6x$g.b((View)r0)) {
            r0.c();
        }
        ((View)r0).addOnAttachStateChangeListener((View$OnAttachStateChangeListener)new ymq(r0));
        this.W0 = (rhh<xmq>)q3j.g0((qsb)new zmq$e(this));
    }
    
    public static void a(final zmq zmq) {
        if (zmq.G0.b()) {
            zmq.b();
            final Context h0 = zmq.H0;
            czd.e((Object)h0, "context");
            final ViewGroup n0 = zmq.N0;
            czd.e((Object)n0, "animationContainer");
            final UserImageView l0 = zmq.L0;
            czd.e((Object)l0, "facepile1");
            final xnq u0 = new xnq(h0, n0, l0, 2131100763);
            if (!u0.i) {
                n0.setClipChildren(false);
                n0.removeView(((View)n0).findViewById(2131431568));
                n0.removeView(((View)n0).findViewById(2131431569));
                final ViewGroup$LayoutParams layoutParams = new ViewGroup$LayoutParams(-1, -1);
                if (u0.g == null) {
                    final Object a = kn6.a;
                    final GradientDrawable imageDrawable = (GradientDrawable)kn6.c.b(h0, 2131233272);
                    if (imageDrawable != null) {
                        final int d = u0.d;
                        if (d != 0) {
                            imageDrawable.setColor(kn6.b(h0, d));
                        }
                    }
                    final ImageView g = new ImageView(h0);
                    (u0.g = g).setImageDrawable((Drawable)imageDrawable);
                    ((View)g).setId(2131431568);
                    ((View)g).setLayoutParams(layoutParams);
                }
                final ImageView g2 = u0.g;
                if (g2 != null && ((View)g2).getParent() == null) {
                    n0.addView((View)u0.g);
                }
                final ViewGroup$LayoutParams layoutParams2 = new ViewGroup$LayoutParams(-1, -1);
                if (u0.h == null) {
                    final Object a2 = kn6.a;
                    final GradientDrawable imageDrawable2 = (GradientDrawable)kn6.c.b(h0, 2131233272);
                    if (imageDrawable2 != null) {
                        final int d2 = u0.d;
                        if (d2 != 0) {
                            imageDrawable2.setColor(kn6.b(h0, d2));
                        }
                    }
                    final ImageView h2 = new ImageView(h0);
                    (u0.h = h2).setImageDrawable((Drawable)imageDrawable2);
                    ((View)h2).setId(2131431569);
                    ((View)h2).setLayoutParams(layoutParams2);
                }
                final ImageView h3 = u0.h;
                if (h3 != null && ((View)h3).getParent() == null) {
                    n0.addView((View)u0.h);
                }
                final float n2 = (float)((View)n0).getWidth();
                final float n3 = 2;
                final float n4 = ((int)(Resources.getSystem().getDisplayMetrics().density * n3) * m5s.a + n2) / ((View)n0).getWidth();
                final float n5 = ((int)(1 * Resources.getSystem().getDisplayMetrics().density) * m5s.a + ((View)n0).getWidth()) / ((View)n0).getWidth();
                final float n6 = ((int)(3 * Resources.getSystem().getDisplayMetrics().density) * m5s.a + ((View)n0).getWidth()) / ((View)n0).getWidth();
                final float n7 = ((int)(n3 * Resources.getSystem().getDisplayMetrics().density) * m5s.a + ((View)n0).getWidth()) / ((View)n0).getWidth();
                final xnq.a companion = xnq.Companion;
                final AnimatorSet f = u0.f;
                final ImageView h4 = u0.h;
                czd.c((Object)h4);
                xnq.a.a(companion, f, (View)h4, n4, n5);
                final AnimatorSet e = u0.e;
                final ImageView g3 = u0.g;
                czd.c((Object)g3);
                xnq.a.a(companion, e, (View)g3, n6, n7);
                if (((View)l0).getParent() == n0) {
                    ((View)l0).bringToFront();
                }
                u0.i = true;
            }
            ((Animator)u0.f).addListener((Animator$AnimatorListener)new ynq(u0));
            ((Animator)u0.e).addListener((Animator$AnimatorListener)new znq(u0));
            u0.a(true);
            u0.f.start();
            u0.e.start();
            zmq.U0 = u0;
        }
    }
    
    public final void T(final jbx jbx) {
        final xmq xmq = (xmq)jbx;
        czd.f((Object)xmq, "state");
        this.W0.b((Object)xmq);
    }
    
    public final void b() {
        final xnq u0 = this.U0;
        if (u0 != null) {
            ((Animator)u0.f).removeAllListeners();
            ((Animator)u0.e).removeAllListeners();
            u0.f.cancel();
            u0.e.cancel();
            u0.a(false);
        }
        this.U0 = null;
    }
    
    public final void q(final Object o) {
        final vmq vmq = (vmq)o;
        czd.f((Object)vmq, "effect");
        if (vmq instanceof vmq.a) {
            this.E0.t(((vmq.a)vmq).a, false, bba.Companion.a((baa)baa.a, "audiospace_fleet"));
            return;
        }
        throw new NoWhenBranchMatchedException();
    }
    
    public final h5j<wmq> w() {
        final h5j map = aoo.f(this.D0).map((psb)new k2o((qsb)zmq$d.D0, 3));
        czd.e((Object)map, "rootView.throttledClicks\u2026ent.ItemClicked\n        }");
        return (h5j<wmq>)map;
    }
    
    public static final class a
    {
        public static final String a(final a a, final String s) {
            Objects.requireNonNull(a);
            final StringBuilder sb = new StringBuilder();
            sb.append("@");
            sb.append(s);
            return sb.toString();
        }
        
        public static final SpannableString b(final a a, final SpannableString spannableString, final String s) {
            Objects.requireNonNull(a);
            spannableString.setSpan((Object)new StyleSpan(1), zkr.k0((CharSequence)spannableString, s, 0, false, 6), s.length() + zkr.k0((CharSequence)spannableString, s, 0, false, 6), 33);
            return spannableString;
        }
        
        public final List<cgv> c(final List<? extends cgv> list, final cgv cgv) {
            final ArrayList list2 = new ArrayList();
            for (final cgv next : list) {
                if (next.D0 != cgv.D0) {
                    list2.add(next);
                }
            }
            return list2;
        }
    }
    
    public interface b
    {
        zmq a(final View p0);
    }
}
