import java.util.WeakHashMap;
import android.view.View;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class xpb implements Runnable
{
    public final /* synthetic */ int C0;
    public final /* synthetic */ ArrayList D0;
    public final /* synthetic */ ArrayList E0;
    public final /* synthetic */ ArrayList F0;
    public final /* synthetic */ ArrayList G0;
    
    public xpb(final int c0, final ArrayList d0, final ArrayList e0, final ArrayList f0, final ArrayList g0) {
        this.C0 = c0;
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
    }
    
    @Override
    public final void run() {
        for (int i = 0; i < this.C0; ++i) {
            final View view = this.D0.get(i);
            final String s = this.E0.get(i);
            final WeakHashMap a = p5x.a;
            p5x$i.v(view, s);
            p5x$i.v((View)this.F0.get(i), (String)this.G0.get(i));
        }
    }
}
