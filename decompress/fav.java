// 
// Decompiled by Procyon v0.6.0
// 

public final class fav<T> implements y9v<T>
{
    public static final ape<Object>[] i;
    public final String a;
    public final t5j<T> b;
    public final T c;
    public final stb<T, yz5> d;
    public final kcm e;
    public final bxo f;
    public final r9a g;
    public final a h;
    
    static {
        i = new ape[] { (ape)i2f.i((Class)fav.class, "value", "getValue()Ljava/lang/Object;", 0) };
    }
    
    public fav(final String a, final t5j<T> b, final T c, final stb<? super T, ? extends yz5> d, final kcm e, final bxo f, final r9a g) {
        e0e.f((Object)a, "key");
        e0e.f((Object)c, "initialValue");
        e0e.f((Object)e, "releaseCompletable");
        e0e.f((Object)f, "ioScheduler");
        e0e.f((Object)g, "errorReporter");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = (stb<T, yz5>)d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = new a();
    }
    
    @Override
    public final t5j<T> a() {
        return this.b;
    }
    
    @Override
    public final String getKey() {
        return this.a;
    }
    
    @Override
    public final T getValue() {
        return this.h.a(this, fav.i[0]);
    }
    
    @Override
    public final void setValue(final T t) {
        e0e.f((Object)t, "<set-?>");
        this.h.b(this, fav.i[0], t);
    }
    
    public final class a implements e1m<Object, T>
    {
        public final e39 a;
        public final xmr<T> b;
        public final udq<T> c;
        public final fav<T> d;
        
        public a(final fav d) {
            this.d = d;
            this.a = new e39();
            final znl b = new znl();
            this.b = b;
            final udq c = new udq(t5j.mergeArray(new fbj[] { (fbj)t5j.just((Object)d.c), (fbj)d.b, (fbj)b }));
            c.a();
            this.c = (udq<T>)c;
            d.e.i((sj)new bq1((Object)this, 23));
        }
        
        public final T a(Object a, final ape<?> ape) {
            e0e.f(a, "thisRef");
            e0e.f((Object)ape, "property");
            a = this.c.a();
            e0e.c(a);
            return (T)a;
        }
        
        public final void b(final Object o, final ape<?> ape, final T t) {
            e0e.f(o, "thisRef");
            e0e.f((Object)ape, "property");
            e0e.f((Object)t, "value");
            final fav<T> d = this.d;
            synchronized (this) {
                if (!e0e.a((Object)t, this.c.a())) {
                    this.b.onNext((Object)t);
                    this.a.c(((yz5)d.d.invoke((Object)t)).t(d.f).r((sj)eav.F0, (rk6)new e4b((stb)new fav$a$a((Object)this), 7)));
                }
            }
        }
    }
}
