import android.os.Looper;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;
import com.google.android.gms.common.api.b;
import com.google.android.gms.common.api.a;

// 
// Decompiled by Procyon v0.6.0
// 

public final class n3y<O extends com.google.android.gms.common.api.a.d> extends c2y
{
    @NotOnlyInitialized
    public final b<O> G0;
    
    public n3y(final b<O> g0) {
        this.G0 = g0;
    }
    
    @Override
    public final <A extends com.google.android.gms.common.api.a.b, T extends com.google.android.gms.common.api.internal.a<? extends etm, A>> T c(final T t) {
        this.G0.j(1, (com.google.android.gms.common.api.internal.a)t);
        return t;
    }
    
    @Override
    public final Looper f() {
        return this.G0.f;
    }
}
