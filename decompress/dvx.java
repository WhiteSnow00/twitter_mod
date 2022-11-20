import com.google.android.material.datepicker.a;
import android.view.View;
import android.view.View$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dvx implements View$OnClickListener
{
    public final int D0;
    public final evx E0;
    
    public dvx(final evx e0, final int d0) {
        this.E0 = e0;
        this.D0 = d0;
    }
    
    public final void onClick(final View view) {
        final jqh f = jqh.f(this.D0, this.E0.G0.E1.E0);
        final a d1 = this.E0.G0.D1;
        jqh jqh;
        if (f.b(d1.D0) < 0) {
            jqh = d1.D0;
        }
        else {
            jqh = f;
            if (f.b(d1.E0) > 0) {
                jqh = d1.E0;
            }
        }
        this.E0.G0.b2(jqh);
        this.E0.G0.c2(1);
    }
}
