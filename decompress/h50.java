import android.graphics.Path;
import android.graphics.PathMeasure;

// 
// Decompiled by Procyon v0.6.0
// 

public final class h50 implements k0k
{
    public final PathMeasure a;
    
    public h50(final PathMeasure a) {
        this.a = a;
    }
    
    public final boolean a(final float n, final float n2, final c0k c0k) {
        e0e.f((Object)c0k, "destination");
        final PathMeasure a = this.a;
        if (c0k instanceof f50) {
            return a.getSegment(n, n2, ((f50)c0k).a, true);
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }
    
    public final void b(final c0k c0k) {
        final PathMeasure a = this.a;
        Path a2;
        if (c0k != null) {
            if (!(c0k instanceof f50)) {
                throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
            }
            a2 = ((f50)c0k).a;
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
