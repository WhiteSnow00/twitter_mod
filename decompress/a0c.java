import android.view.ViewStub;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class a0c extends gue implements otb<View>
{
    public final /* synthetic */ View C0;
    
    public a0c(final View c0) {
        this.C0 = c0;
        super(0);
    }
    
    public final Object invoke() {
        final ViewStub viewStub = (ViewStub)this.C0.findViewById(2131428441);
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
