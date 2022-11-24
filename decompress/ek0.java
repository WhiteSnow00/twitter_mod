import androidx.fragment.app.Fragment;
import android.app.Dialog;
import android.os.Bundle;

// 
// Decompiled by Procyon v0.6.0
// 

public class ek0 extends tw8
{
    public Dialog a2(final Bundle bundle) {
        return new dk0(((Fragment)this).N0(), super.H1);
    }
    
    public void d2(final Dialog dialog, final int n) {
        if (dialog instanceof dk0) {
            final dk0 dk0 = (dk0)dialog;
            if (n != 1 && n != 2) {
                if (n != 3) {
                    return;
                }
                dialog.getWindow().addFlags(24);
            }
            dk0.j();
        }
        else {
            super.d2(dialog, n);
        }
    }
}
