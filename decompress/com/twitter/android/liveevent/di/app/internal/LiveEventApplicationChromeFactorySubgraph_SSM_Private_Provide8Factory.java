// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.android.liveevent.di.app.internal;

import android.view.ViewGroup;

public final class LiveEventApplicationChromeFactorySubgraph_SSM_Private_Provide8Factory implements tpa<ypa<ViewGroup, a94>>
{
    public static ypa<ViewGroup, a94> a(final ug2 ug2, final hf2 hf2, final isf isf, final p6 p8, final lpf lpf, final ksf ksf, final dof dof, final mg3 mg3) {
        final nof nof = (nof)chw.w0((Class)nof.class);
        czd.f((Object)ug2, "controllerManager");
        czd.f((Object)hf2, "broadcastCache");
        czd.f((Object)isf, "chromeFeatures");
        czd.f((Object)p8, "telephonyUtil");
        czd.f((Object)lpf, "stateCoordinator");
        czd.f((Object)ksf, "coordinator");
        czd.f((Object)dof, "accessibilityUtils");
        czd.f((Object)mg3, "captionManager");
        return (ypa<ViewGroup, a94>)new jof(hf2, ug2, isf, ksf, mg3, p8, lpf, dof);
    }
    
    public final Object get() {
        throw null;
    }
}
