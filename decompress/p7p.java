import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.widget.TextView;
import android.widget.Switch;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class p7p implements h7f
{
    public final View C0;
    public final View D0;
    public final View E0;
    public final Switch F0;
    public final Switch G0;
    public final TextView H0;
    public final TextView I0;
    
    public p7p(final LayoutInflater layoutInflater) {
        final View inflate = layoutInflater.inflate(2131625626, (ViewGroup)null, false);
        this.C0 = inflate;
        this.D0 = inflate.findViewById(2131431377);
        this.E0 = inflate.findViewById(2131429858);
        final Switch f0 = (Switch)inflate.findViewById(2131430459);
        this.F0 = f0;
        final Switch g0 = (Switch)inflate.findViewById(2131430458);
        this.G0 = g0;
        this.H0 = (TextView)inflate.findViewById(2131429131);
        this.I0 = (TextView)inflate.findViewById(2131427829);
        ((View)f0).setVisibility(0);
        ((View)g0).setVisibility(0);
    }
    
    public final View getView() {
        return this.C0;
    }
}
