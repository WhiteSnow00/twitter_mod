import android.view.Window$Callback;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.c;
import android.view.View$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ljt implements View$OnClickListener
{
    public final yk F0;
    public final c G0;
    
    public ljt(final c g0) {
        this.G0 = g0;
        this.F0 = new yk(((View)g0.a).getContext(), g0.i);
    }
    
    public final void onClick(final View view) {
        final c g0 = this.G0;
        final Window$Callback l = g0.l;
        if (l != null && g0.m) {
            l.onMenuItemSelected(0, (MenuItem)this.F0);
        }
    }
}
