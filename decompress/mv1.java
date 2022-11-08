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

public final class mv1 extends sd
{
    @RecentlyNonNull
    public static final Parcelable$Creator<mv1> CREATOR;
    public final b C0;
    public final a D0;
    public final String E0;
    public final boolean F0;
    
    static {
        CREATOR = (Parcelable$Creator)new e5y();
    }
    
    public mv1(final b c0, final a d0, final String e0, final boolean f0) {
        Objects.requireNonNull(c0, "null reference");
        this.C0 = c0;
        Objects.requireNonNull(d0, "null reference");
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (!(o instanceof mv1)) {
            return false;
        }
        final mv1 mv1 = (mv1)o;
        return z4j.a((Object)this.C0, (Object)mv1.C0) && z4j.a((Object)this.D0, (Object)mv1.D0) && z4j.a((Object)this.E0, (Object)mv1.E0) && this.F0 == mv1.F0;
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.C0, this.D0, this.E0, this.F0 });
    }
    
    public final void writeToParcel(@RecentlyNonNull final Parcel parcel, final int n) {
        final int x0 = ri4.x0(parcel, 20293);
        ri4.r0(parcel, 1, (Parcelable)this.C0, n);
        ri4.r0(parcel, 2, (Parcelable)this.D0, n);
        ri4.s0(parcel, 3, this.E0);
        ri4.e0(parcel, 4, this.F0);
        ri4.A0(parcel, x0);
    }
    
    public static final class a extends sd
    {
        @RecentlyNonNull
        public static final Parcelable$Creator<a> CREATOR;
        public final boolean C0;
        public final String D0;
        public final String E0;
        public final boolean F0;
        public final String G0;
        public final List<String> H0;
        
        static {
            CREATOR = (Parcelable$Creator)new g6y();
        }
        
        public a(final boolean c0, final String d0, final String e0, final boolean f0, final String g0, final List<String> list) {
            this.C0 = c0;
            if (c0) {
                xd.u((Object)d0, (Object)"serverClientId must be provided if Google ID tokens are requested");
            }
            this.D0 = d0;
            this.E0 = e0;
            this.F0 = f0;
            ArrayList h0;
            final ArrayList list2 = h0 = null;
            if (list != null) {
                if (list.isEmpty()) {
                    h0 = list2;
                }
                else {
                    h0 = new ArrayList<Comparable<? super T>>((Collection<? extends E>)list);
                    Collections.sort((List<Comparable>)h0);
                }
            }
            this.H0 = h0;
            this.G0 = g0;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (!(o instanceof a)) {
                return false;
            }
            final a a = (a)o;
            return this.C0 == a.C0 && z4j.a((Object)this.D0, (Object)a.D0) && z4j.a((Object)this.E0, (Object)a.E0) && this.F0 == a.F0 && z4j.a((Object)this.G0, (Object)a.G0) && z4j.a((Object)this.H0, (Object)a.H0);
        }
        
        @Override
        public final int hashCode() {
            return Arrays.hashCode(new Object[] { this.C0, this.D0, this.E0, this.F0, this.G0, this.H0 });
        }
        
        public final void writeToParcel(@RecentlyNonNull final Parcel parcel, int x0) {
            x0 = ri4.x0(parcel, 20293);
            ri4.e0(parcel, 1, this.C0);
            ri4.s0(parcel, 2, this.D0);
            ri4.s0(parcel, 3, this.E0);
            ri4.e0(parcel, 4, this.F0);
            ri4.s0(parcel, 5, this.G0);
            ri4.u0(parcel, 6, (List)this.H0);
            ri4.A0(parcel, x0);
        }
    }
    
    public static final class b extends sd
    {
        @RecentlyNonNull
        public static final Parcelable$Creator<b> CREATOR;
        public final boolean C0;
        
        static {
            CREATOR = (Parcelable$Creator)new k6y();
        }
        
        public b(final boolean c0) {
            this.C0 = c0;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return o instanceof b && this.C0 == ((b)o).C0;
        }
        
        @Override
        public final int hashCode() {
            return Arrays.hashCode(new Object[] { this.C0 });
        }
        
        public final void writeToParcel(@RecentlyNonNull final Parcel parcel, int x0) {
            x0 = ri4.x0(parcel, 20293);
            ri4.e0(parcel, 1, this.C0);
            ri4.A0(parcel, x0);
        }
    }
}
