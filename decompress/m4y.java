import android.app.Dialog;

// 
// Decompiled by Procyon v0.6.0
// 

public final class m4y extends uau
{
    public final /* synthetic */ Dialog C0;
    public final /* synthetic */ o4y D0;
    
    public m4y(final o4y d0, final Dialog c0) {
        this.D0 = d0;
        this.C0 = c0;
    }
    
    public final void r() {
        this.D0.D0.m();
        if (this.C0.isShowing()) {
            this.C0.dismiss();
        }
    }
}
