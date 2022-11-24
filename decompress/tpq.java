import java.util.Iterator;
import android.graphics.drawable.Drawable;
import java.util.Set;
import tv.periscope.model.NarrowcastSpaceType;
import java.util.concurrent.TimeUnit;
import java.util.Objects;
import java.util.List;
import android.graphics.PorterDuff$Mode;
import android.content.res.ColorStateList;
import android.view.View$OnClickListener;
import android.view.ViewStub;
import tv.periscope.model.NarrowcastSpaceType$SuperFollowerOnly;
import com.twitter.ui.components.text.legacy.TypefacesTextView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ProgressBar;
import android.content.res.Resources;
import android.content.Context;
import com.twitter.util.user.UserIdentifier;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class tpq implements xlx<uqq, upq, bnq>
{
    public final View F0;
    public final UserIdentifier G0;
    public final Context H0;
    public final Resources I0;
    public final fci<?> J0;
    public final hpq K0;
    public final zfo L0;
    public final myn M0;
    public final ProgressBar N0;
    public final TextView O0;
    public final TextView P0;
    public final TextView Q0;
    public final TextView R0;
    public final TextView S0;
    public final TextView T0;
    public final LinearLayout U0;
    public final TypefacesTextView V0;
    public final TypefacesTextView W0;
    public final znl<upq> X0;
    public final znl<upq$l> Y0;
    public final h5s Z0;
    public final h5s a1;
    public final h5s b1;
    public final h5s c1;
    public final h5s d1;
    
    public tpq(final View f0, final UserIdentifier g0, final Context h0, final Resources i0, final fci<?> j0, final hpq k0, final zfo l0, final myn m0) {
        e0e.f((Object)f0, "view");
        e0e.f((Object)g0, "currentUser");
        e0e.f((Object)h0, "context");
        e0e.f((Object)i0, "resources");
        e0e.f((Object)j0, "navigator");
        e0e.f((Object)k0, "spacesCardUtils");
        e0e.f((Object)l0, "roomToaster");
        e0e.f((Object)m0, "reminderToaster");
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
        this.J0 = j0;
        this.K0 = k0;
        this.L0 = l0;
        this.M0 = m0;
        this.N0 = (ProgressBar)f0.findViewById(2131430778);
        this.O0 = (TextView)f0.findViewById(2131428969);
        this.P0 = (TextView)f0.findViewById(2131432077);
        this.Q0 = (TextView)f0.findViewById(2131430191);
        this.R0 = (TextView)f0.findViewById(2131428794);
        this.S0 = (TextView)f0.findViewById(2131431745);
        this.T0 = (TextView)f0.findViewById(2131427975);
        this.U0 = (LinearLayout)f0.findViewById(2131431521);
        this.V0 = (TypefacesTextView)f0.findViewById(2131431528);
        this.W0 = (TypefacesTextView)f0.findViewById(2131429786);
        this.X0 = (znl<upq>)new znl();
        this.Y0 = (znl<upq$l>)new znl();
        this.Z0 = (h5s)jty.N((ptb)new tpq$c(this));
        this.a1 = (h5s)jty.N((ptb)new tpq$e(this));
        this.b1 = (h5s)jty.N((ptb)new tpq$f(this));
        this.c1 = (h5s)jty.N((ptb)new tpq$d(this));
        this.d1 = (h5s)jty.N((ptb)new tpq$b(this));
    }
    
    public final void T(final ccx ccx) {
        final uqq uqq = (uqq)ccx;
        e0e.f((Object)uqq, "state");
        final View viewById = this.F0.findViewById(2131431825);
        final int dimensionPixelSize = this.F0.getResources().getDimensionPixelSize(2131167524);
        final NarrowcastSpaceType l = uqq.l();
        final NarrowcastSpaceType$SuperFollowerOnly instance = NarrowcastSpaceType$SuperFollowerOnly.INSTANCE;
        final boolean a = e0e.a((Object)l, (Object)instance);
        final int n = 1;
        if (a) {
            if (viewById instanceof ViewStub) {
                ((ViewStub)viewById).inflate();
            }
            if (viewById != null) {
                viewById.setVisibility(0);
            }
            final View f0 = this.F0;
            f0.setMinimumHeight(f0.getMinimumHeight() + dimensionPixelSize);
        }
        else if (viewById != null && viewById.getVisibility() == 0) {
            viewById.setVisibility(8);
            final View f2 = this.F0;
            f2.setMinimumHeight(f2.getMinimumHeight() - dimensionPixelSize);
        }
        if (viewById != null) {
            final View viewById2 = viewById.findViewById(2131431824);
            if (viewById2 != null) {
                int backgroundResource;
                if (uqq instanceof uqq$h) {
                    backgroundResource = 2131100766;
                }
                else {
                    backgroundResource = 2131099702;
                }
                viewById2.setBackgroundResource(backgroundResource);
            }
        }
        if (uqq instanceof uqq$a) {
            this.h();
            final String a2 = ((uqq$a)uqq).a;
            this.F0.setOnClickListener((View$OnClickListener)new sbg((Object)this, (Object)a2, 13));
            ((View)this.T0).setOnClickListener((View$OnClickListener)new obs((Object)this, (Object)a2, 16));
            ((View)this.T0).setVisibility(0);
            this.T0.setText((CharSequence)this.I0.getString(2131958235));
            this.T0.setEnabled(true);
        }
        else if (uqq instanceof uqq$e) {
            this.h();
            ((View)this.O0).setVisibility(0);
        }
        else if (uqq instanceof uqq$g) {
            this.h();
            ((View)this.N0).setVisibility(0);
        }
        else {
            final boolean b = uqq instanceof uqq$d;
            int n2 = 2131958240;
            if (b) {
                final uqq$d uqq$d = (uqq$d)uqq;
                this.h();
                this.j((View)this.P0, (View)this.Q0, (View)this.R0, (View)this.S0);
                ((View)this.T0).setVisibility(0);
                final vjo a3 = vjo.a;
                if (ita.b().b("android_audio_enable_end_screen", false)) {
                    final TextView t0 = this.T0;
                    String text;
                    if (uqq$d.i) {
                        text = this.I0.getString(2131958239);
                    }
                    else {
                        text = this.I0.getString(2131958240);
                    }
                    t0.setText((CharSequence)text);
                    this.T0.setEnabled(true);
                    final String a4 = uqq$d.a;
                    final y21 c = uqq$d.c;
                    final String d = uqq$d.d;
                    final Long g = uqq$d.g;
                    final Set h = uqq$d.h;
                    final boolean i = uqq$d.i;
                    final boolean j = uqq$d.j;
                    final boolean a5 = e0e.a((Object)c.d(), (Object)this.G0.getStringId());
                    this.F0.setOnClickListener((View$OnClickListener)new ppq(this, a4, a5, d, g, h, j));
                    ((View)this.T0).setOnClickListener((View$OnClickListener)new spq(this, i, c, a4, a5, d, g, h, j));
                }
                else {
                    this.T0.setText((CharSequence)this.I0.getString(2131958234));
                    this.T0.setEnabled(false);
                }
                this.F0.setBackgroundTintList((ColorStateList)this.Z0.getValue());
                this.F0.setBackgroundTintMode(PorterDuff$Mode.SRC_OVER);
                final String string = this.I0.getString(2131958206);
                e0e.e((Object)string, "resources.getString(R.string.spaces_card_ended)");
                this.d(string);
                this.f(uqq$d.c.c());
                this.a((uqq$j)uqq$d);
            }
            else if (uqq instanceof uqq$b) {
                final uqq$b uqq$b = (uqq$b)uqq;
                this.h();
                this.j((View)this.P0, (View)this.Q0, (View)this.R0, (View)this.S0, (View)this.T0);
                this.T0.setText((CharSequence)this.I0.getString(2131958233));
                this.T0.setEnabled(false);
                this.F0.setBackgroundTintList((ColorStateList)this.Z0.getValue());
                this.F0.setBackgroundTintMode(PorterDuff$Mode.SRC_OVER);
                final String string2 = this.I0.getString(2131958203);
                e0e.e((Object)string2, "resources.getString(R.st\u2026ng.spaces_card_cancelled)");
                this.d(string2);
                this.f(uqq$b.a.c());
                this.e(uqq$b.b, uqq$b.a.c());
            }
            else if (uqq instanceof uqq$f) {
                final uqq$f uqq$f = (uqq$f)uqq;
                this.h();
                this.j((View)this.P0, (View)this.Q0, (View)this.R0, (View)this.S0);
                int n3;
                if (e0e.a((Object)uqq$f.b.d(), (Object)this.G0.getStringId()) && !uqq$f.g) {
                    n3 = n;
                }
                else {
                    n3 = 0;
                }
                ((View)this.T0).setVisibility(0);
                final TextView t2 = this.T0;
                String text2;
                if (n3 != 0) {
                    text2 = this.I0.getString(2131958209);
                }
                else if (uqq$f.g) {
                    text2 = this.I0.getString(2131958211);
                }
                else {
                    text2 = this.I0.getString(2131958467);
                }
                t2.setText((CharSequence)text2);
                final TextView s0 = this.S0;
                e0e.e((Object)s0, "status");
                final qnv b2 = qnv.b(this.H0);
                e0e.e((Object)b2, "get(context)");
                ma7.O(s0, b2);
                final String string3 = this.I0.getString(2131958214);
                e0e.e((Object)string3, "resources.getString(R.string.spaces_card_live)");
                this.d(string3);
                this.f(uqq$f.b.c());
                this.e(uqq$f.c, uqq$f.b.c());
                this.b();
                this.c(uqq$f.e, false);
                this.a((uqq$j)uqq$f);
            }
            else if (uqq instanceof uqq$h) {
                final uqq$h uqq$h = (uqq$h)uqq;
                final int k = uqq$h.i;
                this.h();
                final ColorStateList g2 = this.g();
                e0e.e((Object)g2, "replayStateCardTextColorStateList");
                this.i(g2, this.P0, this.Q0, this.R0, this.S0);
                final View f3 = this.F0;
                final Context h2 = this.H0;
                final Object a6 = qo6.a;
                f3.setBackground(qo6$c.b(h2, 2131230974));
                if (k != 2 && k != 3) {
                    ((View)this.T0).setBackgroundTintList((ColorStateList)this.c1.getValue());
                    ((View)this.T0).setBackgroundTintMode(PorterDuff$Mode.SRC_OVER);
                    final boolean a7 = e0e.a((Object)uqq$h.c.d(), (Object)this.G0.getStringId());
                    final TextView t3 = this.T0;
                    final Resources i2 = this.I0;
                    if (!a7 || !vjo.x()) {
                        n2 = 2131955769;
                    }
                    t3.setText((CharSequence)i2.getString(n2));
                    this.T0.setTextColor((ColorStateList)this.a1.getValue());
                    final z21 b3 = uqq$h.b;
                    final String a8 = uqq$h.a;
                    final String d2 = uqq$h.c.d();
                    final String d3 = uqq$h.d;
                    final Long e = uqq$h.e;
                    final Set m = uqq$h.m;
                    final boolean n4 = uqq$h.n;
                    this.F0.setOnClickListener((View$OnClickListener)new npq(this, b3, a8, d2, a7, d3, e, m, n4));
                    ((View)this.T0).setOnClickListener((View$OnClickListener)new opq(this, b3, a8, d2, a7, d3, e, m, n4));
                }
                else {
                    this.F0.setOnClickListener((View$OnClickListener)new jpq(this, 0));
                    ((View)this.T0).setOnClickListener((View$OnClickListener)new kpq(this, 0));
                    this.T0.setTextColor(this.g());
                    ((View)this.T0).setBackground(qo6$c.b(this.H0, 2131230974));
                    ((View)this.T0).setBackgroundTintList((ColorStateList)null);
                    final TextView t4 = this.T0;
                    final Resources i3 = this.I0;
                    int n5;
                    if (k == 2) {
                        n5 = 2131955651;
                    }
                    else {
                        n5 = 2131955770;
                    }
                    t4.setText((CharSequence)i3.getString(n5));
                }
                ((View)this.T0).setVisibility(0);
                final Long e2 = uqq$h.e;
                if (e2 != null) {
                    this.Q0.setText((CharSequence)rrs.p(this.I0, e2.longValue()));
                }
                this.S0.setText((CharSequence)uqq$h.c.c());
                final TypefacesTextView v0 = this.V0;
                if (v0 != null) {
                    ((TextView)v0).setTextColor(this.g());
                }
                this.e(uqq$h.d, uqq$h.c.c());
                this.c(uqq$h.h, true);
                final vjo a9 = vjo.a;
                if (ita.b().b("android_audio_room_host_recording_listener_count_enabled", false)) {
                    final hpq k2 = this.K0;
                    final Context h3 = this.H0;
                    final Long e3 = uqq$h.e;
                    final Long f4 = uqq$h.f;
                    final int k3 = uqq$h.k;
                    final int l2 = uqq$h.l;
                    Objects.requireNonNull(k2);
                    e0e.f((Object)h3, "context");
                    final StringBuilder sb = new StringBuilder();
                    if (e3 != null && f4 != null) {
                        sb.append(rrs.l(TimeUnit.MILLISECONDS.toSeconds(f4 - e3), h3.getResources()));
                    }
                    final int n6 = k3 + l2;
                    if (n6 > 0) {
                        if (sb.length() > 0) {
                            sb.append(" \u2022 ");
                        }
                        sb.append(h3.getResources().getString(2131956955, new Object[] { o2d.h(h3.getResources(), (long)n6, true) }));
                    }
                    final String string4 = sb.toString();
                    e0e.e((Object)string4, "listenerString.toString()");
                    final ColorStateList g3 = this.g();
                    e0e.e((Object)g3, "replayStateCardTextColorStateList");
                    this.i(g3, (TextView)this.W0);
                    ((TextView)this.W0).setText((CharSequence)string4);
                }
            }
            else if (uqq instanceof uqq$i) {
                this.h();
                this.j((View)this.P0, (View)this.Q0, (View)this.R0, (View)this.S0);
                final boolean b4 = e0e.a((Object)uqq.l(), (Object)instance) && ((uqq$i)uqq).h;
                final uqq$i uqq$i = (uqq$i)uqq;
                if (!e0e.a((Object)uqq$i.d, (Object)r29.f) && !e0e.a((Object)uqq$i.d, (Object)r29.i)) {
                    ((View)this.T0).setVisibility(0);
                    if (e0e.a((Object)uqq$i.a.d(), (Object)this.G0.getStringId())) {
                        this.F0.setOnClickListener((View$OnClickListener)new mpq((Object)this, 0));
                        ((View)this.T0).setOnClickListener((View$OnClickListener)new jpq(this, 1));
                        this.T0.setText((CharSequence)this.I0.getString(2131958240));
                    }
                    else if (e0e.a((Object)uqq$i.f, (Object)uqq$k$c.a)) {
                        this.b();
                        this.T0.setText((CharSequence)this.I0.getString(2131958236));
                        this.T0.setTextColor(qo6.b(this.H0, 2131100704));
                        ((View)this.T0).setBackground(qo6$c.b(this.H0, 2131230906));
                    }
                    else if (e0e.a((Object)uqq$i.f, (Object)uqq$k$b.a)) {
                        this.b();
                        this.T0.setText((CharSequence)this.I0.getString(2131958220));
                        this.T0.setTextColor(qo6.b(this.H0, 2131100880));
                        ((View)this.T0).setBackground(qo6$c.b(this.H0, 2131230900));
                    }
                    else if (e0e.a((Object)uqq$i.f, (Object)uqq$k$d.a)) {
                        this.b();
                        this.T0.setText((CharSequence)this.I0.getString(2131958729));
                    }
                    else if (e0e.a((Object)uqq$i.f, (Object)uqq$k$e.a)) {
                        this.b();
                        this.T0.setText((CharSequence)this.I0.getString(2131958730));
                    }
                    else if (uqq$i.e) {
                        if (vjo.j()) {
                            this.F0.setOnClickListener((View$OnClickListener)new kpq(this, 1));
                        }
                        ((View)this.T0).setOnClickListener((View$OnClickListener)new rpq(this, b4));
                        this.T0.setText((CharSequence)this.I0.getString(2131958224));
                        this.T0.setTextColor(qo6.b(this.H0, 2131100704));
                        ((View)this.T0).setBackground(qo6$c.b(this.H0, 2131230906));
                    }
                    else {
                        if (vjo.j()) {
                            this.F0.setOnClickListener((View$OnClickListener)new lpq(this, 0));
                        }
                        ((View)this.T0).setOnClickListener((View$OnClickListener)new qpq(this, b4));
                        this.T0.setText((CharSequence)this.I0.getString(2131958228));
                        this.T0.setTextColor(qo6.b(this.H0, 2131100880));
                        ((View)this.T0).setBackground(qo6$c.b(this.H0, 2131230900));
                    }
                }
                this.d(iqs.e(this.I0, uqq$i.c));
                this.f(uqq$i.a.c());
                this.e(uqq$i.b, uqq$i.a.c());
            }
            else if (uqq instanceof uqq$c) {
                this.h();
                this.j((View)this.P0, (View)this.Q0, (View)this.R0, (View)this.S0);
                final uqq$c uqq$c = (uqq$c)uqq;
                final em2 f5 = uqq$c.f;
                Label_2753: {
                    if (f5 == em2.G0) {
                        final Long d4 = uqq$c.d;
                        if (d4 != null) {
                            this.d(iqs.e(this.I0, (long)d4));
                            break Label_2753;
                        }
                    }
                    if (f5 == em2.H0) {
                        final String string5 = this.I0.getString(2131958214);
                        e0e.e((Object)string5, "resources.getString(R.string.spaces_card_live)");
                        this.d(string5);
                    }
                    else {
                        final String string6 = this.I0.getString(2131958206);
                        e0e.e((Object)string6, "resources.getString(R.string.spaces_card_ended)");
                        this.d(string6);
                    }
                }
                this.f(uqq$c.b.c());
                this.e(uqq$c.c, uqq$c.b.c());
            }
        }
    }
    
    public final void a(final uqq$j uqq$j) {
        e0e.f((Object)uqq$j, "state");
        String s;
        if (uqq$j.m() != null) {
            final yh5 m = uqq$j.m();
            if (m != null) {
                s = m.k;
            }
            else {
                s = null;
            }
        }
        else {
            s = uqq$j.n().c();
        }
        if (s != null) {
            this.e(uqq$j.getTitle(), s);
        }
        final yh5 i = uqq$j.m();
        if (i != null) {
            final String k = i.k;
            if (k != null) {
                this.f(k);
            }
        }
        final yh5 j = uqq$j.m();
        if (j != null) {
            final int h0 = uw5.Companion.a(j).H0;
            this.F0.setBackground((Drawable)null);
            this.F0.setBackgroundColor(qo6.b(this.H0, h0));
        }
    }
    
    public final void b() {
        this.F0.setOnClickListener((View$OnClickListener)new qsk((Object)this, 27));
        ((View)this.T0).setOnClickListener((View$OnClickListener)new lpq(this, 1));
    }
    
    public final void c(final List<y21> list, final boolean b) {
        if (list.isEmpty() ^ true) {
            final vjo a = vjo.a;
            if (ita.b().b("voice_rooms_spaces_card_social_proof_enabled", false)) {
                this.j((View)this.U0, (View)this.V0);
                int n;
                if (b) {
                    n = 2131820675;
                }
                else {
                    n = 2131820674;
                }
                final TypefacesTextView v0 = this.V0;
                if (v0 != null) {
                    ((TextView)v0).setText((CharSequence)this.H0.getResources().getQuantityString(n, list.size(), new Object[] { rr4.I1((Iterable)list, (CharSequence)null, (CharSequence)null, (CharSequence)null, (stb)tpq$a.F0, 31) }));
                }
            }
        }
    }
    
    public final void d(final String text) {
        this.S0.setText((CharSequence)text);
    }
    
    public final void e(final String text, final String s) {
        if (text == null || slr.k1((CharSequence)text)) {
            this.P0.setText((CharSequence)this.I0.getString(2131958237, new Object[] { s }));
        }
        else {
            this.P0.setText((CharSequence)text);
        }
    }
    
    public final void f(final String text) {
        this.Q0.setText((CharSequence)text);
    }
    
    public final ColorStateList g() {
        return (ColorStateList)this.b1.getValue();
    }
    
    public final void h() {
        this.F0.setOnClickListener((View$OnClickListener)null);
        this.F0.setClickable(false);
        this.F0.setBackground(this.H0.getDrawable(2131230958));
        this.F0.setBackgroundTintList((ColorStateList)null);
        ((View)this.T0).setOnClickListener((View$OnClickListener)null);
        this.T0.setEnabled(true);
        this.S0.setTypeface(qnv.b(this.H0).a);
        for (final View view : shw.y0((Object[])new View[] { (View)this.N0, (View)this.O0, (View)this.P0, (View)this.R0, (View)this.S0, (View)this.Q0, (View)this.T0, (View)this.U0, (View)this.V0, (View)this.W0 })) {
            if (view != null) {
                view.setVisibility(8);
            }
            if (view instanceof TextView) {
                ((TextView)view).setTextColor((ColorStateList)this.d1.getValue());
            }
        }
    }
    
    public final void i(final ColorStateList textColor, final TextView... array) {
        for (final TextView textView : array) {
            if (textView != null) {
                ((View)textView).setVisibility(0);
            }
            if (textView != null) {
                textView.setTextColor(textColor);
            }
        }
    }
    
    public final void j(final View... array) {
        for (final View view : array) {
            if (view != null) {
                view.setVisibility(0);
            }
        }
    }
    
    public final void r(final Object o) {
        final bnq bnq = (bnq)o;
        e0e.f((Object)bnq, "effect");
        if (bnq instanceof bnq$b) {
            final q6s$a q6s$a = new q6s$a();
            final String string = this.I0.getString(2131954136, new Object[] { ((bnq$b)bnq).a });
            e0e.e((Object)string, "resources.getString(R.st\u2026st_text, effect.username)");
            q6s$a.t(string);
            q6s$a.e = (rfd$c)rfd$c$b.b;
            q6s$a.q(28);
            q6s$a.r("");
            q6s$a.o(2131954137, (View$OnClickListener)new ty((Object)this, (Object)bnq, 15));
            this.L0.f((q6s)((z4j)q6s$a).e());
        }
        else if (bnq instanceof bnq$a) {
            final b8l$a b8l$a = new b8l$a();
            final bnq$a bnq$a = (bnq$a)bnq;
            b8l$a.h = bnq$a.b;
            b8l$a.c = bnq$a.a;
            this.J0.d((cn)((z4j)b8l$a).e());
        }
        else if (bnq instanceof bnq$d) {
            final myn m0 = this.M0;
            final bnq$d bnq$d = (bnq$d)bnq;
            m0.c(bnq$d.a, bnq$d.b, bnq$d.c);
        }
        else if (e0e.a((Object)bnq, (Object)bnq$c.a)) {
            this.M0.b();
        }
    }
    
    public final t5j<upq> w() {
        final t5j mergeArray = t5j.mergeArray(new fbj[] { (fbj)((t5j)this.X0).map((rtb)new l5i((stb)tpq$g.F0, 17)), (fbj)this.Y0 });
        e0e.e((Object)mergeArray, "mergeArray(\n        card\u2026filePublishSubject,\n    )");
        return (t5j<upq>)mergeArray;
    }
}
