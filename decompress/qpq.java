import android.content.Context;
import android.content.res.Resources;
import android.app.Activity;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class qpq extends ste implements qsb<View, ilx<? super wpq, woq, emq>>
{
    public final Activity D0;
    public final Resources E0;
    
    public qpq(final Activity d0, final Resources e0) {
        this.D0 = d0;
        this.E0 = e0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final View view = (View)o;
        czd.f((Object)view, "it");
        return new ppa(view, (Context)this.D0, this.E0);
    }
}
