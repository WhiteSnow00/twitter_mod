import android.content.res.Resources;
import androidx.appcompat.view.menu.ActionMenuItemView;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fh1 implements Runnable
{
    public final Toolbar D0;
    public final int E0;
    public final ch1 F0;
    public final FrameLayout G0;
    
    public fh1(final Toolbar d0, final ch1 f0) {
        this.D0 = d0;
        this.E0 = 2131427436;
        this.F0 = f0;
        this.G0 = null;
    }
    
    @Override
    public final void run() {
        final ActionMenuItemView a = qit.a(this.D0, this.E0);
        if (a != null) {
            final ch1 f0 = this.F0;
            final Resources resources = ((View)this.D0).getResources();
            f0.i(resources.getDimensionPixelOffset(2131166499));
            f0.j(resources.getDimensionPixelOffset(2131166500));
            jh1.b(this.F0, (View)a, this.G0);
            jh1.a(this.F0, (View)a);
        }
    }
}
