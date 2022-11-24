import com.twitter.ui.components.button.legacy.TwitterButton;
import android.view.ViewGroup;
import android.view.View$OnClickListener;
import android.view.View;
import com.twitter.ui.components.button.legacy.ToggleTwitterButton;
import android.view.ViewStub;

// 
// Decompiled by Procyon v0.6.0
// 

public final class asf implements sxf
{
    public final ViewStub a;
    public ToggleTwitterButton b;
    public glq c;
    
    public asf(final View view, final glq c) {
        this.a = (ViewStub)view.findViewById(2131430213);
        this.c = c;
    }
    
    public final void a(final boolean enabled) {
        final ToggleTwitterButton b = this.b;
        if (b != null) {
            ((TwitterButton)b).setEnabled(enabled);
        }
    }
    
    public final void b(final View$OnClickListener onClickListener) {
        if (!this.c.a()) {
            final ViewStub a = this.a;
            if (a != null && this.b == null) {
                final View inflate = a.inflate();
                final int a2 = o5j.a;
                this.b = (ToggleTwitterButton)((View)inflate).findViewById(2131430212);
            }
        }
        final ToggleTwitterButton b = this.b;
        if (b != null) {
            ((View)b).setVisibility(0);
            ((View)this.b).setOnClickListener(onClickListener);
        }
    }
    
    public final void c(final boolean toggledOn) {
        final ToggleTwitterButton b = this.b;
        if (b != null) {
            b.setToggledOn(toggledOn);
        }
    }
    
    public final void x() {
        final ToggleTwitterButton b = this.b;
        if (b != null) {
            ((View)b).setVisibility(8);
        }
    }
}
