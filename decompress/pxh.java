import android.view.ViewGroup;
import android.view.LayoutInflater;
import com.twitter.ui.widget.FloatingActionButton;
import androidx.recyclerview.widget.RecyclerView;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pxh implements q7f
{
    public final View F0;
    public final RecyclerView G0;
    public final FloatingActionButton H0;
    public final exh I0;
    
    public pxh(final LayoutInflater layoutInflater) {
        final View inflate = layoutInflater.inflate(2131624893, (ViewGroup)null, false);
        this.F0 = inflate;
        this.G0 = (RecyclerView)inflate.findViewById(2131430937);
        this.H0 = (FloatingActionButton)inflate.findViewById(2131429187);
        this.I0 = new exh();
    }
    
    public final View getView() {
        return this.F0;
    }
}
