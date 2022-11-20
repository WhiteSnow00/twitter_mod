import android.view.WindowManager;
import android.view.View;
import android.view.ViewGroup;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public class ryw extends r49
{
    public final w19 L0;
    
    public ryw(final Context context, final d59 d59, final ViewGroup viewGroup, final m59 m59) {
        super(context, d59, m59);
        this.L0 = new w19();
        ((ViewGroup)((e59)this).E0).removeAllViews();
        if (viewGroup != null) {
            ((ViewGroup)((e59)this).E0).addView((View)viewGroup);
        }
    }
    
    public final void c(final WindowManager windowManager) {
        super.c(windowManager);
        this.L0.a();
    }
    
    public final void e(final WindowManager windowManager) {
        super.e(windowManager);
        if (this.L0.b()) {
            this.L0.c(((h5j)super.I0.F0).subscribe((lj6)new jds((Object)this, 6)));
        }
    }
}
