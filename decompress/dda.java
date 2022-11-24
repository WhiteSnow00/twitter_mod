import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dda
{
    public static final a Companion;
    public static final dda f;
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    
    static {
        f = (Companion = new a()).e("", "", "", "", "");
    }
    
    public dda(final String a, final String b, final String c, final String d, final String e) {
        e0e.f((Object)a, "page");
        e0e.f((Object)b, "section");
        e0e.f((Object)c, "component");
        e0e.f((Object)d, "element");
        e0e.f((Object)e, "action");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public static final dda a(final String s) {
        return dda.Companion.a(s);
    }
    
    public static final void b() {
        Objects.requireNonNull(dda.Companion);
    }
    
    public static final dda c() {
        Objects.requireNonNull(dda.Companion);
        return dda.f;
    }
    
    public static final dda d(final iba iba, final String s, final String s2) {
        return dda.Companion.b(iba, s, s2);
    }
    
    public static final dda e(final ica ica, final String s) {
        return dda.Companion.c(ica, s);
    }
    
    public static final dda f(final qda qda, final String s, final String s2, final String s3) {
        return dda.Companion.d(qda, s, s2, s3);
    }
    
    public static final dda g(final String s, final String s2, final String s3, final String s4, final String s5) {
        return dda.Companion.e(s, s2, s3, s4, s5);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof dda)) {
            return false;
        }
        final dda dda = (dda)o;
        return e0e.a((Object)this.a, (Object)dda.a) && e0e.a((Object)this.b, (Object)dda.b) && e0e.a((Object)this.c, (Object)dda.c) && e0e.a((Object)this.d, (Object)dda.d) && e0e.a((Object)this.e, (Object)dda.e);
    }
    
    @Override
    public final int hashCode() {
        return this.e.hashCode() + brg.d(this.d, brg.d(this.c, brg.d(this.b, this.a.hashCode() * 31, 31), 31), 31);
    }
    
    @Override
    public final String toString() {
        return flr.j((CharSequence)":", (Object[])new String[] { this.a, this.b, this.c, this.d, this.e });
    }
    
    public static final class a
    {
        public final dda a(final String s) {
            if (s != null) {
                if (!flr.e((CharSequence)s)) {
                    final Object[] array = wlr.N1((CharSequence)s, new String[] { ":" }).toArray(new String[0]);
                    e0e.d((Object)array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                    final String[] array2 = (String[])array;
                    if (array2.length == 5) {
                        return this.e(array2[0], array2[1], array2[2], array2[3], array2[4]);
                    }
                }
            }
            return null;
        }
        
        public final dda b(final iba iba, final String s, final String s2) {
            e0e.f((Object)iba, "eventComponentPrefix");
            e0e.f((Object)s, "element");
            e0e.f((Object)s2, "action");
            return new dda(((jda)iba).b(), ((qda)iba).d(), iba.a(), s, s2);
        }
        
        public final dda c(final ica ica, final String s) {
            e0e.f((Object)ica, "eventElementPrefix");
            return new dda(((jda)ica).b(), ((qda)ica).d(), ica.a(), ica.c(), s);
        }
        
        public final dda d(final qda qda, final String s, final String s2, final String s3) {
            e0e.f((Object)qda, "eventSectionPrefix");
            e0e.f((Object)s, "component");
            return new dda(((jda)qda).b(), qda.d(), s, s2, s3);
        }
        
        public final dda e(final String s, final String s2, final String s3, final String s4, final String s5) {
            e0e.f((Object)s, "page");
            e0e.f((Object)s2, "section");
            e0e.f((Object)s3, "component");
            e0e.f((Object)s4, "element");
            e0e.f((Object)s5, "action");
            return new dda(s, s2, s3, s4, s5);
        }
    }
}
