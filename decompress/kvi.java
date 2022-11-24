import android.content.Context;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kvi extends k3a
{
    public final View M0;
    
    public kvi(final Context context, final d6w d6w, final k3a$d k3a$d, final View view) {
        super(context, d6w, k3a$d, view);
        this.M0 = view.findViewById(2131429777);
    }
    
    public final void b(final boolean b) {
        super.b(b);
        if (this.M0.getVisibility() == 0) {
            this.M0.setVisibility(8);
        }
    }
}
