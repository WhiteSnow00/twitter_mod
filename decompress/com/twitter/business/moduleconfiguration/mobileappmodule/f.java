// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.business.moduleconfiguration.mobileappmodule;

import com.twitter.weaver.mvi.MviViewModel;
import java.util.Objects;

@gb8(c = "com.twitter.business.moduleconfiguration.mobileappmodule.MobileAppModuleConfigurationViewModel$intents$2$4", f = "MobileAppModuleConfigurationViewModel.kt", l = {}, m = "invokeSuspend")
public final class f extends xzr implements gub<fdh.j, ap6<? super oyv>, Object>
{
    public final /* synthetic */ MobileAppModuleConfigurationViewModel C0;
    
    public f(final MobileAppModuleConfigurationViewModel c0, final ap6<? super f> ap6) {
        this.C0 = c0;
        super(2, (ap6)ap6);
    }
    
    public final ap6<oyv> create(final Object o, final ap6<?> ap6) {
        return (ap6<oyv>)new f(this.C0, (ap6<? super f>)ap6);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final f f = (f)this.create(o, (ap6<?>)o2);
        final oyv a = oyv.a;
        f.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        kq9.b1(o);
        this.C0.R0.b();
        final MobileAppModuleConfigurationViewModel c0 = this.C0;
        final String appleStoreUrl = c0.V0.getAppleStoreUrl();
        final boolean b = true;
        if (appleStoreUrl == null || appleStoreUrl.length() == 0) {
            final String googleStoreUrl = c0.V0.getGoogleStoreUrl();
            int n = b ? 1 : 0;
            if (googleStoreUrl != null) {
                if (googleStoreUrl.length() == 0) {
                    n = (b ? 1 : 0);
                }
                else {
                    n = 0;
                }
            }
            if (n != 0) {
                final String currentModuleId = c0.V0.getCurrentModuleId();
                oyv a = null;
                if (currentModuleId != null) {
                    final iz5 m = c0.O0.m(currentModuleId);
                    final ug ug = new ug((rtb)new ceh(c0), 18);
                    Objects.requireNonNull(m);
                    ((MviViewModel)c0).x((iz5)new g06((h06)m, (fk6)ug, (fk6)jvb.d, (rj)jvb.c), (rtb)new geh(c0));
                    a = oyv.a;
                }
                if (a == null) {
                    c0.V0.clearAllData();
                    ((MviViewModel)c0).Q((rtb)heh.C0);
                    ((MviViewModel)c0).V((Object)new bdh$a(false, 3));
                    return oyv.a;
                }
                return oyv.a;
            }
        }
        if (e4l.Companion.b() && !c0.N0.getHasFeaturedSpotlight()) {
            ((MviViewModel)c0).V((Object)bdh$b.a);
        }
        else {
            c0.Z(false);
        }
        return oyv.a;
    }
}
