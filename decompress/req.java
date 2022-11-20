import android.widget.TextView;
import com.twitter.media.ui.image.c;
import android.view.View;
import com.twitter.android.liveevent.ui.SlateView;
import com.twitter.media.ui.image.b$a;

// 
// Decompiled by Procyon v0.6.0
// 

public final class req implements ij3
{
    public final a D0;
    public final iqf E0;
    public final w19 F0;
    
    public req(final a d0, final iqf e0) {
        this.F0 = new w19();
        this.E0 = e0;
        this.D0 = d0;
    }
    
    public final void a() {
        ((View)this.D0.a).setVisibility(8);
        this.F0.a();
    }
    
    public final void b() {
        this.F0.a();
        final SlateView a = this.D0.a;
        ((c)a.L0.a).p((x7d$a)null);
        ((c)a.L0.a).setCroppingRectangleProvider((b$a)null);
        ((TextView)a.L0.e).setText((CharSequence)null);
    }
    
    public final void c() {
        ((View)this.D0.a).setVisibility(0);
        this.F0.c(((h5j)((wgm)this.E0).D0).map((psb)hqf.E0).distinctUntilChanged().subscribe((lj6)new hoa(this, 2)));
    }
    
    public final void j() {
        this.b();
    }
    
    public final void k() {
        this.b();
    }
    
    public final void l(final m9i m9i) {
    }
    
    public static final class a
    {
        public final SlateView a;
        
        public a(final View view) {
            this.a = (SlateView)view.findViewById(2131430213);
        }
    }
}
