import java.util.AbstractMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Arrays;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bbm<K, V> extends jdd<K, V>
{
    public static final jdd<Object, Object> J0;
    public final transient Object G0;
    public final transient Object[] H0;
    public final transient int I0;
    
    static {
        bbm.J0 = new bbm(null, new Object[0], 0);
    }
    
    public bbm(final Object g0, final Object[] h0, final int i0) {
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
    }
    
    public static <K, V> bbm<K, V> p(final int n, final Object[] array) {
        if (n == 0) {
            return bbm.J0;
        }
        Object o = null;
        if (n == 1) {
            Objects.requireNonNull(array[0]);
            Objects.requireNonNull(array[1]);
            return new bbm<K, V>(null, array, 1);
        }
        nza.G0(n, array.length >> 1);
        final int p2 = pdd.p(n);
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
                    int a = c9y.A(o2.hashCode());
                    while (true) {
                        a &= n2;
                        final int n5 = array2[a] & 0xFF;
                        if (n5 == 255) {
                            array2[a] = (byte)n4;
                            ++n3;
                            break;
                        }
                        if (o2.equals(array[n5])) {
                            throw q(o2, o3, array, n5);
                        }
                        ++a;
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
                    int n8 = 0;
                Label_0343:
                    while (true) {
                        o = array3;
                        if (n6 >= n) {
                            return new bbm<K, V>(o, array, n);
                        }
                        final int n7 = n6 * 2 + 0;
                        o4 = array[n7];
                        Objects.requireNonNull(o4);
                        o5 = array[n7 ^ 0x1];
                        Objects.requireNonNull(o5);
                        int a2 = c9y.A(o4.hashCode());
                        while (true) {
                            a2 &= n2;
                            n8 = (array3[a2] & 0xFFFF);
                            if (n8 == 65535) {
                                array3[a2] = (short)n7;
                                ++n6;
                                break;
                            }
                            if (o4.equals(array[n8])) {
                                break Label_0343;
                            }
                            ++a2;
                        }
                    }
                    throw q(o4, o5, array, n8);
                }
                final int[] array4 = new int[p2];
                Arrays.fill(array4, -1);
                int n9 = 0;
                Object o6 = null;
                Object o7 = null;
                int n12 = 0;
            Label_0467:
                while (true) {
                    o = array4;
                    if (n9 >= n) {
                        return new bbm<K, V>(o, array, n);
                    }
                    final int n10 = n9 * 2 + 0;
                    o6 = array[n10];
                    Objects.requireNonNull(o6);
                    o7 = array[n10 ^ 0x1];
                    Objects.requireNonNull(o7);
                    int a3 = c9y.A(o6.hashCode());
                    while (true) {
                        final int n11 = a3 & n2;
                        n12 = array4[n11];
                        if (n12 == -1) {
                            array4[n11] = n10;
                            ++n9;
                            break;
                        }
                        if (o6.equals(array[n12])) {
                            break Label_0467;
                        }
                        a3 = n11 + 1;
                    }
                }
                throw q(o6, o7, array, n12);
            }
        }
        return new bbm<K, V>(o, array, n);
    }
    
    public static IllegalArgumentException q(final Object o, final Object o2, final Object[] array, int length) {
        final String value = String.valueOf(o);
        final String value2 = String.valueOf(o2);
        final String value3 = String.valueOf(array[length]);
        final String value4 = String.valueOf(array[length ^ 0x1]);
        final int length2 = value.length();
        length = value2.length();
        return new IllegalArgumentException(mb0.C(x70.D(value4.length() + (value3.length() + (length + (length2 + 39))), "Multiple entries with same key: ", value, "=", value2), " and ", value3, "=", value4));
    }
    
    public final pdd<Map.Entry<K, V>> d() {
        return (pdd<Map.Entry<K, V>>)new a((jdd)this, this.H0, this.I0);
    }
    
    public final pdd<K> e() {
        return new b<K>(this, (edd<K>)new bbm.bbm$c(this.H0, 0, this.I0));
    }
    
    public final xcd<V> f() {
        return (xcd<V>)new bbm.bbm$c(this.H0, 1, this.I0);
    }
    
    public final V get(Object o) {
        final Object g0 = this.G0;
        final Object[] h0 = this.H0;
        final int i0 = this.I0;
        Label_0298: {
            if (o != null) {
                if (i0 == 1) {
                    final Object o2 = h0[0];
                    Objects.requireNonNull(o2);
                    if (o2.equals(o)) {
                        o = h0[1];
                        Objects.requireNonNull(o);
                        break Label_0298;
                    }
                }
                else if (g0 != null) {
                    if (g0 instanceof byte[]) {
                        final byte[] array = (byte[])g0;
                        final int length = array.length;
                        int a = c9y.A(o.hashCode());
                        while (true) {
                            a &= length - 1;
                            final int n = array[a] & 0xFF;
                            if (n == 255) {
                                break;
                            }
                            if (o.equals(h0[n])) {
                                o = h0[n ^ 0x1];
                                break Label_0298;
                            }
                            ++a;
                        }
                    }
                    else if (g0 instanceof short[]) {
                        final short[] array2 = (short[])g0;
                        final int length2 = array2.length;
                        int a2 = c9y.A(o.hashCode());
                        while (true) {
                            final int n2 = a2 & length2 - 1;
                            final int n3 = array2[n2] & 0xFFFF;
                            if (n3 == 65535) {
                                break;
                            }
                            if (o.equals(h0[n3])) {
                                o = h0[n3 ^ 0x1];
                                break Label_0298;
                            }
                            a2 = n2 + 1;
                        }
                    }
                    else {
                        final int[] array3 = (int[])g0;
                        final int length3 = array3.length;
                        int a3 = c9y.A(o.hashCode());
                        while (true) {
                            final int n4 = a3 & length3 - 1;
                            final int n5 = array3[n4];
                            if (n5 == -1) {
                                break;
                            }
                            if (o.equals(h0[n5])) {
                                o = h0[n5 ^ 0x1];
                                break Label_0298;
                            }
                            a3 = n4 + 1;
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
    
    public final void h() {
    }
    
    public final int size() {
        return this.I0;
    }
    
    public static final class a<K, V> extends pdd<Map.Entry<K, V>>
    {
        public final transient jdd<K, V> G0;
        public final transient Object[] H0;
        public final transient int I0;
        public final transient int J0;
        
        public a(final jdd<K, V> p0, final Object[] p1, final int p2, final int p3) {
            // 
            // This method could not be decompiled.
            // 
            // Original Bytecode:
            // 
            //     1: invokespecial   pdd.<init>:()V
            //     4: aload_0        
            //     5: aload_1        
            //     6: putfield        bbm$a.G0:Ljdd;
            //     9: aload_0        
            //    10: aload_2        
            //    11: putfield        bbm$a.H0:[Ljava/lang/Object;
            //    14: aload_0        
            //    15: iconst_0       
            //    16: putfield        bbm$a.I0:I
            //    19: aload_0        
            //    20: iload_3        
            //    21: putfield        bbm$a.J0:I
            //    24: return         
            //    Signature:
            //  (Ljdd<TK;TV;>;[Ljava/lang/Object;II)V
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
        
        public final boolean contains(Object key) {
            final boolean b = key instanceof Map.Entry;
            boolean b3;
            final boolean b2 = b3 = false;
            if (b) {
                final Map.Entry entry = (Map.Entry)key;
                key = entry.getKey();
                final Object value = entry.getValue();
                b3 = b2;
                if (value != null) {
                    b3 = b2;
                    if (value.equals(this.G0.get(key))) {
                        b3 = true;
                    }
                }
            }
            return b3;
        }
        
        public final int g(final Object[] array, final int n) {
            return this.e().g(array, n);
        }
        
        public final /* bridge */ Iterator iterator() {
            return this.n();
        }
        
        public final boolean m() {
            return true;
        }
        
        public final f0w<Map.Entry<K, V>> n() {
            return (f0w<Map.Entry<K, V>>)this.e().s(0);
        }
        
        public final edd<Map.Entry<K, V>> s() {
            return new edd<Map.Entry<K, V>>(this) {
                public final bbm.a F0;
                
                public final Object get(int n) {
                    nza.E0(n, this.F0.J0);
                    final bbm.a f0 = this.F0;
                    final Object[] h0 = f0.H0;
                    n *= 2;
                    final Object o = h0[f0.I0 + n];
                    Objects.requireNonNull(o);
                    final bbm.a f2 = this.F0;
                    final Object o2 = f2.H0[n + (f2.I0 ^ 0x1)];
                    Objects.requireNonNull(o2);
                    return new AbstractMap.SimpleImmutableEntry(o, o2);
                }
                
                public final boolean m() {
                    return true;
                }
                
                public final int size() {
                    return this.F0.J0;
                }
            };
        }
        
        public final int size() {
            return this.J0;
        }
    }
    
    public static final class b<K> extends pdd<K>
    {
        public final transient jdd<K, ?> G0;
        public final transient edd<K> H0;
        
        public b(final jdd<K, ?> g0, final edd<K> h0) {
            this.G0 = g0;
            this.H0 = h0;
        }
        
        public final boolean contains(final Object o) {
            return this.G0.get(o) != null;
        }
        
        public final edd<K> e() {
            return this.H0;
        }
        
        public final int g(final Object[] array, final int n) {
            return this.H0.g(array, n);
        }
        
        public final /* bridge */ Iterator iterator() {
            return this.n();
        }
        
        public final boolean m() {
            return true;
        }
        
        public final f0w<K> n() {
            return (f0w<K>)this.H0.s(0);
        }
        
        public final int size() {
            return ((Map)this.G0).size();
        }
    }
}
