import android.view.View;
import android.view.View$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hvk implements View$OnClickListener
{
    public static final hvk E0;
    public static final hvk F0;
    public static final hvk G0;
    public static final hvk H0;
    public final int D0;
    
    static {
        E0 = new hvk(0);
        F0 = new hvk(1);
        G0 = new hvk(2);
        H0 = new hvk(3);
    }
    
    public hvk(final int d0) {
        this.D0 = d0;
    }
    
    public final void onClick(final View view) {
        switch (this.D0) {
            default: {
                return;
            }
            case 0: {
                if (p0f.o("scribe_api_sample_size", uro.g).b()) {
                    cbw.b((elm)new af4(vba.g("settings", "navigation_bar", "toggle", "", "click")));
                }
            }
        }
    }
}
