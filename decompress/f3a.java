import java.util.Objects;
import java.util.Iterator;
import java.util.Collection;
import java.util.Collections;
import android.os.IBinder;
import java.util.IllegalFormatException;
import android.text.TextUtils;
import android.util.Log;
import java.util.Locale;
import android.os.Process;
import java.util.ArrayList;
import android.os.Parcel;

// 
// Decompiled by Procyon v0.6.0
// 

public final class f3a implements ycm
{
    public Object D0;
    
    public f3a() {
        final Parcel obtain = Parcel.obtain();
        czd.e((Object)obtain, "obtain()");
        this.D0 = obtain;
    }
    
    public f3a(final int n) {
        this.D0 = new ArrayList(n);
    }
    
    public f3a(final ayz d0) {
        this.D0 = d0;
    }
    
    public f3a(String concat) {
        final int myUid = Process.myUid();
        final int myPid = Process.myPid();
        final StringBuilder sb = new StringBuilder(39);
        sb.append("UID: [");
        sb.append(myUid);
        sb.append("]  PID: [");
        sb.append(myPid);
        sb.append("] ");
        final String value = String.valueOf(sb.toString());
        if (concat.length() != 0) {
            concat = value.concat(concat);
        }
        else {
            concat = new String(value);
        }
        this.D0 = concat;
    }
    
    public f3a(final qft d0) {
        czd.f((Object)d0, "toaster");
        this.D0 = d0;
    }
    
    public f3a(final r1s d0) {
        czd.f((Object)d0, "swipeToLatestRepo");
        this.D0 = d0;
    }
    
    public static String n(final String s, final String s2, final Object... array) {
        String s3 = s2;
        if (array.length > 0) {
            try {
                s3 = String.format(Locale.US, s2, array);
            }
            catch (final IllegalFormatException ex) {
                final String value = String.valueOf(s2);
                String concat;
                if (value.length() != 0) {
                    concat = "Unable to format ".concat(value);
                }
                else {
                    concat = new String("Unable to format ");
                }
                Log.e("PlayCore", concat, (Throwable)ex);
                final String join = TextUtils.join((CharSequence)", ", array);
                s3 = mb0.C(new StringBuilder(String.valueOf(s2).length() + 3 + String.valueOf(join).length()), s2, " [", join, "]");
            }
        }
        return ta0.z(new StringBuilder(String.valueOf(s).length() + 3 + String.valueOf(s3).length()), s, " : ", s3);
    }
    
    public final void a(final Object o) {
        ((ArrayList)this.D0).add(o);
    }
    
    @Override
    public final void accept(final Object o, final Object o2) {
        final aty aty = (aty)o;
        final rxz rxz = new rxz((zbs)o2);
        final oxy oxy = (oxy)((bm1)aty).D();
        final Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(oxy.b);
        final int a = fny.a;
        obtain.writeStrongBinder((IBinder)rxz);
        oxy.s(11, obtain);
    }
    
    public final void b(Object d0) {
        if (d0 == null) {
            return;
        }
        if (d0 instanceof Object[]) {
            final Object[] array = (Object[])d0;
            if (array.length > 0) {
                d0 = this.D0;
                ((ArrayList)d0).ensureCapacity(((ArrayList)d0).size() + array.length);
                Collections.addAll((Collection<? super Object>)this.D0, array);
            }
        }
        else if (d0 instanceof Collection) {
            ((ArrayList)this.D0).addAll((Collection)d0);
        }
        else if (d0 instanceof Iterable) {
            final Iterator iterator = ((Iterable)d0).iterator();
            while (iterator.hasNext()) {
                ((ArrayList)this.D0).add(iterator.next());
            }
        }
        else {
            if (!(d0 instanceof Iterator)) {
                final StringBuilder j = fu8.j("Don't know how to spread ");
                j.append(d0.getClass());
                throw new UnsupportedOperationException(j.toString());
            }
            final Iterator iterator2 = (Iterator)d0;
            while (iterator2.hasNext()) {
                ((ArrayList)this.D0).add(iterator2.next());
            }
        }
    }
    
    public final void c(final byte b) {
        ((Parcel)this.D0).writeByte(b);
    }
    
    public final void d(final float n) {
        ((Parcel)this.D0).writeFloat(n);
    }
    
    public final void e(final long n) {
        final long c = xjs.c(n);
        final yjs.a companion = yjs.Companion;
        Objects.requireNonNull(companion);
        final boolean a = yjs.a(c, 0L);
        byte b = 0;
        if (!a) {
            Objects.requireNonNull(companion);
            if (yjs.a(c, 4294967296L)) {
                b = 1;
            }
            else {
                Objects.requireNonNull(companion);
                if (yjs.a(c, 8589934592L)) {
                    b = 2;
                }
            }
        }
        this.c(b);
        final long c2 = xjs.c(n);
        Objects.requireNonNull(companion);
        if (!yjs.a(c2, 0L)) {
            this.d(xjs.d(n));
        }
    }
    
    public final void f(final long n) {
        ((Parcel)this.D0).writeLong(n);
    }
    
    public final int g() {
        return ((ArrayList)this.D0).size();
    }
    
    public final Object[] h(final Object[] array) {
        return ((ArrayList)this.D0).toArray(array);
    }
    
    public final int i(final String s, final Object... array) {
        if (Log.isLoggable("PlayCore", 3)) {
            return Log.d("PlayCore", n((String)this.D0, s, array));
        }
        return 0;
    }
    
    public final int j(final String s, final Object... array) {
        if (Log.isLoggable("PlayCore", 6)) {
            return Log.e("PlayCore", n((String)this.D0, s, array));
        }
        return 0;
    }
    
    public final int k(final Throwable t, final String s, final Object... array) {
        if (Log.isLoggable("PlayCore", 6)) {
            return Log.e("PlayCore", n((String)this.D0, s, array), t);
        }
        return 0;
    }
    
    public final int l(final String s, final Object... array) {
        if (Log.isLoggable("PlayCore", 4)) {
            return Log.i("PlayCore", n((String)this.D0, s, array));
        }
        return 0;
    }
    
    public final int m(final String s, final Object... array) {
        if (Log.isLoggable("PlayCore", 5)) {
            return Log.w("PlayCore", n((String)this.D0, s, array));
        }
        return 0;
    }
}
