import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView$c0;

// 
// Decompiled by Procyon v0.6.0
// 

public final class foh extends RecyclerView$c0 implements c7x
{
    public final View W0;
    public final SwitchCompat X0;
    public final TextView Y0;
    public final TextView Z0;
    public final View a1;
    
    public foh(final View w0) {
        super(w0);
        this.W0 = w0;
        this.X0 = (SwitchCompat)w0.findViewById(2131430111);
        this.Y0 = (TextView)w0.findViewById(2131429424);
        this.Z0 = (TextView)w0.findViewById(2131427837);
        this.a1 = w0.findViewById(2131430102);
    }
    
    public final View getHeldView() {
        final View c0 = super.C0;
        zzd.e((Object)c0, "itemView");
        return c0;
    }
}
