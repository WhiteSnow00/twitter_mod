import android.os.BaseBundle;
import com.twitter.rooms.model.AudioSpaceTopicItem;
import android.view.View$OnClickListener;
import com.twitter.rooms.model.helpers.CohostInvite;
import java.util.Set;
import android.os.Bundle;
import androidx.fragment.app.Fragment$InstantiationException;
import java.util.Objects;
import androidx.fragment.app.p;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.twitter.ui.components.text.legacy.TypefacesTextView;
import com.twitter.common.ui.isTalkingView.IsTalkingView;
import com.twitter.util.user.UserIdentifier;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ofn implements xlx<sgn, qen, pen>
{
    public final zfo F0;
    public final View G0;
    public final eko H0;
    public final ysq I0;
    public final zl1 J0;
    public final eko K0;
    public final UserIdentifier L0;
    public final IsTalkingView M0;
    public final TypefacesTextView N0;
    public final TypefacesTextView O0;
    public final View P0;
    public final View Q0;
    public final ImageView R0;
    public final ImageView S0;
    public Drawable T0;
    public Drawable U0;
    public final int V0;
    public final int W0;
    public final int X0;
    public final int Y0;
    public final znl<d2e> Z0;
    public final znl<vzv> a1;
    public final xob b1;
    public final h5s c1;
    public final h5s d1;
    public final h5s e1;
    public final h5s f1;
    public final h5s g1;
    public final fih<sgn> h1;
    
    public ofn(final zfo f0, final View g0, final eko h0, final ysq i0, final zl1 j0, final eko k0, final k9x k9x, final kcm kcm, final UserIdentifier l0) {
        e0e.f((Object)f0, "roomToaster");
        e0e.f((Object)g0, "rootView");
        e0e.f((Object)h0, "utilsViewEventDispatcher");
        e0e.f((Object)i0, "spacesLauncher");
        e0e.f((Object)j0, "activity");
        e0e.f((Object)k0, "roomUtilsFragmentViewEventDispatcher");
        e0e.f((Object)k9x, "viewLifecycle");
        e0e.f((Object)kcm, "releaseCompletable");
        e0e.f((Object)l0, "userIdentifier");
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
        this.J0 = j0;
        this.K0 = k0;
        this.L0 = l0;
        final View viewById = g0.findViewById(2131428775);
        e0e.e((Object)viewById, "rootView.findViewById(R.\u2026room_isTalking_indicator)");
        this.M0 = (IsTalkingView)viewById;
        final View viewById2 = g0.findViewById(2131428776);
        e0e.e((Object)viewById2, "rootView.findViewById(R.\u2026cker_room_isTalking_name)");
        this.N0 = (TypefacesTextView)viewById2;
        final View viewById3 = g0.findViewById(2131428777);
        e0e.e((Object)viewById3, "rootView.findViewById(R.\u2026.docker_room_participant)");
        this.O0 = (TypefacesTextView)viewById3;
        final View viewById4 = g0.findViewById(2131428774);
        e0e.e((Object)viewById4, "rootView.findViewById(R.id.docker_room_bar)");
        this.P0 = viewById4;
        final View viewById5 = g0.findViewById(2131428772);
        e0e.e((Object)viewById5, "rootView.findViewById(R.\u2026r_notification_indicator)");
        this.Q0 = viewById5;
        final View viewById6 = g0.findViewById(2131428269);
        final ImageView imageView = (ImageView)viewById6;
        e0e.e((Object)imageView, "closeRoomButton$lambda$0");
        final vjo a = vjo.a;
        final rmv b = ita.b();
        int visibility = 0;
        if (!(b.b("spaces_2022_h2_reactions_send_on_dock_enabled", false) ^ true)) {
            visibility = 8;
        }
        ((View)imageView).setVisibility(visibility);
        e0e.e((Object)viewById6, "rootView.findViewById<Im\u2026onOnDockerEnabled()\n    }");
        this.R0 = (ImageView)viewById6;
        final View viewById7 = g0.findViewById(2131430168);
        e0e.e((Object)viewById7, "rootView.findViewById(R.id.mute_button)");
        this.S0 = (ImageView)viewById7;
        final Context context = g0.getContext();
        final Object a2 = qo6.a;
        final Drawable b2 = qo6$c.b(context, 2131231600);
        if (b2 == null) {
            throw new IllegalStateException("Unmute drawable was unexpectedly null".toString());
        }
        this.T0 = b2;
        final Drawable b3 = qo6$c.b(g0.getContext(), 2131231597);
        if (b3 != null) {
            this.U0 = b3;
            this.V0 = qo6.b(g0.getContext(), 2131100774);
            this.W0 = qo6.b(g0.getContext(), 2131100773);
            final Context context2 = g0.getContext();
            e0e.e((Object)context2, "rootView.context");
            this.X0 = b1b.B(context2, 2130969091);
            final Context context3 = g0.getContext();
            e0e.e((Object)context3, "rootView.context");
            this.Y0 = b1b.B(context3, 2130969093);
            this.Z0 = (znl<d2e>)new znl();
            this.a1 = (znl<vzv>)new znl();
            final p p9 = ((dob)j0).P();
            e0e.e((Object)p9, "activity.supportFragmentManager");
            this.b1 = (xob)p9;
            this.c1 = (h5s)jty.N((ptb)new ofn$a(this));
            this.d1 = (h5s)jty.N((ptb)new ofn$b(this));
            this.e1 = (h5s)jty.N((ptb)new ofn$i(this));
            this.f1 = (h5s)jty.N((ptb)new ofn$d(this));
            this.g1 = (h5s)jty.N((ptb)new ofn$c(this));
            final e39 e39;
            e39.c(k9x.l().doOnComplete((sj)new ofn$e(e39 = new e39())).subscribe((rk6)new f$y2((stb)new ofn$f(this))));
            final e39 e40;
            e40.c(k9x.o().doOnComplete((sj)new ofn$g(e40 = new e39())).subscribe((rk6)new f$y2((stb)new ofn$h(this))));
            kcm.i((sj)new gwt((Object)this, 23));
            this.h1 = (fih<sgn>)ma7.S((stb)new ofn$o(this));
            return;
        }
        throw new IllegalStateException("mute drawable was unexpectedly null".toString());
    }
    
    public static final int a(final ofn ofn) {
        return ((Number)ofn.f1.getValue()).intValue();
    }
    
    public static final boolean b(final ofn ofn, final sgn sgn) {
        Objects.requireNonNull(ofn);
        final mrn k = sgn.k;
        final mrn g0 = mrn.G0;
        final boolean b = true;
        if (k == g0) {
            boolean b2 = b;
            if (sgn.o > 0) {
                return b2;
            }
            if (sgn.p.isEmpty() ^ true) {
                b2 = b;
                return b2;
            }
        }
        return false;
    }
    
    public final void T(final ccx ccx) {
        final sgn sgn = (sgn)ccx;
        e0e.f((Object)sgn, "state");
        this.h1.b((Object)sgn);
    }
    
    public final q6s c(final String s, final boolean b) {
        int n;
        if (b) {
            n = 56;
        }
        else {
            n = 55;
        }
        return new q6s(s, (rfd$c)rfd$c$b.b, "", Integer.valueOf(n), 112);
    }
    
    public final void d(final lnj lnj) {
        this.I0.f(false);
        if (((dob)this.J0).P().H("TAG_ROOM_PROFILE_SHEET_FRAGMENT") == null) {
            final Bundle t = m58.t("twitter:id", 874340);
            if (!((BaseBundle)t).containsKey("twitter:id")) {
                throw new Fragment$InstantiationException("Missing fragment id", (Exception)null);
            }
            final wjo e = ehk.e(t);
            final int a = o5j.a;
            ((bl1)e).e2(((dob)this.J0).P(), "TAG_ROOM_PROFILE_SHEET_FRAGMENT");
        }
        this.K0.a(lnj);
    }
    
    public final void r(final Object o) {
        final pen pen = (pen)o;
        e0e.f((Object)pen, "effect");
        if (pen instanceof pen$f) {
            this.I0.f(false);
        }
        else if (pen instanceof pen$m) {
            final boolean a = ((pen$m)pen).a;
            String s;
            if (a) {
                s = this.G0.getContext().getString(2131954324);
            }
            else {
                s = this.G0.getContext().getString(2131954333);
            }
            e0e.e((Object)s, "if (isSpaceMuted) {\n    \u2026_space)\n                }");
            this.F0.f(this.c(s, a));
        }
        else if (pen instanceof pen$g) {
            this.d(new lnj.g(null, 1, null));
        }
        else if (pen instanceof pen$i) {
            final String string = this.G0.getContext().getString(2131955525);
            e0e.e((Object)string, "rootView.context.getStri\u2026.notify_removed_by_admin)");
            this.F0.d(string, (Integer)null);
        }
        else if (pen instanceof pen$c) {
            final String string2 = this.G0.getContext().getString(2131958363);
            e0e.e((Object)string2, "rootView.context.getStri\u2026ted_by_host_confirmation)");
            this.F0.f(this.c(string2, true));
        }
        else if (pen instanceof pen$d) {
            final String stringId = this.L0.getStringId();
            final pen$d pen$d = (pen$d)pen;
            this.d(new lnj.b(xli.g(stringId, pen$d.a), false, pen$d.b));
        }
        else if (pen instanceof pen$e) {
            final v1r f0 = v1r.F0;
            final pen$e pen$e = (pen$e)pen;
            this.d(new lnj.k(f0, pen$e.b, pen$e.a));
        }
        else if (pen instanceof pen.q) {
            final pen.q q = (pen.q)pen;
            final String a2 = q.a;
            final int b = q.b;
            final String c = q.c;
            final d2e d = q.d;
            final q6s$a q6s$a = new q6s$a();
            q6s$a.t(a2);
            q6s$a.e = (rfd$c)rfd$c$a.b;
            q6s$a.r("");
            q6s$a.q(b);
            q6s$a.p(c, (View$OnClickListener)new zgk((Object)this, (Object)d, 19));
            this.F0.f((q6s)((z4j)q6s$a).e());
        }
        else if (pen instanceof pen.p) {
            final zfo f2 = this.F0;
            final String string3 = this.G0.getContext().getString(2131957270);
            e0e.e((Object)string3, "rootView.context.getStri\u2026ge,\n                    )");
            f2.d(string3, Integer.valueOf(31));
        }
        else if (pen instanceof pen$j) {
            final akq$a akq$a = new akq$a();
            final pen$j pen$j = (pen$j)pen;
            akq$a.o(pen$j.a);
            akq$a.p(pen$j.b);
            akq$a.g = pen$j.c;
            final a2p e = new a2p((Object)this, (Object)pen, 18);
            akq$a.d = 2131958198;
            akq$a.e = (View$OnClickListener)e;
            this.F0.e((akq)((z4j)akq$a).e());
        }
        else if (pen instanceof pen$k) {
            final akq$a akq$a2 = new akq$a();
            final pen$k pen$k = (pen$k)pen;
            akq$a2.o(pen$k.b);
            akq$a2.p(pen$k.a);
            akq$a2.g = 61;
            this.F0.e((akq)((z4j)akq$a2).e());
        }
        else if (pen instanceof pen$h) {
            final String string4 = this.G0.getContext().getString(2131958244);
            e0e.e((Object)string4, "rootView.context.getStri\u2026n_text,\n                )");
            this.F0.f(new q6s(string4, (rfd$c)rfd$c$b.b, "", (Integer)null, 120));
        }
        else if (pen instanceof pen$a) {
            qjy.D((Context)this.J0, this.a1, ((pen$a)pen).a);
        }
        else if (pen instanceof pen$b) {
            final xsk a3 = ((pen$b)pen).a;
            final Bundle t = m58.t("twitter:id", 874340);
            if (!((BaseBundle)t).containsKey("twitter:id")) {
                throw new Fragment$InstantiationException("Missing fragment id", (Exception)null);
            }
            final wjo e2 = ehk.e(t);
            final int a4 = o5j.a;
            ((bl1)e2).e2((p)this.b1, "TAG_POST_SURVEY_SHEET_FRAGMENT");
            this.H0.a((lnj)new lnj.i(a3.a, a3.b, a3.c, a3.d, a3.e, a3.f, a3.g, a3.h, a3.i, a3.j, a3.k));
        }
        else if (pen instanceof pen.n) {
            final ysq i0 = this.I0;
            final dhn a5 = ((pen.n)pen).a;
            qee.v(i0, a5.a, a5.b, a5.c, a5.d, (Set)a5.e, false, a5.f, a5.g, 32, (Object)null);
        }
        else if (pen instanceof pen.o) {
            this.I0.g(((pen.o)pen).a.a);
        }
        else if (e0e.a((Object)pen, (Object)pen$l.a)) {
            final zfo f3 = this.F0;
            final String string5 = this.G0.getContext().getString(2131953571);
            e0e.e((Object)string5, "rootView.context.getStri\u2026er_connection_lost_error)");
            f3.c(string5, Integer.valueOf(2131232060));
        }
    }
    
    public final t5j<qen> w() {
        final t5j mergeArray = t5j.mergeArray(new fbj[] { (fbj)vq9.a(this.G0).map((rtb)new uti((stb)ofn$j.F0, 13)), (fbj)vq9.a((View)this.R0).map((rtb)new d6i((stb)ofn$k.F0, 14)), (fbj)vq9.a((View)this.S0).map((rtb)new x2i((stb)ofn$l.F0, 18)), (fbj)((t5j)this.Z0).map((rtb)new l5i((stb)ofn$m.F0, 19)), (fbj)((t5j)this.a1).map((rtb)new yql((stb)ofn$n.F0, 16)) });
        e0e.e((Object)mergeArray, "mergeArray(\n        root\u2026onfirmedEndSpace },\n    )");
        return (t5j<qen>)mergeArray;
    }
}
