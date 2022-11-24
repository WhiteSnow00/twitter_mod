import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.api.c;
import android.os.Bundle;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class e9y implements o3g$a<Void>
{
    public final SignInHubActivity F0;
    
    public e9y(final SignInHubActivity f0) {
        this.F0 = f0;
    }
    
    public final void f(final h3g<Void> h3g) {
    }
    
    public final void h(final h3g h3g, final Object o) {
        final Void void1 = (Void)o;
        final SignInHubActivity f0 = this.F0;
        ((Activity)f0).setResult(f0.a1, f0.b1);
        ((Activity)this.F0).finish();
    }
    
    public final h3g<Void> i(final int n, final Bundle bundle) {
        return (h3g<Void>)new m7y((Context)this.F0, c.d());
    }
}
