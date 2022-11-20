import com.twitter.ui.widget.PopupEditText;
import android.os.ResultReceiver;
import java.util.Objects;
import android.view.KeyEvent;
import android.widget.TextView;
import com.twitter.onboarding.ocf.entertext.LocationEditTextViewPresenter;
import android.widget.TextView$OnEditorActionListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class q5g implements TextView$OnEditorActionListener
{
    public final LocationEditTextViewPresenter D0;
    
    public q5g(final LocationEditTextViewPresenter d0) {
        this.D0 = d0;
    }
    
    public final boolean onEditorAction(final TextView textView, final int n, final KeyEvent keyEvent) {
        final LocationEditTextViewPresenter d0 = this.D0;
        Objects.requireNonNull(d0);
        boolean b = false;
        if ((keyEvent != null && keyEvent.getKeyCode() == 66) || n == 6) {
            final PopupEditText j0 = d0.G0.J0;
            if (j0.y1) {
                j0.h();
            }
            pcx.w(d0.F0, ((ftr)d0.G0).getHeldView(), false, (ResultReceiver)null);
            b = true;
        }
        return b;
    }
}
