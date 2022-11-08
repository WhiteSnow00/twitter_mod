import java.util.concurrent.TimeUnit;
import com.twitter.business.model.phone.PreviewOpenTimesData;
import com.twitter.business.api.ModuleOverviewContentViewResult;
import com.twitter.commerce.api.merchantconfiguration.ShopSpotlightConfigContentViewArgs;
import com.twitter.business.features.linkmodule.api.LinkModuleConfigurationContentViewArgs;
import com.twitter.business.features.linkmodule.model.LinkModuleDomainConfig;
import com.twitter.business.features.mobileappmodule.api.MobileAppModuleConfigurationContentViewArgs;
import com.twitter.business.features.mobileappmodule.model.MobileAppModuleDomainConfig;
import com.twitter.business.api.BusinessInfoContentViewArgs;
import com.twitter.business.model.AboutModuleGoogleData;
import com.twitter.business.model.phone.BusinessPhoneInfoData;
import com.twitter.business.model.address.BusinessAddressInfoData;
import java.util.Objects;
import com.twitter.business.model.hours.BusinessHoursData;
import com.twitter.business.model.AboutModuleDomainData;
import com.twitter.commerce.api.merchantconfiguration.ShopSpotlightConfigContentViewResult;
import com.twitter.business.api.BusinessInfoContentViewResult;
import android.graphics.drawable.Drawable;
import android.content.Context;
import com.twitter.ui.components.inlinecallout.HorizonInlineCalloutView$a;
import com.twitter.ui.components.inlinecallout.HorizonInlineCalloutView$a$a;
import androidx.recyclerview.widget.n;
import androidx.recyclerview.widget.RecyclerView$l;
import androidx.recyclerview.widget.RecyclerView$e;
import android.view.View;
import com.twitter.ui.components.text.legacy.TypefacesTextView;
import com.twitter.ui.components.inlinecallout.HorizonInlineCalloutView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.fragment.app.p;

// 
// Decompiled by Procyon v0.6.0
// 

public final class smh implements okx<wnh, fmh, dmh>
{
    public static final smh.smh$a Companion;
    public final zf6 C0;
    public final jg6 D0;
    public final ig6 E0;
    public final kg6 F0;
    public final doh G0;
    public final zlh H0;
    public final p I0;
    public final kn J0;
    public final zml<fmh> K0;
    public final egd L0;
    public xgl M0;
    public final rv1<fmh.f> N0;
    public final rv1<fmh.h> O0;
    public final RecyclerView P0;
    public final HorizonInlineCalloutView Q0;
    public final TypefacesTextView R0;
    public final mhh<wnh> S0;
    
    static {
        Companion = new smh.smh$a();
    }
    
