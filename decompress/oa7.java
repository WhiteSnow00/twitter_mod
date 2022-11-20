import android.os.Looper;
import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

public final class oa7 extends v1d$a
{
    public Handler a;
    public final ii8 b;
    
    public oa7(final ii8 b) {
        this.b = b;
        this.a = new Handler(Looper.getMainLooper());
    }
}
