import android.content.DialogInterface;

// 
// Decompiled by Procyon v0.6.0
// 

public final class nb9 implements cx8
{
    public final int F0;
    public final Object G0;
    
    public nb9(final Object g0, final int f0) {
        this.F0 = f0;
        this.G0 = g0;
    }
    
    public final void R0(final DialogInterface dialogInterface, final int n) {
        switch (this.F0) {
            default: {
                final hub hub = (hub)this.G0;
                e0e.f((Object)hub, "$tmp0");
                e0e.f((Object)dialogInterface, "p0");
                hub.invoke((Object)dialogInterface, (Object)n);
                return;
            }
            case 0: {
                final ob9 ob9 = (ob9)this.G0;
                e0e.f((Object)ob9, "this$0");
                e0e.f((Object)dialogInterface, "<anonymous parameter 0>");
                ob9.L0.onNext((Object)kni.a);
            }
        }
    }
}
