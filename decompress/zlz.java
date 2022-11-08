import android.os.Looper;

// 
// Decompiled by Procyon v0.6.0
// 

public final class zlz extends h1z
{
    public jmy E0;
    public final xlz F0;
    public final vlz G0;
    public final aiq H0;
    
    public zlz(final y7z y7z) {
        super(y7z);
        this.F0 = new xlz(this);
        this.G0 = new vlz(this);
        this.H0 = new aiq(this);
    }
    
    @Override
    public final boolean j() {
        return false;
    }
    
    public final void k() {
        this.g();
        if (this.E0 == null) {
            this.E0 = new jmy(Looper.getMainLooper());
        }
    }
}
