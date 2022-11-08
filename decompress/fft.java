import android.widget.TextView;
import android.view.View;
import com.twitter.ui.components.button.legacy.ToggleTwitterButton;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fft
{
    public final ToggleTwitterButton a;
    
    public fft(final ToggleTwitterButton a) {
        this.a = a;
    }
    
    public final void a() {
        ((View)this.a).setVisibility(8);
    }
    
    public final void b(final int text) {
        ((TextView)this.a).setText(text);
    }
    
    public final void c() {
        ((View)this.a).setVisibility(0);
    }
}
