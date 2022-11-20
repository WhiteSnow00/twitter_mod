import android.view.View;
import android.view.View$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class loh implements View$OnClickListener
{
    public final int D0;
    public final qsb E0;
    
    public loh(final qsb e0, final int d0) {
        this.D0 = d0;
        this.E0 = e0;
    }
    
    public final void onClick(final View view) {
        switch (this.D0) {
            default: {
                final qsb e0 = this.E0;
                czd.f((Object)e0, "$tmp0");
                e0.invoke((Object)view);
                return;
            }
            case 0: {
                final qsb e2 = this.E0;
                czd.f((Object)e2, "$tmp0");
                e2.invoke((Object)view);
            }
        }
    }
}
