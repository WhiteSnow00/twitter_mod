import android.view.View;
import android.widget.TextView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class a5o extends gue implements rtb<f5o, oyv>
{
    public final /* synthetic */ w4o C0;
    
    public a5o(final w4o c0) {
        this.C0 = c0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final f5o f5o = (f5o)o;
        zzd.f((Object)f5o, "$this$distinct");
        final TextView h0 = this.C0.H0;
        final f5o$a b = f5o.b;
        final mx1 mx1 = (mx1)or4.J1(b.a, b.b);
        String f = null;
        Label_0058: {
            if (mx1 != null) {
                f = mx1.f;
                if (f != null) {
                    break Label_0058;
                }
            }
            f = "";
        }
        h0.setText((CharSequence)f);
        ((View)this.C0.H0).setTag((Object)f5o.b);
        return oyv.a;
    }
}
