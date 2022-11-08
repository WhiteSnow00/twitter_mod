import tv.periscope.model.chat.Message;
import android.view.ViewGroup;

// 
// Decompiled by Procyon v0.6.0
// 

public final class oev implements urp, b24
{
    public final tqm C0;
    public final vtm D0;
    
    public oev(final tqm c0, final vtm d0) {
        this.C0 = c0;
        this.D0 = d0;
    }
    
    public final void C() {
    }
    
    public final a24 a(final ViewGroup viewGroup, final a24$b a24$b) {
        return (a24)new s04(w30.B(viewGroup, 2131625379, viewGroup, false), (b24)this, a24$b);
    }
    
    public final void b(final a24 a24, final w14 c1) {
        final s04 s04 = (s04)a24;
        s04.c1 = c1;
        s04.a1.setText(m0n.P(this.C0.b.getString(2131959220)));
        s04.b1.setImageDrawable(this.C0.j(2131233188));
    }
    
    public final void c() {
    }
    
    public final void o(final Message message) {
        this.D0.b();
    }
    
    public final void onCancel() {
    }
}
