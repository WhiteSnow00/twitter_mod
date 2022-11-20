import com.google.android.exoplayer2.n;
import com.google.android.exoplayer2.r$a;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class b2r implements z8h$b
{
    public final void O1(final r$a r$a) {
    }
    
    public final int describeContents() {
        return 0;
    }
    
    public final n q0() {
        return null;
    }
    
    @Override
    public final String toString() {
        final String simpleName = this.getClass().getSimpleName();
        String concat;
        if (simpleName.length() != 0) {
            concat = "SCTE-35 splice command: type=".concat(simpleName);
        }
        else {
            concat = new String("SCTE-35 splice command: type=");
        }
        return concat;
    }
    
    public final byte[] x3() {
        return null;
    }
}
