// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.android.broadcast.di.view;

import android.view.View;
import android.app.Activity;
import com.twitter.app.di.app.DaggerTwApplOG$c6;
import java.util.Objects;
import tv.periscope.android.view.RootDragLayout;
import com.twitter.media.av.broadcast.di.view.LexBroadcastViewObjectGraph;
import android.view.ViewGroup;
import android.content.Context;

public final class a implements on2
{
    public final LexBroadcastViewObjectGraph a(final Context context, final ViewGroup viewGroup, final u4 i) {
        final int a = w4j.a;
        final snd snd = (snd)context;
        final RootDragLayout h = (RootDragLayout)((View)viewGroup).findViewById(2131431150);
        final int a2 = wj2.a;
        Objects.requireNonNull(xj2.Companion);
        final DaggerTwApplOG$c6 daggerTwApplOG$c6 = (DaggerTwApplOG$c6)((xj2)afw.Companion.a().c((Class)xj2.class)).J1().b();
        Objects.requireNonNull(daggerTwApplOG$c6);
        Objects.requireNonNull(h);
        daggerTwApplOG$c6.h = h;
        Objects.requireNonNull(i);
        daggerTwApplOG$c6.i = i;
        daggerTwApplOG$c6.e((Activity)snd);
        daggerTwApplOG$c6.a(snd.i());
        return (LexBroadcastViewObjectGraph)daggerTwApplOG$c6.f();
    }
}
