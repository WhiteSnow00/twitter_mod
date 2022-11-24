import java.util.List;
import android.view.accessibility.AccessibilityNodeInfo;

// 
// Decompiled by Procyon v0.6.0
// 

public final class og
{
    public static final og a;
    
    static {
        a = new og();
    }
    
    public final void a(final AccessibilityNodeInfo accessibilityNodeInfo, final List<String> availableExtraData) {
        e0e.f((Object)accessibilityNodeInfo, "node");
        e0e.f((Object)availableExtraData, "data");
        accessibilityNodeInfo.setAvailableExtraData((List)availableExtraData);
    }
}
