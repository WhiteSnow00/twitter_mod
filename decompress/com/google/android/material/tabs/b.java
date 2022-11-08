// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.tabs;

import android.view.View;
import android.view.View$OnLayoutChangeListener;

public final class b implements View$OnLayoutChangeListener
{
    public final /* synthetic */ View C0;
    public final /* synthetic */ TabLayout.i D0;
    
    public b(final TabLayout.i d0, final View c0) {
        this.D0 = d0;
        this.C0 = c0;
    }
    
    public final void onLayoutChange(final View view, final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8) {
        if (this.C0.getVisibility() == 0) {
            this.D0.f(this.C0);
        }
    }
}
