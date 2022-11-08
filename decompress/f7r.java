import androidx.work.WorkerParameters;

// 
// Decompiled by Procyon v0.6.0
// 

public final class f7r implements Runnable
{
    public irx C0;
    public e7r D0;
    public WorkerParameters.a E0;
    
    public f7r(final irx c0, final e7r d0, final WorkerParameters.a e0) {
        this.C0 = c0;
        this.D0 = d0;
        this.E0 = e0;
    }
    
    @Override
    public final void run() {
        this.C0.f.h(this.D0, this.E0);
    }
}
