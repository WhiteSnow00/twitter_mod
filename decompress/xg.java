import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityManager$AccessibilityStateChangeListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class xg implements vg, AccessibilityManager$AccessibilityStateChangeListener
{
    public final mv1<Boolean> a;
    
    public xg(final AccessibilityManager accessibilityManager, final xbm xbm) {
        czd.f((Object)accessibilityManager, "accessibilityManager");
        czd.f((Object)xbm, "releaseCompletable");
        (this.a = (mv1<Boolean>)new mv1()).onNext((Object)accessibilityManager.isEnabled());
        accessibilityManager.addAccessibilityStateChangeListener((AccessibilityManager$AccessibilityStateChangeListener)this);
        xbm.i((oj)new wg((Object)accessibilityManager, (Object)this, 0));
    }
    
    public final h5j<Boolean> a() {
        return (h5j<Boolean>)this.a;
    }
    
    public final void onAccessibilityStateChanged(final boolean b) {
        this.a.onNext((Object)b);
    }
}
