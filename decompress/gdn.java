import androidx.appcompat.widget.AppCompatEditText;
import android.os.BaseBundle;
import android.widget.EditText;
import java.util.concurrent.TimeUnit;
import java.util.Set;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicReference;
import androidx.fragment.app.Fragment$InstantiationException;
import java.util.Objects;
import com.twitter.rooms.ui.utils.dm_invites.RoomDmInvitesViewModel;
import androidx.constraintlayout.widget.b;
import android.widget.TextView;
import android.text.TextWatcher;
import androidx.recyclerview.widget.RecyclerView$e;
import androidx.recyclerview.widget.RecyclerView$m;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.content.res.Resources;
import android.widget.ImageButton;
import android.view.ViewGroup;
import com.twitter.ui.widget.TwitterEditText;
import com.twitter.ui.components.text.legacy.TypefacesTextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gdn implements ilx<vdn, fdn, cdn>
{
    public static final gdn.gdn$a Companion;
    public final View D0;
    public final ul1 E0;
    public final d39 F0;
    public final q3e<yon> G0;
    public final gfo H0;
    public final mjo I0;
    public final nnl<fdn> J0;
    public final ConstraintLayout K0;
    public final RecyclerView L0;
    public final TypefacesTextView M0;
    public final View N0;
    public final View O0;
    public final TwitterEditText P0;
    public final TypefacesTextView Q0;
    public final TypefacesTextView R0;
    public final TypefacesTextView S0;
    public final ViewGroup T0;
    public final TwitterEditText U0;
    public final ImageButton V0;
    public final ViewGroup W0;
    public final ViewGroup X0;
    public final ViewGroup Y0;
    public final ViewGroup Z0;
    public final Resources a1;
    public final h5j<aks> b1;
    public final rhh<vdn> c1;
    
    static {
        Companion = new gdn.gdn$a();
    }
    
    public gdn(final View d0, final ul1 e0, final h3e<yon> adapter, final d39 f0, final q3e<yon> g0, final gfo h0, final mjo i0, final nnl<fdn> j0) {
        czd.f((Object)d0, "rootView");
        czd.f((Object)e0, "activity");
        czd.f((Object)adapter, "adapter");
        czd.f((Object)f0, "searchTextChipController");
        czd.f((Object)g0, "provider");
        czd.f((Object)h0, "roomToaster");
        czd.f((Object)i0, "roomUtilsFragmentViewEventDispatcher");
        czd.f((Object)j0, "publishSubject");
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
        this.J0 = j0;
        final View viewById = d0.findViewById(2131431034);
        czd.e((Object)viewById, "rootView.findViewById(R.\u2026m_dm_invites_layout_root)");
        this.K0 = (ConstraintLayout)viewById;
        final View viewById2 = d0.findViewById(2131431050);
        czd.e((Object)viewById2, "rootView.findViewById(R.\u2026ite_layout_recycler_view)");
        final RecyclerView l0 = (RecyclerView)viewById2;
        this.L0 = l0;
        final View viewById3 = d0.findViewById(2131431053);
        czd.e((Object)viewById3, "rootView.findViewById(R.\u2026nvite_layout_start_space)");
        this.M0 = (TypefacesTextView)viewById3;
        final View viewById4 = d0.findViewById(2131431046);
        czd.e((Object)viewById4, "rootView.findViewById(R.\u2026te_layout_dismiss_button)");
        this.N0 = viewById4;
        final View viewById5 = d0.findViewById(2131431043);
        czd.e((Object)viewById5, "rootView.findViewById(R.\u2026oom_interstitial_dismiss)");
        this.O0 = viewById5;
        final View viewById6 = d0.findViewById(2131431052);
        czd.e((Object)viewById6, "rootView.findViewById(R.\u2026ite_layout_search_invite)");
        final TwitterEditText twitterEditText = (TwitterEditText)viewById6;
        this.P0 = twitterEditText;
        final View viewById7 = d0.findViewById(2131431054);
        czd.e((Object)viewById7, "rootView.findViewById(R.\u2026m_invite_layout_subtitle)");
        this.Q0 = (TypefacesTextView)viewById7;
        final View viewById8 = d0.findViewById(2131431057);
        czd.e((Object)viewById8, "rootView.findViewById(R.id.room_invite_title)");
        this.R0 = (TypefacesTextView)viewById8;
        final View viewById9 = d0.findViewById(2131431055);
        czd.e((Object)viewById9, "rootView.findViewById(R.\u2026room_invite_layout_title)");
        this.S0 = (TypefacesTextView)viewById9;
        final View viewById10 = d0.findViewById(2131431051);
        czd.e((Object)viewById10, "rootView.findViewById(R.\u2026out_search_bar_container)");
        this.T0 = (ViewGroup)viewById10;
        final View viewById11 = d0.findViewById(2131431049);
        czd.e((Object)viewById11, "rootView.findViewById(R.\u2026ite_layout_message_input)");
        this.U0 = (TwitterEditText)viewById11;
        final View viewById12 = d0.findViewById(2131431056);
        czd.e((Object)viewById12, "rootView.findViewById(R.\u2026room_invite_send_message)");
        this.V0 = (ImageButton)viewById12;
        final View viewById13 = d0.findViewById(2131429399);
        czd.e((Object)viewById13, "rootView.findViewById(R.id.header)");
        this.W0 = (ViewGroup)viewById13;
        final View viewById14 = d0.findViewById(2131429638);
        czd.e((Object)viewById14, "rootView.findViewById(R.id.interstitial_header)");
        this.X0 = (ViewGroup)viewById14;
        final View viewById15 = d0.findViewById(2131431047);
        czd.e((Object)viewById15, "rootView.findViewById(R.\u2026oom_invite_layout_footer)");
        this.Y0 = (ViewGroup)viewById15;
        final View viewById16 = d0.findViewById(2131431048);
        czd.e((Object)viewById16, "rootView.findViewById(R.\u2026te_layout_message_footer)");
        this.Z0 = (ViewGroup)viewById16;
        final Resources resources = ((View)l0).getResources();
        czd.e((Object)resources, "recyclerView.resources");
        this.a1 = resources;
        d0.getContext();
        l0.setLayoutManager((RecyclerView$m)new LinearLayoutManager(1));
        l0.setAdapter((RecyclerView$e)adapter);
        final djo a = djo.a;
        Object b1;
        if (asa.b().b("android_audio_spaces_enable_dm_invites_search_chips", false)) {
            ((TextView)(f0.a = (EditText)twitterEditText)).addTextChangedListener((TextWatcher)f0.e);
            b1 = f0.b;
        }
        else {
            b1 = mru.e((TextView)twitterEditText);
        }
        this.b1 = (h5j<aks>)b1;
        this.c1 = (rhh<vdn>)q3j.g0((qsb)new qsb<rhh$a<vdn>, fzv>(this) {
            public final gdn D0;
            
            public final Object invoke(final Object o) {
                final rhh$a rhh$a = (rhh$a)o;
                czd.f((Object)rhh$a, "$this$watch");
                rhh$a.c(new foe[] { (foe)mdn.D0 }, (qsb)new ndn(this.D0));
                rhh$a.c(new foe[] { (foe)odn.D0, (foe)pdn.D0, (foe)qdn.D0, (foe)rdn.D0, (foe)sdn.D0, (foe)tdn.D0 }, (qsb)new udn(this.D0));
                rhh$a.c(new foe[] { (foe)hdn.D0, (foe)idn.D0 }, (qsb)new jdn(this.D0));
                rhh$a.c(new foe[] { (foe)kdn.D0 }, (qsb)new ldn(this.D0));
                return fzv.a;
            }
        });
    }
    
    public final void T(final jbx jbx) {
        final vdn vdn = (vdn)jbx;
        czd.f((Object)vdn, "state");
        this.c1.b((Object)vdn);
    }
    
    public final void a(final View view) {
        final b b = new b();
        b.g(this.K0);
        b.i(((View)this.T0).getId(), 3, view.getId(), 4);
        b.b(this.K0);
    }
    
    public final void q(final Object o) {
        final cdn cdn = (cdn)o;
        czd.f((Object)cdn, "effect");
        if (cdn instanceof cdn$b) {
            Objects.requireNonNull(RoomDmInvitesViewModel.Companion);
            final String v0 = RoomDmInvitesViewModel.V0;
            final cdn$b cdn$b = (cdn$b)cdn;
            Objects.toString(cdn$b.a);
            final AtomicReference a = y7g.a;
            m8a.d(cdn$b.a);
        }
        else if (cdn instanceof cdn$a) {
            ((TextView)this.P0).setText((CharSequence)"");
            fu8.o((String)null, (Integer)null, false, 7, this.I0);
        }
        else if (cdn instanceof cdn$d) {
            final cdn$d cdn$d = (cdn$d)cdn;
            final int size = cdn$d.a.size();
            if (cdn$d.b == gpn.H0) {
                String s;
                if (size > 1) {
                    s = this.D0.getContext().getString(2131958031);
                }
                else {
                    s = this.D0.getContext().getString(2131958032, new Object[] { ((ton)mq4.f0((Iterable)cdn$d.a)).b });
                }
                czd.e((Object)s, "if (numberOfInvites > 1)\u2026  )\n                    }");
                this.H0.c(s, (Integer)null);
            }
            else {
                final gfo h0 = this.H0;
                final String quantityString = this.D0.getContext().getResources().getQuantityString(2131820676, size, new Object[] { size });
                czd.e((Object)quantityString, "rootView.context.resourc\u2026                        )");
                h0.c(quantityString, (Integer)null);
            }
        }
        else if (cdn instanceof cdn$c) {
            final Bundle a2 = nh.A("twitter:id", 874340);
            if (!((BaseBundle)a2).containsKey("twitter:id")) {
                throw new Fragment$InstantiationException("Missing fragment id", (Exception)null);
            }
            final ejo k = m1f.k(a2);
            final int a3 = c5j.a;
            this.I0.a((vmj)new vmj.b(((cdn$c)cdn).a));
            ((wk1)k).e2(((cnb)this.E0).P(), "TAG_ROOM_PROFILE_SHEET_FRAGMENT");
        }
        else if (cdn instanceof cdn$e) {
            final Set a4 = ((cdn$e)cdn).a;
            final String string = this.D0.getContext().getResources().getString(2131954465);
            czd.e((Object)string, "rootView.context.resourc\u2026invite_cohosts_separator)");
            final String i = s9i.i(a4, string);
            final gfo h2 = this.H0;
            final String string2 = this.D0.getContext().getResources().getString(2131952530, new Object[] { i });
            czd.e((Object)string2, "rootView.context.resourc\u2026mes\n                    )");
            h2.c(string2, Integer.valueOf(31));
        }
    }
    
    public final h5j<fdn> w() {
        final h5j mergeArray = h5j.mergeArray(new taj[] { (taj)max.h((View)this.M0).map((psb)new k2o((qsb)gdn$b.D0, 10)), (taj)max.h((View)this.V0).map((psb)new abr((qsb)new qsb<fzv, fdn$a>(this) {
                public final gdn D0;
                
                public final Object invoke(final Object o) {
                    czd.f((Object)o, "it");
                    return new fdn$a(String.valueOf(((AppCompatEditText)this.D0.U0).getText()));
                }
            }, 5)), (taj)max.h(this.N0).map((psb)new ncr((qsb)gdn$d.D0, 2)), (taj)max.h(this.O0).map((psb)new byn((qsb)gdn$e.D0, 10)), (taj)this.b1.doOnNext((lj6)new fwi((qsb)new qsb<aks, fzv>(this) {
                public final gdn D0;
                
                public final Object invoke(final Object o) {
                    final CharSequence text = ((aks)o).a.getText();
                    czd.e((Object)text, "it.view.text");
                    if (text.length() == 0) {
                        are.c(this.D0.D0);
                    }
                    return fzv.a;
                }
            }, 22)).map((psb)new cyn((qsb)gdn$g.D0, 12)).distinctUntilChanged().debounce(200L, TimeUnit.MILLISECONDS).map((psb)new hpn((qsb)gdn$h.D0, 15)), (taj)((h5j)this.F0.c).map((psb)new b9n((qsb)gdn$i.D0, 14)), (taj)this.J0 });
        czd.e((Object)mergeArray, "override fun userIntentO\u2026shSubject\n        )\n    }");
        return (h5j<fdn>)mergeArray;
    }
}
