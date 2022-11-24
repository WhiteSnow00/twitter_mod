import android.widget.CompoundButton;
import android.widget.CompoundButton$OnCheckedChangeListener;
import android.view.View;
import com.twitter.onboarding.ocf.userrecommendation.userrecommendationlist.h;
import com.twitter.onboarding.ocf.userrecommendation.userrecommendationlist.b;

// 
// Decompiled by Procyon v0.6.0
// 

public final class t74 implements u4e<b>
{
    public final u74 F0;
    public final h G0;
    public final e39 H0;
    
    public t74(final u74 f0, final h g0) {
        this.H0 = new e39();
        this.F0 = f0;
        this.G0 = g0;
    }
    
    public final View getItemView() {
        return ((sl8)this.F0).F0;
    }
    
    public final void r(final Object o) {
        final b b = (b)o;
        this.F0.G0.setText((CharSequence)b.b);
        final u74 f0 = this.F0;
        final p84 p = new p84((Object)this, (Object)b, 1);
        f0.I0 = (CompoundButton$OnCheckedChangeListener)p;
        ((CompoundButton)f0.H0).setOnCheckedChangeListener((CompoundButton$OnCheckedChangeListener)p);
        this.H0.c(((t5j)this.G0.e).subscribe((rk6)new dyh((Object)this, (Object)b, 5)));
    }
    
    public final void unbind() {
        this.H0.a();
    }
}
