import android.view.View;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public class ud4 extends wf
{
    public final ng$a d;
    
    public ud4(final Context context, final int n) {
        this.d = new ng$a(16, (CharSequence)context.getString(n));
    }
    
    @Override
    public void d(final View view, final ng ng) {
        super.a.onInitializeAccessibilityNodeInfo(view, ng.a);
        ng.b(this.d);
    }
}
