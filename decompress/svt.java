import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Arrays;
import java.util.Objects;
import java.util.Map;
import com.google.android.exoplayer2.f$a;
import com.google.android.exoplayer2.f;

// 
// Decompiled by Procyon v0.6.0
// 

public final class svt implements f
{
    public static final svt D0;
    public static final f$a<svt> E0;
    public final fed<lvt, a> C0;
    
    static {
        D0 = new svt(mam.I0);
        svt.E0 = g71.I0;
    }
    
    public svt(final Map<lvt, a> map) {
        this.C0 = fed.c((Map<? extends lvt, ? extends a>)map);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null && svt.class == o.getClass()) {
            final svt svt = (svt)o;
            final fed<lvt, a> c0 = this.C0;
            final fed<lvt, a> c2 = svt.C0;
            Objects.requireNonNull(c0);
            return tkg.a(c0, c2);
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return this.C0.hashCode();
    }
    
    public static final class a implements f
    {
        public static final f$a<a> E0;
        public final lvt C0;
        public final aed<Integer> D0;
        
        static {
            a.E0 = h71.I0;
        }
        
        public a(final lvt c0) {
            this.C0 = c0;
            wvz.i(4, "initialCapacity");
            Object[] array = new Object[4];
            int i = 0;
            int n = 0;
            int n2 = 0;
            while (i < c0.C0) {
                final Integer value = i;
                Objects.requireNonNull(value);
                final int n3 = n + 1;
                Object[] copy = null;
                int n4 = 0;
                Label_0105: {
                    if (array.length < n3) {
                        copy = Arrays.copyOf(array, tdd.b.b(array.length, n3));
                    }
                    else {
                        copy = array;
                        if ((n4 = n2) == 0) {
                            break Label_0105;
                        }
                        copy = array.clone();
                    }
                    n4 = 0;
                }
                copy[n] = value;
                ++i;
                ++n;
                array = copy;
                n2 = n4;
            }
            this.D0 = (aed<Integer>)aed.o(array, n);
        }
        
        public a(final lvt c0, final List<Integer> list) {
            if (!list.isEmpty() && (Collections.min((Collection<? extends Integer>)list) < 0 || Collections.max((Collection<? extends Integer>)list) >= c0.C0)) {
                throw new IndexOutOfBoundsException();
            }
            this.C0 = c0;
            this.D0 = (aed<Integer>)aed.q((Collection)list);
        }
        
        @Override
        public final boolean equals(final Object o) {
            boolean b = true;
            if (this == o) {
                return true;
            }
            if (o != null && a.class == o.getClass()) {
                final a a = (a)o;
                if (!this.C0.equals(a.C0) || !this.D0.equals((Object)a.D0)) {
                    b = false;
                }
                return b;
            }
            return false;
        }
        
        @Override
        public final int hashCode() {
            return this.D0.hashCode() * 31 + this.C0.hashCode();
        }
    }
}
