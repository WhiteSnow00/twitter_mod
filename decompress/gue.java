import androidx.recyclerview.widget.RecyclerView$c0;
import android.view.View$OnClickListener;
import android.view.View;
import android.widget.TextView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gue extends bue<aue.a>
{
    public static final int c1 = 0;
    public final d6w Z0;
    public final TextView a1;
    public final TextView b1;
    
    public gue(View viewById, final d6w z0) {
        e0e.f((Object)z0, "uriNavigator");
        super(viewById);
        this.Z0 = z0;
        final View viewById2 = viewById.findViewById(2131429086);
        e0e.e((Object)viewById2, "itemView.findViewById(R.id.feature_title)");
        this.a1 = (TextView)viewById2;
        viewById = viewById.findViewById(2131429085);
        e0e.e((Object)viewById, "itemView.findViewById(R.id.feature_summary)");
        this.b1 = (TextView)viewById;
    }
    
    public final void q0(final aue aue) {
        final aue.a a = (aue.a)aue;
        e0e.f((Object)a, "item");
        final por a2 = a.a;
        final String g = a2.g;
        if (g != null) {
            ((RecyclerView$c0)this).F0.setClickable(true);
            ((RecyclerView$c0)this).F0.setOnClickListener((View$OnClickListener)new obs((Object)this, (Object)g, 19));
        }
        else {
            ((RecyclerView$c0)this).F0.setOnClickListener((View$OnClickListener)null);
            ((RecyclerView$c0)this).F0.setClickable(false);
        }
        this.a1.setText((CharSequence)a2.b);
        this.b1.setText((CharSequence)a2.c);
    }
}
