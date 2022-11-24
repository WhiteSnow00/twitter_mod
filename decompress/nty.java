import android.os.BaseBundle;
import java.util.HashSet;
import android.os.Bundle;

// 
// Decompiled by Procyon v0.6.0
// 

public final class nty implements mn0$a
{
    public final dyy a;
    
    public nty(final dyy a) {
        this.a = a;
    }
    
    public final void a(String j0, String s, Bundle bundle, final long n) {
        if (!this.a.a.contains(s)) {
            return;
        }
        bundle = new Bundle();
        final HashSet a = poy.a;
        j0 = lp7.J0(s);
        if (j0 != null) {
            s = j0;
        }
        ((BaseBundle)bundle).putString("events", s);
        ((o07)this.a.b).a(2, bundle);
    }
}
