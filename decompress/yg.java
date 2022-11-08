import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityManager$AccessibilityStateChangeListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class yg implements wg, AccessibilityManager$AccessibilityStateChangeListener
{
    public final rv1<Boolean> a;
    
    public yg(final AccessibilityManager accessibilityManager, final ibm ibm) {
        zzd.f((Object)accessibilityManager, "accessibilityManager");
        zzd.f((Object)ibm, "releaseCompletable");
        (this.a = (rv1<Boolean>)new rv1()).onNext((Object)accessibilityManager.isEnabled());
        accessibilityManager.addAccessibilityStateChangeListener((AccessibilityManager$AccessibilityStateChangeListener)this);
        ibm.i((rj)new xg((Object)accessibilityManager, (Object)this, 0));
    }
    
    public final b5j<Boolean> a() {
        return (b5j<Boolean>)this.a;
    }
    
    public final void onAccessibilityStateChanged(final boolean b) {
        this.a.onNext((Object)b);
    }
}
