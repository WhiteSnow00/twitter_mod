import java.util.Comparator;
import java.util.Iterator;
import java.util.Collection;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public class d8a<T extends r7a> implements Iterable<T>
{
    public static final d8a G0;
    public final List<T> F0;
    
    static {
        final ged$b g0 = ged.G0;
        final int a = o5j.a;
        G0 = new d8a((List<T>)g0);
    }
    
    public d8a(final List<T> f0) {
        this.F0 = f0;
    }
    
    public static <T extends r7a> d8a<T> e(final List<T> list) {
        if (kr4.w((Collection)list)) {
            final r7a.c j0 = r7a.J0;
            final boolean b = list instanceof pmq;
            int n2;
            final int n = n2 = 1;
            if (!b) {
                n2 = n;
                if (list.size() > 1) {
                    final Iterator iterator = list.iterator();
                    Object next = iterator.next();
                    while (true) {
                        n2 = n;
                        if (!iterator.hasNext()) {
                            break;
                        }
                        final Object next2 = iterator.next();
                        if (j0.compare(next, next2) > 0) {
                            n2 = 0;
                            break;
                        }
                        next = next2;
                    }
                }
            }
            if (n2 != 0) {
                return new d8a<T>(list);
            }
        }
        final d8a.d8a$b d8a$b = new d8a.d8a$b(list.size());
        ((a)d8a$b).o(list);
        return (d8a<T>)((z4j)d8a$b).e();
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof d8a && this.F0.equals(((d8a)o).F0));
    }
    
    public final T g(final int p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        d8a.F0:Ljava/util/List;
        //     4: iconst_0       
        //     5: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //    10: checkcast       Lr7a;
        //    13: areturn        
        //    Signature:
        //  (I)TT;
        // 
        // The error that occurred was:
        // 
        // java.lang.ArrayIndexOutOfBoundsException: 1
        //     at com.strobel.decompiler.ast.AstBuilder.performStackAnalysis(AstBuilder.java:2016)
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
    
    @Override
    public final int hashCode() {
        return this.F0.hashCode();
    }
    
    public final boolean isEmpty() {
        return this.F0.isEmpty();
    }
    
    @Override
    public final Iterator<T> iterator() {
        return this.F0.iterator();
    }
    
    public final int size() {
        return this.F0.size();
    }
    
    @Override
    public final String toString() {
        final StringBuilder f = ehk.f("EntityList{mEntities=");
        f.append(this.F0);
        f.append('}');
        return f.toString();
    }
    
    public abstract static class a<T extends r7a, EL extends d8a<T>, B extends a<T, EL, B>> extends z4j<EL>
    {
        public EL a;
        public ojf<T> b;
        
        public a() {
            this.a = this.s(null);
        }
        
        public a(final int n) {
            Object t = null;
            this.a = this.s(null);
            if (n > 0) {
                t = t(n);
            }
            this.b = (ojf$b)t;
        }
        
        public a(final EL a) {
            this.a = a;
        }
        
        public static <T extends r7a> ojf<T> t(final int n) {
            return (ojf<T>)new ojf$b((Comparator)r7a.J0, n);
        }
        
        public final /* bridge */ Object i() {
            return this.q();
        }
        
        public final B o(final Iterable<? extends T> iterable) {
            final Iterator<? extends T> iterator = iterable.iterator();
            while (iterator.hasNext()) {
                this.p((T)iterator.next());
            }
            final int a = o5j.a;
            return (B)this;
        }
        
        public final B p(final T t) {
            this.u().p((Object)t);
            final int a = o5j.a;
            return (B)this;
        }
        
        public final EL q() {
            final ojf$b b = this.b;
            if (b != null) {
                this.a = this.s((List<T>)((z4j)b).e());
                this.b = null;
            }
            return this.a;
        }
        
        public final B r() {
            if (!this.a.isEmpty() || !kr4.s((Iterable)this.b)) {
                final ojf$b b = this.b;
                final d8a<T> a = this.a;
                Object o;
                if (b == null) {
                    o = a;
                }
                else {
                    o = b;
                }
                int n;
                if (b != null) {
                    n = ((ojf)b).size();
                }
                else {
                    n = a.size();
                }
                this.b = (ojf$b)t(n);
                for (final r7a r7a : o) {
                    final ojf$b b2 = this.b;
                    final Object e = r7a.g().e();
                    final int a2 = o5j.a;
                    ((ojf)b2).p((Object)e);
                }
            }
            final int a3 = o5j.a;
            return (B)this;
        }
        
        public abstract EL s(final List<T> p0);
        
        public final ojf<T> u() {
            if (this.b == null) {
                final int size = this.a.size();
                int n;
                if ((n = size) > 1) {
                    n = size + 2;
                }
                final ojf<r7a> t = t(n);
                t.q((Iterable)this.a);
                this.b = (ojf$b)t;
                this.a = this.s(null);
            }
            return (ojf<T>)this.b;
        }
        
        public final B v(EL s) {
            if (s == null) {
                s = this.s(null);
            }
            this.a = s;
            this.b = null;
            final int a = o5j.a;
            return (B)this;
        }
    }
}
