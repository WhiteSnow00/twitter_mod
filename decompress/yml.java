import java.util.concurrent.atomic.AtomicBoolean;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class yml<T> extends cbm<T>
{
    public static final a[] D0;
    public final AtomicReference<a<T>[]> C0;
    
    static {
        D0 = new a[0];
    }
    
    public yml() {
        this.C0 = new AtomicReference<a<T>[]>(yml.D0);
    }
    
    @Override
    public final void accept(final T t) {
        Objects.requireNonNull(t, "value == null");
        for (final a a : this.C0.get()) {
            if (!a.get()) {
                a.C0.onNext((Object)t);
            }
        }
    }
    
    public final void d(final a<T> a) {
        a[] array;
        a[] d0;
        do {
            array = this.C0.get();
            if (array == yml.D0) {
                return;
            }
            final int length = array.length;
            final int n = -1;
            int n2 = 0;
            int n3;
            while (true) {
                n3 = n;
                if (n2 >= length) {
                    break;
                }
                if (array[n2] == a) {
                    n3 = n2;
                    break;
                }
                ++n2;
            }
            if (n3 < 0) {
                return;
            }
            if (length == 1) {
                d0 = yml.D0;
            }
            else {
                d0 = new a[length - 1];
                System.arraycopy(array, 0, d0, 0, n3);
                System.arraycopy(array, n3 + 1, d0, n3, length - n3 - 1);
            }
        } while (!this.C0.compareAndSet(array, d0));
    }
    
    public final void subscribeActual(final wbj<? super T> wbj) {
        final a a = new a((wbj<? super T>)wbj, (yml<T>)this);
        wbj.onSubscribe((j29)a);
        a[] array;
        a[] array2;
        do {
            array = this.C0.get();
            final int length = array.length;
            array2 = new a[length + 1];
            System.arraycopy(array, 0, array2, 0, length);
            array2[length] = a;
        } while (!this.C0.compareAndSet(array, array2));
        if (a.get()) {
            this.d(a);
        }
    }
    
    public static final class a<T> extends AtomicBoolean implements j29
    {
        public final wbj<? super T> C0;
        public final yml<T> D0;
        
        public a(final wbj<? super T> c0, final yml<T> d0) {
            this.C0 = c0;
            this.D0 = d0;
        }
        
        public final void dispose() {
            if (this.compareAndSet(false, true)) {
                this.D0.d(this);
            }
        }
        
        public final boolean isDisposed() {
            return this.get();
        }
    }
}
