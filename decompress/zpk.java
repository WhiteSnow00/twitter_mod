import java.util.Objects;
import android.view.View;
import android.widget.TextView;
import com.twitter.composer.poll.PollComposeView;
import android.view.View$OnFocusChangeListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class zpk implements View$OnFocusChangeListener
{
    public final PollComposeView D0;
    public final TextView E0;
    public final int F0;
    
    public zpk(final PollComposeView d0, final TextView e0, final int f0) {
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
    }
    
    public final void onFocusChange(final View view, final boolean b) {
        final PollComposeView d0 = this.D0;
        final TextView e0 = this.E0;
        final int f0 = this.F0;
        final int m0 = PollComposeView.M0;
        Objects.requireNonNull(d0);
        final boolean b2 = false;
        int visibility;
        if (!b && ((View)e0).getTag() != "choice_error") {
            visibility = 4;
        }
        else {
            visibility = 0;
        }
        ((View)e0).setVisibility(visibility);
        final bqk d2 = d0.D0;
        if (d2 != null) {
            final cqk cqk = (cqk)d2;
            if (((ua6)cqk).J() && b) {
                final r3e$a[] values = r3e$a.values();
                final int length = values.length;
                int i = 0;
                while (i < length) {
                    final r3e$a r3e$a = values[i];
                    if (r3e$a.b() && r3e$a.D0 == f0) {
                        final fgp fgp = (fgp)((ua6)cqk).F0;
                        int n = b2 ? 1 : 0;
                        if (fgp != null) {
                            n = (b2 ? 1 : 0);
                            if (cqk.L0.c(fgp) == 2) {
                                n = 1;
                            }
                        }
                        if (n != 0) {
                            ((ggp)cqk).O().b = r3e$a;
                            ((j96)cqk.K0).a();
                            return;
                        }
                        if (((ggp)cqk).O().b != r3e$a) {
                            ((ggp)cqk).O().b = r3e$a;
                            ((ua6)cqk).K();
                        }
                        return;
                    }
                    else {
                        ++i;
                    }
                }
                throw new IllegalStateException(udu.z("Illegal choice index for focus on poll edit text: ", f0));
            }
        }
    }
}
