import android.os.BaseBundle;
import android.os.Bundle;

// 
// Decompiled by Procyon v0.6.0
// 

public final class c3z implements mn0$a
{
    public final o7z a;
    
    public c3z(final o7z a) {
        this.a = a;
    }
    
    public final void a(final String s, final String s2, final Bundle bundle, final long n) {
        if (s != null && !s.equals("crash") && (poy.a.contains(s2) ^ true)) {
            final Bundle bundle2 = new Bundle();
            ((BaseBundle)bundle2).putString("name", s2);
            ((BaseBundle)bundle2).putLong("timestampInMillis", n);
            bundle2.putBundle("params", bundle);
            ((o07)this.a.a).a(3, bundle2);
        }
    }
}
