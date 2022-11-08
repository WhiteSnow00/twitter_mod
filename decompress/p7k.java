import androidx.compose.ui.platform.ComposeView;
import java.util.List;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class p7k extends gue implements otb<oyv>
{
    public final /* synthetic */ r7k C0;
    public final /* synthetic */ fjb D0;
    
    public p7k(final r7k c0, final fjb d0) {
        this.C0 = c0;
        this.D0 = d0;
        super(0);
    }
    
    public final Object invoke() {
        final v9l v9l = (v9l)this.C0.c.get();
        final ComposeView a = this.C0.a;
        final int ordinal = ((Enum)this.D0).ordinal();
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
            n = 2131430549;
        }
        v9l.Q1((View)a, (List)null, n);
        return oyv.a;
    }
}
