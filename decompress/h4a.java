import android.view.View;
import java.util.concurrent.Callable;
import java.util.Set;
import java.util.Iterator;
import java.util.HashMap;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.LinkedHashSet;
import android.os.IBinder;
import java.util.Objects;
import android.widget.TextView;
import java.util.IllegalFormatException;
import android.text.TextUtils;
import android.util.Log;
import java.util.Locale;
import android.os.Process;
import java.util.HashSet;
import android.os.Parcel;

// 
// Decompiled by Procyon v0.6.0
// 

public final class h4a implements kdm, imb
{
    public Object F0;
    
    public h4a(final int n) {
        if (n != 8) {
            final Parcel obtain = Parcel.obtain();
            e0e.e((Object)obtain, "obtain()");
            this.F0 = obtain;
            return;
        }
        this.F0 = new HashSet();
    }
    
    public h4a(final Object f0) {
        this.F0 = f0;
    }
    
    public h4a(String concat) {
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
        this.F0 = concat;
    }
    
    public h4a(final pk7 f0) {
        this.F0 = f0;
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
                s3 = m58.v(new StringBuilder(String.valueOf(s2).length() + 3 + String.valueOf(join).length()), s2, " [", join, "]");
            }
        }
        return wa0.y(new StringBuilder(String.valueOf(s).length() + 3 + String.valueOf(s3).length()), s, " : ", s3);
    }
    
    public final void a(final TextView textView, final lfs lfs) {
        if (textView != null) {
            final int n = 0;
            int visibility;
            if (lfs instanceof v3a) {
                visibility = 8;
            }
            else if (lfs instanceof zkr) {
                final int a = o5j.a;
                textView.setText(((zkr)lfs).b);
                visibility = n;
            }
            else if (lfs instanceof elr) {
                final int a2 = o5j.a;
                textView.setText((CharSequence)((elr)lfs).b);
                visibility = n;
            }
            else if (lfs instanceof hym) {
                final int a3 = o5j.a;
                final hym hym = (hym)lfs;
                final pe6 pe6 = (pe6)this.F0;
                final fym b = hym.b;
                Objects.requireNonNull(pe6);
                sym$a.a(textView, b, (sym)pe6);
                visibility = n;
            }
            else {
                visibility = n;
                if (lfs instanceof n1r) {
                    final int a4 = o5j.a;
                    textView.setText((CharSequence)s60.a(((n1r)lfs).b));
                    visibility = n;
                }
            }
            ((View)textView).setVisibility(visibility);
        }
    }
    
    public final void accept(final Object o, final Object o2) {
        final xty xty = (xty)o;
        final qyz qyz = new qyz((rcs)o2);
        final myy myy = (myy)((gm1)xty).D();
        final Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(myy.b);
        final int a = zny.a;
        obtain.writeStrongBinder((IBinder)qyz);
        myy.s(11, obtain);
    }
    
    public final tpx b(final zf4 zf4) {
        e0e.f((Object)zf4, "allowlist");
        Objects.requireNonNull(tpx.Companion);
        final tpx tpx = new tpx();
        final pk7 pk7 = (pk7)this.F0;
        Objects.requireNonNull(pk7);
        if (((Enum)zf4.I0).ordinal() == 0) {
            final HashMap f0 = zf4.F0;
            e0e.e((Object)f0, "root");
            final LinkedHashSet set = new LinkedHashSet();
            final Iterator iterator = f0.entrySet().iterator();
            while (iterator.hasNext()) {
                pr4.j1((Collection)set, (Iterable)pk7.i((Map.Entry)iterator.next(), (List)h3a.F0));
            }
            for (final List list : set) {
                e0e.f((Object)list, "tokens");
                final upx a = tpx.a;
                Objects.requireNonNull(a);
                a.a((List)list, 0);
            }
            return tpx;
        }
        throw new IllegalStateException("Invalid field type");
    }
    
    public final void c(final byte b) {
        ((Parcel)this.F0).writeByte(b);
    }
    
    public final void d(final float n) {
        ((Parcel)this.F0).writeFloat(n);
    }
    
    public final void e(final long n) {
        final long c = pks.c(n);
        final qks$a companion = qks.Companion;
        Objects.requireNonNull(companion);
        final boolean a = qks.a(c, 0L);
        byte b = 0;
        if (!a) {
            Objects.requireNonNull(companion);
            if (qks.a(c, 4294967296L)) {
                b = 1;
            }
            else {
                Objects.requireNonNull(companion);
                if (qks.a(c, 8589934592L)) {
                    b = 2;
                }
            }
        }
        this.c(b);
        final long c2 = pks.c(n);
        Objects.requireNonNull(companion);
        if (!qks.a(c2, 0L)) {
            this.d(pks.d(n));
        }
    }
    
    public final int f(final String s) {
        if (s != null && ((Set)this.F0).contains(s.trim())) {
            return 2;
        }
        return 0;
    }
    
    public final void g(final long n) {
        ((Parcel)this.F0).writeLong(n);
    }
    
    public final yz5 h(final Callable callable) {
        return ((yz5)new l06(callable)).t((bxo)this.F0);
    }
    
    public final int i(final String s, final Object... array) {
        if (Log.isLoggable("PlayCore", 3)) {
            return Log.d("PlayCore", n((String)this.F0, s, array));
        }
        return 0;
    }
    
    public final int j(final String s, final Object... array) {
        if (Log.isLoggable("PlayCore", 6)) {
            return Log.e("PlayCore", n((String)this.F0, s, array));
        }
        return 0;
    }
    
    public final int k(final Throwable t, final String s, final Object... array) {
        if (Log.isLoggable("PlayCore", 6)) {
            return Log.e("PlayCore", n((String)this.F0, s, array), t);
        }
        return 0;
    }
    
    public final int l(final String s, final Object... array) {
        if (Log.isLoggable("PlayCore", 4)) {
            return Log.i("PlayCore", n((String)this.F0, s, array));
        }
        return 0;
    }
    
    public final int m(final String s, final Object... array) {
        if (Log.isLoggable("PlayCore", 5)) {
            return Log.w("PlayCore", n((String)this.F0, s, array));
        }
        return 0;
    }
}
