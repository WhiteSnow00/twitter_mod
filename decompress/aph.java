import android.view.View;
import android.view.View$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aph implements View$OnClickListener
{
    public final int F0;
    public final stb G0;
    
    public aph(final stb g0, final int f0) {
        this.F0 = f0;
        this.G0 = g0;
    }
    
    public final void onClick(final View view) {
        switch (this.F0) {
            default: {
                final stb g0 = this.G0;
                e0e.f((Object)g0, "$tmp0");
                g0.invoke((Object)view);
                return;
            }
            case 0: {
                final stb g2 = this.G0;
                e0e.f((Object)g2, "$tmp0");
                g2.invoke((Object)view);
            }
        }
    }
}
