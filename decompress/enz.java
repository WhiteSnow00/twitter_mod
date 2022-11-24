import java.util.Collections;
import java.util.List;
import java.util.Collection;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.RandomAccess;

// 
// Decompiled by Procyon v0.6.0
// 

public final class enz extends tgz implements RandomAccess, hnz
{
    public final ArrayList G0;
    
    static {
        new enz(10).F0 = false;
    }
    
    public enz() {
        this(10);
    }
    
    public enz(final int n) {
        final ArrayList g0 = new ArrayList(n);
        this.G0 = g0;
    }
    
    public enz(final ArrayList g0) {
        this.G0 = g0;
    }
    
    public static String i(final Object o) {
        if (o instanceof String) {
            return (String)o;
        }
        if (o instanceof oiz) {
            final oiz oiz = (oiz)o;
            final Charset a = tmz.a;
            String m;
            if (oiz.i() == 0) {
                m = "";
            }
            else {
                m = oiz.m(a);
            }
            return m;
        }
        return new String((byte[])o, tmz.a);
    }
    
    public final /* bridge */ qmz W(final int n) {
        if (n >= this.size()) {
            final ArrayList list = new ArrayList(n);
            list.addAll(this.G0);
            return (qmz)new enz(list);
        }
        throw new IllegalArgumentException();
    }
    
    public final /* bridge */ void add(final int n, final Object o) {
        final String s = (String)o;
        this.e();
        this.G0.add(n, s);
        ++super.modCount;
    }
    
    @Override
    public final boolean addAll(final int n, final Collection collection) {
        this.e();
        Collection h = collection;
        if (collection instanceof hnz) {
            h = ((hnz)collection).h();
        }
        final boolean addAll = this.G0.addAll(n, h);
        ++super.modCount;
        return addAll;
    }
    
    @Override
    public final boolean addAll(final Collection collection) {
        return this.addAll(this.size(), collection);
    }
    
    @Override
    public final void clear() {
        this.e();
        this.G0.clear();
        ++super.modCount;
    }
    
    public final hnz f() {
        if (super.F0) {
            return (hnz)new csz((hnz)this);
        }
        return (hnz)this;
    }
    
    public final String g(final int n) {
        final Object value = this.G0.get(n);
        if (value instanceof String) {
            return (String)value;
        }
        if (value instanceof oiz) {
            final oiz oiz = (oiz)value;
            final Charset a = tmz.a;
            String m;
            if (oiz.i() == 0) {
                m = "";
            }
            else {
                m = oiz.m(a);
            }
            if (oiz.o()) {
                this.G0.set(n, m);
            }
            return m;
        }
        final byte[] array = (byte[])value;
        final String s = new String(array, tmz.a);
        if (ctz.a.a(array, 0, array.length)) {
            this.G0.set(n, s);
        }
        return s;
    }
    
    public final void g1(final oiz oiz) {
        this.e();
        this.G0.add(oiz);
        ++super.modCount;
    }
    
    public final /* bridge */ Object get(final int n) {
        return this.g(n);
    }
    
    public final List h() {
        return Collections.unmodifiableList((List<?>)this.G0);
    }
    
    @Override
    public final /* bridge */ Object remove(final int n) {
        this.e();
        final Object remove = this.G0.remove(n);
        ++super.modCount;
        return i(remove);
    }
    
    public final Object s0(final int n) {
        return this.G0.get(n);
    }
    
    public final /* bridge */ Object set(final int n, final Object o) {
        final String s = (String)o;
        this.e();
        return i(this.G0.set(n, s));
    }
    
    public final int size() {
        return this.G0.size();
    }
}
