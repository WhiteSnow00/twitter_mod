import android.util.AndroidRuntimeException;
import android.os.Looper;

// 
// Decompiled by Procyon v0.6.0
// 

public final class e4r extends xm9<e4r>
{
    public k4r r;
    public float s;
    public boolean t;
    
    public <K> e4r(final K k, final p6b p6b) {
        final p6b t0 = at8.T0;
        super((Object)k);
        this.r = null;
        this.s = Float.MAX_VALUE;
        this.t = false;
    }
    
    public final void d() {
        if (this.r.b <= 0.0) {
            throw new UnsupportedOperationException("Spring animations can only come to an end when there is damping");
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            if (super.f) {
                this.t = true;
            }
            return;
        }
        throw new AndroidRuntimeException("Animations may only be started on the main thread");
    }
}
