import android.util.Log;
import java.util.HashSet;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class j9g
{
    public static final Set<String> a;
    
    static {
        j9g.a = new HashSet();
    }
    
    public final void a(final String s, final Throwable t) {
        final HashSet a = j9g.a;
        if (a.contains(s)) {
            return;
        }
        Log.w("LOTTIE", s, t);
        a.add(s);
    }
}
