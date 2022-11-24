import android.view.View;
import android.view.View$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class uvg implements View$OnClickListener
{
    public final long F0;
    
    public uvg(final long f0) {
        this.F0 = f0;
    }
    
    public final void onClick(final View view) {
        final long f0 = this.F0;
        final zfu zfu = new zfu(view.getContext());
        zfu.a(f0);
        zfu.start();
    }
}
