import android.os.BaseBundle;
import android.os.Bundle;
import android.view.View;
import android.text.style.ClickableSpan;

// 
// Decompiled by Procyon v0.6.0
// 

public final class uf extends ClickableSpan
{
    public final int D0;
    public final mg E0;
    public final int F0;
    
    public uf(final int d0, final mg e0, final int f0) {
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
    }
    
    public final void onClick(final View view) {
        final Bundle bundle = new Bundle();
        ((BaseBundle)bundle).putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.D0);
        this.E0.a.performAction(this.F0, bundle);
    }
}
