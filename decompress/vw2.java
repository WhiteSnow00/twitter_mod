import android.view.View;
import com.twitter.business.moduleconfiguration.businessinfo.hours.BusinessHoursRowView;
import androidx.recyclerview.widget.RecyclerView$c0;

// 
// Decompiled by Procyon v0.6.0
// 

public final class vw2 extends RecyclerView$c0 implements n8x
{
    public final BusinessHoursRowView Z0;
    public final BusinessHoursRowView a1;
    public final BusinessHoursRowView b1;
    
    public vw2(View viewById) {
        super(viewById);
        final View viewById2 = viewById.findViewById(2131430356);
        e0e.e((Object)viewById2, "view.findViewById(R.id.no_hours_row)");
        this.Z0 = (BusinessHoursRowView)viewById2;
        final View viewById3 = viewById.findViewById(2131428578);
        e0e.e((Object)viewById3, "view.findViewById(R.id.custom_hours_row)");
        this.a1 = (BusinessHoursRowView)viewById3;
        viewById = viewById.findViewById(2131427594);
        e0e.e((Object)viewById, "view.findViewById(R.id.always_open_row)");
        this.b1 = (BusinessHoursRowView)viewById;
    }
    
    public final View getHeldView() {
        final View f0 = super.F0;
        e0e.e((Object)f0, "itemView");
        return f0;
    }
}
