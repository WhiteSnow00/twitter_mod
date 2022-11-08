import android.graphics.Path;
import android.graphics.PathMeasure;

// 
// Decompiled by Procyon v0.6.0
// 

public final class j50 implements pzj
{
    public final PathMeasure a;
    
    public j50(final PathMeasure a) {
        this.a = a;
    }
    
    public final boolean a(final float n, final float n2, final hzj hzj) {
        zzd.f((Object)hzj, "destination");
        final PathMeasure a = this.a;
        if (hzj instanceof h50) {
            return a.getSegment(n, n2, ((h50)hzj).a, true);
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }
    
    public final void b(final hzj hzj) {
        final PathMeasure a = this.a;
        Path a2;
        if (hzj != null) {
            if (!(hzj instanceof h50)) {
                throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
            }
            a2 = ((h50)hzj).a;
        }
        else {
            a2 = null;
        }
        a.setPath(a2, false);
    }
    
    public final float getLength() {
        return this.a.getLength();
    }
}
