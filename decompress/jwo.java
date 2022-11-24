import android.os.BaseBundle;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.p;
import com.twitter.rooms.model.AudioSpaceTopicItem;
import java.util.List;
import androidx.fragment.app.Fragment$InstantiationException;
import android.app.Activity;
import android.content.Context;
import android.widget.PopupWindow$OnDismissListener;
import android.widget.PopupWindow;
import android.view.ViewGroup;
import java.util.Objects;
import com.twitter.common.ui.settings.RoomScheduledSpaceSettingsView;
import android.widget.ImageView;
import com.twitter.ui.components.text.legacy.TypefacesTextView;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jwo implements xlx<qwo, iwo, hwo>
{
    public final View F0;
    public final zl1 G0;
    public final fci<?> H0;
    public final orn I0;
    public final fwo J0;
    public final eko K0;
    public final e5o L0;
    public final View M0;
    public final TypefacesTextView N0;
    public final TypefacesTextView O0;
    public final ImageView P0;
    public final ynl<vzv> Q0;
    public final hvn<RoomScheduledSpaceSettingsView> R0;
    public final znl<kni> S0;
    public final int T0;
    public final int U0;
    public final fih<qwo> V0;
    
    public jwo(final View f0, final zl1 g0, final fci<?> h0, final orn i0, final fwo j0, final eko k0, final e5o l0) {
        e0e.f((Object)f0, "rootView");
        e0e.f((Object)h0, "navigator");
        e0e.f((Object)i0, "roomMultiScheduledSpacesDispatcher");
        e0e.f((Object)j0, "scheduledSpaceDmHelper");
        e0e.f((Object)k0, "roomUtilsFragmentViewEventDispatcher");
        e0e.f((Object)l0, "scheduledSpaceEditDelegate");
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
        this.J0 = j0;
        this.K0 = k0;
        this.L0 = l0;
        this.M0 = f0.findViewById(2131431208);
        final View viewById = f0.findViewById(2131432077);
        e0e.e((Object)viewById, "rootView.findViewById(R.id.title)");
        this.N0 = (TypefacesTextView)viewById;
        final View viewById2 = f0.findViewById(2131431223);
        e0e.e((Object)viewById2, "rootView.findViewById(R.id.scheduled_start)");
        this.O0 = (TypefacesTextView)viewById2;
        final View viewById3 = f0.findViewById(2131430133);
        e0e.e((Object)viewById3, "rootView.findViewById(R.id.more_options)");
        this.P0 = (ImageView)viewById3;
        final ynl q0 = new ynl();
        this.Q0 = (ynl<vzv>)q0;
        final hvn$a companion = hvn.Companion;
        final Context context = f0.getContext();
        e0e.e((Object)context, "rootView.context");
        Objects.requireNonNull(companion);
        final View inflate = View.inflate(context, 2131625569, (ViewGroup)null);
        final d7o d7o = (d7o)inflate.findViewById(2131431009);
        final PopupWindow popupWindow = new PopupWindow(inflate, -2, -2, true);
        popupWindow.setElevation(inflate.getElevation());
        popupWindow.setOnDismissListener((PopupWindow$OnDismissListener)new gvn(q0));
        e0e.e((Object)d7o, "roomSettingsView");
        this.R0 = (hvn<RoomScheduledSpaceSettingsView>)new hvn(popupWindow, d7o);
        this.S0 = (znl<kni>)new znl();
        final Context context2 = f0.getContext();
        e0e.e((Object)context2, "rootView.context");
        this.T0 = b1b.B(context2, 2130969093);
        this.U0 = qo6.b(f0.getContext(), 2131100721);
        this.V0 = (fih<qwo>)ma7.S((stb)new jwo$g(this));
    }
    
    public final void T(final ccx ccx) {
        final qwo qwo = (qwo)ccx;
        e0e.f((Object)qwo, "state");
        this.V0.b((Object)qwo);
    }
    
    public final void r(final Object o) {
        final hwo hwo = (hwo)o;
        e0e.f((Object)hwo, "effect");
        if (hwo instanceof hwo$j) {
            final hvn<RoomScheduledSpaceSettingsView> r0 = this.R0;
            final ImageView p = this.P0;
            r0.b((View)p, (View)p, (hub)kwo.F0);
        }
        else if (hwo instanceof hwo$f) {
            this.J0.a(vjo.f(((hwo$f)hwo).a));
            this.R0.a();
        }
        else if (hwo instanceof hwo$g) {
            final String a = ((hwo$g)hwo).a;
            final orn i0 = this.I0;
            final orn.a a2 = new orn.a(a);
            Objects.requireNonNull(i0);
            i0.b.onNext((Object)a2);
            this.R0.a();
        }
        else if (hwo instanceof hwo$h) {
            vjo.L(((hwo$h)hwo).a, (Activity)this.G0);
            this.R0.a();
        }
        else if (hwo instanceof hwo$i) {
            final String string = ((Context)this.G0).getString(2131957406, new Object[] { vjo.f(((hwo$i)hwo).a) });
            e0e.e((Object)string, "activity.getString(\n    \u2026cesUrl(roomId),\n        )");
            final f86 f86 = new f86();
            f86.s(string, null);
            f86.g(1);
            f86.q(false);
            this.H0.d((cn)f86);
            this.R0.a();
        }
        else if (hwo instanceof hwo$e) {
            final hwo$e hwo$e = (hwo$e)hwo;
            final p p2 = ((dob)this.G0).P();
            e0e.e((Object)p2, "activity.supportFragmentManager");
            final Fragment h = p2.H("TAG_ROOM_SCHEDULED_SPACE_EDIT_SHEET_FRAGMENT");
            if (h != null) {
                tw8 tw8;
                if (h instanceof tw8) {
                    tw8 = (tw8)h;
                }
                else {
                    tw8 = null;
                }
                if (tw8 != null) {
                    tw8.dismiss();
                }
                p2.D();
            }
            final Bundle t = m58.t("twitter:id", 874340);
            if (!((BaseBundle)t).containsKey("twitter:id")) {
                throw new Fragment$InstantiationException("Missing fragment id", (Exception)null);
            }
            final wjo e = ehk.e(t);
            final int a3 = o5j.a;
            ((bl1)e).e2(p2, "TAG_ROOM_SCHEDULED_SPACE_EDIT_SHEET_FRAGMENT");
            this.K0.a((lnj)new lnj.o(hwo$e.a, hwo$e.b, hwo$e.c, hwo$e.d, hwo$e.e, hwo$e.f));
            this.R0.a();
        }
        else if (hwo instanceof hwo$d) {
            this.R0.a();
        }
        else if (hwo instanceof hwo$a) {
            this.L0.c((znl)this.S0);
        }
        else if (e0e.a((Object)hwo, (Object)hwo$b.a)) {
            this.L0.b();
        }
        else if (e0e.a((Object)hwo, (Object)hwo$c.a)) {
            this.L0.a();
        }
    }
    
    public final t5j<iwo> w() {
        final View m0 = this.M0;
        e0e.e((Object)m0, "containerView");
        final t5j mergeArray = t5j.mergeArray(new fbj[] { (fbj)vq9.a(m0).map((rtb)new a4o((stb)jwo$b.F0, 2)), (fbj)vq9.a((View)this.P0).map((rtb)new vyn((stb)jwo$c.F0, 4)), (fbj)((t5j)((d7o)this.R0.b).H0).map((rtb)new uyn((stb)jwo$d.F0, 4)), (fbj)((t5j)this.Q0).map((rtb)new w1n((stb)jwo$e.F0, 10)), (fbj)((t5j)this.S0).map((rtb)new wcn((stb)jwo$f.F0, 7)) });
        e0e.e((Object)mergeArray, "mergeArray(\n        cont\u2026elSpaceConfirmed },\n    )");
        return (t5j<iwo>)mergeArray;
    }
}
