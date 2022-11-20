// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.android.liveevent.di.app.internal;

import android.view.ViewGroup;

public final class LiveEventApplicationChromeFactorySubgraph_SSM_Private_Provide12Factory implements tpa<ypa<ViewGroup, a94>>
{
    public static ypa<ViewGroup, a94> a(final tyw tyw, final h59 h59, final isf isf, final lpf lpf, final dof dof) {
        final nof nof = (nof)chw.w0((Class)nof.class);
        czd.f((Object)tyw, "videoDockController");
        czd.f((Object)h59, "dockEventDispatcher");
        czd.f((Object)isf, "chromeFeatures");
        czd.f((Object)lpf, "stateCoordinator");
        czd.f((Object)dof, "accessibilityUtils");
        return (ypa<ViewGroup, a94>)new kof(isf, tyw, h59, lpf, dof);
    }
    
    public final Object get() {
        throw null;
    }
}
