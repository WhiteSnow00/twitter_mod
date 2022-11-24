import android.os.BaseBundle;
import android.os.Bundle;
import android.view.View;
import android.text.style.ClickableSpan;

// 
// Decompiled by Procyon v0.6.0
// 

public final class vf extends ClickableSpan
{
    public final int F0;
    public final ng G0;
    public final int H0;
    
    public vf(final int f0, final ng g0, final int h0) {
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
    }
    
    public final void onClick(final View view) {
        final Bundle bundle = new Bundle();
        ((BaseBundle)bundle).putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.F0);
        this.G0.a.performAction(this.H0, bundle);
    }
}
