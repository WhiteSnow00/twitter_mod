import java.util.Iterator;
import java.util.Objects;
import android.content.Intent;
import android.content.BroadcastReceiver;
import java.util.LinkedHashSet;
import java.util.Set;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class xs1
{
    public static final b Companion;
    public final Context a;
    public final Object b;
    public final Set<c> c;
    public boolean d;
    public final a e;
    
    static {
        Companion = new b();
    }
    
    public xs1(final Context a) {
        czd.f((Object)a, "context");
        this.a = a;
        final Object b = new Object();
        this.b = b;
        final LinkedHashSet c = new LinkedHashSet();
        this.c = c;
        this.e = new a(c, b);
    }
    
    public static final class a extends BroadcastReceiver
    {
        public final Iterable<c> a;
        public final Object b;
        
        public a(final Iterable<? extends c> a, final Object b) {
            this.a = (Iterable<c>)a;
            this.b = b;
        }
        
        public final void onReceive(final Context context, final Intent intent) {
            if (intent != null) {
                Objects.requireNonNull(xs1.d.Companion);
                final long n = wa2.n();
                final b companion = xs1.Companion;
                final Integer a = xs1.b.a(companion, intent, "status");
                boolean b = false;
                Label_0071: {
                    Label_0068: {
                        if (a != null) {
                            if (a == 2) {
                                break Label_0068;
                            }
                        }
                        if (a != null) {
                            if (a == 5) {
                                break Label_0068;
                            }
                        }
                        b = false;
                        break Label_0071;
                    }
                    b = true;
                }
                final Integer a2 = xs1.b.a(companion, intent, "temperature");
                Float value;
                if (a2 != null) {
                    value = a2 / 10.0f;
                }
                else {
                    value = null;
                }
                final Integer a3 = xs1.b.a(companion, intent, "level");
                final Integer a4 = xs1.b.a(companion, intent, "scale");
                Float value2;
                if (a3 != null && a4 != null && a4 > 0) {
                    value2 = a3 * 100 / (float)a4;
                }
                else {
                    value2 = null;
                }
                final d d = new d(n, b, value, value2);
                synchronized (this.b) {
                    final Iterator<c> iterator = this.a.iterator();
                    while (iterator.hasNext()) {
                        iterator.next().a(d);
                    }
                }
            }
        }
    }
    
    public static final class b
    {
        public static final Integer a(final b b, final Intent intent, final String s) {
            Objects.requireNonNull(b);
            final int intExtra = intent.getIntExtra(s, -1);
            Integer value;
            if (intExtra != -1) {
                value = intExtra;
            }
            else {
                value = null;
            }
            return value;
        }
    }
    
    public interface c
    {
        void a(final d p0);
        
        void release();
    }
    
    public static final class d
    {
        public static final a Companion;
        public final long a;
        public final boolean b;
        public final Float c;
        public final Float d;
        
        static {
            Companion = new a();
        }
        
        public d(final long a, final boolean b, final Float c, final Float d) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof d)) {
                return false;
            }
            final d d = (d)o;
            return this.a == d.a && this.b == d.b && czd.a((Object)this.c, (Object)d.c) && czd.a((Object)this.d, (Object)d.d);
        }
        
        @Override
        public final int hashCode() {
            final long a = this.a;
            final int n = (int)(a ^ a >>> 32);
            int b;
            if ((b = (this.b ? 1 : 0)) != 0) {
                b = 1;
            }
            final Float c = this.c;
            int hashCode = 0;
            int hashCode2;
            if (c == null) {
                hashCode2 = 0;
            }
            else {
                hashCode2 = c.hashCode();
            }
            final Float d = this.d;
            if (d != null) {
                hashCode = d.hashCode();
            }
            return ((n * 31 + b) * 31 + hashCode2) * 31 + hashCode;
        }
        
        @Override
        public final String toString() {
            final long a = this.a;
            final boolean b = this.b;
            final Float c = this.c;
            final Float d = this.d;
            final StringBuilder sb = new StringBuilder();
            sb.append("Sample(timestamp=");
            sb.append(a);
            sb.append(", isCharging=");
            sb.append(b);
            sb.append(", celsius=");
            sb.append(c);
            sb.append(", percent=");
            sb.append(d);
            sb.append(")");
            return sb.toString();
        }
        
        public static final class a
        {
        }
    }
}
