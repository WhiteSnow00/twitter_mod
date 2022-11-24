import java.util.Objects;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class tv1<T> extends ecm<T>
{
    public static final Object[] K0;
    public static final tv1.tv1$a[] L0;
    public final AtomicReference<T> F0;
    public final AtomicReference<tv1.tv1$a<T>[]> G0;
    public final Lock H0;
    public final Lock I0;
    public long J0;
    
    static {
        K0 = new Object[0];
        L0 = new tv1.tv1$a[0];
    }
    
    public tv1() {
        final ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.H0 = reentrantReadWriteLock.readLock();
        this.I0 = reentrantReadWriteLock.writeLock();
        this.G0 = new AtomicReference<tv1.tv1$a<T>[]>((tv1.tv1$a<T>[])tv1.L0);
        this.F0 = new AtomicReference<T>();
    }
    
    public static <T> tv1<T> d(final T t) {
        final tv1 tv1 = new tv1();
        Objects.requireNonNull(t, "defaultValue == null");
        tv1.F0.lazySet((T)t);
        return tv1;
    }
    
    public final void accept(final T t) {
        Objects.requireNonNull(t, "value == null");
        this.I0.lock();
        ++this.J0;
        this.F0.lazySet(t);
        this.I0.unlock();
        final tv1.tv1$a[] array = this.G0.get();
        for (int length = array.length, i = 0; i < length; ++i) {
            final tv1.tv1$a tv1$a = array[i];
            final long j0 = this.J0;
            if (!tv1$a.L0) {
                if (!tv1$a.K0) {
                    synchronized (tv1$a) {
                        if (tv1$a.L0) {
                            continue;
                        }
                        if (tv1$a.M0 == j0) {
                            continue;
                        }
                        if (tv1$a.I0) {
                            rq0 j2;
                            if ((j2 = tv1$a.J0) == null) {
                                j2 = new rq0();
                                tv1$a.J0 = j2;
                            }
                            int c;
                            if ((c = j2.c) == 4) {
                                final Object[] b = new Object[5];
                                j2.b[4] = b;
                                j2.b = b;
                                c = 0;
                            }
                            j2.b[c] = t;
                            j2.c = c + 1;
                            continue;
                        }
                        tv1$a.H0 = true;
                        monitorexit(tv1$a);
                        tv1$a.K0 = true;
                    }
                }
                tv1$a.test((Object)t);
            }
        }
    }
    
    public final void e(final tv1.tv1$a<T> tv1$a) {
        tv1.tv1$a[] array;
        tv1.tv1$a[] l0;
        do {
            array = this.G0.get();
            final int length = ((tv1.tv1$a<T>[])array).length;
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
                if (array[n2] == tv1$a) {
                    n3 = n2;
                    break;
                }
                ++n2;
            }
            if (n3 < 0) {
                return;
            }
            if (length == 1) {
                l0 = tv1.L0;
            }
            else {
                l0 = new tv1.tv1$a[length - 1];
                System.arraycopy(array, 0, l0, 0, n3);
                System.arraycopy(array, n3 + 1, l0, n3, length - n3 - 1);
            }
        } while (!this.G0.compareAndSet((tv1.tv1$a<T>[])array, (tv1.tv1$a<T>[])l0));
    }
    
    public final void subscribeActual(final ocj<? super T> ocj) {
        final tv1.tv1$a tv1$a = new tv1.tv1$a((ocj)ocj, this);
        ocj.onSubscribe((b39)tv1$a);
        tv1.tv1$a[] array;
        tv1.tv1$a[] array2;
        do {
            array = this.G0.get();
            final int length = ((tv1.tv1$a<T>[])array).length;
            array2 = new tv1.tv1$a[length + 1];
            System.arraycopy(array, 0, array2, 0, length);
            array2[length] = tv1$a;
        } while (!this.G0.compareAndSet((tv1.tv1$a<T>[])array, (tv1.tv1$a<T>[])array2));
        if (tv1$a.L0) {
            this.e((tv1.tv1$a<T>)tv1$a);
            return;
        }
        if (tv1$a.L0) {
            return;
        }
        synchronized (tv1$a) {
            if (tv1$a.L0) {
                monitorexit(tv1$a);
            }
            else if (tv1$a.H0) {
                monitorexit(tv1$a);
            }
            else {
                final tv1 g0 = tv1$a.G0;
                final Lock h0 = g0.H0;
                h0.lock();
                tv1$a.M0 = g0.J0;
                final T value = g0.F0.get();
                h0.unlock();
                tv1$a.I0 = (value != null);
                tv1$a.H0 = true;
                monitorexit(tv1$a);
                if (value != null) {
                    tv1$a.test((Object)value);
                    while (!tv1$a.L0) {
                        monitorenter(tv1$a);
                        try {
                            final rq0 j0 = tv1$a.J0;
                            if (j0 != null) {
                                tv1$a.J0 = null;
                                monitorexit(tv1$a);
                                for (Object[] a = j0.a; a != null; a = (Object[])a[4]) {
                                    for (int i = 0; i < 4; ++i) {
                                        final Object o = a[i];
                                        if (o == null) {
                                            break;
                                        }
                                        tv1$a.test(o);
                                    }
                                }
                                continue;
                            }
                            tv1$a.I0 = false;
                            monitorexit(tv1$a);
                        }
                        finally {}
                        break;
                    }
                }
            }
        }
    }
}
