import android.view.accessibility.AccessibilityManager$TouchExplorationStateChangeListener;
import android.view.accessibility.AccessibilityManager;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jg
{
    public static boolean a(final AccessibilityManager accessibilityManager, final kg kg) {
        return accessibilityManager.addTouchExplorationStateChangeListener((AccessibilityManager$TouchExplorationStateChangeListener)new lg(kg));
    }
    
    public static boolean b(final AccessibilityManager accessibilityManager, final kg kg) {
        return accessibilityManager.removeTouchExplorationStateChangeListener((AccessibilityManager$TouchExplorationStateChangeListener)new lg(kg));
    }
}
