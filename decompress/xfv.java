import tv.periscope.model.chat.Message;
import android.view.ViewGroup;

// 
// Decompiled by Procyon v0.6.0
// 

public final class xfv implements htp, k24
{
    public final zrm F0;
    public final bvm G0;
    
    public xfv(final zrm f0, final bvm g0) {
        this.F0 = f0;
        this.G0 = g0;
    }
    
    public final void C() {
    }
    
    public final j24 a(final ViewGroup viewGroup, final j24$b j24$b) {
        return (j24)new a14(m51.w(viewGroup, 2131625381, viewGroup, false), (k24)this, j24$b);
    }
    
    public final void b(final j24 j24, final f24 f1) {
        final a14 a14 = (a14)j24;
        a14.f1 = f1;
        a14.d1.setText(iqs.c(this.F0.b.getString(2131959222)));
        a14.e1.setImageDrawable(this.F0.j(2131233190));
    }
    
    public final void c() {
    }
    
    public final void h(final Message message) {
    }
    
    public final void o(final Message message) {
        this.G0.b();
    }
    
    public final void onCancel() {
    }
}
