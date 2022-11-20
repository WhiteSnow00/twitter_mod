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

public final class ovo implements ilx<vvo, nvo, mvo>
{
    public final View D0;
    public final ul1 E0;
    public final obi<?> F0;
    public final yqn G0;
    public final kvo H0;
    public final mjo I0;
    public final l4o J0;
    public final View K0;
    public final TypefacesTextView L0;
    public final TypefacesTextView M0;
    public final ImageView N0;
    public final mnl<fzv> O0;
    public final qun<RoomScheduledSpaceSettingsView> P0;
    public final nnl<tmi> Q0;
    public final int R0;
    public final int S0;
    public final rhh<vvo> T0;
    
    public ovo(final View d0, final ul1 e0, final obi<?> f0, final yqn g0, final kvo h0, final mjo i0, final l4o j0) {
        czd.f((Object)d0, "rootView");
        czd.f((Object)f0, "navigator");
        czd.f((Object)g0, "roomMultiScheduledSpacesDispatcher");
        czd.f((Object)h0, "scheduledSpaceDmHelper");
        czd.f((Object)i0, "roomUtilsFragmentViewEventDispatcher");
        czd.f((Object)j0, "scheduledSpaceEditDelegate");
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
        this.J0 = j0;
        this.K0 = d0.findViewById(2131431207);
        final View viewById = d0.findViewById(2131432076);
        czd.e((Object)viewById, "rootView.findViewById(R.id.title)");
        this.L0 = (TypefacesTextView)viewById;
        final View viewById2 = d0.findViewById(2131431222);
        czd.e((Object)viewById2, "rootView.findViewById(R.id.scheduled_start)");
        this.M0 = (TypefacesTextView)viewById2;
        final View viewById3 = d0.findViewById(2131430132);
        czd.e((Object)viewById3, "rootView.findViewById(R.id.more_options)");
        this.N0 = (ImageView)viewById3;
        final mnl o0 = new mnl();
        this.O0 = (mnl<fzv>)o0;
        final qun$a companion = qun.Companion;
        final Context context = d0.getContext();
        czd.e((Object)context, "rootView.context");
        Objects.requireNonNull(companion);
        final View inflate = View.inflate(context, 2131625569, (ViewGroup)null);
        final k6o k6o = (k6o)inflate.findViewById(2131431008);
        final PopupWindow popupWindow = new PopupWindow(inflate, -2, -2, true);
        popupWindow.setElevation(inflate.getElevation());
        popupWindow.setOnDismissListener((PopupWindow$OnDismissListener)new pun(o0));
        czd.e((Object)k6o, "roomSettingsView");
        this.P0 = (qun<RoomScheduledSpaceSettingsView>)new qun(popupWindow, k6o);
        this.Q0 = (nnl<tmi>)new nnl();
        final Context context2 = d0.getContext();
        czd.e((Object)context2, "rootView.context");
        this.R0 = d4j.i(context2, 2130969093);
        this.S0 = kn6.b(d0.getContext(), 2131100721);
        this.T0 = (rhh<vvo>)q3j.g0((qsb)new ovo$g(this));
    }
    
    public final void T(final jbx jbx) {
        final vvo vvo = (vvo)jbx;
        czd.f((Object)vvo, "state");
        this.T0.b((Object)vvo);
    }
    
    public final void q(final Object o) {
        final mvo mvo = (mvo)o;
        czd.f((Object)mvo, "effect");
        if (mvo instanceof mvo$j) {
            final qun<RoomScheduledSpaceSettingsView> p = this.P0;
            final ImageView n0 = this.N0;
            p.b((View)n0, (View)n0, (ftb)pvo.D0);
        }
        else if (mvo instanceof mvo$f) {
            this.H0.a(djo.f(((mvo$f)mvo).a));
            this.P0.a();
        }
        else if (mvo instanceof mvo$g) {
            final String a = ((mvo$g)mvo).a;
            final yqn g0 = this.G0;
            final yqn$a yqn$a = new yqn$a(a);
            Objects.requireNonNull(g0);
            g0.b.onNext((Object)yqn$a);
            this.P0.a();
        }
        else if (mvo instanceof mvo$h) {
            djo.L(((mvo$h)mvo).a, (Activity)this.E0);
            this.P0.a();
        }
        else if (mvo instanceof mvo$i) {
            final String string = ((Context)this.E0).getString(2131957406, new Object[] { djo.f(((mvo$i)mvo).a) });
            czd.e((Object)string, "activity.getString(\n    \u2026cesUrl(roomId),\n        )");
            final z66 z66 = new z66();
            z66.s(string, null);
            z66.g(1);
            z66.q(false);
            this.F0.d((ym)z66);
            this.P0.a();
        }
        else if (mvo instanceof mvo$e) {
            final mvo$e mvo$e = (mvo$e)mvo;
            final p p2 = ((cnb)this.E0).P();
            czd.e((Object)p2, "activity.supportFragmentManager");
            final Fragment h = p2.H("TAG_ROOM_SCHEDULED_SPACE_EDIT_SHEET_FRAGMENT");
            if (h != null) {
                nv8 nv8;
                if (h instanceof nv8) {
                    nv8 = (nv8)h;
                }
                else {
                    nv8 = null;
                }
                if (nv8 != null) {
                    nv8.dismiss();
                }
                p2.D();
            }
            final Bundle a2 = nh.A("twitter:id", 874340);
            if (!((BaseBundle)a2).containsKey("twitter:id")) {
                throw new Fragment$InstantiationException("Missing fragment id", (Exception)null);
            }
            final ejo k = m1f.k(a2);
            final int a3 = c5j.a;
            ((wk1)k).e2(p2, "TAG_ROOM_SCHEDULED_SPACE_EDIT_SHEET_FRAGMENT");
            this.I0.a((vmj)new vmj.o(mvo$e.a, mvo$e.b, mvo$e.c, mvo$e.d, mvo$e.e, mvo$e.f));
            this.P0.a();
        }
        else if (mvo instanceof mvo$d) {
            this.P0.a();
        }
        else if (mvo instanceof mvo$a) {
            this.J0.c((nnl)this.Q0);
        }
        else if (czd.a((Object)mvo, (Object)mvo$b.a)) {
            this.J0.b();
        }
        else if (czd.a((Object)mvo, (Object)mvo$c.a)) {
            this.J0.a();
        }
    }
    
    public final h5j<nvo> w() {
        final View k0 = this.K0;
        czd.e((Object)k0, "containerView");
        final h5j mergeArray = h5j.mergeArray(new taj[] { (taj)max.h(k0).map((psb)new h3o((qsb)ovo$b.D0, 3)), (taj)max.h((View)this.N0).map((psb)new cyn((qsb)ovo$c.D0, 4)), (taj)((h5j)((k6o)this.P0.b).F0).map((psb)new hpn((qsb)ovo$d.D0, 5)), (taj)((h5j)this.O0).map((psb)new b9n((qsb)ovo$e.D0, 8)), (taj)((h5j)this.Q0).map((psb)new wtn((qsb)ovo$f.D0, 11)) });
        czd.e((Object)mergeArray, "mergeArray(\n        cont\u2026elSpaceConfirmed },\n    )");
        return (h5j<nvo>)mergeArray;
    }
}
