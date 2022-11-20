import android.view.View;
import android.widget.TextView;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class zn1<T extends nui, VH extends b> extends a3e<T, VH>
{
    public zn1(final Class<T> clazz) {
        super((Class)clazz);
    }
    
    public /* bridge */ void k(final v7x v7x, final Object o, final xbm xbm) {
        this.n((b)v7x, (nui)o, xbm);
    }
    
    public void n(final VH vh, final T t, final xbm xbm) {
        final String a = vh.G0.a(t, ((View)vh.F0).getContext());
        if (ikr.g((CharSequence)a)) {
            vh.F0.setText((CharSequence)a);
            ((View)vh.F0).setVisibility(0);
        }
        else {
            vh.F0.setText((CharSequence)null);
            ((View)vh.F0).setVisibility(8);
        }
        vh.E0.setText((CharSequence)t.a.b);
        vh.l0(t.c);
    }
    
    public interface a
    {
        String a(final nui p0, final Context p1);
    }
    
    public static class b extends nk8
    {
        public final TextView E0;
        public final TextView F0;
        public final a G0;
        
        public b(final View view, final a g0) {
            super(view);
            jee.l((Object)g0);
            this.G0 = g0;
            final TextView e0 = (TextView)view.findViewById(2131432076);
            jee.l((Object)e0);
            this.E0 = e0;
            final TextView f0 = (TextView)view.findViewById(2131431327);
            jee.l((Object)f0);
            this.F0 = f0;
        }
        
        public void l0(final boolean b) {
            this.E0.setEnabled(b);
            this.F0.setEnabled(b);
        }
    }
}
