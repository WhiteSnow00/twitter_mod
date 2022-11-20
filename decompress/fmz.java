import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.Collection;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.RandomAccess;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fmz extends ufz implements RandomAccess, imz
{
    public final ArrayList E0;
    
    static {
        new fmz(10).D0 = false;
    }
    
    public fmz() {
        this(10);
    }
    
    public fmz(final int n) {
        final ArrayList e0 = new ArrayList(n);
        this.E0 = e0;
    }
    
    public fmz(final ArrayList e0) {
        this.E0 = e0;
    }
    
    public static String i(final Object o) {
        if (o instanceof String) {
            return (String)o;
        }
        if (o instanceof phz) {
            final phz phz = (phz)o;
            final Charset a = ulz.a;
            String m;
            if (phz.i() == 0) {
                m = "";
            }
            else {
                m = phz.m(a);
            }
            return m;
        }
        return new String((byte[])o, ulz.a);
    }
    
    public final /* bridge */ rlz V(final int n) {
        if (n >= this.size()) {
            final ArrayList list = new ArrayList(n);
            list.addAll(this.E0);
            return (rlz)new fmz(list);
        }
        throw new IllegalArgumentException();
    }
    
    public final /* bridge */ void add(final int n, final Object o) {
        final String s = (String)o;
        this.e();
        this.E0.add(n, s);
        ++((AbstractList)this).modCount;
    }
    
    public final boolean addAll(final int n, final Collection collection) {
        this.e();
        List h = (List)collection;
        if (collection instanceof imz) {
            h = ((imz)collection).h();
        }
        final boolean addAll = this.E0.addAll(n, h);
        ++((AbstractList)this).modCount;
        return addAll;
    }
    
    public final boolean addAll(final Collection collection) {
        return this.addAll(this.size(), collection);
    }
    
    public final void clear() {
        this.e();
        this.E0.clear();
        ++((AbstractList)this).modCount;
    }
    
    public final imz f() {
        if (super.D0) {
            return (imz)new drz((imz)this);
        }
        return this;
    }
    
    public final void f1(final phz phz) {
        this.e();
        this.E0.add(phz);
        ++((AbstractList)this).modCount;
    }
    
    public final String g(final int n) {
        final Object value = this.E0.get(n);
        if (value instanceof String) {
            return (String)value;
        }
        if (value instanceof phz) {
            final phz phz = (phz)value;
            final Charset a = ulz.a;
            String m;
            if (phz.i() == 0) {
                m = "";
            }
            else {
                m = phz.m(a);
            }
            if (phz.o()) {
                this.E0.set(n, m);
            }
            return m;
        }
        final byte[] array = (byte[])value;
        final String s = new String(array, ulz.a);
        if (((jrz)dsz.a).a(array, 0, array.length)) {
            this.E0.set(n, s);
        }
        return s;
    }
    
    public final /* bridge */ Object get(final int n) {
        return this.g(n);
    }
    
    public final List h() {
        return Collections.unmodifiableList((List<?>)this.E0);
    }
    
    public final Object r0(final int n) {
        return this.E0.get(n);
    }
    
    public final /* bridge */ Object remove(final int n) {
        this.e();
        final Object remove = this.E0.remove(n);
        ++((AbstractList)this).modCount;
        return i(remove);
    }
    
    public final /* bridge */ Object set(final int n, final Object o) {
        final String s = (String)o;
        this.e();
        return i(this.E0.set(n, s));
    }
    
    public final int size() {
        return this.E0.size();
    }
}
