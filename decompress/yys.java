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

public final class yys extends v3e<ips, a>
{
    public final xys d;
    public final int e;
    
    public yys(final xys d, final int e) {
        super((Class)ips.class);
        this.d = d;
        this.e = e;
    }
    
    public final void k(final c7x c7x, final Object o, final ibm ibm) {
        final a a = (a)c7x;
        final ips ips = (ips)o;
        final xys d = this.d;
        Objects.requireNonNull(d);
        final zos k = ips.k;
        final FrescoMediaImageView d2 = a.D0;
        if (((nws)ips).c().s.isEmpty()) {
            a.F0.setVisibility(8);
        }
        else {
            a.F0.setVisibility(0);
            a.F0.setOnClickListener((View$OnClickListener)new ssf((Object)d, (Object)ips, (Object)a, 1));
        }
        a.I0.setVisibility(8);
        a.K0.setVisibility(8);
        a.G0.setVisibility(0);
        ((View)a.E0).setVisibility(0);
        ((View)a.H0).setVisibility(8);
        ((el8)a.P0).C0.setVisibility(8);
        final bps c = k.c;
        String s;
        if (c instanceof fps) {
            final fps fps = (fps)c;
            if (fps.d != null) {
                a.l0((TextView)a.H0);
                ((View)a.H0).setVisibility(0);
                ((TextView)a.H0).setText((CharSequence)fps.d.c);
                xd9.c(((View)a.H0).getBackground(), fps.d.b.b(((View)a.H0).getContext()));
            }
            a.l0(a.E0);
            a.E0.setText((CharSequence)fps.b);
            a.E0.setMaxLines(d.k);
            s = ((View)a.E0).getContext().getString(2131954795);
        }
        else if (c instanceof dps) {
            final View o2 = a.O0;
            float scaleX;
            if (d.j) {
                scaleX = -1.0f;
            }
            else {
                scaleX = 1.0f;
            }
            o2.setScaleX(scaleX);
            s = ((dps)k.c).b;
            a.l0(a.J0);
            a.J0.setText((CharSequence)s);
            a.G0.setVisibility(8);
            a.I0.setVisibility(0);
        }
        else if (c instanceof cps) {
            final cps cps = (cps)c;
            final Context context = a.K0.getContext();
            if (cps.b != null) {
                a.l0((TextView)a.H0);
                ((View)a.H0).setVisibility(0);
                ((TextView)a.H0).setText((CharSequence)cps.b.c);
            }
            ((View)a.E0).setVisibility(8);
            a.K0.setVisibility(0);
            final hfv d3 = cps.d;
            if (d3 != null) {
                a.L0.H(d3);
                if (cps.d.c() != null) {
                    a.l0(a.M0);
                    a.M0.setText((CharSequence)cps.d.c());
                }
                if (cps.d.J0 != null) {
                    a.l0(a.N0);
                    a.N0.setText((CharSequence)context.getString(2131952064, new Object[] { cps.d.J0 }));
                }
            }
            s = context.getString(2131954795);
        }
        else if (c instanceof eps) {
            final bps c2 = ips.k.c;
            final int a2 = w4j.a;
            final eps eps = (eps)c2;
            a.F0.setVisibility(8);
            a.G0.setVisibility(8);
            d.f.a(a.P0, eps.b);
            final ezs a3 = d.a;
            final w7t b = d.b;
            final zys.a d4 = d.d;
            final rys p3 = a.P0;
            ((el8)p3).C0.setOnClickListener((View$OnClickListener)new oys(a3, ips, p3, eps.b.a, d4, b));
            final List s2 = ((nws)ips).c().s;
            final tij c3 = d.c;
            final zys.a d5 = d.d;
            final rys p4 = a.P0;
            if (s2.isEmpty()) {
                ((View)p4.F0).setVisibility(4);
            }
            else {
                ((View)p4.F0).setVisibility(0);
                ((View)p4.F0).setOnClickListener((View$OnClickListener)new mea((Object)c3, (Object)ips, (Object)p4, (Object)d5, 1));
            }
            Objects.requireNonNull(d.h);
            if (dta.b().b("live_event_score_cards_tile_auto_refresh_enabled", false)) {
                final axo i = d.i;
                final mww mww = new mww((Object)d, (Object)a, (Object)ips, 1);
                Objects.requireNonNull(i);
                final m29 m29 = new m29();
                final int ordinal = ((Enum)eps.b.a.b).ordinal();
                b5j b5j = null;
                Label_0930: {
                    if (ordinal != 1) {
                        if (ordinal == 2) {
                            b5j = b5j.just((Object)1L);
                            break Label_0930;
                        }
                    }
                    else {
                        final Long d6 = eps.b.a.d;
                        if (d6 != null) {
                            final long longValue = d6;
                            final t3s a4 = mq1.a;
                            b5j = b5j.timer(longValue - System.currentTimeMillis(), TimeUnit.MILLISECONDS);
                            break Label_0930;
                        }
                    }
                    b5j = null;
                }
                if (b5j != null) {
                    final b5j flatMap = b5j.flatMap((qtb)new zt1((rtb)new bxo(eps, i, m29), 20));
                    if (flatMap != null) {
                        final b5j subscribeOn = flatMap.subscribeOn(yvo.c());
                        if (subscribeOn != null) {
                            final b5j observeOn = subscribeOn.observeOn(h6q.L());
                            if (observeOn != null) {
                                final j29 subscribe = observeOn.subscribe((fk6)new xja((rtb)new cxo(i, eps, (fk6)mww, m29), 20), (fk6)new za6((rtb)new dxo((fk6)mww), 20));
                                if (subscribe != null) {
                                    m29.c(subscribe);
                                }
                            }
                        }
                    }
                }
                ibm.i((rj)new uys((Object)d, (Object)m29, 0));
            }
            return;
        }
        else {
            zi.A("tileContent has to be of type TileContentStandard, TileContentCallToAction, TileContentBroadcast, or TileContentScoreCard.");
            s = null;
        }
        ((View)d2).setContentDescription((CharSequence)s);
        final wys wys = new wys((Object)d, (Object)ips, (Object)a, (Object)k, 0);
        if (k.b != null) {
            a.G0.setOnClickListener((View$OnClickListener)wys);
            a.I0.setOnClickListener((View$OnClickListener)wys);
        }
        final bca a5 = k.a;
        if (a5 != null) {
            d.b(a, a5);
            ((View)a.D0).setVisibility(0);
            final t8d$a d7 = u8d.d(a5.a, ncq.g(a5.b, a5.c), (z5w)null);
            ((vqm$a)d7).g = (vqm$b)new vys(d, a, k);
            final int a6 = w4j.a;
            ((c)d2).p(d7);
        }
        else {
            ((c)d2).p((t8d$a)null);
            d.a(a);
        }
    }
    
