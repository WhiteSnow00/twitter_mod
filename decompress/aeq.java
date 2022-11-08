import android.widget.TextView;
import com.twitter.media.ui.image.c;
import android.view.View;
import com.twitter.android.liveevent.ui.SlateView;
import com.twitter.media.ui.image.b$a;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aeq implements ak3
{
    public final a C0;
    public final wqf D0;
    public final m29 E0;
    
    public aeq(final a c0, final wqf d0) {
        this.E0 = new m29();
        this.D0 = d0;
        this.C0 = c0;
    }
    
    public final void a() {
        ((View)this.C0.a).setVisibility(8);
        this.E0.a();
    }
    
    public final void b() {
        this.E0.a();
        final SlateView a = this.C0.a;
        ((c)a.K0.a).p((t8d$a)null);
        ((c)a.K0.a).setCroppingRectangleProvider((b$a)null);
        ((TextView)a.K0.e).setText((CharSequence)null);
    }
    
    public final void c() {
        ((View)this.C0.a).setVisibility(0);
        this.E0.c(((b5j)((ggm)this.D0).C0).map((qtb)vqf.D0).distinctUntilChanged().subscribe((fk6)new jpa((Object)this, 2)));
    }
    
    public final void j() {
        this.b();
    }
    
    public final void k() {
        this.b();
    }
    
    public final void l(final l9i l9i) {
    }
    
    public static final class a
    {
        public final SlateView a;
        
        public a(final View view) {
            this.a = (SlateView)view.findViewById(2131430211);
        }
    }
}
