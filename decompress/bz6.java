import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bz6 extends ztr<wy6>
{
    public final wy6 G0;
    
    public bz6(final Context context, final wy6 g0) {
        super(context);
        this.G0 = g0;
    }
    
    public final void a(final View view, final Context context, final Object o) {
        final wy6 wy6 = (wy6)o;
        final bz6.bz6$a bz6$a = (bz6.bz6$a)view.getTag();
        bz6$a.a.setText((CharSequence)wy6.E0);
        final wy6 g0 = this.G0;
        if (g0 != null && g0.E0.equals(wy6.E0)) {
            bz6$a.b.setVisibility(0);
        }
        else {
            bz6$a.b.setVisibility(8);
        }
    }
    
    public final View f(final Context context, final int n, final ViewGroup viewGroup) {
        final View inflate = LayoutInflater.from(context).inflate(2131624252, viewGroup, false);
        inflate.setTag((Object)new bz6.bz6$a(inflate));
        return inflate;
    }
}
