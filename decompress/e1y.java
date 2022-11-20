import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

// 
// Decompiled by Procyon v0.6.0
// 

public final class e1y implements e2k$a
{
    public final BasePendingResult a;
    public final f1y b;
    
    public e1y(final f1y b, final BasePendingResult a) {
        this.b = b;
        this.a = a;
    }
    
    public final void a(final Status status) {
        this.b.a.remove(this.a);
    }
}
