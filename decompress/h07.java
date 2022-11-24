import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class h07 extends xur<c07>
{
    public final c07 I0;
    
    public h07(final Context context, final c07 i0) {
        super(context);
        this.I0 = i0;
    }
    
    public final void a(final View view, final Context context, final Object o) {
        final c07 c07 = (c07)o;
        final h07.h07$a h07$a = (h07.h07$a)view.getTag();
        h07$a.a.setText((CharSequence)c07.G0);
        final c07 i0 = this.I0;
        if (i0 != null && i0.G0.equals(c07.G0)) {
            h07$a.b.setVisibility(0);
        }
        else {
            h07$a.b.setVisibility(8);
        }
    }
    
    public final View f(final Context context, final int n, final ViewGroup viewGroup) {
        final View inflate = LayoutInflater.from(context).inflate(2131624252, viewGroup, false);
        inflate.setTag((Object)new h07.h07$a(inflate));
        return inflate;
    }
}
