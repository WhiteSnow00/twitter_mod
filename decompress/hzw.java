import android.view.WindowManager;
import android.view.View;
import android.view.ViewGroup;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public class hzw extends y59
{
    public final e39 N0;
    
    public hzw(final Context context, final k69 k69, final ViewGroup viewGroup, final t69 t69) {
        super(context, k69, t69);
        this.N0 = new e39();
        ((ViewGroup)((l69)this).G0).removeAllViews();
        if (viewGroup != null) {
            ((ViewGroup)((l69)this).G0).addView((View)viewGroup);
        }
    }
    
    public final void c(final WindowManager windowManager) {
        super.c(windowManager);
        this.N0.a();
    }
    
    public final void e(final WindowManager windowManager) {
        super.e(windowManager);
        if (this.N0.b()) {
            this.N0.c(((t5j)super.K0.H0).subscribe((rk6)new bes((Object)this, 6)));
        }
    }
}
