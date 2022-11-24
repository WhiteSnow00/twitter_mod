// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.android.explore.locations.di.view;

import android.app.Activity;
import android.view.View;
import com.twitter.android.explore.locations.ExploreLocationsActivity;
import android.view.ViewGroup;

public final class c extends pue implements stb<ViewGroup, tla>
{
    public final ExploreLocationsActivity F0;
    public final yla G0;
    public final igt H0;
    
    public c(final ExploreLocationsActivity f0, final yla g0, final igt h0) {
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final ViewGroup viewGroup = (ViewGroup)o;
        e0e.f((Object)viewGroup, "view");
        return new tla((View)viewGroup, (Activity)this.F0, this.G0, this.H0);
    }
}
