import android.content.Context;
import androidx.recyclerview.widget.RecyclerView$e;
import android.os.Bundle;
import android.view.accessibility.AccessibilityEvent;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import android.view.View;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bhh extends vf
{
    public final Activity d;
    public final View e;
    public final RecyclerView f;
    public final chh g;
    
    public bhh(final Activity d, final View e, final RecyclerView f, final chh g) {
        czd.f((Object)d, "activity");
        czd.f((Object)e, "accessibilityContainer");
        czd.f((Object)f, "modeSwitchList");
        czd.f((Object)g, "snapHelper");
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        e.setImportantForAccessibility(1);
    }
    
    public final void d(final View view, final mg mg) {
        czd.f((Object)view, "host");
        super.a.onInitializeAccessibilityNodeInfo(view, mg.a);
        mg.b(new mg$a(16, (CharSequence)((Context)this.d).getString(2131951691)));
    }
    
    public final boolean f(final ViewGroup viewGroup, final View view, final AccessibilityEvent accessibilityEvent) {
        czd.f((Object)viewGroup, "host");
        czd.f((Object)view, "child");
        czd.f((Object)accessibilityEvent, "event");
        if (accessibilityEvent.getEventType() == 128) {
            this.e.performAccessibilityAction(64, (Bundle)null);
            return false;
        }
        return true;
    }
    
    public final boolean g(View e, int n, final Bundle bundle) {
        czd.f((Object)e, "host");
        if (n != 16) {
            if (n == 64) {
                ((View)this.f).setImportantForAccessibility(4);
            }
            return super.g(e, n, bundle);
        }
        ((View)this.f).setImportantForAccessibility(1);
        final RecyclerView$e adapter = this.f.getAdapter();
        final int n2 = n = 0;
        if (adapter != null) {
            n = n2;
            if (adapter.c() == 0) {
                n = 1;
            }
        }
        if (n == 0) {
            e = this.g.e(this.f.getLayoutManager());
            if (e != null) {
                e.performAccessibilityAction(64, (Bundle)null);
            }
        }
        return true;
    }
}
