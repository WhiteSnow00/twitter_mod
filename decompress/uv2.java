import android.widget.ImageView;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView$c0;

// 
// Decompiled by Procyon v0.6.0
// 

public final class uv2 extends RecyclerView$c0 implements c7x
{
    public final TextView W0;
    public final View X0;
    public final TextView Y0;
    public final View Z0;
    public final ImageView a1;
    
    public uv2(View viewById) {
        super(viewById);
        final View viewById2 = viewById.findViewById(2131429279);
        zzd.e((Object)viewById2, "view.findViewById(R.id.from_content)");
        this.W0 = (TextView)viewById2;
        final View viewById3 = viewById.findViewById(2131429278);
        zzd.e((Object)viewById3, "view.findViewById(R.id.from_click_overlay)");
        this.X0 = viewById3;
        final View viewById4 = viewById.findViewById(2131432092);
        zzd.e((Object)viewById4, "view.findViewById(R.id.to_content)");
        this.Y0 = (TextView)viewById4;
        final View viewById5 = viewById.findViewById(2131432091);
        zzd.e((Object)viewById5, "view.findViewById(R.id.to_click_overlay)");
        this.Z0 = viewById5;
        viewById = viewById.findViewById(2131430945);
        zzd.e((Object)viewById, "view.findViewById(R.id.remove_hour)");
        this.a1 = (ImageView)viewById;
    }
    
    public final View getHeldView() {
        final View c0 = super.C0;
        zzd.e((Object)c0, "itemView");
        return c0;
    }
}
