import android.view.accessibility.AccessibilityRecord;

// 
// Decompiled by Procyon v0.6.0
// 

public final class sg
{
    public static int a(final AccessibilityRecord accessibilityRecord) {
        return accessibilityRecord.getMaxScrollX();
    }
    
    public static int b(final AccessibilityRecord accessibilityRecord) {
        return accessibilityRecord.getMaxScrollY();
    }
    
    public static void c(final AccessibilityRecord accessibilityRecord, final int maxScrollX) {
        accessibilityRecord.setMaxScrollX(maxScrollX);
    }
    
    public static void d(final AccessibilityRecord accessibilityRecord, final int maxScrollY) {
        accessibilityRecord.setMaxScrollY(maxScrollY);
    }
}