    public final c7x l(final ViewGroup viewGroup) {
        final xys d = this.d;
        final int e = this.e;
        Objects.requireNonNull(d);
        final a a = new a(LayoutInflater.from(((View)viewGroup).getContext()).inflate(e, viewGroup, false));
        final FrescoMediaImageView d2 = a.D0;
        final Context context = ((View)d2).getContext();
        final StateListDrawable overlayDrawable = new StateListDrawable();
        final oko oko = new oko(context.getResources().getColor(2131099976));
        final float n = (float)d.l;
        oko.m(new float[] { n, n, n, n, 0.0f, 0.0f, 0.0f, 0.0f });
        overlayDrawable.addState(xys.m, (Drawable)oko);
        d2.setOverlayDrawable((Drawable)overlayDrawable);
        d.a(a);
        return (c7x)a;
    }
    
    public final void m(final c7x c7x, final Object o) {
        final a a = (a)c7x;
        final ips ips = (ips)o;
        final xys d = this.d;
        Objects.requireNonNull(d);
        final qzo j = ((nws)ips).j;
        String g;
        if (j != null && pjr.g((CharSequence)j.g)) {
            g = j.g;
        }
        else {
            g = "tile";
        }
        final ezs a2 = d.a;
        final int q0 = a.Q0;
        final int g2 = ((xxs)d.d).g;
        final String b = zys.b(ips);
        Objects.requireNonNull(a2);
        final qzo i = ((nws)ips).j;
        final lev lev = new lev();
        lev.R0 = i;
        lev.f = q0;
        lev.v = String.valueOf(g2);
        ((List<lev>)a2.F0).add(lev);
        final zf4 zf4 = new zf4();
        final String b2 = ((tca)a2.I0).b();
        final String d2 = a2.I0.d();
        String f;
        if (i != null) {
            f = i.f;
        }
        else {
            f = null;
        }
        zf4.q(new String[] { b2, d2, f, g, "impression" });
        zf4.i((szo)lev);
        zf4.q = b;
        final int a3 = w4j.a;
        zf4.c = zys.a(q0, g2, b);
        saw.b((okm)zf4);
    }
    
    public static final class a extends el8 implements ork
    {
        public final FrescoMediaImageView D0;
        public final TextView E0;
        public final View F0;
        public final View G0;
        public final UnpaddedTypefacesTextView H0;
        public final View I0;
        public final TextView J0;
        public final View K0;
        public final UserImageView L0;
        public final TextView M0;
        public final TextView N0;
        public final View O0;
        public rys P0;
        public int Q0;
        
        public a(final View view) {
            super(view);
            this.D0 = (FrescoMediaImageView)view.findViewById(2131429793);
            this.E0 = (TextView)view.findViewById(2131429794);
            this.F0 = view.findViewById(2131429813);
            this.G0 = view.findViewById(2131429819);
            this.H0 = (UnpaddedTypefacesTextView)view.findViewById(2131429791);
            this.I0 = view.findViewById(2131429800);
            this.J0 = (TextView)view.findViewById(2131429792);
            this.K0 = view.findViewById(2131429798);
            this.L0 = (UserImageView)view.findViewById(2131432467);
            this.M0 = (TextView)view.findViewById(2131432462);
            this.N0 = (TextView)view.findViewById(2131432463);
            this.O0 = view.findViewById(2131429815);
            this.P0 = new rys(view.findViewById(2131429808));
        }
        
        public final void k(final int q0) {
            this.Q0 = q0;
        }
        
        public final void l0(final TextView textView) {
            zg.a(textView, super.C0.getContext().getResources().getDimension(2131165846), super.C0.getContext().getResources().getDimension(2131166097));
        }
    }
}