    public smh(final View view, final zf6 c0, final jg6 d0, final ig6 e0, final kg6 f0, final doh g0, final c4e<eoh> adapter, final zlh h0, final p i0, final kn j0, final zml<fmh> k0, final egd l0) {
        zzd.f((Object)view, "rootView");
        zzd.f((Object)c0, "configureBusinessInfoScreenLauncher");
        zzd.f((Object)d0, "configureMobileAppModuleScreenLauncher");
        zzd.f((Object)e0, "configureLinkModuleScreenLauncher");
        zzd.f((Object)f0, "configureShopModuleScreenLauncher");
        zzd.f((Object)g0, "collectionProvider");
        zzd.f((Object)adapter, "itemAdapter");
        zzd.f((Object)h0, "listIntentDispatcher");
        zzd.f((Object)i0, "supportFragmentManager");
        zzd.f((Object)j0, "activityFinisher");
        zzd.f((Object)k0, "navigatorEvents");
        zzd.f((Object)l0, "inAppMessageManager");
        this.C0 = c0;
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
        this.J0 = j0;
        this.K0 = k0;
        this.L0 = l0;
        this.N0 = (rv1<fmh.f>)new rv1();
        this.O0 = (rv1<fmh.h>)new rv1();
        final RecyclerView p12 = (RecyclerView)view.findViewById(2131429698);
        this.P0 = p12;
        final HorizonInlineCalloutView q0 = (HorizonInlineCalloutView)view.findViewById(2131428691);
        this.Q0 = q0;
        this.R0 = (TypefacesTextView)view.findViewById(2131428928);
        p12.setAdapter((RecyclerView$e)adapter);
        if (e4l.Companion.b()) {
            final Context context = ((View)p12).getContext();
            zzd.e((Object)context, "context");
            p12.h((RecyclerView$l)new cmh(context));
        }
        else {
            final Drawable drawable = ((View)p12).getContext().getDrawable(2131231156);
            if (drawable != null) {
                final n n = new n(view.getContext(), 1);
                n.j(drawable);
                p12.h((RecyclerView$l)n);
            }
        }
        final HorizonInlineCalloutView$a$a horizonInlineCalloutView$a$a = new HorizonInlineCalloutView$a$a((cqm)new ey0(2130969276), gpc.v1);
        zzd.e((Object)q0, "disclaimerCalloutView");
        HorizonInlineCalloutView.g(q0, (HorizonInlineCalloutView$a)horizonInlineCalloutView$a$a, 2131955952, 0, 0, (otb)null, 28);
        final b5j<BusinessInfoContentViewResult> c2 = c0.a.c();
        final b5j filter = c2.filter((ptk)new jn0((rtb)tmh.C0, 5));
        zzd.e((Object)filter, "it.filter { result -> result.modulesWereUpdated }");
        this.a((b5j<Object>)filter);
        final b5j filter2 = c2.filter((ptk)new qo((rtb)umh.C0, 5));
        zzd.e((Object)filter2, "it.filter { result -> result.isFeatured }");
        this.b((b5j<Object>)filter2);
        final b5j c3 = d0.a.c();
        final b5j filter3 = c3.filter((ptk)new lt1((rtb)vmh.C0, 6));
        zzd.e((Object)filter3, "it.filter { result -> result.modulesWereUpdated }");
        this.a((b5j<Object>)filter3);
        final b5j filter4 = c3.filter((ptk)new jhb((rtb)wmh.C0, 3));
        zzd.e((Object)filter4, "it.filter { result -> result.isFeatured }");
        this.b((b5j<Object>)filter4);
        final b5j c4 = e0.a.c();
        final b5j filter5 = c4.filter((ptk)new zt1((rtb)xmh.C0, 7));
        zzd.e((Object)filter5, "it.filter { result -> result.modulesWereUpdated }");
        this.a((b5j<Object>)filter5);
        final b5j filter6 = c4.filter((ptk)new dzf((rtb)ymh.C0, 6));
        zzd.e((Object)filter6, "it.filter { result -> result.isFeatured }");
        this.b((b5j<Object>)filter6);
        final b5j<ShopSpotlightConfigContentViewResult> c5 = f0.a.c();
        final b5j filter7 = c5.filter((ptk)new di((rtb)zmh.C0, 7));
        zzd.e((Object)filter7, "it.filter { result -> result.modulesWereUpdated }");
        this.a((b5j<Object>)filter7);
        final b5j filter8 = c5.filter((ptk)new ku9((rtb)anh.C0, 4));
        zzd.e((Object)filter8, "it.filter { result -> result.isFeatured }");
        this.b((b5j<Object>)filter8);
        this.S0 = (mhh<wnh>)ajy.a0((rtb)new rtb<mhh$a<wnh>, oyv>() {
            public final /* synthetic */ smh C0;
            
            public final Object invoke(final Object o) {
                final mhh$a mhh$a = (mhh$a)o;
                zzd.f((Object)mhh$a, "$this$watch");
                mhh$a.c(new voe[] { (voe)bnh.C0 }, (rtb)new cnh(this.C0));
                mhh$a.c(new voe[] { (voe)dnh.C0 }, (rtb)new enh(this.C0));
                mhh$a.c(new voe[] { (voe)fnh.C0 }, (rtb)new gnh(this.C0));
                return oyv.a;
            }
        });
    }
    
    public final void T(final oax oax) {
        final wnh wnh = (wnh)oax;
        zzd.f((Object)wnh, "state");
        this.S0.b((Object)wnh);
    }
    
    public final <T> b5j<fmh.f> a(final b5j<T> b5j) {
        final b5j map = b5j.map((qtb)new uj4((rtb)smh$b.C0, 21));
        zzd.e((Object)map, "this.map { RefreshPage }");
        f.e(map, (hlr)this.N0, false);
        return (b5j<fmh.f>)map;
    }
    
    public final <T> b5j<fmh.h> b(final b5j<T> b5j) {
        final b5j map = b5j.map((qtb)new nla((rtb)smh$c.C0, 16));
        zzd.e((Object)map, "this.map { SpotlightFeatured }");
        f.e(map, (hlr)this.O0, false);
        return (b5j<fmh.h>)map;
    }
    
