import java.util.Objects;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lv1<T> extends rbm<T>
{
    public static final Object[] I0;
    public static final lv1.lv1$a[] J0;
    public final AtomicReference<T> D0;
    public final AtomicReference<lv1.lv1$a<T>[]> E0;
    public final Lock F0;
    public final Lock G0;
    public long H0;
    
    static {
        I0 = new Object[0];
        J0 = new lv1.lv1$a[0];
    }
    
    public lv1() {
        final ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.F0 = reentrantReadWriteLock.readLock();
        this.G0 = reentrantReadWriteLock.writeLock();
        this.E0 = new AtomicReference<lv1.lv1$a<T>[]>((lv1.lv1$a<T>[])lv1.J0);
        this.D0 = new AtomicReference<T>();
    }
    
    public static <T> lv1<T> d(final T t) {
        final lv1 lv1 = new lv1();
        Objects.requireNonNull(t, "defaultValue == null");
        lv1.D0.lazySet((T)t);
        return lv1;
    }
    
    @Override
    public final void accept(final T t) {
        Objects.requireNonNull(t, "value == null");
        this.G0.lock();
        ++this.H0;
        this.D0.lazySet(t);
        this.G0.unlock();
        final lv1.lv1$a[] array = this.E0.get();
        for (int length = array.length, i = 0; i < length; ++i) {
            final lv1.lv1$a lv1$a = array[i];
            final long h0 = this.H0;
            if (!lv1$a.J0) {
                if (!lv1$a.I0) {
                    synchronized (lv1$a) {
                        if (lv1$a.J0) {
                            continue;
                        }
                        if (lv1$a.K0 == h0) {
                            continue;
                        }
                        if (lv1$a.G0) {
                            qq0 h2;
                            if ((h2 = lv1$a.H0) == null) {
                                h2 = new qq0();
                                lv1$a.H0 = h2;
                            }
                            int c;
                            if ((c = h2.c) == 4) {
                                final Object[] b = new Object[5];
                                h2.b[4] = b;
                                h2.b = b;
                                c = 0;
                            }
                            h2.b[c] = t;
                            h2.c = c + 1;
                            continue;
                        }
                        lv1$a.F0 = true;
                        monitorexit(lv1$a);
                        lv1$a.I0 = true;
                    }
                }
                lv1$a.test((Object)t);
            }
        }
    }
    
    public final void e(final lv1.lv1$a<T> lv1$a) {
        lv1.lv1$a[] array;
        lv1.lv1$a[] j0;
        do {
            array = this.E0.get();
            final int length = ((lv1.lv1$a<T>[])array).length;
            if (length == 0) {
                return;
            }
            final int n = -1;
            int n2 = 0;
            int n3;
            while (true) {
                n3 = n;
                if (n2 >= length) {
                    break;
                }
                if (array[n2] == lv1$a) {
                    n3 = n2;
                    break;
                }
                ++n2;
            }
            if (n3 < 0) {
                return;
            }
            if (length == 1) {
                j0 = lv1.J0;
            }
            else {
                j0 = new lv1.lv1$a[length - 1];
                System.arraycopy(array, 0, j0, 0, n3);
                System.arraycopy(array, n3 + 1, j0, n3, length - n3 - 1);
            }
        } while (!this.E0.compareAndSet((lv1.lv1$a<T>[])array, (lv1.lv1$a<T>[])j0));
    }
    
    public final void subscribeActual(final ccj<? super T> ccj) {
        final lv1.lv1$a lv1$a = new lv1.lv1$a((ccj)ccj, this);
        ccj.onSubscribe((t19)lv1$a);
        lv1.lv1$a[] array;
        lv1.lv1$a[] array2;
        do {
            array = this.E0.get();
            final int length = ((lv1.lv1$a<T>[])array).length;
            array2 = new lv1.lv1$a[length + 1];
            System.arraycopy(array, 0, array2, 0, length);
            array2[length] = lv1$a;
        } while (!this.E0.compareAndSet((lv1.lv1$a<T>[])array, (lv1.lv1$a<T>[])array2));
        if (lv1$a.J0) {
            this.e((lv1.lv1$a<T>)lv1$a);
            return;
        }
        if (lv1$a.J0) {
            return;
        }
        synchronized (lv1$a) {
            if (lv1$a.J0) {
                monitorexit(lv1$a);
            }
            else if (lv1$a.F0) {
                monitorexit(lv1$a);
            }
            else {
                final lv1 e0 = lv1$a.E0;
                final Lock f0 = e0.F0;
                f0.lock();
                lv1$a.K0 = e0.H0;
                final T value = e0.D0.get();
                f0.unlock();
                lv1$a.G0 = (value != null);
                lv1$a.F0 = true;
                monitorexit(lv1$a);
                if (value != null) {
                    lv1$a.test((Object)value);
                    while (!lv1$a.J0) {
                        monitorenter(lv1$a);
                        try {
                            final qq0 h0 = lv1$a.H0;
                            if (h0 != null) {
                                lv1$a.H0 = null;
                                monitorexit(lv1$a);
                                for (Object[] a = h0.a; a != null; a = (Object[])a[4]) {
                                    for (int i = 0; i < 4; ++i) {
                                        final Object o = a[i];
                                        if (o == null) {
                                            break;
                                        }
                                        lv1$a.test(o);
                                    }
                                }
                                continue;
                            }
                            lv1$a.G0 = false;
                            monitorexit(lv1$a);
                        }
                        finally {}
                        break;
                    }
                }
            }
        }
    }
}
