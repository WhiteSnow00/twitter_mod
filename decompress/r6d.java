import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class r6d implements fa3
{
    public final t6d a;
    public final int b;
    
    public r6d(final t6d a, final int b) {
        this.a = a;
        this.b = b;
    }
    
    public final void a(final Object o) {
        final t6d a = this.a;
        final int b = this.b;
        final kni kni = (kni)o;
        final zai g4 = ((u9)a).G4();
        vmw.g((Object)g4);
        g4.d().F(b);
        ((Activity)((u9)a).G0).findViewById(16908290).setBackgroundColor(b);
        ((Activity)((u9)a).G0).getWindow().setNavigationBarColor(b);
        ((Activity)((u9)a).G0).getWindow().setStatusBarColor(b);
    }
}
