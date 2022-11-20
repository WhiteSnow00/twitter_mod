// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.android.liveevent.di.app.internal;

import android.view.ViewGroup;

public final class LiveEventApplicationChromeFactorySubgraph_SSM_Private_Provide7Factory implements tpa<ypa<ViewGroup, a94>>
{
    public static ypa<ViewGroup, a94> a(final ug2 ug2, final tyw tyw, final h59 h59, final isf isf, final lpf lpf, final dof dof) {
        final nof nof = (nof)chw.w0((Class)nof.class);
        czd.f((Object)ug2, "controllerManager");
        czd.f((Object)tyw, "videoDockController");
        czd.f((Object)h59, "dockEventDispatcher");
        czd.f((Object)isf, "chromeFeatures");
        czd.f((Object)lpf, "stateCoordinator");
        czd.f((Object)dof, "accessibilityUtils");
        return (ypa<ViewGroup, a94>)new iof((Object)ug2, (Object)isf, (Object)tyw, (Object)lpf, (Object)dof, 0);
    }
    
    public final Object get() {
        throw null;
    }
}
