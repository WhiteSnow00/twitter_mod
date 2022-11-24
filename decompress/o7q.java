import android.view.View;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class o7q extends gf4
{
    public final Runnable L0;
    
    public o7q(final Context context, final Runnable l0) {
        this.L0 = l0;
        super(context);
    }
    
    public final void onClick(final View view) {
        this.L0.run();
    }
}
