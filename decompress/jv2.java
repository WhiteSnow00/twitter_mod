import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView$c0;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jv2 extends RecyclerView$c0 implements v7x
{
    public final TextView X0;
    
    public jv2(View viewById) {
        super(viewById);
        viewById = viewById.findViewById(2131429424);
        czd.e((Object)viewById, "view.findViewById(R.id.header_text)");
        this.X0 = (TextView)viewById;
    }
    
    public final View getHeldView() {
        final View d0 = super.D0;
        czd.e((Object)d0, "itemView");
        return d0;
    }
}
