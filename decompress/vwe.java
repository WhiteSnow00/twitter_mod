import android.view.View;
import java.util.concurrent.Callable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class vwe implements Callable
{
    public final View D0;
    public final int E0;
    
    public vwe(final View d0, final int e0) {
        this.D0 = d0;
        this.E0 = e0;
    }
    
    @Override
    public final Object call() {
        return ynj.b((Object)krm.Companion.b(this.D0).j(this.E0));
    }
}
