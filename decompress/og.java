import java.util.Objects;
import java.util.List;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import android.os.Bundle;
import android.os.Build$VERSION;

// 
// Decompiled by Procyon v0.6.0
// 

public class og
{
    public final Object a;
    
    public og() {
        if (Build$VERSION.SDK_INT >= 26) {
            this.a = new c(this);
        }
        else {
            this.a = new og$b(this);
        }
    }
    
    public og(final Object a) {
        this.a = a;
    }
    
    public mg a(final int n) {
        return null;
    }
    
    public mg b(final int n) {
        return null;
    }
    
    public boolean c(final int n, final int n2, final Bundle bundle) {
        return false;
    }
    
    public static class a extends AccessibilityNodeProvider
    {
        public final og a;
        
        public a(final og a) {
            this.a = a;
        }
        
        public final AccessibilityNodeInfo createAccessibilityNodeInfo(final int n) {
            final mg a = this.a.a(n);
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
    
    public static final class c extends og$b
    {
        public c(final og og) {
            super(og);
        }
        
        public final void addExtraDataToAccessibilityNodeInfo(final int n, final AccessibilityNodeInfo accessibilityNodeInfo, final String s, final Bundle bundle) {
            Objects.requireNonNull(((a)this).a);
        }
    }
}
