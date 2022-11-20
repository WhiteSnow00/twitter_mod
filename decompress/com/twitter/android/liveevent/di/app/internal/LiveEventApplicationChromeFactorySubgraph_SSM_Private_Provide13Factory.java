// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.android.liveevent.di.app.internal;

import android.view.ViewGroup;

public final class LiveEventApplicationChromeFactorySubgraph_SSM_Private_Provide13Factory implements tpa<ypa<ViewGroup, a94>>
{
    public static ypa<ViewGroup, a94> a(final isf isf, final p6 p6, final lpf lpf, final ksf ksf, final dof dof, final mg3 mg3) {
        final nof nof = (nof)chw.w0((Class)nof.class);
        czd.f((Object)isf, "chromeFeatures");
        czd.f((Object)p6, "telephonyUtil");
        czd.f((Object)lpf, "stateCoordinator");
        czd.f((Object)ksf, "chromeToolbarCoordinator");
        czd.f((Object)dof, "accessibilityUtils");
        czd.f((Object)mg3, "captionManager");
        return (ypa<ViewGroup, a94>)new lof(ksf, mg3, p6, isf, lpf, dof);
    }
    
    public final Object get() {
        throw null;
    }
}
