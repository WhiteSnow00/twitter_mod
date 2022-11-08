import android.os.Bundle;
import android.app.Activity;
import com.twitter.util.user.UserIdentifier;
import android.content.Context;
import java.lang.ref.WeakReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class zu extends sbq<tu> implements yu, xu$a
{
    public final WeakReference<Context> c;
    public final WeakReference<wu> d;
    public final g3g e;
    public final int f;
    public final UserIdentifier g;
    
    public zu(final Activity activity, final g3g e, final UserIdentifier g, final wu wu) {
        this.c = new WeakReference<Context>((Context)activity);
        this.d = new WeakReference<wu>(wu);
        this.e = e;
        this.f = 7;
        this.g = g;
    }
    
    public final void b(final tu a) {
        final wu wu = this.d.get();
        if (a != null) {
            wu.t4((tu)(super.a = a));
        }
    }
    
    public final void c(final Bundle bundle) {
        if (bundle != null) {
            super.b = bundle.getBoolean("state_fetched");
            super.a = tkp.a(bundle.getByteArray("state_data"), (alp)tu.b);
        }
        final tu a = (tu)super.a;
        final wu wu = this.d.get();
        if (a != null) {
            wu.t4((tu)(super.a = a));
        }
    }
    
    public final void getName() {
    }
}
