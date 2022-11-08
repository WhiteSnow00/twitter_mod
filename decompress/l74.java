import android.widget.CompoundButton;
import android.widget.CompoundButton$OnCheckedChangeListener;
import android.view.View;
import com.twitter.onboarding.ocf.userrecommendation.userrecommendationlist.h;
import com.twitter.onboarding.ocf.userrecommendation.userrecommendationlist.b;

// 
// Decompiled by Procyon v0.6.0
// 

public final class l74 implements n4e<b>
{
    public final m74 C0;
    public final h D0;
    public final m29 E0;
    
    public l74(final m74 c0, final h d0) {
        this.E0 = new m29();
        this.C0 = c0;
        this.D0 = d0;
    }
    
    public final View getItemView() {
        return this.C0.C0;
    }
    
    public final void q(final Object o) {
        final b b = (b)o;
        this.C0.D0.setText((CharSequence)b.b);
        final m74 c0 = this.C0;
        final h84 h84 = new h84((Object)this, (Object)b, 1);
        c0.F0 = (CompoundButton$OnCheckedChangeListener)h84;
        ((CompoundButton)c0.E0).setOnCheckedChangeListener((CompoundButton$OnCheckedChangeListener)h84);
        this.E0.c(((b5j)this.D0.e).subscribe((fk6)new kww((Object)this, (Object)b, 7)));
    }
    
    public final void unbind() {
        this.E0.a();
    }
}
