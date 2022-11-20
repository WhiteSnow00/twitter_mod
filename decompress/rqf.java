import android.view.View;
import android.widget.TextView;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rqf implements ij3, qqf$a
{
    public final a D0;
    public final qqf E0;
    
    public rqf(final a d0, final qqf e0) {
        this.D0 = d0;
        Objects.requireNonNull(this.E0 = e0);
        e0.c = (qqf$a)this;
    }
    
    public final void b(final jqf jqf) {
        this.D0.a.setText((CharSequence)jqf.e);
        this.D0.b.setText((CharSequence)jqf.d);
    }
    
    public final void j() {
        final qqf e0 = this.E0;
        final oqf d0 = oqf.D0;
        Objects.requireNonNull(e0);
        e0.c = (qqf$a)d0;
    }
    
    public final void k() {
        this.E0.b.a();
    }
    
    public final void l(final m9i m9i) {
        final qqf e0 = this.E0;
        e0.b.c((t19)((h5j)((wgm)e0.a).D0).distinctUntilChanged().subscribeWith((ccj)new nqf(e0)));
    }
    
    public static final class a
    {
        public final TextView a;
        public final TextView b;
        
        public a(final View view) {
            this.a = (TextView)view.findViewById(2131430697);
            this.b = (TextView)view.findViewById(2131431297);
            view.findViewById(2131431936).setVisibility(8);
        }
    }
}
