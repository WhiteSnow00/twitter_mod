import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import android.annotation.SuppressLint;
import android.widget.ImageButton;

// 
// Decompiled by Procyon v0.6.0
// 

@SuppressLint({ "AppCompatCustomView" })
public class vdx extends ImageButton
{
    public int C0;
    
    public vdx(final Context context, final AttributeSet set) {
        super(context, set, 0);
        this.C0 = ((View)this).getVisibility();
    }
    
    public vdx(final Context context, final AttributeSet set, final int n) {
        super(context, set, 2130969506);
        this.C0 = ((View)this).getVisibility();
    }
    
    public final void b(final int n, final boolean b) {
        super.setVisibility(n);
        if (b) {
            this.C0 = n;
        }
    }
    
    public final int getUserSetVisibility() {
        return this.C0;
    }
    
    public void setVisibility(final int n) {
        this.b(n, true);
    }
}
