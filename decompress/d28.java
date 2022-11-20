import com.twitter.util.user.UserIdentifier;
import android.graphics.Bitmap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class d28 extends ste implements qsb<Bitmap, j3q>
{
    public final b28 D0;
    public final UserIdentifier E0;
    public final m28 F0;
    public final int G0;
    
    public d28(final b28 d0, final UserIdentifier e0, final m28 f0, final int g0) {
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final Bitmap bitmap = (Bitmap)o;
        czd.f((Object)bitmap, "it");
        final j3q$a b = this.D0.b(this.E0, (x38)this.F0, bitmap);
        b.a.n = this.G0;
        return b.a();
    }
}
