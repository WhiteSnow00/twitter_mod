import android.view.View;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public class rc4 extends vf
{
    public final mg$a d;
    
    public rc4(final Context context, final int n) {
        this.d = new mg$a(16, (CharSequence)context.getString(n));
    }
    
    public void d(final View view, final mg mg) {
        super.a.onInitializeAccessibilityNodeInfo(view, mg.a);
        mg.b(this.d);
    }
}
