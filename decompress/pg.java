import java.util.Objects;
import java.util.List;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import android.os.Bundle;
import android.os.Build$VERSION;

// 
// Decompiled by Procyon v0.6.0
// 

public class pg
{
    public final Object a;
    
    public pg() {
        if (Build$VERSION.SDK_INT >= 26) {
            this.a = new pg.pg$c(this);
        }
        else {
            this.a = new b(this);
        }
    }
    
    public pg(final Object a) {
        this.a = a;
    }
    
    public ng a(final int n) {
        return null;
    }
    
    public ng b(final int n) {
        return null;
    }
    
    public boolean c(final int n, final int n2, final Bundle bundle) {
        return false;
    }
    
    public static class a extends AccessibilityNodeProvider
    {
        public final pg a;
        
        public a(final pg a) {
            this.a = a;
        }
        
        public final AccessibilityNodeInfo createAccessibilityNodeInfo(final int n) {
            final ng a = this.a.a(n);
            if (a == null) {
                return null;
            }
            return a.a;
        }
        
        public final List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(final String s, final int n) {
            Objects.requireNonNull(this.a);
            return null;
        }
        
        public final boolean performAction(final int n, final int n2, final Bundle bundle) {
            return this.a.c(n, n2, bundle);
        }
    }
    
    public static class b extends a
    {
        public b(final pg pg) {
            super(pg);
        }
        
        public final AccessibilityNodeInfo findFocus(final int n) {
            final ng b = super.a.b(n);
            if (b == null) {
                return null;
            }
            return b.a;
        }
    }
}
