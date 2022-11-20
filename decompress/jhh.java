import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jhh extends vf
{
    public final TextView d;
    public final zgh e;
    public final khh$a f;
    
    public jhh(final khh$a f, final TextView d, final zgh e) {
        this.f = f;
        this.d = d;
        this.e = e;
    }
    
    public final boolean g(final View view, final int n, final Bundle bundle) {
        if (n == 64) {
            this.f.L0.onNext((Object)new fd4$a((View)this.d, (Object)this.e));
        }
        return super.g(view, n, bundle);
    }
}
