import android.view.View;
import android.widget.TextView;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class frf implements ak3, erf$a
{
    public final a C0;
    public final erf D0;
    
    public frf(final a c0, final erf d0) {
        this.C0 = c0;
        Objects.requireNonNull(this.D0 = d0);
        d0.c = (erf$a)this;
    }
    
    public final void a(final xqf xqf) {
        this.C0.a.setText((CharSequence)xqf.e);
        this.C0.b.setText((CharSequence)xqf.d);
    }
    
    public final void j() {
        final erf d0 = this.D0;
        final crf c0 = crf.C0;
        Objects.requireNonNull(d0);
        d0.c = (erf$a)c0;
    }
    
    public final void k() {
        this.D0.b.a();
    }
    
    public final void l(final l9i l9i) {
        final erf d0 = this.D0;
        d0.b.c((j29)((b5j)((ggm)d0.a).C0).distinctUntilChanged().subscribeWith((wbj)new brf(d0)));
    }
    
    public static final class a
    {
        public final TextView a;
        public final TextView b;
        
        public a(final View view) {
            this.a = (TextView)view.findViewById(2131430695);
            this.b = (TextView)view.findViewById(2131431295);
            view.findViewById(2131431933).setVisibility(8);
        }
    }
}
