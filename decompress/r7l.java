import android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.View;
import android.content.res.Resources;
import com.twitter.profiles.HeaderImageView;
import android.view.View$AccessibilityDelegate;

// 
// Decompiled by Procyon v0.6.0
// 

public final class r7l extends View$AccessibilityDelegate
{
    public final ggm<ce1> a;
    public final otb<Boolean> b;
    public final HeaderImageView c;
    public final Resources d;
    
    public r7l(final ggm<ce1> a, final otb<Boolean> b, final HeaderImageView c, final Resources d) {
        zzd.f((Object)a, "stateDispatcher");
        zzd.f((Object)b, "isCurrentlySpacing");
        zzd.f((Object)c, "headerLayout");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final void onInitializeAccessibilityNodeInfo(final View view, final AccessibilityNodeInfo accessibilityNodeInfo) {
        zzd.f((Object)view, "host");
        zzd.f((Object)accessibilityNodeInfo, "info");
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        final boolean b = (boolean)this.b.invoke() && this.a.b() != ce1.D0;
        accessibilityNodeInfo.setContentDescription((CharSequence)this.d.getString(2131951695));
        final Resources d = this.d;
        int n;
        if (b) {
            n = 2131951696;
        }
        else {
            n = 2131955574;
        }
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo$AccessibilityAction(16, (CharSequence)d.getString(n)));
        new ng(accessibilityNodeInfo).a0((View)this.c);
    }
}
