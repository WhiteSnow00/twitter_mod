import java.util.Collections;
import java.util.Collection;
import java.util.ArrayList;
import java.util.List;
import android.os.Parcelable;
import android.os.Parcel;
import java.util.Arrays;
import java.util.Objects;
import androidx.annotation.RecentlyNonNull;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pv1 extends sd
{
    @RecentlyNonNull
    public static final Parcelable$Creator<pv1> CREATOR;
    public final b F0;
    public final a G0;
    public final String H0;
    public final boolean I0;
    
    static {
        CREATOR = (Parcelable$Creator)new o6y();
    }
    
    public pv1(final b f0, final a g0, final String h0, final boolean i0) {
        Objects.requireNonNull(f0, "null reference");
        this.F0 = f0;
        Objects.requireNonNull(g0, "null reference");
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (!(o instanceof pv1)) {
            return false;
        }
        final pv1 pv1 = (pv1)o;
        return r5j.a(this.F0, pv1.F0) && r5j.a(this.G0, pv1.G0) && r5j.a(this.H0, pv1.H0) && this.I0 == pv1.I0;
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.F0, this.G0, this.H0, this.I0 });
    }
    
    public final void writeToParcel(@RecentlyNonNull final Parcel parcel, final int n) {
        final int x1 = xd.x1(parcel, 20293);
        xd.r1(parcel, 1, (Parcelable)this.F0, n);
        xd.r1(parcel, 2, (Parcelable)this.G0, n);
        xd.s1(parcel, 3, this.H0);
        xd.e1(parcel, 4, this.I0);
        xd.B1(parcel, x1);
    }
    
    public static final class a extends sd
    {
        @RecentlyNonNull
        public static final Parcelable$Creator<a> CREATOR;
        public final boolean F0;
        public final String G0;
        public final String H0;
        public final boolean I0;
        public final String J0;
        public final List<String> K0;
        
        static {
            CREATOR = (Parcelable$Creator)new q7y();
        }
        
        public a(final boolean f0, final String g0, final String h0, final boolean i0, final String j0, final List<String> list) {
            this.F0 = f0;
            if (f0) {
                iuk.D((Object)g0, (Object)"serverClientId must be provided if Google ID tokens are requested");
            }
            this.G0 = g0;
            this.H0 = h0;
            this.I0 = i0;
            ArrayList k0;
            final ArrayList list2 = k0 = null;
            if (list != null) {
                if (list.isEmpty()) {
                    k0 = list2;
                }
                else {
                    k0 = new ArrayList<Comparable<? super T>>((Collection<? extends E>)list);
                    Collections.sort((List<Comparable>)k0);
                }
            }
            this.K0 = k0;
            this.J0 = j0;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (!(o instanceof a)) {
                return false;
            }
            final a a = (a)o;
            return this.F0 == a.F0 && r5j.a(this.G0, a.G0) && r5j.a(this.H0, a.H0) && this.I0 == a.I0 && r5j.a(this.J0, a.J0) && r5j.a(this.K0, a.K0);
        }
        
        @Override
        public final int hashCode() {
            return Arrays.hashCode(new Object[] { this.F0, this.G0, this.H0, this.I0, this.J0, this.K0 });
        }
        
        public final void writeToParcel(@RecentlyNonNull final Parcel parcel, int x1) {
            x1 = xd.x1(parcel, 20293);
            xd.e1(parcel, 1, this.F0);
            xd.s1(parcel, 2, this.G0);
            xd.s1(parcel, 3, this.H0);
            xd.e1(parcel, 4, this.I0);
            xd.s1(parcel, 5, this.J0);
            xd.u1(parcel, 6, this.K0);
            xd.B1(parcel, x1);
        }
    }
    
    public static final class b extends sd
    {
        @RecentlyNonNull
        public static final Parcelable$Creator<b> CREATOR;
        public final boolean F0;
        
        static {
            CREATOR = (Parcelable$Creator)new u7y();
        }
        
        public b(final boolean f0) {
            this.F0 = f0;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return o instanceof b && this.F0 == ((b)o).F0;
        }
        
        @Override
        public final int hashCode() {
            return Arrays.hashCode(new Object[] { this.F0 });
        }
        
        public final void writeToParcel(@RecentlyNonNull final Parcel parcel, int x1) {
            x1 = xd.x1(parcel, 20293);
            xd.e1(parcel, 1, this.F0);
            xd.B1(parcel, x1);
        }
    }
}
