import com.twitter.profiles.HeaderImageView$a;
import android.graphics.Bitmap;
import java.util.Objects;
import com.twitter.profiles.HeaderImageView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class nic implements bsm$b
{
    public final HeaderImageView F0;
    public final vgl G0;
    
    public nic(final HeaderImageView f0, final vgl g0) {
        this.F0 = f0;
        this.G0 = g0;
    }
    
    public final void f(final csm csm) {
        final HeaderImageView f0 = this.F0;
        final vgl g0 = this.G0;
        final d9d d9d = (d9d)csm;
        final int p = HeaderImageView.p1;
        Objects.requireNonNull(f0);
        final Bitmap bitmap = (Bitmap)((csm)d9d).b;
        if (bitmap == null && g0.e.b(g0.b) != null) {
            final qgv b = g0.b;
            if (b != null) {
                a5g.e(b.f());
            }
            f0.setProfileUser(g0);
        }
        else {
            if (bitmap != null && f0.n1.size() >= 2 && !f0.n1.contains(bitmap)) {
                f0.n1.clear();
            }
            f0.n1.add(bitmap);
            final HeaderImageView$a o1 = f0.o1;
            if (o1 != null) {
                o1.b4(((z8d)((csm)d9d).a).d(), bitmap);
            }
        }
    }
}
