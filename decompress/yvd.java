import android.widget.TextView;
import com.twitter.ui.widget.PillToggleButton;
import android.view.View$OnClickListener;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class yvd implements n4e<zvd$d>
{
    public final nwd C0;
    public final kwd D0;
    public final m29 E0;
    
    public yvd(final nwd c0, final kwd d0) {
        this.E0 = new m29();
        this.C0 = c0;
        this.D0 = d0;
    }
    
    public final View getItemView() {
        return this.C0.C0;
    }
    
    public final void q(final Object o) {
        final zvd$d zvd$d = (zvd$d)o;
        final PillToggleButton d0 = this.C0.D0;
        final pvd a = zvd$d.a;
        final String b = a.b;
        ((TextView)d0).setText((CharSequence)a.a);
        d0.setOnClickListener((View$OnClickListener)new xvd((Object)this, (Object)d0, (Object)b, 0));
        this.E0.c(((b5j)this.D0.g).subscribe((fk6)new n92((Object)d0, (Object)zvd$d, 3)));
    }
    
    public final void unbind() {
        this.E0.a();
    }
}
