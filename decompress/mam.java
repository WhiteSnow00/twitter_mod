import java.util.AbstractMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Arrays;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mam<K, V> extends fed<K, V>
{
    public static final fed<Object, Object> I0;
    public final transient Object F0;
    public final transient Object[] G0;
    public final transient int H0;
    
    static {
        mam.I0 = new mam(null, new Object[0], 0);
    }
    
    public mam(final Object f0, final Object[] g0, final int h0) {
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
    }
    
    public static <K, V> mam<K, V> p(final int n, final Object[] array) {
        if (n == 0) {
            return mam.I0;
        }
        Object o = null;
        if (n == 1) {
            Objects.requireNonNull(array[0]);
            Objects.requireNonNull(array[1]);
            return new mam<K, V>(null, array, 1);
        }
        j78.g(n, array.length >> 1);
        final int p2 = led.p(n);
        if (n == 1) {
            Objects.requireNonNull(array[0]);
            Objects.requireNonNull(array[1]);
        }
        else {
            final int n2 = p2 - 1;
            if (p2 <= 128) {
                final byte[] array2 = new byte[p2];
                Arrays.fill(array2, (byte)(-1));
                int n3 = 0;
                while (true) {
                    o = array2;
                    if (n3 >= n) {
                        break;
                    }
                    final int n4 = n3 * 2 + 0;
                    final Object o2 = array[n4];
                    Objects.requireNonNull(o2);
                    final Object o3 = array[n4 ^ 0x1];
                    Objects.requireNonNull(o3);
                    int z = h6q.Z(o2.hashCode());
                    while (true) {
                        z &= n2;
                        final int n5 = array2[z] & 0xFF;
                        if (n5 == 255) {
                            array2[z] = (byte)n4;
                            ++n3;
                            break;
                        }
                        if (o2.equals(array[n5])) {
                            throw q(o2, o3, array, n5);
                        }
                        ++z;
                    }
                }
            }
            else {
                if (p2 <= 32768) {
                    final short[] array3 = new short[p2];
                    Arrays.fill(array3, (short)(-1));
                    int n6 = 0;
                    Object o4 = null;
                    Object o5 = null;
                    int n9 = 0;
                Label_0348:
                    while (true) {
                        o = array3;
                        if (n6 >= n) {
                            return new mam<K, V>(o, array, n);
                        }
                        final int n7 = n6 * 2 + 0;
                        o4 = array[n7];
                        Objects.requireNonNull(o4);
                        o5 = array[n7 ^ 0x1];
                        Objects.requireNonNull(o5);
                        int z2 = h6q.Z(o4.hashCode());
                        while (true) {
                            final int n8 = z2 & n2;
                            n9 = (array3[n8] & 0xFFFF);
                            if (n9 == 65535) {
                                array3[n8] = (short)n7;
                                ++n6;
                                break;
                            }
                            if (o4.equals(array[n9])) {
                                break Label_0348;
                            }
                            z2 = n8 + 1;
                        }
                    }
                    throw q(o4, o5, array, n9);
                }
                final int[] array4 = new int[p2];
                Arrays.fill(array4, -1);
                int n10 = 0;
                Object o6 = null;
                Object o7 = null;
                int n12 = 0;
            Label_0469:
                while (true) {
                    o = array4;
                    if (n10 >= n) {
                        return new mam<K, V>(o, array, n);
                    }
                    final int n11 = n10 * 2 + 0;
                    o6 = array[n11];
                    Objects.requireNonNull(o6);
                    o7 = array[n11 ^ 0x1];
                    Objects.requireNonNull(o7);
                    int z3 = h6q.Z(o6.hashCode());
                    while (true) {
                        z3 &= n2;
                        n12 = array4[z3];
                        if (n12 == -1) {
                            array4[z3] = n11;
                            ++n10;
                            break;
                        }
                        if (o6.equals(array[n12])) {
                            break Label_0469;
                        }
                        ++z3;
                    }
                }
                throw q(o6, o7, array, n12);
            }
        }
        return new mam<K, V>(o, array, n);
    }
    
    public static IllegalArgumentException q(final Object o, final Object o2, final Object[] array, int length) {
        final String value = String.valueOf(o);
        final String value2 = String.valueOf(o2);
        final String value3 = String.valueOf(array[length]);
        final String value4 = String.valueOf(array[length ^ 0x1]);
        final int length2 = value.length();
        length = value2.length();
        return new IllegalArgumentException(hi.J(xpa.n(value4.length() + (value3.length() + (length + (length2 + 39))), "Multiple entries with same key: ", value, "=", value2), " and ", value3, "=", value4));
    }
    
    @Override
    public final led<Entry<K, V>> d() {
        return (led<Entry<K, V>>)new a((fed)this, this.G0, this.H0);
    }
    
    @Override
    public final led<K> e() {
        return new b<K>(this, (aed<K>)new c(this.G0, 0, this.H0));
    }
    
    @Override
    public final tdd<V> f() {
        return (tdd<V>)new c(this.G0, 1, this.H0);
    }
    
    @Override
    public final V get(Object o) {
        final Object f0 = this.F0;
        final Object[] g0 = this.G0;
        final int h0 = this.H0;
        Label_0295: {
            if (o != null) {
                if (h0 == 1) {
                    final Object o2 = g0[0];
                    Objects.requireNonNull(o2);
                    if (o2.equals(o)) {
                        o = g0[1];
                        Objects.requireNonNull(o);
                        break Label_0295;
                    }
                }
                else if (f0 != null) {
                    if (f0 instanceof byte[]) {
                        final byte[] array = (byte[])f0;
                        final int length = array.length;
                        int z = h6q.Z(o.hashCode());
                        while (true) {
                            z &= length - 1;
                            final int n = array[z] & 0xFF;
                            if (n == 255) {
                                break;
                            }
                            if (o.equals(g0[n])) {
                                o = g0[n ^ 0x1];
                                break Label_0295;
                            }
                            ++z;
                        }
                    }
                    else if (f0 instanceof short[]) {
                        final short[] array2 = (short[])f0;
                        final int length2 = array2.length;
                        int z2 = h6q.Z(o.hashCode());
                        while (true) {
                            final int n2 = z2 & length2 - 1;
                            final int n3 = array2[n2] & 0xFFFF;
                            if (n3 == 65535) {
                                break;
                            }
                            if (o.equals(g0[n3])) {
                                o = g0[n3 ^ 0x1];
                                break Label_0295;
                            }
                            z2 = n2 + 1;
                        }
                    }
                    else {
                        final int[] array3 = (int[])f0;
                        final int length3 = array3.length;
                        int z3 = h6q.Z(o.hashCode());
                        while (true) {
                            final int n4 = z3 & length3 - 1;
                            final int n5 = array3[n4];
                            if (n5 == -1) {
                                break;
                            }
                            if (o.equals(g0[n5])) {
                                o = g0[n5 ^ 0x1];
                                break Label_0295;
                            }
                            z3 = n4 + 1;
                        }
                    }
                }
            }
            o = null;
        }
        if (o == null) {
            return null;
        }
        return (V)o;
    }
    
    @Override
    public final void h() {
    }
    
    @Override
    public final int size() {
        return this.H0;
    }
    
    public static final class a<K, V> extends led<Entry<K, V>>
    {
        public final transient fed<K, V> F0;
        public final transient Object[] G0;
        public final transient int H0;
        public final transient int I0;
        
        public a(final fed<K, V> p0, final Object[] p1, final int p2, final int p3) {
            // 
            // This method could not be decompiled.
            // 
            // Original Bytecode:
            // 
            //     1: invokespecial   led.<init>:()V
            //     4: aload_0        
            //     5: aload_1        
            //     6: putfield        mam$a.F0:Lfed;
            //     9: aload_0        
            //    10: aload_2        
            //    11: putfield        mam$a.G0:[Ljava/lang/Object;
            //    14: aload_0        
            //    15: iconst_0       
            //    16: putfield        mam$a.H0:I
            //    19: aload_0        
            //    20: iload_3        
            //    21: putfield        mam$a.I0:I
            //    24: return         
            //    Signature:
            //  (Lfed<TK;TV;>;[Ljava/lang/Object;II)V
            // 
            // The error that occurred was:
            // 
            // java.lang.ArrayIndexOutOfBoundsException: 4
            //     at com.strobel.decompiler.ast.AstBuilder.performStackAnalysis(AstBuilder.java:2016)
            //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:108)
            //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:203)
            //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createConstructor(AstBuilder.java:799)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:635)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:662)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:162)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:137)
            //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
            //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
            //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:333)
            //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:254)
            //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:129)
            // 
            throw new IllegalStateException("An error occurred while decompiling this method.");
        }
        
        @Override
        public final boolean contains(Object key) {
            final boolean b = key instanceof Entry;
            boolean b3;
            final boolean b2 = b3 = false;
            if (b) {
                final Entry entry = (Entry)key;
                key = entry.getKey();
                final Object value = entry.getValue();
                b3 = b2;
                if (value != null) {
                    b3 = b2;
                    if (value.equals(this.F0.get(key))) {
                        b3 = true;
                    }
                }
            }
            return b3;
        }
        
        @Override
        public final int g(final Object[] array, final int n) {
            return this.e().g(array, n);
        }
        
        @Override
        public final boolean m() {
            return true;
        }
        
        @Override
        public final ozv<Entry<K, V>> n() {
            return (ozv<Entry<K, V>>)this.e().s(0);
        }
        
        @Override
        public final aed<Entry<K, V>> s() {
            return new aed<Entry<K, V>>() {
                public final Object get(int n) {
                    j78.e(n, a.this.I0);
                    final a e0 = a.this;
                    final Object[] g0 = e0.G0;
                    n *= 2;
                    final Object o = g0[e0.H0 + n];
                    Objects.requireNonNull(o);
                    final a e2 = a.this;
                    final Object o2 = e2.G0[n + (e2.H0 ^ 0x1)];
                    Objects.requireNonNull(o2);
                    return new AbstractMap.SimpleImmutableEntry(o, o2);
                }
                
                public final boolean m() {
                    return true;
                }
                
                public final int size() {
                    return a.this.I0;
                }
            };
        }
        
        @Override
        public final int size() {
            return this.I0;
        }
    }
    
    public static final class b<K> extends led<K>
    {
        public final transient fed<K, ?> F0;
        public final transient aed<K> G0;
        
        public b(final fed<K, ?> f0, final aed<K> g0) {
            this.F0 = f0;
            this.G0 = g0;
        }
        
        @Override
        public final boolean contains(final Object o) {
            return this.F0.get(o) != null;
        }
        
        @Override
        public final aed<K> e() {
            return this.G0;
        }
        
        @Override
        public final int g(final Object[] array, final int n) {
            return this.G0.g(array, n);
        }
        
        @Override
        public final boolean m() {
            return true;
        }
        
        @Override
        public final ozv<K> n() {
            return (ozv<K>)this.G0.s(0);
        }
        
        @Override
        public final int size() {
            return this.F0.size();
        }
    }
    
    public static final class c extends aed<Object>
    {
        public final transient Object[] E0;
        public final transient int F0;
        public final transient int G0;
        
        public c(final Object[] e0, final int f0, final int g0) {
            this.E0 = e0;
            this.F0 = f0;
            this.G0 = g0;
        }
        
        public final Object get(final int n) {
            j78.e(n, this.G0);
            final Object o = this.E0[n * 2 + this.F0];
            Objects.requireNonNull(o);
            return o;
        }
        
        public final boolean m() {
            return true;
        }
        
        public final int size() {
            return this.G0;
        }
    }
}
