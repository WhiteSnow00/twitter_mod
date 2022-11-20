import android.widget.TextView;
import android.view.ViewGroup;
import android.view.View;
import java.util.Collections;
import java.util.Set;
import android.view.LayoutInflater;
import com.twitter.ui.components.button.legacy.ToggleTwitterButton;

// 
// Decompiled by Procyon v0.6.0
// 

public final class qgc extends fd4<ngc, ToggleTwitterButton>
{
    public final LayoutInflater J0;
    public Set<ngc> K0;
    
    public qgc(final LayoutInflater j0, final xbm xbm) {
        super(xbm);
        this.J0 = j0;
        this.K0 = Collections.emptySet();
    }
    
    public final void D(final View view, final Object o, final int n) {
        final ToggleTwitterButton toggleTwitterButton = (ToggleTwitterButton)view;
        final ngc ngc = (ngc)o;
        super.D((View)toggleTwitterButton, (Object)ngc, n);
        ((TextView)toggleTwitterButton).setText((CharSequence)ngc.a);
        toggleTwitterButton.setToggledOn(this.K0.contains(ngc));
    }
    
    public final View E(final ViewGroup viewGroup) {
        final View inflate = this.J0.inflate(2131624604, viewGroup, false);
        final int a = c5j.a;
        return inflate;
    }
}
