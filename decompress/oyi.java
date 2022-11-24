import android.view.View;
import android.view.View$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class oyi implements View$OnClickListener
{
    public static final oyi G0;
    public static final oyi H0;
    public static final oyi I0;
    public final int F0;
    
    static {
        G0 = new oyi(0);
        H0 = new oyi(1);
        I0 = new oyi(2);
    }
    
    public oyi(final int f0) {
        this.F0 = f0;
    }
    
    public final void onClick(final View view) {
        switch (this.F0) {
            default: {
                return;
            }
            case 0: {
                if (jba.t("scribe_api_sample_size", nso.g).b()) {
                    final fg4 fg4 = new fg4();
                    ((o1p)fg4).q(new String[] { "settings:notifications:toggle::click" });
                    sbw.b((tlm)fg4);
                }
            }
        }
    }
}
