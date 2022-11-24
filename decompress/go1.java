import android.view.View;
import android.widget.TextView;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class go1<T extends evi, VH extends b> extends b4e<T, VH>
{
    public go1(final Class<T> clazz) {
        super((Class)clazz);
    }
    
    public /* bridge */ void k(final n8x n8x, final Object o, final kcm kcm) {
        this.n((b)n8x, (evi)o, kcm);
    }
    
    public void n(final VH vh, final T t, final kcm kcm) {
        final String b = vh.I0.b((evi)t, ((View)vh.H0).getContext());
        if (flr.g((CharSequence)b)) {
            vh.H0.setText((CharSequence)b);
            ((View)vh.H0).setVisibility(0);
        }
        else {
            vh.H0.setText((CharSequence)null);
            ((View)vh.H0).setVisibility(8);
        }
        vh.G0.setText((CharSequence)t.a.b);
        vh.l0(t.c);
    }
    
    public static class b extends sl8
    {
        public final TextView G0;
        public final TextView H0;
        public final go1$a I0;
        
        public b(final View view, final go1$a i0) {
            super(view);
            vmw.g((Object)i0);
            this.I0 = i0;
            final TextView g0 = (TextView)view.findViewById(2131432077);
            vmw.g((Object)g0);
            this.G0 = g0;
            final TextView h0 = (TextView)view.findViewById(2131431328);
            vmw.g((Object)h0);
            this.H0 = h0;
        }
        
        public void l0(final boolean b) {
            this.G0.setEnabled(b);
            this.H0.setEnabled(b);
        }
    }
}
