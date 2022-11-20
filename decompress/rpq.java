import android.content.Context;
import android.app.Activity;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rpq extends ste implements qsb<View, ilx<? super wpq, woq, emq>>
{
    public final Activity D0;
    
    public rpq(final Activity d0) {
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final View view = (View)o;
        czd.f((Object)view, "it");
        return new njq(view, (Context)this.D0);
    }
}
