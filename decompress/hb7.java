import java.util.Objects;
import android.os.Bundle;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hb7 implements Runnable
{
    public final /* synthetic */ kb7 C0;
    
    public hb7(final kb7 c0, final Bundle bundle) {
        this.C0 = c0;
    }
    
    @Override
    public final void run() {
        Objects.requireNonNull(this.C0.b);
    }
}
