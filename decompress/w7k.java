import androidx.compose.ui.platform.ComposeView;
import java.util.List;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class w7k extends ste implements nsb<fzv>
{
    public final y7k D0;
    public final bib E0;
    
    public w7k(final y7k d0, final bib e0) {
        this.D0 = d0;
        this.E0 = e0;
        super(0);
    }
    
    public final Object invoke() {
        final hal hal = (hal)this.D0.c.get();
        final ComposeView a = this.D0.a;
        final int ordinal = ((Enum)this.E0).ordinal();
        int n;
        if (ordinal != 0 && ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 4) {
                    n = 0;
                }
                else {
                    n = 2131427992;
                }
            }
            else {
                n = 2131427988;
            }
        }
        else {
            n = 2131430551;
        }
        hal.Q1((View)a, (List)null, n);
        return fzv.a;
    }
}
