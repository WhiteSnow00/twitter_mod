import android.os.Bundle;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.c$c;
import com.google.android.gms.common.api.c$b;

// 
// Decompiled by Procyon v0.6.0
// 

public final class o5y implements c$b, c$c
{
    public final a<?> a;
    public final boolean b;
    public q5y c;
    
    public o5y(final a<?> a, final boolean b) {
        this.a = a;
        this.b = b;
    }
    
    public final void U0(final Bundle bundle) {
        ((tg6)this.a()).U0(bundle);
    }
    
    public final q5y a() {
        eli.r(this.c, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        return this.c;
    }
    
    public final void s(final vg6 vg6) {
        this.a().D1(vg6, (a)this.a, this.b);
    }
    
    public final void x(final int n) {
        ((tg6)this.a()).x(n);
    }
}
