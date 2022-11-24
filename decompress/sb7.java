import java.util.Objects;
import android.os.Bundle;

// 
// Decompiled by Procyon v0.6.0
// 

public final class sb7 implements Runnable
{
    public final ub7 F0;
    
    public sb7(final ub7 f0, final String s, final Bundle bundle) {
        this.F0 = f0;
    }
    
    @Override
    public final void run() {
        Objects.requireNonNull(this.F0.b);
    }
}
