import android.view.ViewManager;
import android.view.WindowManager;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.graphics.Rect;
import android.view.WindowManager$LayoutParams;
import android.widget.TextView;
import android.view.View;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kjt
{
    public final Context a;
    public final View b;
    public final TextView c;
    public final WindowManager$LayoutParams d;
    public final Rect e;
    public final int[] f;
    public final int[] g;
    
    public kjt(final Context a) {
        final WindowManager$LayoutParams d = new WindowManager$LayoutParams();
        this.d = d;
        this.e = new Rect();
        this.f = new int[2];
        this.g = new int[2];
        this.a = a;
        final View inflate = LayoutInflater.from(a).inflate(2131623963, (ViewGroup)null);
        this.b = inflate;
        this.c = (TextView)inflate.findViewById(2131430047);
        d.setTitle((CharSequence)kjt.class.getSimpleName());
        d.packageName = a.getPackageName();
        d.type = 1002;
        d.width = -2;
        d.height = -2;
        d.format = -3;
        d.windowAnimations = 2132017186;
        d.flags = 24;
    }
    
    public final void a() {
        if (this.b.getParent() == null) {
            return;
        }
        ((ViewManager)this.a.getSystemService("window")).removeView(this.b);
    }
}
