import android.view.View;
import android.view.View$OnClickListener;
import com.twitter.util.user.UserIdentifier;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ejb implements xxp<cjb>
{
    public final fft a;
    public final img b;
    public ejb.ejb$a c;
    
    public ejb(final fft a, final img b) {
        this.a = a;
        this.b = b;
    }
    
    public static ejb d(final Context context, final fft fft) {
        return new ejb(fft, new img((Object)context, (Object)UserIdentifier.getCurrent(), (Object)psc.c()));
    }
    
    @Override
    public final void a(final wxp wxp) {
        final cjb cjb = (cjb)wxp;
        final boolean q = bgl.q(cjb.a.f(), cjb.a.J0, cjb.b);
        this.c(q, tdy.e0(cjb.a.H1));
        ((View)this.a.a).setOnClickListener((View$OnClickListener)new djb(this, cjb, q));
    }
    
    @Override
    public final int b() {
        return 1;
    }
    
    public final void c(final boolean b, final boolean toggledOn) {
        if (b) {
            this.a.a();
        }
        else {
            this.a.c();
            this.a.a.setToggledOn(toggledOn);
            if (toggledOn) {
                this.a.b(2131959333);
            }
            else {
                this.a.b(2131954121);
            }
        }
    }
    
    @Override
    public final View getActionView() {
        return (View)this.a.a;
    }
}
