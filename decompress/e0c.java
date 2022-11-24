import android.view.ViewStub;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class e0c extends pue implements ptb<View>
{
    public final View F0;
    
    public e0c(final View f0) {
        this.F0 = f0;
        super(0);
    }
    
    public final Object invoke() {
        final ViewStub viewStub = (ViewStub)this.F0.findViewById(2131429247);
        View inflate;
        if (viewStub != null) {
            inflate = viewStub.inflate();
        }
        else {
            inflate = null;
        }
        return inflate;
    }
}
