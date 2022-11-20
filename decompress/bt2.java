import android.os.Parcelable;
import android.os.Bundle;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class bt2 implements mso<Bundle>
{
    public final Parcelable C3() {
        final Bundle bundle = new Bundle();
        this.a(bundle);
        return (Parcelable)bundle;
    }
    
    public void T0() {
    }
    
    public abstract void a(final Bundle p0);
    
    public String getId() {
        return this.getClass().getName();
    }
}
