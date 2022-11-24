import android.os.Build$VERSION;
import android.content.Context;
import android.view.accessibility.AccessibilityManager;

// 
// Decompiled by Procyon v0.6.0
// 

public final class l10 implements jg
{
    private static final l10.l10$a Companion;
    public final AccessibilityManager a;
    
    static {
        Companion = new l10.l10$a();
    }
    
    public l10(final Context context) {
        final Object systemService = context.getSystemService("accessibility");
        e0e.d(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        this.a = (AccessibilityManager)systemService;
    }
    
    @Override
    public final long a(final long n, final boolean b) {
        if (n >= 2147483647L) {
            return n;
        }
        int n2 = 3;
        if (b) {
            n2 = 7;
        }
        if (Build$VERSION.SDK_INT >= 29) {
            final int a = ke0.a.a(this.a, (int)n, n2);
            if (a != Integer.MAX_VALUE) {
                return a;
            }
        }
        else {
            long n3 = n;
            if (!b) {
                return n3;
            }
            n3 = n;
            if (!this.a.isTouchExplorationEnabled()) {
                return n3;
            }
        }
        return Long.MAX_VALUE;
    }
}
