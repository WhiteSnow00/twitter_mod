import java.util.Objects;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bik implements ucc
{
    public final View a;
    
    public bik(final View a) {
        e0e.f((Object)a, "view");
        this.a = a;
    }
    
    public final void a(int n) {
        final vcc.a companion = vcc.Companion;
        Objects.requireNonNull(companion);
        final int n2 = 1;
        if (n == 0) {
            this.a.performHapticFeedback(0);
        }
        else {
            Objects.requireNonNull(companion);
            if (n == 9) {
                n = n2;
            }
            else {
                n = 0;
            }
            if (n != 0) {
                this.a.performHapticFeedback(9);
            }
        }
    }
}
