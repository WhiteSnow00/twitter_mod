// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.business.moduleconfiguration.mobileappmodule;

import com.twitter.business.features.mobileappmodule.model.MobileAppModuleDomainConfig;
import com.twitter.business.moduleconfiguration.mobileappmodule.util.inputtext.MobileAppPlatformType;
import java.util.Objects;

@gb8(c = "com.twitter.business.moduleconfiguration.mobileappmodule.MobileAppModuleConfigurationViewModel$intents$2$3", f = "MobileAppModuleConfigurationViewModel.kt", l = {}, m = "invokeSuspend")
public final class e extends xzr implements gub<fdh.k, ap6<? super oyv>, Object>
{
    public /* synthetic */ Object C0;
    public final /* synthetic */ MobileAppModuleConfigurationViewModel D0;
    
    public e(final MobileAppModuleConfigurationViewModel d0, final ap6<? super e> ap6) {
        this.D0 = d0;
        super(2, (ap6)ap6);
    }
    
    public final ap6<oyv> create(final Object c0, final ap6<?> ap6) {
        final e e = new e(this.D0, (ap6<? super e>)ap6);
        e.C0 = c0;
        return (ap6<oyv>)e;
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final e e = (e)this.create(o, (ap6<?>)o2);
        final oyv a = oyv.a;
        e.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        kq9.b1(o);
        final fdh.k k = (fdh.k)this.C0;
        final MobileAppModuleConfigurationViewModel d0 = this.D0;
        String b = k.b;
        final MobileAppPlatformType a = k.a;
        final soe[] x0 = MobileAppModuleConfigurationViewModel.X0;
        Objects.requireNonNull(d0);
        final int n = MobileAppModuleConfigurationViewModel$b.a[((Enum)a).ordinal()];
        final int n2 = 0;
        boolean b2 = false;
        final String s = null;
        final String s2 = null;
        if (n != 1) {
            if (n == 2) {
                final MobileAppModuleDomainConfig v0 = d0.V0;
                final MobileAppModuleDomainConfig mobileAppDomainConfig = d0.N0.getMobileAppDomainConfig();
                String googleStoreUrl;
                if (mobileAppDomainConfig != null) {
                    googleStoreUrl = mobileAppDomainConfig.getGoogleStoreUrl();
                }
                else {
                    googleStoreUrl = null;
                }
                if (zzd.a((Object)b, (Object)googleStoreUrl)) {
                    final MobileAppModuleDomainConfig mobileAppDomainConfig2 = d0.N0.getMobileAppDomainConfig();
                    String googleAppName;
                    if (mobileAppDomainConfig2 != null) {
                        googleAppName = mobileAppDomainConfig2.getGoogleAppName();
                    }
                    else {
                        googleAppName = null;
                    }
                    v0.setGoogleAppName(googleAppName);
                    final MobileAppModuleDomainConfig mobileAppDomainConfig3 = d0.N0.getMobileAppDomainConfig();
                    String googleStoreUrl2;
                    if (mobileAppDomainConfig3 != null) {
                        googleStoreUrl2 = mobileAppDomainConfig3.getGoogleStoreUrl();
                    }
                    else {
                        googleStoreUrl2 = null;
                    }
                    v0.setGoogleStoreUrl(googleStoreUrl2);
                    final MobileAppModuleDomainConfig mobileAppDomainConfig4 = d0.N0.getMobileAppDomainConfig();
                    String googleAppIcon = s2;
                    if (mobileAppDomainConfig4 != null) {
                        googleAppIcon = mobileAppDomainConfig4.getGoogleAppIcon();
                    }
                    v0.setGoogleAppIcon(googleAppIcon);
                }
                else {
                    v0.setGoogleAppName((String)null);
                    if (b.length() == 0) {
                        b2 = true;
                    }
                    if (b2) {
                        b = null;
                    }
                    v0.setGoogleStoreUrl(b);
                    v0.setGoogleAppIcon((String)null);
                }
            }
        }
        else {
            final MobileAppModuleDomainConfig v2 = d0.V0;
            final MobileAppModuleDomainConfig mobileAppDomainConfig5 = d0.N0.getMobileAppDomainConfig();
            String appleStoreUrl;
            if (mobileAppDomainConfig5 != null) {
                appleStoreUrl = mobileAppDomainConfig5.getAppleStoreUrl();
            }
            else {
                appleStoreUrl = null;
            }
            if (zzd.a((Object)b, (Object)appleStoreUrl)) {
                final MobileAppModuleDomainConfig mobileAppDomainConfig6 = d0.N0.getMobileAppDomainConfig();
                String appleAppName;
                if (mobileAppDomainConfig6 != null) {
                    appleAppName = mobileAppDomainConfig6.getAppleAppName();
                }
                else {
                    appleAppName = null;
                }
                v2.setAppleAppName(appleAppName);
                final MobileAppModuleDomainConfig mobileAppDomainConfig7 = d0.N0.getMobileAppDomainConfig();
                String appleStoreUrl2;
                if (mobileAppDomainConfig7 != null) {
                    appleStoreUrl2 = mobileAppDomainConfig7.getAppleStoreUrl();
                }
                else {
                    appleStoreUrl2 = null;
                }
                v2.setAppleStoreUrl(appleStoreUrl2);
                final MobileAppModuleDomainConfig mobileAppDomainConfig8 = d0.N0.getMobileAppDomainConfig();
                String appleAppIcon = s;
                if (mobileAppDomainConfig8 != null) {
                    appleAppIcon = mobileAppDomainConfig8.getAppleAppIcon();
                }
                v2.setAppleAppIcon(appleAppIcon);
            }
            else {
                v2.setAppleAppName((String)null);
                int n3 = n2;
                if (b.length() == 0) {
                    n3 = 1;
                }
                if (n3 != 0) {
                    b = null;
                }
                v2.setAppleStoreUrl(b);
                v2.setAppleAppIcon((String)null);
            }
        }
        d0.a0();
        return oyv.a;
    }
}
