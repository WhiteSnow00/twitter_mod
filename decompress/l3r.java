import android.util.AndroidRuntimeException;
import android.os.Looper;

// 
// Decompiled by Procyon v0.6.0
// 

public final class l3r extends on9<l3r>
{
    public r3r r;
    public float s;
    public boolean t;
    
    public <K> l3r(final K k, final r7b r7b) {
        final rt8$a s0 = rt8.S0;
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
