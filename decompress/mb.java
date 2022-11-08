// 
// Decompiled by Procyon v0.6.0
// 

public final class mb implements Runnable
{
    public final /* synthetic */ boolean C0;
    public final /* synthetic */ n88 D0;
    public final /* synthetic */ boolean E0;
    public final /* synthetic */ ob F0;
    
    public mb(final ob f0, final boolean c0, final n88 d0, final boolean e0) {
        this.F0 = f0;
        this.C0 = c0;
        this.D0 = d0;
        this.E0 = e0;
    }
    
    @Override
    public final void run() {
        if (this.C0) {
            this.D0.d((h88)this.F0);
        }
        else if (this.E0) {
            this.D0.a();
        }
        else {
            this.D0.c((h88)this.F0);
        }
    }
}
