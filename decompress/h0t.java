import com.twitter.media.ui.image.c;
import com.twitter.media.ui.image.UserImageView;
import com.twitter.ui.widget.UnpaddedTypefacesTextView;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import java.util.List;
import android.content.Context;
import android.view.View;
import com.twitter.media.ui.fresco.FrescoMediaImageView;
import java.util.concurrent.TimeUnit;
import android.widget.TextView;
import android.view.View$OnClickListener;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class h0t extends b4e<sqs, a>
{
    public final g0t d;
    public final int e;
    
    public h0t(final g0t d, final int e) {
        super((Class)sqs.class);
        this.d = d;
        this.e = e;
    }
    
    public final void k(final n8x n8x, final Object o, final kcm kcm) {
        final a a = (a)n8x;
        final sqs sqs = (sqs)o;
        final g0t d = this.d;
        Objects.requireNonNull(d);
        final jqs k = sqs.k;
        final FrescoMediaImageView g0 = a.G0;
        if (((vxs)sqs).c().s.isEmpty()) {
            a.I0.setVisibility(8);
        }
        else {
            a.I0.setVisibility(0);
            a.I0.setOnClickListener((View$OnClickListener)new wpf((Object)d, (Object)sqs, (Object)a, 2));
        }
        a.L0.setVisibility(8);
        a.N0.setVisibility(8);
        a.J0.setVisibility(0);
        ((View)a.H0).setVisibility(0);
        ((View)a.K0).setVisibility(8);
        ((sl8)a.S0).F0.setVisibility(8);
        final lqs c = k.c;
        String s;
        if (c instanceof pqs) {
            final pqs pqs = (pqs)c;
            if (pqs.d != null) {
                a.l0((TextView)a.K0);
                ((View)a.K0).setVisibility(0);
                ((TextView)a.K0).setText((CharSequence)pqs.d.c);
                ie9.c(((View)a.K0).getBackground(), pqs.d.b.b(((View)a.K0).getContext()));
            }
            a.l0(a.H0);
            a.H0.setText((CharSequence)pqs.b);
            a.H0.setMaxLines(d.k);
            s = ((View)a.H0).getContext().getString(2131954795);
        }
        else if (c instanceof nqs) {
            final View r0 = a.R0;
            float scaleX;
            if (d.j) {
                scaleX = -1.0f;
            }
            else {
                scaleX = 1.0f;
            }
            r0.setScaleX(scaleX);
            s = ((nqs)k.c).b;
            a.l0(a.M0);
            a.M0.setText((CharSequence)s);
            a.J0.setVisibility(8);
            a.L0.setVisibility(0);
        }
        else if (c instanceof mqs) {
            final mqs mqs = (mqs)c;
            final Context context = a.N0.getContext();
            if (mqs.b != null) {
                a.l0((TextView)a.K0);
                ((View)a.K0).setVisibility(0);
                ((TextView)a.K0).setText((CharSequence)mqs.b.c);
            }
            ((View)a.H0).setVisibility(8);
            a.N0.setVisibility(0);
            final qgv d2 = mqs.d;
            if (d2 != null) {
                a.O0.H(d2);
                if (mqs.d.c() != null) {
                    a.l0(a.P0);
                    a.P0.setText((CharSequence)mqs.d.c());
                }
                if (mqs.d.M0 != null) {
                    a.l0(a.Q0);
                    a.Q0.setText((CharSequence)context.getString(2131952064, new Object[] { mqs.d.M0 }));
                }
            }
            s = context.getString(2131954795);
        }
        else if (c instanceof oqs) {
            final lqs c2 = sqs.k.c;
            final int a2 = o5j.a;
            final oqs oqs = (oqs)c2;
            a.I0.setVisibility(8);
            a.J0.setVisibility(8);
            d.f.a(a.S0, oqs.b);
            final n0t a3 = d.a;
            final i9t b = d.b;
            final i0t$a d3 = d.d;
            final a0t s2 = a.S0;
            ((sl8)s2).F0.setOnClickListener((View$OnClickListener)new yzs(a3, sqs, s2, oqs.b.a, d3, b));
            final List s3 = ((vxs)sqs).c().s;
            final njj c3 = d.c;
            final i0t$a d4 = d.d;
            final a0t s4 = a.S0;
            if (s3.isEmpty()) {
                ((View)s4.I0).setVisibility(4);
            }
            else {
                ((View)s4.I0).setVisibility(0);
                ((View)s4.I0).setOnClickListener((View$OnClickListener)new hf4((Object)c3, (Object)sqs, (Object)s4, (Object)d4, 2));
            }
            Objects.requireNonNull(d.h);
            if (ita.b().b("live_event_score_cards_tile_auto_refresh_enabled", false)) {
                final lyo i = d.i;
                final d0t d0t = new d0t((Object)d, (Object)a, (Object)sqs, 0);
                Objects.requireNonNull(i);
                final e39 e39 = new e39();
                final int ordinal = ((Enum)oqs.b.a.b).ordinal();
                t5j t5j = null;
                Label_0930: {
                    if (ordinal != 1) {
                        if (ordinal == 2) {
                            t5j = t5j.just((Object)1L);
                            break Label_0930;
                        }
                    }
                    else {
                        final Long d5 = oqs.b.a.d;
                        if (d5 != null) {
                            final long longValue = d5;
                            final g5s a4 = nq1.a;
                            t5j = t5j.timer(longValue - System.currentTimeMillis(), TimeUnit.MILLISECONDS);
                            break Label_0930;
                        }
                    }
                    t5j = null;
                }
                if (t5j != null) {
                    final t5j flatMap = t5j.flatMap((rtb)new oy4((stb)new myo(oqs, i, e39), 23));
                    if (flatMap != null) {
                        final t5j subscribeOn = flatMap.subscribeOn(jxo.c());
                        if (subscribeOn != null) {
                            final t5j observeOn = subscribeOn.observeOn(iqs.j());
                            if (observeOn != null) {
                                final b39 subscribe = observeOn.subscribe((rk6)new tg5((stb)new nyo(i, oqs, (rk6)d0t, e39), 28), (rk6)new gh5((stb)new oyo((rk6)d0t), 21));
                                if (subscribe != null) {
                                    e39.c(subscribe);
                                }
                            }
                        }
                    }
                }
                kcm.i((sj)new kpa((Object)d, (Object)e39, 1));
            }
            return;
        }
        else {
            c0e.i("tileContent has to be of type TileContentStandard, TileContentCallToAction, TileContentBroadcast, or TileContentScoreCard.");
            s = null;
        }
        ((View)g0).setContentDescription((CharSequence)s);
        final f0t f0t = new f0t((Object)d, (Object)sqs, (Object)a, (Object)k, 0);
        if (k.b != null) {
            a.J0.setOnClickListener((View$OnClickListener)f0t);
            a.L0.setOnClickListener((View$OnClickListener)f0t);
        }
        final rca a5 = k.a;
        if (a5 != null) {
            d.b(a, a5);
            ((View)a.G0).setVisibility(0);
            final z8d$a d6 = a9d.d(a5.a, beq.g(a5.b, a5.c), (z6w)null);
            ((bsm$a)d6).g = (bsm$b)new e0t(d, a, k);
            final int a6 = o5j.a;
            ((c)g0).p(d6);
        }
        else {
            ((c)g0).p((z8d$a)null);
            d.a(a);
        }
    }
    
    public final n8x l(final ViewGroup viewGroup) {
        final g0t d = this.d;
        final int e = this.e;
        Objects.requireNonNull(d);
        final a a = new a(LayoutInflater.from(((View)viewGroup).getContext()).inflate(e, viewGroup, false));
        final FrescoMediaImageView g0 = a.G0;
        final Context context = ((View)g0).getContext();
        final StateListDrawable overlayDrawable = new StateListDrawable();
        final wlo wlo = new wlo(context.getResources().getColor(2131099976));
        final float n = (float)d.l;
        wlo.m(new float[] { n, n, n, n, 0.0f, 0.0f, 0.0f, 0.0f });
        overlayDrawable.addState(g0t.m, (Drawable)wlo);
        g0.setOverlayDrawable((Drawable)overlayDrawable);
        d.a(a);
        return (n8x)a;
    }
    
    public final void m(final n8x n8x, final Object o) {
        final a a = (a)n8x;
        final sqs sqs = (sqs)o;
        final g0t d = this.d;
        Objects.requireNonNull(d);
        final b1p j = ((vxs)sqs).j;
        String g;
        if (j != null && flr.g((CharSequence)j.g)) {
            g = j.g;
        }
        else {
            g = "tile";
        }
        final n0t a2 = d.a;
        final int t0 = a.T0;
        final int g2 = ((gzs)d.d).g;
        final String b = i0t.b(sqs);
        Objects.requireNonNull(a2);
        final b1p i = ((vxs)sqs).j;
        final ufv ufv = new ufv();
        ufv.R0 = i;
        ufv.f = t0;
        ufv.v = String.valueOf(g2);
        ((List<ufv>)a2.I0).add(ufv);
        final fg4 fg4 = new fg4();
        final String b2 = ((jda)a2.L0).b();
        final String d2 = a2.L0.d();
        String f;
        if (i != null) {
            f = i.f;
        }
        else {
            f = null;
        }
        ((o1p)fg4).q(new String[] { b2, d2, f, g, "impression" });
        ((o1p)fg4).i((d1p)ufv);
        ((o1p)fg4).q = b;
        final int a3 = o5j.a;
        ((o1p)fg4).c = i0t.a(t0, g2, b);
        sbw.b((tlm)fg4);
    }
    
    public static final class a extends sl8 implements isk
    {
        public final FrescoMediaImageView G0;
        public final TextView H0;
        public final View I0;
        public final View J0;
        public final UnpaddedTypefacesTextView K0;
        public final View L0;
        public final TextView M0;
        public final View N0;
        public final UserImageView O0;
        public final TextView P0;
        public final TextView Q0;
        public final View R0;
        public a0t S0;
        public int T0;
        
        public a(final View view) {
            super(view);
            this.G0 = (FrescoMediaImageView)view.findViewById(2131429794);
            this.H0 = (TextView)view.findViewById(2131429795);
            this.I0 = view.findViewById(2131429814);
            this.J0 = view.findViewById(2131429820);
            this.K0 = (UnpaddedTypefacesTextView)view.findViewById(2131429792);
            this.L0 = view.findViewById(2131429801);
            this.M0 = (TextView)view.findViewById(2131429793);
            this.N0 = view.findViewById(2131429799);
            this.O0 = (UserImageView)view.findViewById(2131432471);
            this.P0 = (TextView)view.findViewById(2131432466);
            this.Q0 = (TextView)view.findViewById(2131432467);
            this.R0 = view.findViewById(2131429816);
            this.S0 = new a0t(view.findViewById(2131429809));
        }
        
        public final void l(final int t0) {
            this.T0 = t0;
        }
        
        public final void l0(final TextView textView) {
            ah.a(textView, super.F0.getContext().getResources().getDimension(2131165846), super.F0.getContext().getResources().getDimension(2131166097));
        }
    }
}
