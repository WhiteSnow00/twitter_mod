import java.util.Objects;
import android.view.View;
import android.view.View$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class qsf implements View$OnClickListener
{
    public final rsf D0;
    public final long E0;
    
    public qsf(final rsf d0, final long e0) {
        this.D0 = d0;
        this.E0 = e0;
    }
    
    public final void onClick(final View view) {
        final rsf d0 = this.D0;
        final long e0 = this.E0;
        Objects.requireNonNull(d0);
        final kfu kfu = new kfu(view.getContext(), d0.c);
        kfu.a(e0);
        kfu.start();
    }
}
