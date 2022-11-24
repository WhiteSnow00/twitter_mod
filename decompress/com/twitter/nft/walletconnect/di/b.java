// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.nft.walletconnect.di;

import android.view.MenuItem;

public final class b implements vbi
{
    public final dbi F0;
    
    public b(final dbi f0) {
        this.F0 = f0;
    }
    
    public final void a3() {
        this.F0.a.onNext((Object)dbi.a.G0);
    }
    
    public final boolean n(final MenuItem menuItem) {
        e0e.f((Object)menuItem, "item");
        boolean b;
        if (menuItem.getItemId() == 2131427484) {
            this.F0.a.onNext((Object)dbi.a.F0);
            b = true;
        }
        else {
            b = false;
        }
        return b;
    }
}
