import android.os.BaseBundle;
import android.os.Parcel;
import java.util.Iterator;
import android.os.Bundle;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fhy extends sd implements Iterable<String>
{
    public static final Parcelable$Creator<fhy> CREATOR;
    public final Bundle F0;
    
    static {
        CREATOR = (Parcelable$Creator)new khy();
    }
    
    public fhy(final Bundle f0) {
        this.F0 = f0;
    }
    
    @Override
    public final Iterator iterator() {
        return (Iterator)new ahy(this);
    }
    
    public final Bundle p() {
        return new Bundle(this.F0);
    }
    
    public final Double s() {
        return ((BaseBundle)this.F0).getDouble("value");
    }
    
    public final Long t() {
        return ((BaseBundle)this.F0).getLong("value");
    }
    
    @Override
    public final String toString() {
        return this.F0.toString();
    }
    
    public final Object u(final String s) {
        return ((BaseBundle)this.F0).get(s);
    }
    
    public final String v(final String s) {
        return ((BaseBundle)this.F0).getString(s);
    }
    
    public final void writeToParcel(final Parcel parcel, int x1) {
        x1 = xd.x1(parcel, 20293);
        xd.g1(parcel, 2, this.p());
        xd.B1(parcel, x1);
    }
}
