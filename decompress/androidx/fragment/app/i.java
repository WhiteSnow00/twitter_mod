// 
// Decompiled by Procyon v0.6.0
// 

package androidx.fragment.app;

import android.graphics.Rect;
import android.view.View;

public final class i implements Runnable
{
    public final /* synthetic */ ypb C0;
    public final /* synthetic */ View D0;
    public final /* synthetic */ Rect E0;
    
    public i(final ypb c0, final View d0, final Rect e0) {
        this.C0 = c0;
        this.D0 = d0;
        this.E0 = e0;
    }
    
    @Override
    public final void run() {
        this.C0.g(this.D0, this.E0);
    }
}
