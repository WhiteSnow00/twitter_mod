import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.LinkedHashMap;

// 
// Decompiled by Procyon v0.6.0
// 

public class ieg<K, V>
{
    public final LinkedHashMap<K, V> a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    
    public ieg(final int c) {
        if (c > 0) {
            this.c = c;
            this.a = new LinkedHashMap<K, V>(0, 0.75f, true);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }
    
    public V a(final K k) {
        return null;
    }
    
    public void b(final boolean p0, final K p1, final V p2, final V p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //    Signature:
        //  (ZTK;TV;TV;)V
        // 
        // The error that occurred was:
        // 
        // java.lang.ArrayIndexOutOfBoundsException: 4
        //     at com.strobel.decompiler.ast.AstBuilder.performStackAnalysis(AstBuilder.java:2030)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:108)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:203)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:761)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:638)
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
    
    public final V c(final K k) {
        Objects.requireNonNull(k, "key == null");
        synchronized (this) {
            final V value = this.a.get(k);
            if (value != null) {
                ++this.f;
                return value;
            }
            ++this.g;
            monitorexit(this);
            final V a = this.a(k);
            if (a == null) {
                return null;
            }
            synchronized (this) {
                ++this.e;
                final V put = this.a.put(k, a);
                if (put != null) {
                    this.a.put(k, put);
                }
                else {
                    this.b += this.f(k, a);
                }
                monitorexit(this);
                if (put != null) {
                    this.b(false, (Object)k, (Object)a);
                    return put;
                }
                this.i(this.c);
                return a;
            }
        }
    }
    
    public final V d(final K k, final V v) {
        if (k != null && v != null) {
            synchronized (this) {
                ++this.d;
                this.b += this.f(k, v);
                final V put = this.a.put(k, v);
                if (put != null) {
                    this.b -= this.f(k, put);
                }
                monitorexit(this);
                if (put != null) {
                    this.b(false, (Object)k, (Object)put);
                }
                this.i(this.c);
                return put;
            }
        }
        throw new NullPointerException("key == null || value == null");
    }
    
    public final V e(final K k) {
        Objects.requireNonNull(k, "key == null");
        synchronized (this) {
            final V remove = this.a.remove(k);
            if (remove != null) {
                this.b -= this.f(k, remove);
            }
            monitorexit(this);
            if (remove != null) {
                this.b(false, (Object)k, (Object)remove);
            }
            return remove;
        }
    }
    
    public final int f(final K k, final V v) {
        final int g = this.g((Object)v);
        if (g >= 0) {
            return g;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Negative size: ");
        sb.append(k);
        sb.append("=");
        sb.append(v);
        throw new IllegalStateException(sb.toString());
    }
    
    public int g(final K p0, final V p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ireturn        
        //    Signature:
        //  (TK;TV;)I
        // 
        // The error that occurred was:
        // 
        // java.lang.ArrayIndexOutOfBoundsException: 2
        //     at com.strobel.decompiler.ast.AstBuilder.performStackAnalysis(AstBuilder.java:2030)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:108)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:203)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:761)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:638)
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
    
    public final Map<K, V> h() {
        synchronized (this) {
            return new LinkedHashMap<K, V>((Map<? extends K, ? extends V>)this.a);
        }
    }
    
    public void i(final int n) {
        while (true) {
            synchronized (this) {
                if (this.b < 0 || (this.a.isEmpty() && this.b != 0)) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append(this.getClass().getName());
                    sb.append(".sizeOf() is reporting inconsistent results!");
                    throw new IllegalStateException(sb.toString());
                }
                if (this.b <= n || this.a.isEmpty()) {
                    return;
                }
                final Map.Entry entry = (Map.Entry)this.a.entrySet().iterator().next();
                final Object key = entry.getKey();
                final Object value = entry.getValue();
                this.a.remove(key);
                this.b -= this.f((K)key, (V)value);
                monitorexit(this);
                this.b(true, key, value);
            }
        }
    }
    
    @Override
    public final String toString() {
        synchronized (this) {
            final int f = this.f;
            final int n = this.g + f;
            int n2;
            if (n != 0) {
                n2 = f * 100 / n;
            }
            else {
                n2 = 0;
            }
            return String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", this.c, this.f, this.g, n2);
        }
    }
}
