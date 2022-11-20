import java.lang.reflect.Modifier;
import android.os.Looper;
import android.os.Bundle;
import androidx.lifecycle.LiveData;
import java.util.Objects;
import java.io.PrintWriter;
import java.io.FileDescriptor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class s2g extends r2g
{
    public final xaf a;
    public final c b;
    
    public s2g(final xaf a, final s9x s9x) {
        this.a = a;
        final n9x$a e = (n9x$a)c.e;
        czd.f((Object)s9x, "store");
        this.b = (c)new n9x(s9x, (n9x$a)e, (a57)a57$a.b).a((Class)c.class);
    }
    
    @Deprecated
    public final void a(final String s, final FileDescriptor fileDescriptor, final PrintWriter printWriter, final String[] array) {
        final c b = this.b;
        if (b.c.h() > 0) {
            printWriter.print(s);
            printWriter.println("Loaders:");
            final StringBuilder sb = new StringBuilder();
            sb.append(s);
            sb.append("    ");
            final String string = sb.toString();
            for (int i = 0; i < b.c.h(); ++i) {
                final s2g$a s2g$a = (s2g$a)b.c.i(i);
                printWriter.print(s);
                printWriter.print("  #");
                printWriter.print(b.c.f(i));
                printWriter.print(": ");
                printWriter.println(s2g$a.toString());
                printWriter.print(string);
                printWriter.print("mId=");
                printWriter.print(s2g$a.l);
                printWriter.print(" mArgs=");
                printWriter.println(s2g$a.m);
                printWriter.print(string);
                printWriter.print("mLoader=");
                printWriter.println(s2g$a.n);
                s2g$a.n.e(hmg.h(string, "  "), fileDescriptor, printWriter, array);
                if (s2g$a.p != null) {
                    printWriter.print(string);
                    printWriter.print("mCallbacks=");
                    printWriter.println(s2g$a.p);
                    final b p4 = s2g$a.p;
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append(string);
                    sb2.append("  ");
                    final String string2 = sb2.toString();
                    Objects.requireNonNull(p4);
                    printWriter.print(string2);
                    printWriter.print("mDeliveredData=");
                    printWriter.println(p4.F0);
                }
                printWriter.print(string);
                printWriter.print("mData=");
                final k2g n = s2g$a.n;
                Object e = ((LiveData)s2g$a).e;
                if (e == LiveData.k) {
                    e = null;
                }
                printWriter.println(n.c(e));
                printWriter.print(string);
                printWriter.print("mStarted=");
                printWriter.println(((LiveData)s2g$a).d());
            }
        }
    }
    
    public final <D> k2g<D> c(final int n) {
        final c b = this.b;
        if (!b.d) {
            final s2g$a<Object> b2 = b.b(n);
            k2g n2;
            if (b2 != null) {
                n2 = ((s2g$a)b2).n;
            }
            else {
                n2 = null;
            }
            return (k2g<D>)n2;
        }
        throw new IllegalStateException("Called while creating a loader");
    }
    
    public final <D> k2g<D> d(final int n, final Bundle bundle, final r2g$a<D> r2g$a) {
        if (this.b.d) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
        final s2g$a<Object> b = this.b.b(n);
        if (b == null) {
            return this.f(n, bundle, r2g$a, null);
        }
        return (k2g<D>)((s2g$a)b).n(this.a, (r2g$a)r2g$a);
    }
    
    public final <D> k2g<D> e(final int n, final Bundle bundle, final r2g$a<D> r2g$a) {
        if (this.b.d) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (Looper.getMainLooper() == Looper.myLooper()) {
            final s2g$a<Object> b = this.b.b(n);
            k2g l = null;
            if (b != null) {
                l = ((s2g$a)b).l(false);
            }
            return this.f(n, bundle, r2g$a, (k2g<D>)l);
        }
        throw new IllegalStateException("restartLoader must be called on the main thread");
    }
    
    public final <D> k2g<D> f(final int n, final Bundle bundle, final r2g$a<D> r2g$a, final k2g<D> k2g) {
        try {
            this.b.d = true;
            final k2g i = r2g$a.i(n, bundle);
            if (i == null) {
                throw new IllegalArgumentException("Object returned from onCreateLoader must not be null");
            }
            if (i.getClass().isMemberClass() && !Modifier.isStatic(i.getClass().getModifiers())) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Object returned from onCreateLoader must not be a non-static inner member class: ");
                sb.append(i);
                throw new IllegalArgumentException(sb.toString());
            }
            final s2g$a s2g$a = new s2g$a(n, bundle, i, (k2g)k2g);
            this.b.c.g(n, (Object)s2g$a);
            this.b.d = false;
            return (k2g<D>)s2g$a.n(this.a, (r2g$a)r2g$a);
        }
        finally {
            this.b.d = false;
        }
    }
    
    public final String toString() {
        final StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        final Class<? extends xaf> class1 = this.a.getClass();
        sb.append(class1.getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(class1)));
        sb.append("}}");
        return sb.toString();
    }
    
    public static final class b<D> implements dcj<D>
    {
        public final k2g<D> D0;
        public final r2g$a<D> E0;
        public boolean F0;
        
        public b(final k2g<D> d0, final r2g$a<D> e0) {
            this.F0 = false;
            this.D0 = d0;
            this.E0 = e0;
        }
        
        @Override
        public final void f(final D n) {
            this.F0 = true;
            this.E0.h((k2g)this.D0, (Object)n);
        }
        
        @Override
        public final String toString() {
            return this.E0.toString();
        }
    }
    
    public static final class c extends a9x
    {
        public static final s2g$c$a e;
        public u0r<s2g$a> c;
        public boolean d;
        
        static {
            e = new n9x$a() {
                public final <T extends a9x> T a(final Class<T> clazz) {
                    return (T)new c();
                }
                
                public final a9x b(final Class clazz, final a57 a57) {
                    return this.a((Class<a9x>)clazz);
                }
            };
        }
        
        public c() {
            this.c = (u0r<s2g$a>)new u0r();
            this.d = false;
        }
        
        public final void a() {
            for (int f0 = this.c.F0, i = 0; i < f0; ++i) {
                ((s2g$a)this.c.E0[i]).l(true);
            }
            final u0r<s2g$a> c = this.c;
            final int f2 = c.F0;
            final Object[] e0 = c.E0;
            for (int j = 0; j < f2; ++j) {
                e0[j] = null;
            }
            c.F0 = 0;
        }
        
        public final <D> s2g$a<D> b(final int n) {
            return (s2g$a<D>)this.c.e(n, (Object)null);
        }
    }
}