    public final void s(final Object o) {
        final dmh dmh = (dmh)o;
        zzd.f((Object)dmh, "effect");
        if (dmh instanceof dmh.c) {
            final dmh.c c = (dmh.c)dmh;
            final koh a = c.a;
            final boolean a2 = zzd.a((Object)a, (Object)koh.a.a);
            final MobileAppModuleDomainConfig mobileAppModuleDomainConfig = null;
            final LinkModuleDomainConfig linkModuleDomainConfig = null;
            AboutModuleDomainData aboutModuleDomainData = null;
            if (a2) {
                final zf6 c2 = this.C0;
                final wkh b = c.b;
                if (b != null) {
                    aboutModuleDomainData = (AboutModuleDomainData)b;
                }
                final boolean d = c.d;
                final PreviewOpenTimesData e = c.e;
                final boolean f = c.f;
                final xn6<BusinessInfoContentViewArgs, BusinessInfoContentViewResult> a3 = c2.a;
                AboutModuleDomainData aboutModuleDomainData2;
                if ((aboutModuleDomainData2 = aboutModuleDomainData) == null) {
                    Objects.requireNonNull(BusinessHoursData.Companion);
                    aboutModuleDomainData2 = new AboutModuleDomainData((String)null, (BusinessAddressInfoData)null, (BusinessPhoneInfoData)null, BusinessHoursData.access$getNO_HOURS$cp(), (String)null, (String)null, (AboutModuleGoogleData)null, 119, (hg8)null);
                }
                a3.d(new BusinessInfoContentViewArgs(aboutModuleDomainData2, d, e, f));
            }
            else if (zzd.a((Object)a, (Object)koh.d.a)) {
                final jg6 d2 = this.D0;
                final wkh b2 = c.b;
                MobileAppModuleDomainConfig mobileAppModuleDomainConfig2 = mobileAppModuleDomainConfig;
                if (b2 != null) {
                    mobileAppModuleDomainConfig2 = (MobileAppModuleDomainConfig)b2;
                }
                final boolean d3 = c.d;
                final boolean f2 = c.f;
                final xn6 a4 = d2.a;
                MobileAppModuleDomainConfig mobileAppModuleDomainConfig3;
                if ((mobileAppModuleDomainConfig3 = mobileAppModuleDomainConfig2) == null) {
                    mobileAppModuleDomainConfig3 = new MobileAppModuleDomainConfig((String)null, (String)null, (String)null, (String)null, (String)null, (String)null, (String)null, 127, (hg8)null);
                }
                a4.d(new MobileAppModuleConfigurationContentViewArgs(mobileAppModuleDomainConfig3, d3, f2));
            }
            else if (zzd.a((Object)a, (Object)koh.c.a)) {
                final ig6 e2 = this.E0;
                final wkh b3 = c.b;
                LinkModuleDomainConfig linkModuleDomainConfig2 = linkModuleDomainConfig;
                if (b3 != null) {
                    linkModuleDomainConfig2 = (LinkModuleDomainConfig)b3;
                }
                final boolean d4 = c.d;
                final boolean f3 = c.f;
                final xn6 a5 = e2.a;
                LinkModuleDomainConfig linkModuleDomainConfig3;
                if ((linkModuleDomainConfig3 = linkModuleDomainConfig2) == null) {
                    linkModuleDomainConfig3 = new LinkModuleDomainConfig((String)null, (k93)null, (String)null, 7, (hg8)null);
                }
                a5.d(new LinkModuleConfigurationContentViewArgs(linkModuleDomainConfig3, d4, f3));
            }
        }
        else if (dmh instanceof dmh.d) {
            final kg6 f4 = this.F0;
            final dmh.d d5 = (dmh.d)dmh;
            f4.a.d(new ShopSpotlightConfigContentViewArgs(d5.a, d5.b));
        }
        else if (dmh instanceof dmh.b) {
            this.J0.c((vn6)new ModuleOverviewContentViewResult(((dmh.b)dmh).a));
        }
        else if (dmh instanceof dmh.e) {
            p88.f().b(((dmh.e)dmh).a, 0);
        }
        else if (dmh instanceof dmh.a) {
            this.J0.cancel();
        }
        else if (dmh instanceof dmh.f) {
            final boolean a6 = ((dmh.f)dmh).a;
            final egd l0 = this.L0;
            final d5s$a d5s$a = new d5s$a();
            d5s$a.q(32);
            d5s$a.e = (nfd$c)nfd$c$c.b;
            int n;
            if (a6) {
                n = 2131958461;
            }
            else {
                n = 2131958458;
            }
            d5s$a.s(n);
            d5s$a.r("");
            l0.a((zfd)((h4j)d5s$a).e());
        }
    }
    
    public final b5j<fmh> x() {
        final xml<fmh> a = this.H0.a;
        Objects.requireNonNull(a);
        final b5j mergeArray = b5j.mergeArray(new naj[] { (naj)((b5j)new l7j((bnl)a)).debounce(300L, TimeUnit.MILLISECONDS), (naj)this.N0, (naj)this.K0, (naj)this.O0 });
        zzd.e((Object)mergeArray, "mergeArray(\n            \u2026eaturedListener\n        )");
        return (b5j<fmh>)mergeArray;
    }
}
