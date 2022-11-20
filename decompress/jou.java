import android.os.Parcelable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jou implements mso<eto>
{
    public final kou D0;
    
    public jou(final kou d0) {
        this.D0 = d0;
    }
    
    public final Parcelable C3() {
        return (Parcelable)this.D0.a1;
    }
    
    public final void T0() {
    }
    
    public final String getId() {
        return jou.class.getName();
    }
    
    public final void v(final Parcelable parcelable) {
        this.D0.a1 = (eto)parcelable;
    }
}
