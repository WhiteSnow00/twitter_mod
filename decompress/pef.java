import java.util.concurrent.TimeUnit;
import android.content.Context;
import com.twitter.business.features.linkmodule.api.LinkConfigurationContentViewResult;
import com.twitter.business.api.BusinessInputTextContentViewArgs;
import com.twitter.business.api.ValidationType;
import java.util.Objects;
import com.twitter.business.model.listselection.BusinessListSelectionData;
import android.widget.TextView;
import androidx.fragment.app.p;
import android.view.View;
import com.twitter.business.linkconfiguration.LinkModuleConfigurationViewModel;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pef implements ilx<LinkModuleConfigurationViewModel.b, eef, cef>
{
    public static final a Companion;
    public final View D0;
    public final ogf E0;
    public final h13 F0;
    public final jn G0;
    public final p H0;
    public final tu2 I0;
    public final xba<q4h> J0;
    public final fef K0;
    public final bef L0;
    public final osa M0;
    public final wu2 N0;
    public final View O0;
    public final TextView P0;
    public final View Q0;
    public final TextView R0;
    public final TextView S0;
    public final TextView T0;
    public final View U0;
    public jhl V0;
    public final mv1<BusinessListSelectionData> W0;
    public final mv1<ogf$a> X0;
    public final rhh<LinkModuleConfigurationViewModel.b> Y0;
    
    static {
        Companion = new a();
    }
    
    public pef(final View d0, final ogf e0, final h13 f0, final jn g0, final p h0, final tu2 i0, final xba<q4h> j0, final fef k0, final bef l0, final osa m0, final wu2 n0) {
        czd.f((Object)d0, "rootView");
        czd.f((Object)e0, "linkModuleTextInputLauncher");
        czd.f((Object)f0, "listSelectionScreenLauncher");
        czd.f((Object)g0, "activityFinisher");
        czd.f((Object)h0, "supportFragmentManager");
        czd.f((Object)i0, "businessDialogBuilder");
        czd.f((Object)j0, "menuEventObservable");
        czd.f((Object)k0, "navigationConfigurator");
        czd.f((Object)l0, "actionDispatcher");
        czd.f((Object)m0, "halfSheetLauncher");
        czd.f((Object)n0, "halfSheetActionDispatcher");
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
        this.J0 = j0;
        this.K0 = k0;
        this.L0 = l0;
        this.M0 = m0;
        this.N0 = n0;
        final View viewById = d0.findViewById(2131428052);
        this.O0 = viewById;
        final TextView textView = (TextView)viewById.findViewById(2131431164);
        this.P0 = (TextView)viewById.findViewById(2131431167);
        final View viewById2 = d0.findViewById(2131429764);
        this.Q0 = viewById2;
        final TextView textView2 = (TextView)viewById2.findViewById(2131431164);
        this.R0 = (TextView)viewById2.findViewById(2131431167);
        this.S0 = (TextView)d0.findViewById(2131428251);
        final TextView textView3 = (TextView)d0.findViewById(2131431381);
        this.T0 = (TextView)d0.findViewById(2131430689);
        this.U0 = d0.findViewById(2131430687);
        final mv1 w0 = new mv1();
        this.W0 = (mv1<BusinessListSelectionData>)w0;
        final mv1 x0 = new mv1();
        this.X0 = (mv1<ogf$a>)x0;
        this.Y0 = (rhh<LinkModuleConfigurationViewModel.b>)q3j.g0((qsb)new qsb<rhh$a<LinkModuleConfigurationViewModel.b>, fzv>(this) {
            public final pef D0;
            
            public final Object invoke(final Object o) {
                final rhh$a rhh$a = (rhh$a)o;
                czd.f((Object)rhh$a, "$this$watch");
                rhh$a.c(new foe[] { (foe)xef.D0 }, (qsb)new yef(this.D0));
                rhh$a.c(new foe[] { (foe)zef.D0 }, (qsb)new aff(this.D0));
                rhh$a.c(new foe[] { (foe)bff.D0 }, (qsb)new cff(this.D0));
                rhh$a.c(new foe[] { (foe)dff.D0 }, (qsb)new eff(this.D0));
                rhh$a.c(new foe[] { (foe)fff.D0 }, (qsb)new uef(this.D0));
                rhh$a.c(new foe[] { (foe)vef.D0 }, (qsb)new wef(this.D0));
                return fzv.a;
            }
        });
        final String string = d0.getContext().getString(2131954505);
        czd.e((Object)string, "rootView.context.getString(id)");
        textView.setText((CharSequence)string);
        final String string2 = d0.getContext().getString(2131954666);
        czd.e((Object)string2, "rootView.context.getString(id)");
        textView2.setText((CharSequence)string2);
        czd.e((Object)textView3, "settingsHeaderView");
        f4l.a((View)textView3);
        this.V0 = (jhl)h0.H("loading_dialog");
        final h5j map = e0.c.c().map((psb)new ola((qsb)new pgf(e0), 16));
        czd.e((Object)map, "fun observeSuccess(): Ob\u2026extValue)\n        }\n    }");
        f.e(map, (amr)x0, false);
        final h5j map2 = f0.a().map((psb)new lka((qsb)tef.D0, 13));
        czd.e((Object)map2, "listSelectionScreenLaunc\u2026).map { it.originalItem }");
        f.e(map2, (amr)w0, false);
    }
    
    public final void T(final jbx jbx) {
        final LinkModuleConfigurationViewModel.b b = (LinkModuleConfigurationViewModel.b)jbx;
        czd.f((Object)b, "state");
        this.Y0.b((Object)b);
    }
    
    public final void q(final Object o) {
        final cef cef = (cef)o;
        czd.f((Object)cef, "effect");
        if (cef instanceof cef$d) {
            final ogf e0 = this.E0;
            final cef$d cef$d = (cef$d)cef;
            final String a = cef$d.a;
            final d93 b = cef$d.b;
            Objects.requireNonNull(e0);
            czd.f((Object)a, "existingUrl");
            czd.f((Object)b, "type");
            final egf a2 = e0.a;
            Objects.requireNonNull(a2);
            Objects.requireNonNull(a2.a);
            e0.c.d((Object)new BusinessInputTextContentViewArgs(((Enum)b).name(), a, a2.a(2131954431), a2.a(2131954418), a2.a(2131953919), 100, 208, a2.a(2131954431), a2.a(2131958630), "https://business.twitter.com/en/help/account-setup/professional-accounts.html", "link_module_url_settings", new ValidationType.Website(false)));
        }
        else if (cef instanceof cef$b) {
            final h13 f0 = this.F0;
            final cef$b cef$b = (cef$b)cef;
            f0.b(cef$b.a, cef$b.b, cef$b.c, (Integer)null, false);
        }
        else if (cef instanceof cef$e) {
            final tu2 i0 = this.I0;
            final qef qef = new qef(this.L0);
            final ref ref = new ref(this.L0);
            final Context context = this.D0.getContext();
            czd.e((Object)context, "rootView.context");
            i0.a(2131953074, (nsb)qef, (nsb)ref, context);
        }
        else if (cef instanceof cef$f) {
            final tu2 i2 = this.I0;
            final sef sef = new sef(this.L0);
            final Context context2 = this.D0.getContext();
            czd.e((Object)context2, "rootView.context");
            i2.c((nsb)sef, (nsb)su2.D0, context2);
        }
        else if (cef instanceof cef$g) {
            m1f.e().c(((cef$g)cef).a, 0);
        }
        else if (cef instanceof cef$h) {
            final String a3 = ((cef$h)cef).a;
            final tu2 i3 = this.I0;
            final Context context3 = this.D0.getContext();
            czd.e((Object)context3, "rootView.context");
            i3.d(a3, context3);
        }
        else if (cef instanceof cef$a) {
            final jn g0 = this.G0;
            final cef$a cef$a = (cef$a)cef;
            g0.c((bn6)new LinkConfigurationContentViewResult(cef$a.a, cef$a.b));
        }
        else if (cef instanceof cef$c) {
            osa.b(this.M0);
        }
    }
    
    public final h5j<eef> w() {
        final View q0 = this.Q0;
        czd.e((Object)q0, "linkRow");
        final h5j map = max.h(q0).map((psb)new ut1((qsb)pef$b.D0, 18));
        final View o0 = this.O0;
        czd.e((Object)o0, "labelRow");
        final h5j map2 = max.h(o0).map((psb)new nla((qsb)pef$c.D0, 16));
        final h5j map3 = ((h5j)this.W0).map((psb)new ola((qsb)pef$d.D0, 15));
        final h5j map4 = ((h5j)this.X0).map((psb)new qo((qsb)pef$e.D0, 13));
        final TextView s0 = this.S0;
        czd.e((Object)s0, "clearDataView");
        final h5j map5 = max.h((View)s0).map((psb)new ti4((qsb)pef$f.D0, 13));
        final lnl<eef> a = this.L0.a;
        Objects.requireNonNull(a);
        final h5j map6 = ((h5j)new r7j((pnl)a)).map((psb)new ui4((qsb)pef$g.D0, 11));
        final h5j ofType = this.J0.v0().ofType((Class)q4h$b.class);
        czd.e((Object)ofType, "onEvent().ofType(ME::class.java)");
        final h5j mergeArray = h5j.mergeArray(new taj[] { (taj)map, (taj)map2, (taj)map3, (taj)map4, (taj)map5, (taj)map6, (taj)ofType.filter((ytk)new qo((qsb)pef$h.D0, 3)).debounce(100L, TimeUnit.MILLISECONDS).map((psb)new y9v((qsb)pef$i.D0, 13)), (taj)this.N0.a().map((psb)new di((qsb)pef$j.D0, 13)) });
        czd.e((Object)mergeArray, "mergeArray(\n        link\u2026        }\n        }\n    )");
        return (h5j<eef>)mergeArray;
    }
    
    public static final class a
    {
    }
}
