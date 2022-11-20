import com.twitter.ui.widget.TightTextView;
import android.widget.TextView;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView$c0;

// 
// Decompiled by Procyon v0.6.0
// 

public final class moh extends RecyclerView$c0 implements v7x
{
    public final View X0;
    public final TextView Y0;
    public final TextView Z0;
    public final TightTextView a1;
    public final TightTextView b1;
    public final View c1;
    
    public moh(final View x0) {
        super(x0);
        this.X0 = x0;
        this.Y0 = (TextView)x0.findViewById(2131429424);
        this.Z0 = (TextView)x0.findViewById(2131427837);
        this.a1 = (TightTextView)x0.findViewById(2131427520);
        this.b1 = (TightTextView)x0.findViewById(2131428685);
        this.c1 = x0.findViewById(2131427643);
    }
    
    public final View getHeldView() {
        final View d0 = super.D0;
        czd.e((Object)d0, "itemView");
        return d0;
    }
}
