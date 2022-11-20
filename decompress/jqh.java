import java.util.GregorianCalendar;
import android.content.Context;
import android.text.format.DateUtils;
import java.util.Arrays;
import android.os.Parcel;
import java.util.Calendar;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jqh implements Comparable<jqh>, Parcelable
{
    public static final Parcelable$Creator<jqh> CREATOR;
    public final Calendar D0;
    public final int E0;
    public final int F0;
    public final int G0;
    public final int H0;
    public final long I0;
    public String J0;
    
    static {
        CREATOR = (Parcelable$Creator)new Parcelable$Creator<jqh>() {
            public final Object createFromParcel(final Parcel parcel) {
                return jqh.f(parcel.readInt(), parcel.readInt());
            }
            
            public final Object[] newArray(final int n) {
                return new jqh[n];
            }
        };
    }
    
    public jqh(Calendar b) {
        b.set(5, 1);
        b = wmw.b(b);
        this.D0 = b;
        this.E0 = b.get(2);
        this.F0 = b.get(1);
        this.G0 = b.getMaximum(7);
        this.H0 = b.getActualMaximum(5);
        this.I0 = b.getTimeInMillis();
    }
    
    public static jqh f(final int n, final int n2) {
        final Calendar e = wmw.e((Calendar)null);
        e.set(1, n);
        e.set(2, n2);
        return new jqh(e);
    }
    
    public static jqh g(final long timeInMillis) {
        final Calendar e = wmw.e((Calendar)null);
        e.setTimeInMillis(timeInMillis);
        return new jqh(e);
    }
    
    public final int b(final jqh jqh) {
        return this.D0.compareTo(jqh.D0);
    }
    
    @Override
    public final /* bridge */ int compareTo(final Object o) {
        return this.b((jqh)o);
    }
    
    public final int describeContents() {
        return 0;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (!(o instanceof jqh)) {
            return false;
        }
        final jqh jqh = (jqh)o;
        if (this.E0 != jqh.E0 || this.F0 != jqh.F0) {
            b = false;
        }
        return b;
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.E0, this.F0 });
    }
    
    public final int r() {
        int n2;
        final int n = n2 = this.D0.get(7) - this.D0.getFirstDayOfWeek();
        if (n < 0) {
            n2 = n + this.G0;
        }
        return n2;
    }
    
    public final String s() {
        if (this.J0 == null) {
            this.J0 = DateUtils.formatDateTime((Context)null, this.D0.getTimeInMillis(), 8228);
        }
        return this.J0;
    }
    
    public final jqh t(final int n) {
        final Calendar b = wmw.b(this.D0);
        b.add(2, n);
        return new jqh(b);
    }
    
    public final int u(final jqh jqh) {
        if (this.D0 instanceof GregorianCalendar) {
            return jqh.E0 - this.E0 + (jqh.F0 - this.F0) * 12;
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeInt(this.F0);
        parcel.writeInt(this.E0);
    }
}
