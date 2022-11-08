import android.content.res.Resources;
import android.os.Parcelable;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class lwp implements Parcelable
{
    public mwp C0;
    
    public abstract Long a();
    
    public abstract Integer b();
    
    public final mwp c(final Resources resources) {
        zzd.f((Object)resources, "res");
        mwp c0;
        if ((c0 = this.C0) == null) {
            c0 = this.d(resources);
            this.C0 = c0;
        }
        return c0;
    }
    
    public abstract mwp d(final Resources p0);
}
