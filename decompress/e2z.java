import android.os.BaseBundle;
import android.os.Bundle;

// 
// Decompiled by Procyon v0.6.0
// 

public final class e2z implements mn0$a
{
    public final p6z a;
    
    public e2z(final p6z a) {
        this.a = a;
    }
    
    public final void a(final String s, final String s2, final Bundle bundle, final long n) {
        if (s != null && !s.equals("crash") && (vny.a.contains(s2) ^ true)) {
            final Bundle bundle2 = new Bundle();
            ((BaseBundle)bundle2).putString("name", s2);
            ((BaseBundle)bundle2).putLong("timestampInMillis", n);
            bundle2.putBundle("params", bundle);
            ((iz6)this.a.a).a(3, bundle2);
        }
    }
}
