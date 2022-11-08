import android.view.WindowManager;
import android.view.View;
import android.view.ViewGroup;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public class yxw extends j59
{
    public final m29 K0;
    
    public yxw(final Context context, final v59 v59, final ViewGroup viewGroup, final e69 e69) {
        super(context, v59, e69);
        this.K0 = new m29();
        ((ViewGroup)((w59)this).D0).removeAllViews();
        if (viewGroup != null) {
            ((ViewGroup)((w59)this).D0).addView((View)viewGroup);
        }
    }
    
    public final void c(final WindowManager windowManager) {
        super.c(windowManager);
        this.K0.a();
    }
    
    public final void e(final WindowManager windowManager) {
        super.e(windowManager);
        if (this.K0.b()) {
            this.K0.c(((b5j)super.H0.E0).subscribe((fk6)new ocs((Object)this, 6)));
        }
    }
}
