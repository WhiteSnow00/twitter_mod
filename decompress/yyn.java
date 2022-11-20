import android.widget.AbsSeekBar;
import android.view.View;
import android.widget.ProgressBar;
import java.util.concurrent.TimeUnit;

// 
// Decompiled by Procyon v0.6.0
// 

public final class yyn extends ste implements qsb<d0o, fzv>
{
    public final dyn D0;
    
    public yyn(final dyn d0) {
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final d0o d0o = (d0o)o;
        czd.f((Object)d0o, "$this$distinct");
        ((ProgressBar)this.D0.j1).setMax((int)d0o.q);
        if (((ProgressBar)this.D0.j1).getMax() != 0) {
            final Long x = d0o.x;
            if (x != null && x != 0L) {
                if (djo.w()) {
                    final float n = TimeUnit.SECONDS.toMillis(d0o.x) / (float)((ProgressBar)this.D0.j1).getMax();
                    final dyn d0 = this.D0;
                    d0.m1.setX(n * ((View)this.D0.j1).getWidth() + ((View)d0.j1).getX());
                    final dyn d2 = this.D0;
                    d2.m1.setY(((View)d2.j1).getY() + ((AbsSeekBar)this.D0.j1).getThumb().getIntrinsicWidth() / 2 - this.D0.m1.getWidth() / 2);
                    this.D0.m1.setVisibility(0);
                    return fzv.a;
                }
            }
        }
        this.D0.m1.setVisibility(4);
        return fzv.a;
    }
}
