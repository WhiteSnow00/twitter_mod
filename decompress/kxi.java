import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kxi extends nsr
{
    public final v92 E0;
    
    public kxi(final LayoutInflater layoutInflater) {
        zzd.f((Object)layoutInflater, "layoutInflater");
        final View inflate = layoutInflater.inflate(2131625094, (ViewGroup)null);
        zzd.e((Object)inflate, "layoutInflater.inflate(R\u2026er_without_toolbar, null)");
        super(inflate);
        this.E0 = new v92(this.getHeldView());
        this.G();
        this.M();
    }
    
    public final int l0() {
        return 0;
    }
}
