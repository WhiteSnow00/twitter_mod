import android.os.Parcel;
import java.util.Arrays;
import androidx.annotation.RecentlyNonNull;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class m6q extends rd
{
    @RecentlyNonNull
    public static final Parcelable$Creator<m6q> CREATOR;
    public final String D0;
    public final String E0;
    
    static {
        CREATOR = (Parcelable$Creator)new u7y();
    }
    
    public m6q(@RecentlyNonNull String trim, @RecentlyNonNull final String e0) {
        eli.r(trim, "Account identifier cannot be null");
        trim = trim.trim();
        eli.o(trim, "Account identifier cannot be empty");
        this.D0 = trim;
        eli.n(e0);
        this.E0 = e0;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (!(o instanceof m6q)) {
            return false;
        }
        final m6q m6q = (m6q)o;
        return f5j.a(this.D0, m6q.D0) && f5j.a(this.E0, m6q.E0);
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.D0, this.E0 });
    }
    
    public final void writeToParcel(@RecentlyNonNull final Parcel parcel, int d1) {
        d1 = fli.d1(parcel, 20293);
        fli.Y0(parcel, 1, this.D0);
        fli.Y0(parcel, 2, this.E0);
        fli.g1(parcel, d1);
    }
}
