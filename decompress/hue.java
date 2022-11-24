import android.view.View;
import android.widget.TextView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hue extends bue<aue.b>
{
    public final TextView Z0;
    
    public hue(View viewById) {
        super(viewById);
        viewById = viewById.findViewById(2131429710);
        e0e.e((Object)viewById, "itemView.findViewById(R.id.labs_description)");
        this.Z0 = (TextView)viewById;
    }
    
    public final void q0(final aue aue) {
        final aue.b b = (aue.b)aue;
        e0e.f((Object)b, "item");
        this.Z0.setText((CharSequence)b.a);
    }
}
