import android.view.ViewGroup;
import android.view.View;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
import java.util.HashMap;
import android.content.Context;
import java.util.Map;
import android.widget.ArrayAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

public final class d02 extends ArrayAdapter<vna$c> implements ifp
{
    public static final Map<vna$c, Integer> I0;
    public static final Map<vna$c, Integer> J0;
    public final vna$c[] F0;
    public d02.d02$a G0;
    public final Context H0;
    
    static {
        final HashMap hashMap = d02.I0 = new HashMap();
        final HashMap hashMap2 = d02.J0 = new HashMap();
        final vna$c j0 = vna$c.J0;
        hashMap.put(j0, 2130969802);
        final vna$c i0 = vna$c.I0;
        hashMap.put(i0, 2130969800);
        final vna$c h0 = vna$c.H0;
        hashMap.put(h0, 2130969799);
        final vna$c g0 = vna$c.G0;
        hashMap.put(g0, 2130969798);
        final vna$c f0 = vna$c.F0;
        hashMap.put(f0, 2130969801);
        hashMap2.put(j0, 2131231681);
        hashMap2.put(i0, 2131231682);
        hashMap2.put(h0, 2131231680);
        hashMap2.put(g0, 2131231679);
        hashMap2.put(f0, 2131231683);
    }
    
    public d02(final Context h0, final vna$c[] f0) {
        super(h0, 2131624100, (Object[])f0);
        this.H0 = h0;
        this.F0 = f0;
    }
    
    public final void a(final TextView textView, final int n) {
        textView.setText((CharSequence)zgl.l(this.F0[n], this.H0.getResources()));
        final Drawable g = b1b.G(this.H0, d02.I0.get(this.F0[n]), d02.J0.get(this.F0[n]));
        ie9.c(g, b1b.B(this.H0, 2130969091));
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(g, (Drawable)null, (Drawable)null, (Drawable)null);
    }
    
    public final int d(final vna$c vna$c) {
        int n = 0;
        while (true) {
            final vna$c[] f0 = this.F0;
            if (n >= f0.length) {
                return -1;
            }
            if (f0[n] == vna$c) {
                return n;
            }
            ++n;
        }
    }
    
    public final /* bridge */ int getPosition(final Object o) {
        return this.d((vna$c)o);
    }
    
    public final View getView(final int n, final View view, final ViewGroup viewGroup) {
        final TextView textView = (TextView)super.getView(n, view, viewGroup);
        this.a(textView, n);
        return (View)textView;
    }
}
