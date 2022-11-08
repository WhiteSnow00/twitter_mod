import android.os.BaseBundle;
import android.os.Bundle;
import android.view.View;
import android.text.style.ClickableSpan;

// 
// Decompiled by Procyon v0.6.0
// 

public final class vf extends ClickableSpan
{
    public final int C0;
    public final ng D0;
    public final int E0;
    
    public vf(final int c0, final ng d0, final int e0) {
        this.C0 = c0;
        this.D0 = d0;
        this.E0 = e0;
    }
    
    public final void onClick(final View view) {
        final Bundle bundle = new Bundle();
        ((BaseBundle)bundle).putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.C0);
        this.D0.a.performAction(this.E0, bundle);
    }
}
