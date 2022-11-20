// 
// Decompiled by Procyon v0.6.0
// 

package androidx.preference;

import androidx.recyclerview.widget.RecyclerView$c0;
import android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo;
import android.os.Build$VERSION;
import android.util.AttributeSet;
import android.content.Context;

public class PreferenceCategory extends PreferenceGroup
{
    public PreferenceCategory(final Context context) {
        this(context, null);
    }
    
    public PreferenceCategory(final Context context, final AttributeSet set) {
        this(context, set, cmv.a(context, 2130970339, 16842892));
    }
    
    public PreferenceCategory(final Context context, final AttributeSet set, final int n) {
        this(context, set, n, 0);
    }
    
    public PreferenceCategory(final Context context, final AttributeSet set, final int n, final int n2) {
        super(context, set, n, n2);
    }
    
    public final void C(final tvk tvk) {
        super.C(tvk);
        if (Build$VERSION.SDK_INT >= 28) {
            ((RecyclerView$c0)tvk).D0.setAccessibilityHeading(true);
        }
    }
    
    public final void G(final mg mg) {
        if (Build$VERSION.SDK_INT < 28) {
            final AccessibilityNodeInfo$CollectionItemInfo collectionItemInfo = mg.a.getCollectionItemInfo();
            mg$c mg$c;
            if (collectionItemInfo != null) {
                mg$c = new mg$c((Object)collectionItemInfo);
            }
            else {
                mg$c = null;
            }
            if (mg$c == null) {
                return;
            }
            mg.H((Object)mg$c.a(((AccessibilityNodeInfo$CollectionItemInfo)mg$c.a).getRowIndex(), ((AccessibilityNodeInfo$CollectionItemInfo)mg$c.a).getRowSpan(), ((AccessibilityNodeInfo$CollectionItemInfo)mg$c.a).getColumnIndex(), ((AccessibilityNodeInfo$CollectionItemInfo)mg$c.a).getColumnSpan(), true, ((AccessibilityNodeInfo$CollectionItemInfo)mg$c.a).isSelected()));
        }
    }
    
    public final boolean V() {
        return super.w() ^ true;
    }
    
    public final boolean w() {
        return false;
    }
}
