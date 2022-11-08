import android.view.View;
import android.view.MotionEvent;
import android.view.ViewGroup;

// 
// Decompiled by Procyon v0.6.0
// 

public final class p3 implements z0s$c
{
    public float C0;
    public final /* synthetic */ q3 D0;
    
    public p3(final q3 d0) {
        this.D0 = d0;
        this.C0 = 0.0f;
    }
    
    public final void K3(final ViewGroup viewGroup) {
        if (this.C0 > 0.0f) {
            this.D0.W0.a = new zyt(null, new yyt(2130772038, 2130772040));
        }
        else {
            this.D0.W0.a = new zyt(null, new yyt(2130772038, 2130772039));
        }
        ((abv)this.D0).Q0.j();
    }
    
    public final void a2(ViewGroup k4, final float n) {
        this.C0 = n;
        k4 = ((x9)this.D0).K4();
        if (k4 != null) {
            if (n >= 0.0f) {
                ((View)k4).setTranslationY(-n);
            }
            else {
                ((View)k4).setTranslationY(n);
            }
        }
    }
}
