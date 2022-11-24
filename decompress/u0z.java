import android.os.Parcel;
import java.util.List;
import com.twitter.util.user.UserIdentifier;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class u0z implements v98, dlv
{
    public u0z() {
    }
    
    public u0z(final Context context, final pml pml, final pml pml2, final UserIdentifier userIdentifier) {
        e0e.f((Object)context, "context");
        e0e.f((Object)pml, "avgOpenCursorMetricProvider");
        e0e.f((Object)pml2, "databaseSizeMetricsProvider");
        e0e.f((Object)userIdentifier, "userIdentifier");
        if (p70.m(context) && userIdentifier.isRegularUser() && ita.c().b("android_collect_database_perf_counter_metrics", false)) {
            pml.get();
            pml2.get();
        }
    }
    
    public final void A() {
        throw new UnsupportedOperationException("Invalid use case for this database type.");
    }
    
    public final void B() {
        throw new UnsupportedOperationException("Invalid use case for this database type.");
    }
    
    public final long C(final String s, final Object o) {
        throw new UnsupportedOperationException("Invalid use case for this database type.");
    }
    
    public final Object D(final String s, final String[] array, final String s2, final String[] array2, final String s3, final String s4, final String s5, final String s6) {
        throw new UnsupportedOperationException("Invalid use case for this database type.");
    }
    
    public final List E(final String s) {
        throw new UnsupportedOperationException("Invalid use case for this database type.");
    }
    
    public final int F(final String s, final String s2, final String[] array) {
        throw new UnsupportedOperationException("Invalid use case for this database type.");
    }
    
    public final boolean G() {
        return false;
    }
    
    public final void H(final boolean b) {
    }
    
    public final long I(final String s, final Object o) {
        throw new UnsupportedOperationException("Invalid use case for this database type.");
    }
    
    public final int J(final String s, final Object o, final String s2, final String[] array) {
        throw new UnsupportedOperationException("Invalid use case for this database type.");
    }
    
    public final String[] K() {
        throw new UnsupportedOperationException("Invalid use case for this database type.");
    }
    
    public final int L(final String s, final String s2, final String[] array) {
        throw new UnsupportedOperationException("Invalid use case for this database type.");
    }
    
    public final Object f(final Parcel parcel) {
        final int int1 = parcel.readInt();
        Object o;
        if (int1 == -1) {
            o = null;
        }
        else {
            final char[] array = new char[int1];
            parcel.readCharArray(array);
            o = array;
        }
        return o;
    }
    
    public final void g(final Object o, final Parcel parcel) {
        final char[] array = (char[])o;
        if (array == null) {
            parcel.writeInt(-1);
        }
        else {
            parcel.writeInt(array.length);
            parcel.writeCharArray(array);
        }
    }
    
    public final void v() {
        throw new UnsupportedOperationException("Invalid use case for this database type.");
    }
    
    public final void y(final String s) {
        throw new UnsupportedOperationException("Invalid use case for this database type.");
    }
}
