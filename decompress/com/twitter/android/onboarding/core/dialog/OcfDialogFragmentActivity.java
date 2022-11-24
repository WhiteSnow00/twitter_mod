// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.android.onboarding.core.dialog;

import android.app.Activity;
import com.twitter.android.onboarding.core.dialog.di.view.OcfDialogFragmentViewObjectGraph;
import android.os.Bundle;

public class OcfDialogFragmentActivity extends vnd
{
    public final void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        final OcfDialogFragmentViewObjectGraph ocfDialogFragmentViewObjectGraph = (OcfDialogFragmentViewObjectGraph)k5b.f((y2e)this);
        final adj adj = (adj)rk0.b((oec)this, (Class)adj.class);
        new idj(((zcj)rk0.a((oec)this, (Class)zcj.class)).H2().h, ((dob)this).P(), adj.w1(), bundle, ocfDialogFragmentViewObjectGraph.W7(), adj.r8(), u7k.d(), m58.m().R1(), this.i(), this.v0().D(), (Activity)this);
    }
}
